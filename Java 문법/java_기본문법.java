package java_grammar;

import java.util.Scanner; // Java���� ǥ�� �Է��� �ޱ����� Ŭ���� ���̺귯��


public class java_��¹��� {
  public static void main(String [] args) {
			
			int num = 10;
			int bNum = 0B1010; // Binary�� 0B
			int oNum = 012;    // 8������ �տ� 0
			int xNum = 0xA;    // 16������ �տ� 0x
			
			System.out.println(num);
			System.out.println(bNum);
			System.out.println(oNum);
			System.out.println(xNum);
			
			double dnum = 3.14;
			float fnum = 3.14f; //���ͷ� �Ǽ����� 8byte�� ���������� �����ִ�.
			                   //���� float Ÿ�������� �ڵ鸵 �ϱ� ���� f�� �ٿ���.
			int inum = 3215;
			long lnum = 3215L; //���ͷ� �������� �⺻������ 4byte�̴�.
			                   //���� 8byte�� long������ �ڵ鸵�ϰ� ���� ��� L�� �ٿ�����Ѵ�.	
			
	        System.out.println(dnum);
	        System.out.println(fnum);
	        System.out.println(inum);
	        System.out.println(lnum);
	        
	        char ch1 = 'A';
			System.out.println(ch1);
			System.out.println((int)ch1);
			
			char ch2 = 66; // char������ 66 �Է� ���� �� ���ڰ� ��µȴ�.
			System.out.println(ch2);
			System.out.println((char)(ch2));
			
			int ch3 = 67;
			System.out.println(ch3);
		 	System.out.println((char)ch3);
			
			char han = '��';
		    char ch = '\uD55C';
		    System.out.println(han);
		    System.out.println(ch);
		    
		    var i = 10; // JRE 10 �̻���� �����̵Ǹ� �����ϵǸ鼭 �ڷ����� ������ �� ������
		 	var j = 10.0;
		 	var str = "test";
		 	
		 	System.out.println(i);
		 	System.out.println(j);
		 	System.out.println(str);
		 	
		 	var str2 = str;
		 	System.out.println(str2);
		 	
		 	str = "hello";
		 	// str = 3; var�� ���� string �ڷ������� ������ �����Ǿ����Ƿ�
		 	// java���� ������ �Ұ����Ͽ� error�� �߻��Ѵ�.
		 	
			final int MAX_NUM = 100; // final�� ���� ��������� �����Ƿ� ���Ŀ� ������ �ȵȴ�.
			final int MIN_NUM = 0;
			
			System.out.println(MAX_NUM);
			System.out.println(MIN_NUM);
			
			//��� ������ (+, - , * , /, %)
			//���� ���� ������(+=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, !=, ^=)
			byte ex_num1 = 127;
			byte ex_num2 = -4;
			
			ex_num1 >>>= 1; // ��Ʈ�� ���������� �̵��ϴµ� ���ʿ� ä������ ��Ʈ ���� 0�̴�.
			ex_num2 >>= 1; // ��Ʈ�� ���������� �̵��ϴµ� ���ʿ� ä������ ��Ʈ ���� ��ȣ��Ʈ�� �����ϴ�.
			
			System.out.println(ex_num1);
			System.out.println(ex_num2);
			// ������ ǥ���� �� 2�� ������ ��Ʈ�� ǥ���Ѵ�. (-n = ~n + 1(��Ʈ ���� ���� + 1�� 2�� �����̴�.))
			
			// ���׿�����, ��Ʈ������ ���� �����ڴ� C���� �����ϴ�.
			// if�� ���� c���� ������ �����̴�.
			
			Scanner scanner = new Scanner(System.in); // Scanner Ŭ������ Ȱ���Ͽ� ǥ�� �Է��� �ް��ִ�.
			int in_num = scanner.nextInt(); // Int���� �ްԴٴ� �ǹ��̴�.
			System.out.println(in_num);
			String str_2 = scanner.next(); // �� �ܾ �ްԵȴ�.
			System.out.println(str_2);
			str_2 = scanner.nextLine(); // nextLine()�� buffer�� ���๮�ڸ� ������ �Է��� �����ϴµ� �տ� �����ִ� ���๮�ڷ� ���� �Է��� ���� �ʾҴ�.                
			System.out.println(str_2); // ���۸� �ʱ�ȭ���ִ� �۾��� �ʿ��ϴ�.
			/*String�� ���� next();

              byte��� nextByte();

              short��� nextShort();

              int��� nextInt();

              long�̶�� nextLong();

              float��� nextFloat();

              double nextDouble();

              String�̸鼭 �Ѷ��� ��ü�� �о������ nextLine()
              
              1. next()�� �ϳ��� �ܾ �Է� �޴´�.

                 �׷��� ù �ܾ� ������ �����̳� ���๮�ڴ� ����������, ���� ���๮�ڴ� ���ۿ� ���� �ȴ�.



              2.  nextLine()�� ���๮�� ������ �� �ٷ� �ν��ϰ�, ���๮�ڴ� ��������.

                  next(), nextInt()���� ���� ���ڰ� ���� nextLine()�� ������, �̻��� ���װ� �����.

                  �׷��� ���๮�ڸ� ó���ϴ� �۾��� �ʿ��ϴ�.
			*/
			int month = 10;
			int day;
			
			switch(month) {
			case 10:	{
				System.out.println("10���Դϴ�.");
			}
			
			month = 1;
			
			switch(month) {
			case 1: case 2: case 3: case 4: case 5: case 6: {
				System.out.println("��ݱ�");
			}
			
			//�ڹٿ��� ���ڿ� Switch case���� �����ȴ�.
			String medal = "Gold";
			switch(medal) {
			case "Gold" :
				System.out.println("�ݸ޴�");
				break;
			case "Silver" :
				System.out.println("���޴�");
				break;
				
			}
			//JRE 14�������� Switch Expression�� �����ȴ�.
			// ,�� case�� ǥ���ϸ� ->, yield �� ����Ѵ�.
			// �� �� yield�� ��� switch case������ return ���� �ְ���� �� ����ϴ� ���̴�.
			
			int day_ = switch (month) {
			case 1, 3, 5, 7, 8, 10,12 ->{
	    		System.out.println("�� ���� 31���Դϴ�."); 
	    		yield 31;
	    	}
			default -> {
				System.out.println("���� ���̽��Դϴ�.");
				yield -1;
			}	
	    }; // yield�� ��ȯ���̱⿡ int day_�� ���� ��ȯ ���� Ȱ���� �� �ֵ������ָ� ����� �� �ִ�.
	    
	      System.out.println("Case�� ���� ���� "+ day_);
		}
			
			// for�� ���� c���� ������ ������ ���Ѵ�.
			
		}
	}
}
