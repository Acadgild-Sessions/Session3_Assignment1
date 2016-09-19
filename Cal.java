import java.util.Scanner;

class Cal{
	public void SqrtCbrt(int a){
		System.out.println("SquareRoot of "+a+" : "+Math.sqrt(a));
		System.out.println("CubeRoot of "+a+" : "+Math.cbrt(a));
	}
	public static void main(String args[]){
		int num=0;
		System.out.print("Enter number : ");
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		Cal c= new Cal();
		c.SqrtCbrt(num);
	}
	
}

