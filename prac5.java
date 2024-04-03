import java.util.Scanner;

public class prac5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		System.out.println("학번을 입력하세요: ");
		
		String name = sc.next();
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println("<출력>");
		System.out.println("이름: " + name);
		System.out.println("학번: " + num);
		

	}

}