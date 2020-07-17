package ALGORITHMS;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

class Cypherocks
{
    //Here k are number of parts with which we can reconstruct,n are total number in which we will split
    public static SecretShare[] split(BigInteger secret, int k, int n, BigInteger prime, Random random)
    {
        final BigInteger[] coeff = new BigInteger[k];
        coeff[0] = secret;
        for (int i = 1; i < k; i++)
        {
            BigInteger r;
            while (true)
            {
                r = new BigInteger(prime.bitLength(), random);
                if (r.compareTo(BigInteger.ZERO) > 0 && r.compareTo(prime) < 0)
                {
                    break;
                }
            }
            coeff[i] = r;
        }

        final SecretShare[] shares = new SecretShare[n];
        for (int x = 1; x <= n; x++)
        {
            BigInteger ss = secret;

            for (int exp = 1; exp < k; exp++)
            {
                ss = ss.add(coeff[exp].multiply(BigInteger.valueOf(x).pow(exp).mod(prime))).mod(prime);
            }
            shares[x - 1] = new SecretShare(x, ss);
        }

        return shares;
    }

    public static BigInteger combine(final SecretShare[] shares, final BigInteger prime)
    {
        BigInteger ss = BigInteger.ZERO;

        for(int y = 0; y < shares.length; y++)
        {
            BigInteger numerator = BigInteger.ONE;
            BigInteger denominator = BigInteger.ONE;

            for(int x = 0; x < shares.length; x++)
            {
                if(y == x)
                    continue;

                int fi = shares[y].number;
                int fj = shares[x].number;

                numerator = numerator.multiply(BigInteger.valueOf(fj).negate()).mod(prime);
                denominator = denominator.multiply(BigInteger.valueOf(fi - fj)).mod(prime);
            }

            BigInteger value = shares[y].share;
            BigInteger tmp = value.multiply(numerator) . multiply(denominator.modInverse( prime));
            ss = prime.add(ss).add(tmp).mod(prime);
        }


        return ss;
    }


    public static void main(final String[] args)
    {
        SecureRandom random = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        BigInteger secret = new BigInteger(in);
        //System.out.print(secret.bitLength());
        BigInteger prime = new BigInteger(33, 256, random); // getting prime number bigger than 32 bit, so using 33 bits
        SecretShare[] shares = Cypherocks.split(secret, 2, 4, prime, random);


        int i=0,j=2; // runs 0 and 2 keys combination
        SecretShare[] sharesToViewSecret = new SecretShare[] {shares[i],shares[j]};
        BigInteger result = Cypherocks.combine(sharesToViewSecret, prime);
        System.out.println(result);
    }
}


class SecretShare
{
    public SecretShare(final int number, final BigInteger share)
    {
        this.number = number;
        this.share = share;
    }
    public int number;
    public BigInteger share;
}

