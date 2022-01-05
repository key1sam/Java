package practice_package;

public class Report {

	public static void main(String[] args) {

		MakeReport report = new MakeReport();
		String builder = report.getReport();
		
		System.out.println(builder);
		// 객체지향프로그래밍에서 중요한 점 : 
		// 1. 어떠한 정보를 공개할 것인가? 
		// 2. 효율적으로 객체를 관리할 수 있게 메서드, 필드 부여 
	}
}
