import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in1 = new Scanner(System.in);
        Integer number = in1.nextInt();
        System.out.println((number/1000)+(number%1000/100)+(number%100/10)+(number%10));
    }
}