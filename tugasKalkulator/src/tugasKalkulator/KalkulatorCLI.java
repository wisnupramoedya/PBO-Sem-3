package tugasKalkulator;

import java.util.Scanner;
import java.util.Stack;

public class KalkulatorCLI {
	public static Stack<Double> stack = new Stack<Double>();
	
	public static String text = "[Calculator CLI]\n"
			+ "Cara pemakaian:\n"
			+ "1. Masukkan nilai awalmu.\n"
			+ "2. Masukkan operator yang diinginkan (+, -, *, /, %). Berikan spasi setelahnya.\n"
			+ "3. Masukkan angka kedua\n"
			+ "4. Hasil akan keluar dengan format \">>> x\".\n"
			+ "5. Ada beberapa command khusus\n"
			+ "  - help : menampilkan bantuan\n"
			+ "  - back : kembali ke hasil sebelumnya\n"
			+ "  - reset : menghapus seluruh hasil\n"
			+ "  - exit : keluar dari program\n";

	private static Scanner scanner;
	
	public static void command(String input) {
		switch(input) {
			case "help":
				System.out.println(text);
				break;
			case "back":
				stack.pop();
				if(stack.isEmpty()) stack.push((double) 0);
				break;
			case "reset":
				stack.clear();
				stack.push((double) 0);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("Symbol was not recognized, please give the right character.");
				break;
		}
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Boolean sign = true;
		String input1, input2;
		
		
		System.out.println(text + "Masukkan angka:");
		stack.push(scanner.nextDouble());
		
		while(sign) {
			input1 = scanner.next();
			
			switch (input1) {
				case "+":
					input2 = scanner.next();
					stack.push(stack.peek() + Double.parseDouble(input2));
					break;
				case "-":
					input2 = scanner.next();
					stack.push(stack.peek() - Double.parseDouble(input2));
					break;
				case "*":
					input2 = scanner.next();
					stack.push(stack.peek() * Double.parseDouble(input2));
					break;
				case "/":
					input2 = scanner.next();
					stack.push(stack.peek() / Double.parseDouble(input2));
					break;
				case "%":
					input2 = scanner.next();
					stack.push((double) (Math.round(stack.peek()) % Math.round(Double.parseDouble(input2))));
					break;
				default:
					command(input1);
					break;
			}
			
			System.out.println(">>> " + stack.peek());
		}

	}

}
