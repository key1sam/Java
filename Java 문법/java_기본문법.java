package java_grammar;

import java.util.Scanner; // Java에서 표준 입력을 받기위한 클래스 라이브러리


public class java_출력문법 {
  public static void main(String [] args) {
			
			int num = 10;
			int bNum = 0B1010; // Binary는 0B
			int oNum = 012;    // 8진수는 앞에 0
			int xNum = 0xA;    // 16진수는 앞에 0x
			
			System.out.println(num);
			System.out.println(bNum);
			System.out.println(oNum);
			System.out.println(xNum);
			
			double dnum = 3.14;
			float fnum = 3.14f; //리터럴 실수형은 8byte로 내부적으로 잡혀있다.
			                   //따라서 float 타입형으로 핸들링 하기 위해 f를 붙였다.
			int inum = 3215;
			long lnum = 3215L; //리터럴 정수형은 기본적으로 4byte이다.
			                   //따라서 8byte인 long형으로 핸들링하고 싶을 경우 L을 붙여줘야한다.	
			
	        System.out.println(dnum);
	        System.out.println(fnum);
	        System.out.println(inum);
	        System.out.println(lnum);
	        
	        char ch1 = 'A';
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			char ch2 = 66; // char형으로 66 입력 받을 시 문자가 출력된다.
			System.out.println(ch2);
			System.out.println((char)(ch2));
			
			int ch3 = 67;
			System.out.println(ch3);
		 	System.out.println((char)ch3);
			
			char han = '한';
		    char ch = '\uD55C';
		    System.out.println(han);
		    System.out.println(ch);
		    
		    var i = 10; // JRE 10 이상부터 지원이되며 컴파일되면서 자료형이 정해진 후 고정됨
		 	var j = 10.0;
		 	var str = "test";
		 	
		 	System.out.println(i);
		 	System.out.println(j);
		 	System.out.println(str);
		 	
		 	var str2 = str;
		 	System.out.println(str2);
		 	
		 	str = "hello";
		 	// str = 3; var을 통해 string 자료형임을 위에서 설정되었으므로
		 	// java에서 변경이 불가능하여 error가 발생한다.
		 	
			final int MAX_NUM = 100; // final을 통해 상수선언을 했으므로 이후에 변경이 안된다.
			final int MIN_NUM = 0;
			
			System.out.println(MAX_NUM);
			System.out.println(MIN_NUM);
			
			//산술 연산자 (+, - , * , /, %)
			//복합 대입 연산자(+=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, !=, ^=)
			byte ex_num1 = 127;
			byte ex_num2 = -4;
			
			ex_num1 >>>= 1; // 비트를 오른쪽으로 이동하는데 왼쪽에 채워지는 비트 값은 0이다.
			ex_num2 >>= 1; // 비트를 오른쪽으로 이동하는데 왼쪽에 채워지는 비트 값은 부호비트와 동일하다.
			
			System.out.println(ex_num1);
			System.out.println(ex_num2);
			// 음수를 표현할 때 2의 보수로 비트를 표현한다. (-n = ~n + 1(비트 반전 이후 + 1이 2의 보수이다.))
			
			// 삼항연산자, 비트연산자 등의 연산자는 C언어와 동일하다.
			// if문 또한 c언어와 동일한 문법이다.
			
			Scanner scanner = new Scanner(System.in); // Scanner 클래스를 활용하여 표준 입력을 받고있다.
			int in_num = scanner.nextInt(); // Int값을 받게다는 의미이다.
			System.out.println(in_num);
			String str_2 = scanner.next(); // 한 단어를 받게된다.
			System.out.println(str_2);
			str_2 = scanner.nextLine(); // nextLine()은 buffer의 개행문자를 만나면 입력을 종료하는데 앞에 남아있는 개행문자로 인해 입력을 받지 않았다.                
			System.out.println(str_2); // 버퍼를 초기화해주는 작업이 필요하다.
			/*String일 때는 next();

              byte라면 nextByte();

              short라면 nextShort();

              int라면 nextInt();

              long이라면 nextLong();

              float라면 nextFloat();

              double nextDouble();

              String이면서 한라인 전체를 읽어오려면 nextLine()
              
              1. next()는 하나의 단어만 입력 받는다.

                 그래서 첫 단어 앞쪽의 공백이나 개행문자는 무시하지만, 뒤의 개행문자는 버퍼에 남게 된다.



              2.  nextLine()는 개행문자 까지를 한 줄로 인식하고, 개행문자는 버려진다.

                  next(), nextInt()등은 개행 문자가 남아 nextLine()를 만나면, 이상한 버그가 생긴다.

                  그래서 개행문자를 처리하는 작업이 필요하다.
			*/
			int month = 10;
			int day;
			
			switch(month) {
			case 10:	{
				System.out.println("10월입니다.");
			}
			
			month = 1;
			
			switch(month) {
			case 1: case 2: case 3: case 4: case 5: case 6: {
				System.out.println("상반기");
			}
			
			//자바에서 문자열 Switch case문이 지원된다.
			String medal = "Gold";
			switch(medal) {
			case "Gold" :
				System.out.println("금메달");
				break;
			case "Silver" :
				System.out.println("은메달");
				break;
				
			}
			//JRE 14에서부터 Switch Expression이 지원된다.
			// ,로 case를 표기하며 ->, yield 를 사용한다.
			// 이 때 yield의 경우 switch case문에서 return 값을 주고싶을 때 사용하는 것이다.
			
			int day_ = switch (month) {
			case 1, 3, 5, 7, 8, 10,12 ->{
	    		System.out.println("한 달은 31일입니다."); 
	    		yield 31;
	    	}
			default -> {
				System.out.println("없는 케이스입니다.");
				yield -1;
			}	
	    }; // yield는 반환값이기에 int day_와 같이 반환 값을 활용할 수 있도록해주면 사용할 수 있다.
	    
	      System.out.println("Case문 리턴 값은 "+ day_);
		}
			
			// for문 또한 c언어와 동일한 문법을 지닌다.
			
		}
	}
}
