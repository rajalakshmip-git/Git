import java.util.Scanner;

public class quotient{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the 1st no:");
double num1 = sc.nextDouble();

System.out.println("Enter the 2nd no:");
double num2 = sc.nextDouble();

double quotient = num1/num2;

System.out.println("The quotient of the two no is:" + quotient);
}
}

