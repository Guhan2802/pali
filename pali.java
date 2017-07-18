import java.util.*;
class pali
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while(a>0)
{
int r=a%10;
int rem=rem*10+r;
a=a/10;
}
if(rem==a)
System.out.print("palidrome");
else
System.out.print("not palidrome");
}
}
