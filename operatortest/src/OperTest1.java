public class OperTest1 
{
	public static void main(String[] args) 
	{
		int x = 10;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(x);

		char c = 'a';
		System.out.println("c == "+c);
		System.out.println("(int)c == "+ (int)c); //강제 형변환

		int y = c;
		System.out.println("y == " + y);//자동 형변환 : 2byte인 char를 4byte에 집어넣음. 
										//작은놈을 큰놈에 집어넣기 가능

		//c=y;  // error //큰놈을 작은 곳에 집어넣어야 함으로 그냥하면 에러남
		c=(char)y;
		System.out.println("c == "+c);//강제 형변환 : 
									  //그냥하면 에러남으로 압축해서 집어넣음.
		
		//char를 int로 바꿀 수 있는건 문자마다 아스키 코드 값이 있기 때문
		
		//boolean b = true;
		//int z =b; //에러남. boolean은 true,faulse만 있기 때문에 int로 바꿀 수 없다. 
		//형변환은 서로 바꿀 수 있는 type 끼리만 된다
		//기본데이터 타입에서는 숫자끼리만 된다
		
		//강제 형변환 = 명시적 형변환 =캐스팅 operator 
		//자동 형변환 = 묵시적 형변환 

		//형변환할 때 일단 바꿀 수 있는 type인지 생각
		//두번째로 강제로 할지 자동으로 할지 결정

		int z =30;
		double d =z;
		//z=d; //error
		z=(int)d;
	}
}
