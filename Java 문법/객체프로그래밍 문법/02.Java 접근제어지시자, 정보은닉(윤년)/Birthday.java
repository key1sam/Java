package practice_package;

public class Birthday {
	public static void main(String args[]) {
		
		//get(), set() �޼��带 Ȱ���Ͽ� ��ü ��������� ���������� �������ν� ������ ���� �� �ְ� ������� ���ϴ�.
		
		BirthdayClass date = new BirthdayClass();
		date.setYear(1999);
		date.setMonth(2);
		date.setDay(29);
		
		date.showDate();
	}

}
