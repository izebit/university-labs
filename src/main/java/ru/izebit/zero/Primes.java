package ru.izebit.zero;

import java.util.stream.IntStream;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
public class Primes {

    /**
     * checks numbers if they are prime or not
     * @param number number
     * @return true if a number is prime or false if it's not
     */
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
