package constructor;

public class StarCraft {
	public static void main(String[] args) {
		Marine my=new Marine();

		Marine com=new Marine();
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		
		int count = 2;
		System.out.println("���� ���� "+count+"ȸ ����!!!");
		my.attack(com,count);
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		
		
		count = 4;
		System.out.println("���� ���� "+count+"ȸ ����!!!");
		com.attack(my,count);
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		//��ü�� : 60 ��ü�� : 80

		System.out.println("��� ����!!!");
		my.changeMode();
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		//��ü�� : 35 ��ü�� : 80

		count = 3;
		System.out.println("���� ���� "+count+"ȸ ����!!!");
		my.attack(com,count);
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		//��ü�� : 35 ��ü�� : 35

		System.out.println("��� ����!!!");
		my.changeMode();
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		//��� : ��� ���� �Ұ�!!!
		//��ü�� : 35 ��ü�� : 35

		count = 3;
		System.out.println("���� ���� "+count+"ȸ ����!!!");
		my.attack(com,count);
		System.out.println("��ü�� : "+my.getStatus()+" ��ü�� : "+com.getStatus());
		//��ü�� : 35 ��ü�� : die

	}
}
