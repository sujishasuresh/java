import java.util.*;
class prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,flag=0;
System.out.println("enter the number:");
n=sc.nextInt();
for(i=2;i<n;i++){
if(n%i==0){
flag=1;
break;
}
else{
flag=0;
}
}
if(n==1)
System.out.println("1 is neither prime nor composite");
else if(flag==0)
System.out.println("Prime number");
else
System.out.println("Not Prime number");
}
}
	

