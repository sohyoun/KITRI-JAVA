public class IfElseIfTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 100;

		String dr;
		if (x==y)
		{
			dr = "����";
		} else if (x>y)
		{
			dr = "ũ��";
		} else {
			dr = "�۴�";
		}
		
		/*
		ds = x == y ? "����" : (x > y ? "ũ��" : "�۴�");
		*/ //���׿����ڷε� �� �� ������ �������� ��������.

		System.out.println(x + "�� " + y + "���� " + dr);
	}
}
