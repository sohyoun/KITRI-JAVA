public class ForTest1 {
	public static void main(String[] args) {
		System.out.println("1 ~ 10���� ���.");
		for (int i=1; i<11; i++ ) //database�� 1���� java�� 0����
		{
			System.out.print(i+" ");
		}
		System.out.println("\n1 ~ 10���� ���.Ȧ����");
		for (int i=1; i<10; i+=2 )
		{
			System.out.print(i+" ");
		}

		System.out.println("\n1 ~ 100���� ���.10�� ���� �ٹٲ�");
		for (int j=1 ; j<101; j=j+10 )
		{
			for (int i=j; i<j+10; i++)
			{
				System.out.print(i+" ");
			}
			//System.out.print(j+" ");
			System.out.println("\n");
		}
	}
}
