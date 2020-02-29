package com.bhavani.calculator.java;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("Calculator\nOption 1 to ADD two numbers\nOption 2 to SUB two numbers\nOption 3 to MULtwo numbers\nOption 4 to DIV two numbers\n Option 0 to exit the calcultor");
            System.out.print("Enter the opion ");
            int number=sc.nextInt();
            switch(number){
            case 1:
                System.out.print("Enter number");
                double a=sc.nextDouble();
                System.out.print("Enter number");
                double b=sc.nextDouble();
                Add a1=new Add(a,b);
                a1.add();
                break;
            case 2:
            	System.out.println("Enter number");
            	double s1=sc.nextDouble();
            	System.out.println("Enter number");
            	double s2=sc.nextDouble();
            	Sub s3=new Sub(s1,s2);
            	s3.sub();
            	break;
            case 3:
            	System.out.println("Enter number");
            	double m1=sc.nextDouble();
            	System.out.println("Enter number");
            	double m2=sc.nextDouble();
            	Mul m3=new Mul(m1,m2);
            	m3.mul();
            	break;
            case 4:
            	System.out.println("Enter number");
            	double d1=sc.nextDouble();
            	System.out.println("Enter number");
            	double d2=sc.nextDouble();
                Div d3=new Div(d1,d2);
            	d3.div();
            	break;
            case 0:
            	return;
            default:
            	System.out.println("Enter valid number");
            }
        }
    }
}
