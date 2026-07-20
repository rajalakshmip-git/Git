import java.io.*;

public class mobileno{
public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the mobile num:");
String mobile = br.readLine();

if(mobile.contains("0")){
System.out.println("Mobile number contains 0. Invalid mobile number");
}else{
System.out.println("Mobile number doesn't contain 0. Valid mobile number");
}
}
}