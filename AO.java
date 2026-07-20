import java.io.*;

public class AO{
public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the value a");
int a = Integer.parseInt(br.readLine());

System.out.println("Enter the value b");
int b = Integer.parseInt(br.readLine());

System.out.println("Enter the value c");
int c = Integer.parseInt(br.readLine());

System.out.println("Addition=" + (a + b + c));
System.out.println("Subtraction=" + (a - b - c));
System.out.println("Multiplication=" + (a * b * c));

if(b !=0 && c!=0){
System.out.println("Division=" + (a / b / c));
System.out.println("Modulus=" + (a % b % c));
}
else{
System.out.println("Division and Modulus con't be performed");
}
}
}