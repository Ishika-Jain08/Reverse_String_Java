import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        String str = "InnovateEd Solutions Tasks Completed!";

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Original String here!!");
        String str = sc.nextLine();
        System.out.println("Original String = " + str);
        String reverseStr = "";
        char ch;

        for(int i = 0; i <str.length(); i++) {
          ch = str.charAt(i);
          reverseStr = ch + reverseStr;
        }
        System.out.println("Reversed String = " + reverseStr);
    }
}
