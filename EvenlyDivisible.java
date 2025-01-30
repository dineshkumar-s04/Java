import java.util.Scanner;
class EvenlyDivisible{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();
if (num % 27 == 0)
System.out.println(num + " is evenly divisible by 27 and it is multiple of 27 ");
else
System.out.println("Not a multiple of 27");

}

}