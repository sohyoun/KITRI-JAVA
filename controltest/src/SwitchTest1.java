public class SwitchTest1 {
	public static void main(String[] args) {
		int num = 1; //���� ����
		switch(num) {
			case 1 : System.out.println("1�Դϴ�.");break;
			case 2 : System.out.println("2�Դϴ�.");break;
			case 3 : System.out.println("3�Դϴ�.");break;
			default : System.out.println("123�ƴմϴ�.");
		}

		char c = 'a'; //�ƽ�Ű�ڵ尪 ���� char�� ����
		switch(c){
			case 97 : System.out.println("1�Դϴ�.");break;
			case 98 : System.out.println("2�Դϴ�.");break;
			case 99 : System.out.println("3�Դϴ�.");break;
			default : System.out.println("123�ƴմϴ�.");
		}

		String str = "java"; //����6������ String���� switch���� �� �� ����. 
							 //jdk 7�̻󿡼��� ���ڿ� �� ����
		switch(str){
			case "oracle" : System.out.println("oracle�Դϴ�.");break;
			case "java" : System.out.println("java�Դϴ�.");break;
			case "jsp" : System.out.println("jsp�Դϴ�.");break;
			default : System.out.println("���� �ƴմϴ�.");
		}
		System.out.println("���α׷�����!!!");
	}
}
