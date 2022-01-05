package practice_package;

public class MakeReport {

		StringBuffer buffer = new StringBuffer();
		//String에서 +를 활용하여 문자열을 나열할 수도 있지만 메모리 Overhead가 큰편이다.
		//따라서 내부적으로 늘어날 수 있는 버퍼를 가지고 있는 클래스에 연결을 한 후 String으로 return하는게 효율적
		//대표적으로 StringBuilder, StingBuffer에서 append를 통해 문자열 표현
		
		private String line = "===========================================\n";
		private String title = "  이름\t   주소 \t\t  전화번호  \n";
		private void makeHeader() // private을 통해 외부에 정보를 공개하지 않았다. (개인정보를 굳이 오픈할 필요 X) 
		{
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);
		}
		
		private void generateBody()
		{
			buffer.append("홍길동 \t");
			buffer.append("Seoul Korea \t");
			buffer.append("010-1234-5678\n");
			
			buffer.append("김철수 \t");
			buffer.append("Busan Korea \t");
			buffer.append("010-1111-2222\n");
		}
		
		private void makeFooter()
		{
			buffer.append(line);
		}
		
		public String getReport() // 외부에서 사용할 수 있는 메서드는 Public 메서드인 getReport( )만 존재
		{
			makeHeader();
			generateBody();
			makeFooter();
			return buffer.toString();
		}


}
