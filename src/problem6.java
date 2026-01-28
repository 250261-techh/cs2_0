import java.util.Scanner;

public class problem6 {
    public static void main(String[] args){
        System.out.print("Enter the cost of the meal: ");
        Scanner in = new Scanner(System.in);
        Double cost=in.nextDouble();
        String tax = String.format("Your tax is %.2f",cost*0.10);
        String tip = String.format("Your tip is %.2f(without tax)",cost*0.18);
        String all = String.format("Whole bill is %.2f",cost+(cost*0.1)+(cost*0.18));
        System.out.println(tax+"\n"+tip+"\n"+all);

    }
}
