//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String name;
		int size;

		System.out.print("Enter first monster's name: ");
		name = scan.nextLine();
		System.out.print("Enter first monster's size: ");
		size = scan.nextInt();
		scan.nextLine();
		Monster monster1 = new Skeleton(name, size);

		System.out.println();

		System.out.print("Enter second monster's name: ");
		name = scan.nextLine();
		System.out.print("Enter second monster's size: ");
		size = scan.nextInt();
		scan.nextLine();
		Monster monster2 = new Zombie(name, size);

		System.out.println();

		System.out.println("Monster 1: " + monster1.toString());
		System.out.println("Monster 2: " + monster2.toString());

		System.out.println();

		if (monster1.isBigger(monster2)) {
			System.out.println("Monster 1 is bigger than Monster 2");
		} else if (monster1.isSmaller(monster2)) {
			System.out.println("Monster 1 is smaller than Monster 2");
		} else {
			System.out.println("Monster 1 is the same size as Monster 2");
		}

		if (monster1.namesTheSame(monster2)) {
			System.out.println("Monster 1 has the same name as Monster 2");
		} else {
			System.out.println("Monster 1 does not have the same name as Monster 2");
		}
	}
}