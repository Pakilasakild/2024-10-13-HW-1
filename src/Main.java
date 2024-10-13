import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Is the string empty? " + str.isEmpty());
        System.out.println("Is the string blank? " + str.isBlank());
        System.out.println("The length of the string is: " + str.length());
        System.out.println("The first character of the string is " + str.charAt(0));
        System.out.println("The last character of the string is " + str.charAt(str.length()-1));
        System.out.println("The first space of the string is at " + str.indexOf(' '));
        char first = Character.toUpperCase(str.charAt(0));
        if (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') {
            System.out.println("Does the string start with a vowel? true");
        }
        else {
            System.out.println("Does the string end with a vowel? false");
        }
    }
}