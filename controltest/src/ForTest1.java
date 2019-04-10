public class ForTest1 {
	public static void main(String[] args) {
		System.out.println("1 ~ 10까지 출력.");
		for (int i=1; i<11; i++ ) //database는 1부터 java는 0부터
		{
			System.out.print(i+" ");
		}
		System.out.println("\n1 ~ 10까지 출력.홀수만");
		for (int i=1; i<10; i+=2 )
		{
			System.out.print(i+" ");
		}

		System.out.println("\n1 ~ 100까지 출력.10개 단위 줄바꿈");
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
