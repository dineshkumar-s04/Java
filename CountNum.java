import java.util.Scanner;
class CountNum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the digit : ");
num = sc.nextInt();
int count = 0;
while(num>0){
	num=num/10;
	count+=1;
	
}
System.out.println(count);
}
}