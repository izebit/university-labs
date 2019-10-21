package ru.izebit.zero;

/**
 * @author <a href="mailto:izebit@gmail.com">Artem Konovalov</a> <br/>
 * Date: 21.10.2019
 */
public class Palindrome {

    /**
     * checks words if it is a palindrome or not
     * @param str checked word
     * @return true is a word is palindrome, otherwise false
     */
    static boolean isPalindrome(final String str) {
        return str.equals(reverseString(str));
    }

    /**
     * reverses a word
     * @param str word
     * @return reserved word
     */
    private static String reverseString(final String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));

        return sb.toString();
    }
}
