public class OperTest4 {
	public static void main(String[] args) {
		//���׿�����
		int jumin = 2;
		String gender = jumin % 2 == 0 ? "����" : "����" ;
		
		System.out.println("�ֹι�ȣ�� " + jumin + "�� ����� " +gender +"�Դϴ�.");
		
		//������ 80�̻��̸� �հ�,80�̸��̸� ���հ�
		//����� ������ XX�̹Ƿ� XX�Դϴ�.
		int score = 80;
		String result = (score>=80) ? "�հ�" : "���հ�";
		System.out.println("����� ������ " + score + "�̹Ƿ� " + result + "�Դϴ�.");
	}
}
