package ch01;

//public의 경우 어느 곳에서든 접근이 가능하다는 뜻이며, class의 시작은 대문자로 시작하는게 좋다.
//하나의 java파일 안에 class는 여러개일 수 있지만 public class는 한개만 가능하고 클래스이름과 자바파일 이름이 동일하다.
public class FunctionTest { 

	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calSum()
	{
		int sum = 0;
		int i;
		
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int total = addNum(n1, n2);
		System.out.println(total);
		sayHello("안녕하세요");
	}
}

// addNum을 부르는 순간 스택 메모리에 지역변수들이 저장되며 add()수행 후 메모리 해제된다.
