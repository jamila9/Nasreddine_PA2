import java.util.Scanner;
public class Decrypt {
		public static void main(String []args){
			Scanner scnr = new Scanner(System.in);
			int n,i,d,temp;
			int []a= new int [4];
			System.out.print("Input a 4-digit number: ");
			n = scnr.nextInt();
			a[0]= n/1000;
			a[1] = (n/100) % 10;
			a[2] = (n/10) % 10;
			a[3]= n % 10;
			
			temp = a[0];
			a[0]= a[2];
			a[2]= temp;
			temp = a[1];
			a[1]= a[3];
			a[3]= temp;
			
			for(i=0; i<4; i++)
			{
			a[i]=(a[i]+3)%10;
			}
			
			d = (a[0]*1000)+(a[1]*100)+(a[2]*10)+a[3];
			System.out.print(d);
	}
}
