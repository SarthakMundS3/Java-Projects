// WAP to find CGPA for 3 subjects.
import java.util.Scanner;

public class findCgpa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks for subject 1 :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks for subject 2 :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks for subject 3 :");
        float sub3 = sc.nextFloat();

        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.print("cgpa will be : ");
        System.out.println(cgpa);
    }
}
