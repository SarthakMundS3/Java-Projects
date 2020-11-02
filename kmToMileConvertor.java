// WAP to convert Km into mile

import java.util.Scanner;
public class kmToMileConvertor {
    public static void main(String[] args) {
        System.out.println(" Enter Km value :");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = (0.62137 * km );
        System.out.println(" Mile value be :");
        System.out.println( mile );
        

    }
}
