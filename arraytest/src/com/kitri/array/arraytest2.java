package com.kitri.array;

public class arraytest2 {
	public static void main(String[] args) {
		/*
		Car car[] = new Car[3];//3칸짜리 공간 만듦. car가 가르킴>자동차를3대 저장할 수 잇는 공간. 이건 차가 안에 없음
							// 생성자를 호출한 것이 아니라 그냥 3개의 빈칸을 만든 것.
		
		System.out.println(car[0].getCarName());//null pointer exception : car[0]이 0인데 어떻게 참조하냐?
												//차가 안에 없는데 어떻게 0번째차라는 것이 있느냐?
												//NULLpointer exception: . 앞의 것이 null이라는 것
		*/
		Car car[] = new Car[6];//6칸짜리 빈공간만들고
		car[0] = new Car("쏘나타","검정색","현대");
		car[1] = new Car("K5","흰색","기아");
		car[2] = new Car("SM5","은색","삼성");
		car[3] = new Car("아반떼","흰색","현대");
		car[4] = new Car("니어로","비둘기색","기아");//빈공간에 생성자 이용해 차 생성
		car[5] = new Car("싼타페","검정색","현대");
		
		int len = car.length;
		for (int i=0; i<len; i++)
			System.out.println(i+1+"번째구역 : "+car[i]);
		/*
		//비둘기색 니어로(기아)는 5번째에 있습니다.
		String name = "니어로";		
		for (int i=0; i<len; i++) {
			if (name.equals(car[i].getCarName())) {//문자열은 ==비교말고 equals로 비교!!!!
				int j=i+1;
				System.out.println(car[i].getColor()+" "+car[i].getCarName()+
						"("+car[i].getMaker()+")"+"는 "+j+"번째에 있습니다.");
				break;//꼭 break 넣기!
			}
		}
		*/
		//QM5는 없습니다.
		String name="QM5";
		Car findcar = null;
		int count=0;
		for (int i=0; i<len; i++) {
			if (name.equals(car[i].getCarName())) {
				findcar = car[i];
				count = i+1;
				break;
			}
		}
		if (findcar!=null) {//꼭 ==으로 해야함. =는 왜 안되는걸까?
			System.out.println(findcar.getColor()+" "+findcar.getCarName()+
					"("+findcar.getMaker()+")"+"는 "+count+"번째에 있습니다.");
		}else {
			System.out.println(name+"는 없습니다");
		}
		
	}

}
