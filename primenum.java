import java.util.Scanner;
import java.lang.String;
class primenum{
	public static void main(String[] args){
		System.out.println("Please insert any number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime number");
	}
}
