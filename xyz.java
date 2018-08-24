import java.util.Scanner;
public class xyz{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x[] = new int[5];
int i;
int a=0;
int b=0;
for(i=0;i<5;i++){
	x[i] = sc.nextInt();
}
for(i=0;i<5;i++){
	a=a+x[i];
	b=a/5;
}
System.out.println("Average Score is " + b);
}	
}
