import java.util.Scanner ;
class Weekday{
public static void main(String[] args) {

System.out.println("1.Monday");
System.out.println("2.Tuesday");
System.out.println("3.Wednesday");
System.out.println("4.Thursday");
System.out.println("5.Friday");
System.out.println("6.Saturday");
System.out.println("7.Sunday");

Scanner sc = new Scanner(System.in);

System.out.println("Enter the day number:");
int days = sc.nextInt();

switch(days){
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	default:
		System.out.println("Invalid input");
		break;
}
}
}
