public class OperTest4 {
	public static void main(String[] args) {
		//삼항연산자
		int jumin = 2;
		String gender = jumin % 2 == 0 ? "여자" : "남자" ;
		
		System.out.println("주민번호가 " + jumin + "인 당신은 " +gender +"입니다.");
		
		//점수가 80이상이면 합격,80미만이면 불합격
		//당신의 점수는 XX이므로 XX입니다.
		int score = 80;
		String result = (score>=80) ? "합격" : "불합격";
		System.out.println("당신의 점수는 " + score + "이므로 " + result + "입니다.");
	}
}
