import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        System.out.print("Hello, Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name =in.nextLine();
        System.out.print("Hi "+name);
    }
}