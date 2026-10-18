package edu.course.lab01;

public class TextTasks {

    public static String reverse(String text) {

        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            while (left < right &&
                    !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }

            while (left < right &&
                    !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            char c1 = Character.toLowerCase(text.charAt(left));
            char c2 = Character.toLowerCase(text.charAt(right));

            if (c1 != c2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}