package Pawielski.Macy.Chapter6.Java.Project.FinalAttempt;

public class SimpleMath {


	  double Divide(double numerator,double demoninator) {
		if(demoninator == 0) {
			throw new ArithmeticException("Cannot Divide by 0");
		}
		return  numerator / demoninator;
	
	}
	  
	  double Multiply(double number1, double number2) {
		  return number1*number2;
	  }

}
