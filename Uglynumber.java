import java.util.*;
import java.lang.*;
import java.io.*;
class Uglynumber
{
        static int N=500000;
        public static int prime[]=new int[N];
        public static void sieve()
        {
                for(int i=0;i<N;i++)
               {
                   prime[i]=i;
               }
                   prime[0]=1;
                   prime[1]=1;
                for(int i=2;i*i<N;i++)
                {
                    if(prime[i]==i)
                    {
                        for(int j=i*i;j<N;j+=i)
                        {
                            prime[j]=i;
                        }
                     }
                  }
                  
           }
public static void main(String args[]) throws java.lang.Exception
{
                  sieve();
                  Scanner sc=new Scanner(System.in);
                  System.out.print("n=");
                  int n=sc.nextInt();
                  int arr[]=new int[n];
                  int c=0,x;
                  while(n!=1)
                  {
                        x=prime[n];
                        arr[c]=x;
                        if(arr[c]<=5)
                        c++;
                        n=n/prime[n];        
                 }
                      if(arr[c]<=5)
                      System.out.println("True");
                      else
                      System.out.println("False");
}
}

Output____________________________________________________________
n=8
True 
