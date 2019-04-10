public class WhileGugudan {
	public static void main(String[] args) {
		int i=1;
		while (i<9)
		{
			i++;
			int j=1;
			while (j<10)
			{
				int result = i * j;
				System.out.print(i+"*"+j+"="+result+"   ");
				j++;
			}
			System.out.println();
		}
		
	}
}
