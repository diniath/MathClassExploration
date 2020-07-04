package mypackage;
public class MathClass{
	public static void main (String [] args){
		double num = Double.parseDouble(args[0]);
		System.out.println("Input number is " + num);
		System.out.println("the result of ceil is: " + Math.ceil(num));
		System.out.println("the result of floor is: " + Math.floor(num));
		System.out.println("the result of round is: " + Math.round(num));
		System.out.println("the result of abs is: " + Math.abs(num));
	}

}