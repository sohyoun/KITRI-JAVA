package constructor;

/*
1.ü�� : hp 100, ��� : (0 : �Ϲ�, 1 : ���)
2. ���� attack()
		1ȸ ���� �� �� ü�� (0 : -10, 1 : -15)

   ��庯�� changeMode()
   		��ü�� -25;
		��ü�� 40������ ���� ��� ���� �Ұ�.

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

    void changeMode() { //mode �ٲٴ� method
		if (hp>40){
			hp-=25;
			mode =1;
			power=15;
		} else{
			System.out.println("��� : ��庯��Ұ�!!!");
		}
    }

	String getStatus() { //���� ���� ǥ���ϴ� method
		return hp <0 ? "die" : hp + "";//���ڿ� ���ڿ� ���ϸ� ���ڿ� ��.
	}
}
