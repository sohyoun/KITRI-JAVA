public class ForTest2 {
	public static void main(String[] args) {
		//5��
		/*
		int dan = 5;
		for (int i=1;i<10;i++ )
		{
			int result = 5* i;
			System.out.println(dan + "*"+i+"="+result);
		}
		*/
		//������1
		System.out.println("������1");
		int result;
		for (int j=1;j<10;j++){
			for (int i=2;i<10 ;i++)
			{
				result = i*j;
				System.out.print(i+"*"+j+"="+result+"   ");
			}
			System.out.println();
		}

		//������2
		System.out.println("������2");
		for (int j=2;j<10;j++)
		{
			for (int i=1;i<10;i++)
			{
				result = j*i;
				System.out.print(j+"*"+i+"="+result+"   ");
			}
			System.out.println();
		}
		
	}
}
