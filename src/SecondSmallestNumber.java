import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondSmallestNumber {
	ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice");
		String choose = sc.next();

		if (choose.equalsIgnoreCase("secSmallestNumberWithLoop")) {
			SecondSmallestNumber s = new SecondSmallestNumber();
			int small = s.secSmallestNumberWithLoop();
			System.out.println("Second Smallest Number using loop concept " + small);
		}

		else if (choose.equalsIgnoreCase("secSmallestNumberWithoutLoop")) {

			SecondSmallestNumber s = new SecondSmallestNumber();
			int small1 = s.secSmallestNumberWithoutLoop();
			System.out.println("Second Smallest Number without using loop concept " + small1);
		}

	}

	public int secSmallestNumberWithLoop() {

		al.add(9);
		al.add(4);
		al.add(10);

		int min = al.get(0);
		int secMin = al.get(0);

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == min) {
				secMin = min;
			} else if (al.get(i) < min) {
				secMin = min;
				min = al.get(i);
			} else if (al.get(i) < secMin) {
				secMin = al.get(i);
			}
		}

		return secMin;

	}

	public int secSmallestNumberWithoutLoop() {

		al.add(1);
		al.add(4);
		al.add(10);

		int secMin;
		Collections.sort(al);
		secMin = al.get(1);
		return secMin;

	}

}
