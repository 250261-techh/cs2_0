import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        System.out.print("Enter the distance: ");
        Scanner in1 = new Scanner(System.in);
        Integer number1= in1.nextInt();
        Integer number2= in1.nextInt();
        Integer number3= in1.nextInt();
        Integer max = Math.max(Math.max(number1,number2),number3);
        Integer min = Math.min(Math.min(number1,number2),number3);
        System.out.printf("Sorted order %d, %d, %d",min,max-min,max);
    }
}