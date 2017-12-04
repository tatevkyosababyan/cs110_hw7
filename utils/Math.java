package  utils;

public class Math{
	public static int factorial(int a){
		if (a<=1){
			return 1;
		}
		return a * factorial(a-1);
	}

	public static int factorialLoop(int b){
		int result = 1;
		if (b <= 1){
			return result;
		}
		for(int i = 1; i <= b; i++){
			result = result * i;
		}
		return result;
	}

}