/*
1.  요금
	기본요금(basicPrice)
		일반 : 3800
		심야 : 5000
	요금합(totalPrice)
	요금(price)
		일반 : 100원/km
		심야 : 150원/km
2.  요금계산(calcPrice())
3. 심야할증 : 0시~6시

*/
import java.util.*;

public class Taxi extends Car {
    
    int basicPrice;
    int totalPrice;
    int price;
    int pricePerKm;

    public Taxi() {
        super();
    }

    public Taxi(String carName, String color, String maker) {
        super(carName, color, maker);
    }

    void initPrice() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if(hour < 6) {
            basicPrice = 5000;
            pricePerKm = 150;
        } else {
            basicPrice = 3800;
            pricePerKm = 100;
        }
    }

    int calcPrice(int km) {
        price = basicPrice + (km * pricePerKm);
        return price;
    }

    void sumPrice() {
        totalPrice += price;
        price = 0;
        basicPrice = 0;
    }

	/*
	@Override //method 이름 달라 에러 발생
	int speedup(int speed) { //method의 이름이 다르기 때문에 안됨
		this.speed += speed; // 이렇게 하나하나 Car의 코드를 불러오지 않고 한번에 올러오고 싶다.
		if (speed>150){
			this.speed = 150;
		}
		return this.speed;
	}
	*/

	/*
	@Override 
	int speedUp(int speed) { //상위 class보다 좁은 의미의 접근제어자는 사용할 수 없음.
		this.speed += speed; // 이렇게 하나하나 Car의 코드를 불러오지 않고 한번에 올러오고 싶다.
		if (speed>150){
			this.speed = 150;
		}
		return this.speed;
	}
	*/




	@Override // 이밑의 메소드는 오버라이딩한것이다 라고 알려주는 것.
	int speedUp(int speed) { // 상위클래스의 메소드를 하위클래스에게 맞게 재정의하는 것 : 오버라이딩
		//this.speed += speed; // 이렇게 하나하나 Car의 코드를 불러오지 않고 한번에 올러오고 싶다.
		//speedUp(speed); // 이렇게하면 무한루프 speedup이 이 클래스의 speedUP이 되어서
		speed = super.speedUp(speed); //상위클래스의 speedUP을 호출해라
		if (speed>150){
			this.speed = 150; //여기 만큼은 this. 써야함.
		}
		return this.speed;//여기도
	}

	@Override
		public String toString() { 
			return super.toString() + "택시";
		}

}
	

