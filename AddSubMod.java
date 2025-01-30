import java.util.Scanner;
class AddSubMod{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
int num1 = sc.nextInt();
int num2 = sc.nextInt();

int add = num1 + num2;
int sub = num1 -  num2;

System.out.println("Sum is "+ add);
System.out.println("Difference is " + sub);

if (sub < 0){
	int positive_value = sub*(-1);
	System.out.println("Positive value is " + positive_value);
}

}
}