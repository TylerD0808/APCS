//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MonsterRunner1 {
	public static void main(String args[]) {
		Monster1 zero = new Monster1();
		Monster1 one = new Monster1(8);
		Monster1 sue = new Monster1(9, 4);
		Monster1 harry = new Monster1(1, 2, 3);
		out.print("\nzero Monster :: " + zero);
		out.print("\none Monster :: " + one);
		out.print("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.print("\nchanging harry's properties ");
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster :: " + harry);

		out.print("\ncloning harry");
		sue = (Monster1) harry.clone();
		out.println("\nsue Monster :: " + sue);

		Monster1 mOne = new Monster1(33, 33, 11);
		Monster1 mTwo = new Monster1(55, 33, 11);

		out.print("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}