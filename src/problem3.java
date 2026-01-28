import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        System.out.print("Enter width: ");
        Scanner in1 = new Scanner(System.in);
        Double width = in1.nextDouble();
        System.out.print("Enter height: ");
        Scanner in2 = new Scanner(System.in);
        Double height = in1.nextDouble();
        System.out.println("Area is: "+ width*height);
        System.out.println("Perimeter is: "+(2*(width+height)));
    }
}