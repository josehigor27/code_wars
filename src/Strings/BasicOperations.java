package Strings;

public class BasicOperations {

	public static Integer basicMath(String op, int v1, int v2) {
		
		int operation=0;
		
		switch (op) {
			case "+":
				operation = v1 + v2;
				break;
			case "-":
				operation = v1-v2;
				break;
			case "*":
				operation = v1*v2;
				break;
			case "/":
				operation = v1/v2;
				break;
		}

		return operation;
	}

	public static void main(String[] args) {

		BasicOperations solution = new BasicOperations();
		
		System.out.println(solution.basicMath("+", 5, 7));

	}

}
