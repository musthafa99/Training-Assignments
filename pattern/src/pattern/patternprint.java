package pattern;

import java.util.Scanner;

public class patternprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int col=ip.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || i==row)
				{
					System.out.print('$');
				}
				if(i==2 || i==3)
				{
					if(j==1 || j==col)
					{
						System.out.print('$');
					}
					else
					{
						System.out.print(" ");
					}
				}
					
			}
			System.out.println();
				
		}
		
	}
}
