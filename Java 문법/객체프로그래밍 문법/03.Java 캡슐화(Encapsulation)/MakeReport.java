package practice_package;

public class MakeReport {

		StringBuffer buffer = new StringBuffer();
		//String���� +�� Ȱ���Ͽ� ���ڿ��� ������ ���� ������ �޸� Overhead�� ū���̴�.
		//���� ���������� �þ �� �ִ� ���۸� ������ �ִ� Ŭ������ ������ �� �� String���� return�ϴ°� ȿ����
		//��ǥ������ StringBuilder, StingBuffer���� append�� ���� ���ڿ� ǥ��
		
		private String line = "===========================================\n";
		private String title = "  �̸�\t   �ּ� \t\t  ��ȭ��ȣ  \n";
		private void makeHeader() // private�� ���� �ܺο� ������ �������� �ʾҴ�. (���������� ���� ������ �ʿ� X) 
		{
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);
		}
		
		private void generateBody()
		{
			buffer.append("ȫ�浿 \t");
			buffer.append("Seoul Korea \t");
			buffer.append("010-1234-5678\n");
			
			buffer.append("��ö�� \t");
			buffer.append("Busan Korea \t");
			buffer.append("010-1111-2222\n");
		}
		
		private void makeFooter()
		{
			buffer.append(line);
		}
		
		public String getReport() // �ܺο��� ����� �� �ִ� �޼���� Public �޼����� getReport( )�� ����
		{
			makeHeader();
			generateBody();
			makeFooter();
			return buffer.toString();
		}


}
