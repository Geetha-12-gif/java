import java.util.*;
class prime
{
public static void main(String[]args)
{
int n=4;
boolean isprime=false;
for(int i=2;i<=n/2;i++){
if(n%i==0){
isprime=true;
break;
}
}
if(!isprime){
System.out.println("prime");
}else{
System.out.println("not prime");
}
}
}