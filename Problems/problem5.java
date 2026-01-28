import java.util.Scanner;

public class problem5 {
    public static void main(String[] args){
        System.out.println("Enter length of sides:");
        Scanner in1 = new Scanner(System.in);
        Double length = in1.nextDouble();
        Double area =length*length*(Math.sqrt(3)/4);
        Double volume = area*length;
        System.out.println("Area is: "+area);
        System.out.println("Volume is: "+volume);

    }
}
