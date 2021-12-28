package practice_package;

public class Birthday {
	public static void main(String args[]) {
		
		//get(), set() 메서드를 활용하여 객체 멤버변수에 접근제한을 가함으로써 오류를 막을 수 있고 디버깅이 편하다.
		
		BirthdayClass date = new BirthdayClass();
		date.setYear(1999);
		date.setMonth(2);
		date.setDay(29);
		
		date.showDate();
	}

}
