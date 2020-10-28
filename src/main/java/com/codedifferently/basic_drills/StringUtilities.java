package com.codedifferently.basic_drills;


public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
         char firstChar = input.charAt(0);
         char secondChar = input.charAt(1);
         char thirdChar = input.charAt(2);
         String firstStr = String.valueOf(firstChar);
         String secondStr = String.valueOf(secondChar);
         String thirdStr = String.valueOf(thirdChar);
         return firstStr + secondStr + thirdStr;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String lastThreeChars = "";
        for (int i = 0; i < input.length(); i++) {
            if (i >= input.length() - 3) {
                lastThreeChars += input.charAt(i);
            }
        }
        return lastThreeChars;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int index = inputValue.length() / 2;
        return inputValue.charAt(index);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String firstWord = "";
        for (char letter : spaceDelimitedString.toCharArray()) {
            if (Character.isWhitespace(letter)) {
                return firstWord;
            }
            firstWord += String.valueOf(letter);
        }
        // If code makes it here, there are no spaces in the string. There's only one word.
        return firstWord;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String secondWord = "";
        boolean loopedOverFirstSpace = false;
        for (char letter : spaceDelimitedString.toCharArray()) {
            if (loopedOverFirstSpace) {
                if (Character.isWhitespace(letter)) {
                    break; // breaks out of loop if a 3rd word is found.
                }
                secondWord += String.valueOf(letter);
            }
            if (!loopedOverFirstSpace && Character.isWhitespace(letter)) {
                loopedOverFirstSpace = true;
            }
        }

        if (!loopedOverFirstSpace) {
            throw new IllegalArgumentException("Could not find second word in string. Are you sure it was more than one word?");
        }

        return secondWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reversedStr = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedStr += stringToReverse.charAt(i);
        }
        return reversedStr;
    }
}
