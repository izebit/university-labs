package ru.izebit.zero;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertFalse(Palindrome.isPalindrome("Palindrome"));
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertFalse(Palindrome.isPalindrome("apple"));
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertFalse(Palindrome.isPalindrome("song"));
        assertTrue(Palindrome.isPalindrome("noon"));
    }
}
