import java.util.*;

class TwinCount
{
       static void primenumber(int x,int y)
{
       int twincount=0;
       for(int i=x;i<=y;i++)
{
       int count=0;
       for(int j=1;j<=i;j++)
{
       if(i%j==0)
       count++;
}
       if(count==2)
{
       twincount++;
}
}
     System.out.println("twin count="+twincount/2);
}
     public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     primenumber(a,b);
}
}