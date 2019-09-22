import java.util.Scanner;
public class Nasreddine_p3{

    public static void main(String []args){
    	Scanner scnr = new Scanner(System.in);
        String[] issue = new String [5];
        issue[0]="Retirement";
        issue[1]="Employment";
        issue[2]="Experience";
        issue[3]="Counseling";
        issue[4]="Networking";
        int[][]response= new int [5][10];
        int i,j;
        int []sum = new int[5] ;
        double []avg = new double [5];
        String lowest="", top ="";
        int min,max;
        for (j=0;j<10;j++){
        System.out.println("\nParticipant "+ (j+1) + ": ");
        for (i=0;i<5;i++)
        {
            System.out.print(" "+ issue[i] + ":");
            response[i][j]= scnr.nextInt();
            sum[i] += response[i][j];  
        }
        }
       System.out.println("Issue   \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage");
       max =sum[0];
       for (i=0; i<5 ; i++)
    	{
    	   if (sum[i] > max)
           {
               max = sum[i];
               top = issue[i]; 
           }
    	}
       min =sum[0];
       for (i=0; i<5 ; i++)
   		{	
    	   if (sum[i] < min)
           {
               min = sum[i];
               lowest = issue[i]; 
           }
       }
       for (i=0; i<5 ; i++) 
       {
    	   avg[i] = sum[i]/10.0;
           System.out.print(issue[i]);
           for (j=0;j<10;j++)
           {
               System.out.print("\t"+response[i][j]);
           }
           System.out.println("\t"+avg[i]);
       }
       System.out.println("Top priority issue:  "+ top + "  >> "+max+" points total");
       System.out.println("Low priority issue:  "+ lowest + " >> "+min+" points total");
        }
}
