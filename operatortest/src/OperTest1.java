public class OperTest1 
{
	public static void main(String[] args) 
	{
		int x = 10;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(x);

		char c = 'a';
		System.out.println("c == "+c);
		System.out.println("(int)c == "+ (int)c); //���� ����ȯ

		int y = c;
		System.out.println("y == " + y);//�ڵ� ����ȯ : 2byte�� char�� 4byte�� �������. 
										//�������� ū�� ����ֱ� ����

		//c=y;  // error //ū���� ���� ���� ����־�� ������ �׳��ϸ� ������
		c=(char)y;
		System.out.println("c == "+c);//���� ����ȯ : 
									  //�׳��ϸ� ���������� �����ؼ� �������.
		
		//char�� int�� �ٲ� �� �ִ°� ���ڸ��� �ƽ�Ű �ڵ� ���� �ֱ� ����
		
		//boolean b = true;
		//int z =b; //������. boolean�� true,faulse�� �ֱ� ������ int�� �ٲ� �� ����. 
		//����ȯ�� ���� �ٲ� �� �ִ� type ������ �ȴ�
		//�⺻������ Ÿ�Կ����� ���ڳ����� �ȴ�
		
		//���� ����ȯ = ����� ����ȯ =ĳ���� operator 
		//�ڵ� ����ȯ = ������ ����ȯ 

		//����ȯ�� �� �ϴ� �ٲ� �� �ִ� type���� ����
		//�ι�°�� ������ ���� �ڵ����� ���� ����

		int z =30;
		double d =z;
		//z=d; //error
		z=(int)d;
	}
}
