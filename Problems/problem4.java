import java.util.Scanner;

public class problem4 {
    public static void main(String[] args){
        System.out.print("Enter radius and length: ");
        Scanner in1 = new Scanner(System.in);
        Double radius = in1.nextDouble();
        Double length = in1.nextDouble();
        Double area =radius*radius*Math.PI;
        System.out.println("Area is: "+area);
        System.out.println("Volume is: "+area*length);

    }
}