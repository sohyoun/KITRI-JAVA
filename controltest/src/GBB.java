/*
**���� ���� �� ����.
1. 0(����), 1(����), 2(��)
2. �� : ���� (0,1,2)
3. ��� logic(�̱�, ��, ���)
4. ��� ���
	�� : ��2, �� : ����1, ��� : �̰��. 
	�� : ��2, �� : ��2, ��� : ����. 
	�� : ��2, �� : ����0, ��� : ����. 
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my =2;
		int com = (int)(Math.random() * 3);
		//random ������ 0���� 0.99999..������ ���� double ���·� ���
		//���� int�� ���� ����ȯ
		//int�� �ٲٸ� �׻� 1���� �۱� ������ 0�ۿ� �ȳ���
		//3�� ���ؼ� 0,1,2������ ��. ()���� �ؾ���.
		String comp;
		String result;
		if (my-com==1){
			result = "�̰��";
			comp = "����";
		}else if (my-com ==0){
			result = "����";
			comp = "��";
		}else {
			result = "����";
			comp = "����";
		}
		System.out.println("�� : ��, �� : "+comp+", ��� : "+result);
	}
}
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my =2;
		int com = (int)(Math.random() * 3);
		//random ������ 0���� 0.99999..������ ���� double ���·� ���
		//���� int�� ���� ����ȯ
		//int�� �ٲٸ� �׻� 1���� �۱� ������ 0�ۿ� �ȳ���
		//3�� ���ؼ� 0,1,2������ ��. ()���� �ؾ���.
		String comp;
		String result;
		switch (com){
			case 0 : comp = "����" ; result = "����"; break;
			case 1 : comp = "����" ; result = "�̰��"; break;
			default : comp = "��" ; result = "����";
		}
		
		System.out.println("�� : ��, �� : "+comp+", ��� : "+result);
	}
}
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		//random ������ 0���� 0.99999..������ ���� double ���·� ���
		//���� int�� ���� ����ȯ
		//int�� �ٲٸ� �׻� 1���� �۱� ������ 0�ۿ� �ȳ���
		//3�� ���ؼ� 0,1,2������ ��. ()���� �ؾ���.
		String myp;
		String comp;
		String result;
		if (my == 2)
		{
			myp="��";
			switch (com){
			case 0 : comp = "����" ; result = "����"; break;
			case 1 : comp = "����" ; result = "�̰��"; break;
			default : comp = "��" ; result = "����";
			}
		}else if (my == 1)
		{
			myp="����";
			switch (com){
			case 0 : comp = "����" ; result = "������"; break;
			case 1 : comp = "����" ; result = "����"; break;
			default : comp = "��" ; result = "����";
			}
		}else{
			myp="����";
			switch (com){
			case 0 : comp = "����" ; result = "����"; break;
			case 1 : comp = "����" ; result = "����"; break;
			default : comp = "��" ; result = "�̰��";
			}
		}
		
		
		System.out.println("�� : "+myp+", �� : "+comp+", ��� : "+result);
	}
}
*/

public class GBB {
	public static void main(String[] args) {
		int my = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		//random ������ 0���� 0.99999..������ ���� double ���·� ���
		//���� int�� ���� ����ȯ
		//int�� �ٲٸ� �׻� 1���� �۱� ������ 0�ۿ� �ȳ���
		//3�� ���ؼ� 0,1,2������ ��. ()���� �ؾ���.
		String mystr; //��
		String comstr; //��
		String resultstr; //���
		int result = (my-com+2)%3;

		if (result == 2){
			resultstr = "����";
		}else if (result == 1)
		{
			resultstr="�̰��";
		}else{
			resultstr="����";
		}
		
		switch (my){
			case 0 : mystr = "����";break;
			case 1 : mystr = "����";break;
			default : mystr = "��";break;
		}

		switch (com){
			case 0 : comstr = "����";break;
			case 1 : comstr = "����";break;
			default : comstr = "��";break;
		}
		System.out.println("�� : "+mystr+", �� : "+comstr+", ��� : "+resultstr);
	}
}