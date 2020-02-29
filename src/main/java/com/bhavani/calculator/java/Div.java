package com.bhavani.calculator.java;

public class Div {
  double a,b;
  Div(double a,double b){
	  this.a=a;
	  this.b=b;
  }
  void div() {
	  try {
		  if(this.b==0) {
			  throw new ArithmeticException();
		  }
		  else {
			  System.out.println(this.a/this.b);
		  }
	  }
	  catch (ArithmeticException e) {
		  System.out.println("Enter valid number other than 0");
	  }
  }
}
