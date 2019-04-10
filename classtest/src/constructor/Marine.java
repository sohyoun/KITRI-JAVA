package constructor;

/*
1.체력 : hp 100, 모드 : (0 : 일반, 1 : 흥분)
2. 공격 attack()
		1회 공격 당 적 체력 (0 : -10, 1 : -15)

   모드변경 changeMode()
   		내체력 -25;
		내체력 40이하일 경우는 모드 변경 불가.

		call by value
		call by reference
*/
public class Marine {
    int hp ;
    int mode;
	int power;
	
    public Marine(){
		hp=100;
        mode=0;
		power =10;
    }


    void attack(Marine enemy,int count) {
		if (mode==0){
			for (int i=0;i<count ;i++ )
				enemy.hp-=power;
		} else {
			for (int i=0;i<count ;i++ )
				enemy.hp-=power;
		}
    }

    void changeMode() { //mode 바꾸는 method
		if (hp>40){
			hp-=25;
			mode =1;
			power=15;
		} else{
			System.out.println("경고 : 모드변경불가!!!");
		}
    }

	String getStatus() { //현재 상태 표시하는 method
		return hp <0 ? "die" : hp + "";//숫자에 문자열 더하면 문자열 됨.
	}
}
