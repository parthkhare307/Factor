import java.util.*;
class Factor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,f,count;
count=0;
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count=count+1;
}
if(count==2)
{
System.out.println("The Number is Prime Number");
}
}
}
}
