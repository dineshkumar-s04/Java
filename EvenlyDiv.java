import java.util.Scanner;
class EvenlyDiv{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();
if (num % 100 == 0)
System.out.println(num + " is evenly divisible by 100 and it is multiple of 100");
else
System.out.println("Not divisible by 100");

}

}