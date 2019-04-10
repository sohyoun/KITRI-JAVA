public class WhileTest1 {
	public static void main(String[] args) {
		System.out.println("1 ~ 10까지 출력.");
		int i = 0;
		while (i < 10){
			System.out.println(++i);
		}

		System.out.println("1 ~ 10까지 출력.");
		boolean flag = true;
		int n=0;
		while (flag) //무한 루프 
		{
			n++;
			int number = (int)(Math.random()*11); //0 - 11
			if (number != 0){
				System.out.println ("number == " + number);
			} else {
				
				System.out.println ("0이 발생("+n+"번째)되어 프로그램 종료 !!!");
				flag = false;
			}
		}
	}
}
