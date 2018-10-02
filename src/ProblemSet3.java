/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		
		System.out.println("Problem1");
		ps3.dateFashion(5,5);
		System.out.println("");
		
		System.out.println("Problem2");
		ps3.fizzString("saaaaaaag");
		System.out.println("");
		
		System.out.println("Problem3");
		ps3.squirrelPlay(95, true);
		System.out.println("");
		
		System.out.println("Problem4");
		ps3.fizzStringAgain(15);
		System.out.println("");
		
		System.out.println("Problem5");
		ps3.makeBricks(3,2,10);
		System.out.println("");
		
		System.out.println("Problem6");
		ps3.loneSum(1,3,2);
		System.out.println("");
		
		System.out.println("Problem7");
		ps3.luckySum(1,13,3);
		System.out.println("");
		
		System.out.println("Problem8");
		ps3.factorialWithFor(5);
		System.out.println("");
		
		System.out.println("Problem9");
		ps3.factorialWithWhile(4);
		System.out.println("");
		
		System.out.println("Problem10");
		ps3.isPrime(2);
		System.out.println("");
	}
		
	public void dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else if (you >= 8 || date >= 8) {
			System.out.println("YES");
		}
		else {
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		String toreturn = "";
		if (str.charAt(0) == 'f') {
			toreturn += "FIZZ";
		}
		if (str.charAt(str.length()-1) == 'b') {
			toreturn += "BUZZ";
		} 
		if (toreturn.equals("")) {
			System.out.println(str);
		}
		else {
			System.out.println(toreturn);
		}
		
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (temp <= 100 && temp >= 60) {
			if (temp > 90) {
				if (isSummer) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			} 
			else {
				System.out.println("YES");
			}
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 == 0 || n % 5 == 0) {
			if (n % 3 == 0) {
				System.out.print("FIZZ");
			}
			if (n % 5 == 0) {
				System.out.print("BUZZ");
			}
			System.out.println("!");
		}
		else {
			System.out.println(n+"!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		int max = small + big * 5;
		if (goal <= max) {
			if (big >= (goal / 5)) {
				if (small >= goal % 5) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("YES");
			}
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		int sum = a + b + c;
		if (a == b || b == c || a == c) {
			if (a == b && b == c) {
				sum = 0;
			}
			else if (a == b) {
				sum -= (a*2);
			}
			else if (b == c) {
				sum -= (b*2);
			}
			else if (a == c) {
				sum -= (c*2);
			}
		}
		System.out.println(sum);
		
		
	}
	
	public void luckySum(int a, int b, int c) {
		int sum = a + b + c;
		if (a == 13 || b == 13 || c == 13) {
			if (a == 13) {
				sum = 0;
			}
			else if (b == 13) {
				sum -= (b + c);
			}
			else {
				sum -= 13;
			}
		}
		System.out.println(sum);
		
	}
	
	public void factorialWithFor(int n) {
		int factorial = 1;
		for  (int i = n; i > 1; i--) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
	
	public void factorialWithWhile(int n) {
		int factorial = 1;
		while (n > 1) {
			factorial *= n;
			n--;
		}
		System.out.println(factorial);
		
	}
	
	public void isPrime(int n) {
		int counter = 2;
		boolean isPrime = true;
		while ((counter < (double) Math.sqrt(n)) && isPrime) {
			System.out.println(counter);
			if (n % counter == 0) {
				isPrime = false;
			}
			counter++;
			
		}
		
		if (n == 1) {
			isPrime = false;
		}
		
		if (isPrime) {
			System.out.println("Prime");
		}
		
		else {
			System.out.println("Not Prime");
		}
	}
}