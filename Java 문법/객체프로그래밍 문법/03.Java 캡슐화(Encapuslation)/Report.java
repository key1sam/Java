package practice_package;

public class Report {

	public static void main(String[] args) {

		MakeReport report = new MakeReport();
		String builder = report.getReport();
		
		System.out.println(builder);
		// ��ü�������α׷��ֿ��� �߿��� �� : 
		// 1. ��� ������ ������ ���ΰ�? 
		// 2. ȿ�������� ��ü�� ������ �� �ְ� �޼���, �ʵ� �ο� 
	}
}
