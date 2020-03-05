//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster1 implements Comparable {
	private int myWeight = 0;
	private int myHeight = 0;
	private int myAge = 0;

	public Monster1() {
	}

	public Monster1(int ht) {
		myHeight = ht;
	}

	public Monster1(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
	}

	public Monster1(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}

	public void setWeight(int wt) {
		myWeight = wt;
	}

	public void setHeight(int ht) {
		myHeight = ht;
	}

	public void setAge(int age) {
		myAge = age;
	}

	public int getWeight() {
		return myWeight;
	}

	public int getHeight() {
		return myHeight;
	}

	public int getAge() {
		return myAge;
	}

	public Object clone() {
		return new Monster1(myHeight, myWeight, myAge);
	}

	public boolean equals(Object obj) {
		Monster1 rhs = (Monster1) obj;

		if (myHeight == rhs.getHeight() && myWeight == rhs.getWeight() && myAge == rhs.getAge()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Object obj) {
		Monster1 rhs = (Monster1) obj;

		if (!equals(obj)) {
			if (myHeight > rhs.getHeight()) {
				return 1;
			} else if (myHeight < rhs.getHeight()) {
				return -1;
			} else if (myWeight > rhs.getWeight()) {
				return 1;
			} else if (myWeight < rhs.getWeight()) {
				return -1;
			} else if (myAge > rhs.getAge()) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	public String toString() {
		return myHeight + " " + myWeight + " " + myAge;
	}

}