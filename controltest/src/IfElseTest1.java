public class IfElseTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		/*
		if (x>y)
		{
			System.out.println(x + "�� " +  y + "���� ũ��.");
		} else {
			System.out.println(x + "�� " +  y + "���� �۴�.");
		}
		*/
		String ds;
		if (x == y)
		{
			ds = "����.";
		} else{
			if (x>y)
			{
				ds = "ũ��";
			}else{
			ds = "�۴�.";
			}
		}
		//���� �� ���� �ϴ� ���� ����.
		
		//���� ���� if else�� �ٲٱ�
		
		System.out.println(x + "�� " +  y + "���� " + ds);
		System.out.println("���α׷� ����!!!");
	}
}
