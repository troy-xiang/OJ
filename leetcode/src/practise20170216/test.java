package practise20170216;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(new Solution461().hammingDistance(x, y));
		}*/
		System.out.println(new Solution476().findComplement(sc.nextInt()));
		sc.close();
	}

}
