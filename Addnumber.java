import java.util.Scanner;
class Addnumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int a = sc.nextInt();
System.out.println("Enter the second number:");
int b = sc.nextInt();
int sum = a+b;
int diff = a-b;
int mul = a*b;
int div = a/b;
int rem = a%b;
System.out.println("Sum = "+sum);
System.out.println("Difference = "+diff);
System.out.println("Product = "+mul);
System.out.println("Divide = "+div);
System.out.println("Remainder = "+rem);
}
}