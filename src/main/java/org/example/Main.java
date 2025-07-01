package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        String str = Integer.toString(Math.abs(number));
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String text = "";
        for(char digit:digits){
            switch (digit){
                case '0':
                    text+= "Zero ";
                    break;
                case '1':
                    text+= "One ";
                    break;
                case '2':
                    text+= "Two ";
                    break;
                case '3':
                    text+= "Three ";
                    break;
                case '4':
                    text+= "Four ";
                    break;
                case '5':
                    text+= "Five ";
                    break;
                case '6':
                    text+= "Six ";
                    break;
                case '7':
                    text+= "Seven ";
                    break;
                case '8':
                    text+= "Eight ";
                    break;
                case '9':
                    text+= "Nine ";
                    break;
            }

        }
     return text.trim();
    }
}
