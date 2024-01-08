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
        
    }

    public static String capVowelsLowRest (String string) {
        String answerString = "";
        String vowels = "aeiou";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar += 32;
            }
            if (vowels.indexOf(currentChar) != -1) {
                currentChar -= 32;
            }
            answerString += currentChar;
        }
        return answerString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
