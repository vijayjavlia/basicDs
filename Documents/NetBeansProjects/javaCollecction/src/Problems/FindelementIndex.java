/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.sound.midi.SysexMessage;

class FindelementIndex{
	public static void main (String[] args) throws IOException {
           
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            
		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
		while(t!=0)
		{    
		    int index=-1;
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==k)
		        {
		            index=i;
		        }
		    }
		    System.out.println(index);
		    t--;
		}
		
	}
}