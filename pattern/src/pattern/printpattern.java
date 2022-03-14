package pattern;

import java.util.Scanner;

public class printpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int number;
		for(int i=1;i<=row;i++)
		{
			number=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			
		}
	}

}
