package pattern;

import java.util.Scanner;

public class characterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		char letter;
		for(int i=1;i<=row;i++)
		{
			letter='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(letter+" ");
				letter++;
			}
			System.out.println();
		}

	}

}
