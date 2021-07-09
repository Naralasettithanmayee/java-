import java.util.*;
class Stringsplit 
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string data:");
str=sc.nextLine();
String ch[]=str.split(" ");
int n=ch.length;//n=4
if(n==0)
    System.out.print(n);
else
{
String st=ch[n-1];  //[0];[1];  //aditya
int m=st.length();//m=5
System.out.print(m);

}
}
}