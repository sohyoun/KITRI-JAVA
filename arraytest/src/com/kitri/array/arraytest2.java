package com.kitri.array;

public class arraytest2 {
	public static void main(String[] args) {
		/*
		Car car[] = new Car[3];//3ĭ¥�� ���� ����. car�� ����Ŵ>�ڵ�����3�� ������ �� �մ� ����. �̰� ���� �ȿ� ����
							// �����ڸ� ȣ���� ���� �ƴ϶� �׳� 3���� ��ĭ�� ���� ��.
		
		System.out.println(car[0].getCarName());//null pointer exception : car[0]�� 0�ε� ��� �����ϳ�?
												//���� �ȿ� ���µ� ��� 0��°����� ���� �ִ���?
												//NULLpointer exception: . ���� ���� null�̶�� ��
		*/
		Car car[] = new Car[6];//6ĭ¥�� ����������
		car[0] = new Car("�Ÿ","������","����");
		car[1] = new Car("K5","���","���");
		car[2] = new Car("SM5","����","�Ｚ");
		car[3] = new Car("�ƹݶ�","���","����");
		car[4] = new Car("�Ͼ��","��ѱ��","���");//������� ������ �̿��� �� ����
		car[5] = new Car("��Ÿ��","������","����");
		
		int len = car.length;
		for (int i=0; i<len; i++)
			System.out.println(i+1+"��°���� : "+car[i]);
		/*
		//��ѱ�� �Ͼ��(���)�� 5��°�� �ֽ��ϴ�.
		String name = "�Ͼ��";		
		for (int i=0; i<len; i++) {
			if (name.equals(car[i].getCarName())) {//���ڿ��� ==�񱳸��� equals�� ��!!!!
				int j=i+1;
				System.out.println(car[i].getColor()+" "+car[i].getCarName()+
						"("+car[i].getMaker()+")"+"�� "+j+"��°�� �ֽ��ϴ�.");
				break;//�� break �ֱ�!
			}
		}
		*/
		//QM5�� �����ϴ�.
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
		if (findcar!=null) {//�� ==���� �ؾ���. =�� �� �ȵǴ°ɱ�?
			System.out.println(findcar.getColor()+" "+findcar.getCarName()+
					"("+findcar.getMaker()+")"+"�� "+count+"��°�� �ֽ��ϴ�.");
		}else {
			System.out.println(name+"�� �����ϴ�");
		}
		
	}

}
