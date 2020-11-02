// WAP to calculate % secured by the student

import java.util.Scanner;
public class examPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Number of subjects :");
        int no = sc.nextInt();
        float sum = 0;
        for (int i=1; i <=no;i++){
            System.out.print("Enter marks of subject ");
            System.out.println(i);
            float a = sc.nextFloat();
            sum = sum + a;
        }
        System.out.print("Total marks = ");
        System.out.println(sum);
        System.out.print("Percentage = ");
        int b = no*100;
        float per = (sum*100)/b ;
        System.out.println(per);

    }
}
