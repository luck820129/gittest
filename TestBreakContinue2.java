package module07_08;
/*
 * �j��f�tcontinue�P���Ҫ��d�һ���
 */
public class TestBreakContinue2 {

	public static void main(String[] args) {
		int i = 1;
		int j;
		int c = 1
		String a ;
		String b;

		outer: 
			while (i <= 3) {
			i++;
			j = 0;
			while (j <= 5) {
				j++;
				if (j == 4) {
					continue outer;
				}
				System.out.println(j);
			}
		}

	}

}
