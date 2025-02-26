public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String text, char letter){
		int x = 0;
		int y = 0;
		while (x < text.length()){
			
		if (text.charAt(x) == letter){
			y += 1;}
		x += 1;
		if (y == 5){
			break;}
		}
		if (y == 5){
			return x;
		}
		else {return -1;}
	}
	public static int countLetter(String text, char letter){
		int x = 0;
		int y = 0;
		while (x < text.length()){
		if (text.charAt(x) == letter){
			y += 1;}
		x += 1;}
		return y;
	}
	public static int oddSum(int num1, int num2){
		int x = Math.min(num1, num2);
		int y = Math.max(num1, num2);
		int sum = 0;
		while (x <= y){
		if (x % 2 == 1){
			sum += x;
			x += 2;
		} else {
			x += 1;
		}
	}
		return sum;
	
	}
}
	
	