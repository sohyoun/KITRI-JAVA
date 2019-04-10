/*
**가위 바위 보 게임.
1. 0(가위), 1(바위), 2(보)
2. 컴 : 난수 (0,1,2)
3. 결과 logic(이김, 짐, 비김)
4. 결과 출력
	나 : 보2, 컴 : 바위1, 결과 : 이겼다. 
	나 : 보2, 컴 : 보2, 결과 : 비겼다. 
	나 : 보2, 컴 : 가위0, 결과 : 졌다. 
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my =2;
		int com = (int)(Math.random() * 3);
		//random 난수는 0부터 0.99999..까지의 수를 double 형태로 출력
		//따라서 int로 강제 형변환
		//int로 바꾸면 항상 1보다 작기 때문에 0밖에 안나옴
		//3을 곱해서 0,1,2나오게 함. ()먼저 해야함.
		String comp;
		String result;
		if (my-com==1){
			result = "이겼다";
			comp = "바위";
		}else if (my-com ==0){
			result = "비겼다";
			comp = "보";
		}else {
			result = "졌다";
			comp = "가위";
		}
		System.out.println("나 : 보, 컴 : "+comp+", 결과 : "+result);
	}
}
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my =2;
		int com = (int)(Math.random() * 3);
		//random 난수는 0부터 0.99999..까지의 수를 double 형태로 출력
		//따라서 int로 강제 형변환
		//int로 바꾸면 항상 1보다 작기 때문에 0밖에 안나옴
		//3을 곱해서 0,1,2나오게 함. ()먼저 해야함.
		String comp;
		String result;
		switch (com){
			case 0 : comp = "가위" ; result = "졌다"; break;
			case 1 : comp = "바위" ; result = "이겼다"; break;
			default : comp = "보" ; result = "비겼다";
		}
		
		System.out.println("나 : 보, 컴 : "+comp+", 결과 : "+result);
	}
}
*/
/*
public class GBB {
	public static void main(String[] args) {
		int my = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		//random 난수는 0부터 0.99999..까지의 수를 double 형태로 출력
		//따라서 int로 강제 형변환
		//int로 바꾸면 항상 1보다 작기 때문에 0밖에 안나옴
		//3을 곱해서 0,1,2나오게 함. ()먼저 해야함.
		String myp;
		String comp;
		String result;
		if (my == 2)
		{
			myp="보";
			switch (com){
			case 0 : comp = "가위" ; result = "졌다"; break;
			case 1 : comp = "바위" ; result = "이겼다"; break;
			default : comp = "보" ; result = "비겼다";
			}
		}else if (my == 1)
		{
			myp="바위";
			switch (com){
			case 0 : comp = "가위" ; result = "이졌다"; break;
			case 1 : comp = "바위" ; result = "비겼다"; break;
			default : comp = "보" ; result = "졌다";
			}
		}else{
			myp="가위";
			switch (com){
			case 0 : comp = "가위" ; result = "비겼다"; break;
			case 1 : comp = "바위" ; result = "졌다"; break;
			default : comp = "보" ; result = "이겼다";
			}
		}
		
		
		System.out.println("나 : "+myp+", 컴 : "+comp+", 결과 : "+result);
	}
}
*/

public class GBB {
	public static void main(String[] args) {
		int my = (int)(Math.random() * 3);
		int com = (int)(Math.random() * 3);
		//random 난수는 0부터 0.99999..까지의 수를 double 형태로 출력
		//따라서 int로 강제 형변환
		//int로 바꾸면 항상 1보다 작기 때문에 0밖에 안나옴
		//3을 곱해서 0,1,2나오게 함. ()먼저 해야함.
		String mystr; //나
		String comstr; //컴
		String resultstr; //결과
		int result = (my-com+2)%3;

		if (result == 2){
			resultstr = "비겼다";
		}else if (result == 1)
		{
			resultstr="이겼다";
		}else{
			resultstr="졌다";
		}
		
		switch (my){
			case 0 : mystr = "가위";break;
			case 1 : mystr = "바위";break;
			default : mystr = "보";break;
		}

		switch (com){
			case 0 : comstr = "가위";break;
			case 1 : comstr = "바위";break;
			default : comstr = "보";break;
		}
		System.out.println("나 : "+mystr+", 컴 : "+comstr+", 결과 : "+resultstr);
	}
}