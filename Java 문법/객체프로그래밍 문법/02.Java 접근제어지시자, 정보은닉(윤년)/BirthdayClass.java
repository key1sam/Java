package practice_package;

public class BirthdayClass {
	private int day; // integer의 Default 값은 0
	private int month;
	private int year;
	
	private boolean isValid; // boolean은 Default 값이 false
		
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
	
	public int getDay() { //getDay 메서드
		return day;
	}
	
	public void setDay(int day) { //setDay 메서드
		 switch (month) {
		 case 1, 3, 5, 7, 8, 10, 12-> { // 해당 월들은 31일까지 존재한다.
			 
			 if (day < 1 || day > 31) {
				 isValid = false;
			 }
			 else {
				 isValid = true;
				 this.day = day;
				 break;
			 }
		 }
		 
		 case 4, 6, 9, 11-> { // 해당 월들은 30일까지 존재한다.
			 if (day < 1 || day > 30) {
				 isValid = false;
			 }
			 else {
				 isValid = true;
				 this.day = day;
				 break;
			 }
		 }
		 case 2 -> { // 2월은 28일까지 존재한다. 윤년에는 29일까지 존재한다.
			if (day < 1 || day > 29) {
				isValid = false;
			}
			else {
				if (day == 29) { // 연도가 윤년인지 계산해야한다.
					if (year % 4 == 0) {
						if (year % 100 != 0) { // 4로 나누어떨어지고, 100으로 나누어 떨어지지 않아야 윤년
							isValid = true;
							this.day = day;
							break;
						}
						else { // 여기서는 100으로 나누어떨어지는 숫자. 400으로 나누어지는지 확인해봐야한다.
							if (year % 400 == 0) {
								isValid = true;
								this.day = day;
								break;
							}
							else {
								isValid = false; // 윤년이 아니므로 29일이 존재할 수 없다.
							}
						}
					}
					else { // year가 4로 나누어떨어지지 않는 경우 -> 윤년 X
						isValid = false;
					}
				}
				else { // day가 1 ~ 28일 경우
					isValid = true;
					this.day = day;
					break;
				}
			}
			 
		 }
			 
		 default -> { // month가 1~12월이 아닌 경우
			 isValid = false;
		}
	  }
		 
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년" + month + "월" + day + "일");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
}