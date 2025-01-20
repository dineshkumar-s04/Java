import java.util.Scanner;
class EvenOdd {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if (num>0) 
{
	if(num%2 == 0)
		System.out.println(num  + "is even");
	else
		System.out.println("Odd");
}
else
{
	if(num%2 == 0)
		System.out.println(num + "is even");
	else
		System.out.println("Odd");
}
}
}