import java.util.Scanner;

public class JavaBasic008 {
    public static void main(String args[]) {
        float area;

        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        float Pi = sc.nextFloat();
        // Area of the circle 
        area = Pi * rad * rad;
        System.out.println(area);
    }
}
