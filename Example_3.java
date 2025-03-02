import java.util.Scanner;

public class Example_3{
    public static void main(String[] args) {
        String a;
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name? ");
        a = sc.nextLine();
        System.out.println("Hi " + a + "," + "How are you? ");
        sc.close();
    }
}