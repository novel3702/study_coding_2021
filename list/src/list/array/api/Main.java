package list.array.api;

public class Main {

	public static void main(String[] args) {
		String[] Members1 = new String[] { "����", "�̴ٱ�", "��û��", "õ��" };
		System.out.println(Members1[0]);
		System.out.println(Members1[3]);

		int i = 0;
		System.out.println("for");
		for (i = 0; Members1.length > i; i++) {
			System.out.println(Members1[i]);

		}

	}

}
