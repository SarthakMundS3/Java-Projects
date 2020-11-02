// WAP to convert celsius to Fahrenheit and vice versa

import java.util.Scanner;
public class celsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to convert celsius to Fahrenheit :\nPress 2 to convert Fahrenheit to celcius :");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("We are going to convert celsius to Fahrenheit \nEnter the celsius value : ");
            double c = sc.nextInt();
            double fah = (c*9)/5 + 32 ;
            System.out.println("After conversion the Fahrenheit value is : "+fah);
        }
        else if (a==2) {
            System.out.println("We are going to convert Fahrenheit to celsius \nEnter Fahrenheit value : ");
            double b = sc.nextInt();
            double cel = ((b-32) *5)/9 ;
            System.out.println("After conversion the Fahrenheit value is : "+cel);
        }
        else{
            System.out.println("Invalid input....!! ");
        }
    }
}