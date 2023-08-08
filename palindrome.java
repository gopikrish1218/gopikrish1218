import java.util.*;
public class palindrome{
public static void main(String args[]){
int num, temp, rem, sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
temp=num;
while(num>0){
rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum){
System.out.println(temp+"is a palindrome");
}
else
System.out.println(temp+"is not a palindrome");
}
}

