import java.util.Scanner;

public class problem7 {
    public static void main(String[] args){
        System.out.print("Enter the distance: ");
        Scanner in1 = new Scanner(System.in);
        Double distance = in1.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        Double efficiency = in1.nextDouble();
        System.out.print("Enter the price per gallon: ");
        Double price = in1.nextDouble();
        String result = String.format("Cost of driving is: %.2f",(distance/efficiency)*price);
        System.out.println(result);
    }
}
