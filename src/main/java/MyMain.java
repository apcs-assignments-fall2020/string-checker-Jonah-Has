import java.util.Scanner;

public class MyMain {
    int i;
    // Counts the number of 'a', 'b', and 'c' chars in str
    
    
    public static int countABC(String str) {
        // REPLACE WITH YOUR CODE
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                counter += 1;
            }
        }

        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
   
   
    public static boolean containsThe(String str) {
        // REPLACE WITH YOUR CODE
        String str2 = str.toLowerCase();
        if (str2.indexOf("the") != -1) {
            return true;
        }
        else{
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        // REPLACE WITH YOUR CODE
        String ret = "";
        for (int i = 0; i < str.length(); i++){
            ret = ret + str.charAt(str.length() - i - 1);
        }
        //System.out.println(ret);
        if (ret.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("abc for countabc, con for containsthe, ispal for ispalindrome");
        String play = scan.nextLine();
        System.out.println("type the string you want to use");
        String str = scan.nextLine();

        if (play.equals("abc")){
            System.out.println(countABC(str));
        }
        else if (play.equals("con")){
            System.out.println(containsThe(str));
        }
        else if (play.equals("ispal")){
            System.out.println(isPalindrome(str));
        }
        else{
            System.out.println("Something went wrong. Try again");
        }
        scan.close();

        // YOUR CODE HERE
    }
}
