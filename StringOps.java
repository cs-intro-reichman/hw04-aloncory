public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Tests StringOps:");
        System.out.println("Checks \"capVowelsLowRes\" :");
        System.out.println(capVowelsLowRest("Hello World")); //  “hEllO wOrld”;
        System.out.println(capVowelsLowRest("One two tHRee world")); // “OnE twO thrEE wOrld”;
        System.out.println(capVowelsLowRest("vowels are fun")); // “vOwEls ArE fUn”;
        System.out.println(capVowelsLowRest("intro")); // “IntrO”;
        System.out.println(capVowelsLowRest("yellow")); // “yEllOw”;
        System.out.println(capVowelsLowRest("Xi Jinping")); // “xI jInpIng”;
        System.out.println(); // Prints an empty line
        System.out.println("Checks \"camelCase\" :");
        System.out.println(camelCase("Hello World")); // “helloWorld”
        System.out.println(camelCase("HELLO   world")); // “helloWorld”
        System.out.println(camelCase(" tWo    wordS")); // “twoWords”
        System.out.println(camelCase("world")); // “world”
        System.out.println(camelCase("   Intro to  coMPUter   sCIEncE ")); // “introToComputerScience”
        System.out.println(camelCase("Xi Jinping")); // “xiJinping”
        System.out.println(); // Prints an empty line
    }
    /* This function takes as input a string containing only letters, organized into words that are
    separated with a single space (assume that the input is valid).
    The function returns a string in which all the English vowels (a,e,i,o,u) in the original strings are
    changed to uppercase, and all the other characters are changed to lowercase (if they were
    lowercase in the original string, they remain the same). */
    public static String capVowelsLowRest (String string) {
        String answerString = ""; // Initializing an empty string , which will save the answer.
        String vowels = "aeiou"; // 
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            // Checks if the char is an upper letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar += 32; // Converts an uppercase letter to lowercase letter
            }
            // Checks if the char is an lowerletter and a vowel
            if (vowels.indexOf(currentChar) != -1) {
                currentChar -= 32; // Converts a lowercase letter to uppercase letter
            }
            answerString += currentChar; // Add the processed char to the answer string
        }
        return answerString; // Returns the processed string
    }
    /* This function also takes as an input a string containing only letters, organized into words that are
    separated with a single space (assume that the input is valid).
    The function returns a string in which the original string is modified according to three rules:
    1. The first word is changed to lowercase (if it’s not lowercase already).
    2. The first letter of each word is changed to uppercase (if it’s not uppercase already), and all the
    remaining letters in the word are changed to lowercase (if they are not lowercase already).
    3. All the spaces (if any) are removed. */
    public static String camelCase (String string) {
        String answerString = ""; // Initializing an empty string , which will save the answer.
            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i); 
                // Checks if the char is an uppercase letter and is not after a space char
                if (currentChar >= 'A' && currentChar <= 'Z' && (i == 0 || ((i >= 1) && string.charAt(i - 1) != ' '))) {
                    currentChar += 32; // Converts an uppercase letter to lowercase letter
                } else if (currentChar >= 'a' && currentChar <= 'z' && (i >= 1) && string.charAt(i - 1) == ' ') {
                    currentChar -= 32; // Converts a lowercase letter to uppercase letter
                } if (currentChar != ' ') {
                    answerString += currentChar; // Add the processed char to the answer string
                }
            }
        return answerString; // Returns the processed string
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
