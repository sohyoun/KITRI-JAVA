public class AbstractTest2 {
	public static void main(String[] args) throws Exception{

		//3. �ܺ�Ŭ���� ����.
		//java.lang�� Process ���� abstract class������ new �ȵ�.
		//���� Ŭ���� �ֳ� �ô��� ����.
		//�ڽ��� ��ü�� return�ϴ� static method�� ����
		//�ܺ� Ŭ���� Runtime ���� private�̾ ���� Ŭ���� X, static method �� 2�� �� �� ����.
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("calc");
		System.out.println("");
	}
}
