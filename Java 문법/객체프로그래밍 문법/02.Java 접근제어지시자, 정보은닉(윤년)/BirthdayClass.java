package practice_package;

public class BirthdayClass {
	private int day; // integer�� Default ���� 0
	private int month;
	private int year;
	
	private boolean isValid; // boolean�� Default ���� false
		
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
			return month;
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}
	
	public int getDay() { //getDay �޼���
		return day;
	}
	
	public void setDay(int day) { //setDay �޼���
		 switch (month) {
		 case 1, 3, 5, 7, 8, 10, 12-> { // �ش� ������ 31�ϱ��� �����Ѵ�.
			 
			 if (day < 1 || day > 31) {
				 isValid = false;
			 }
			 else {
				 isValid = true;
				 this.day = day;
				 break;
			 }
		 }
		 
		 case 4, 6, 9, 11-> { // �ش� ������ 30�ϱ��� �����Ѵ�.
			 if (day < 1 || day > 30) {
				 isValid = false;
			 }
			 else {
				 isValid = true;
				 this.day = day;
				 break;
			 }
		 }
		 case 2 -> { // 2���� 28�ϱ��� �����Ѵ�. ���⿡�� 29�ϱ��� �����Ѵ�.
			if (day < 1 || day > 29) {
				isValid = false;
			}
			else {
				if (day == 29) { // ������ �������� ����ؾ��Ѵ�.
					if (year % 4 == 0) {
						if (year % 100 != 0) { // 4�� �����������, 100���� ������ �������� �ʾƾ� ����
							isValid = true;
							this.day = day;
							break;
						}
						else { // ���⼭�� 100���� ����������� ����. 400���� ������������ Ȯ���غ����Ѵ�.
							if (year % 400 == 0) {
								isValid = true;
								this.day = day;
								break;
							}
							else {
								isValid = false; // ������ �ƴϹǷ� 29���� ������ �� ����.
							}
						}
					}
					else { // year�� 4�� ����������� �ʴ� ��� -> ���� X
						isValid = false;
					}
				}
				else { // day�� 1 ~ 28�� ���
					isValid = true;
					this.day = day;
					break;
				}
			}
			 
		 }
			 
		 default -> { // month�� 1~12���� �ƴ� ���
			 isValid = false;
		}
	  }
		 
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "��" + month + "��" + day + "��");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
	
}