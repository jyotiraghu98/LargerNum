import java.util.Scanner;

public class LargerNum{
public static void main(String[] args){

int num1, num2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers to find large one");
num1 = sc.nextInt();
num2 = sc.nextInt();

if(num1>num2){
System.out.println("larger number is "+num1);
}
else{
System.out.println("larger number is "+num2);
}
}
}
