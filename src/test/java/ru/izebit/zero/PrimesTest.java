package ru.izebit.zero;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
public class PrimesTest {

    @Test
    public void testIsPrime() {
        int[] expected = new int[] {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
                157, 163, 167, 173, 179, 181, 191, 193, 197, 199
        };
        final int[] actual = IntStream.range(2, 200).filter(Primes::isPrime).toArray();
        assertArrayEquals(expected, actual);
    }
}
