public class BooleanOperatorsAndTypeComparison
{
	public static void main(String[] args) 
	{
		boolean a = true;
		boolean b = 4<3; //false
		//! not, && and, || or
		System.out.println("a: "+ a+"\t\t!a: "+!a);
		System.out.println("b: "+ b+"\t!b: "+!b);
		
		//Truth table for &&, ||
		b=a; // b is now true
		
		System.out.println("\nTruth Table\na\t\tb\t\ta && b\t\ta || b");
		System.out.println(a+"\t\t"+b+"\t\t"+(a && b)+"\t\t"+(a || b));
		b = !b; 
		System.out.println(a+"\t\t"+b+"\t\t"+(a && b)+"\t\t"+(a || b));
		a = b; 
		b = !a;
		System.out.println(a+"\t\t"+b+"\t\t"+(a && b)+"\t\t"+(a || b));
		b = !!a; 
		System.out.println(a+"\t\t"+b+"\t\t"+(a && b)+"\t\t"+(a || b));
		
		//order of operations: PEMD%AS, (>, >=, <, <=, !=, ==), !, &&, ||, (+=, -=, *=, /=, %=, =)
		System.out.println(7/11 <= 14%2 && !true || 7+3/2 >= 8);
		System.out.println(7/11 <= 14%2 && (!true || 7+3/2 >= 8));
		
		//Short circuited
		int total = 100;
		int count = 0;
		final int MAX = 5;
		if(count!=0 && total/count > MAX)
			System.out.println("Testing...");
		
		if(count==0 || total/count > MAX)
			System.out.println("Testing...");
		
		count = 10;
		if(count!=0 && total/count > MAX)
			System.out.println("Testing...");
		
		if(count!=0 || total/count > MAX)
			System.out.println("Testing count...");
		
		//char comparison (relation operators >, <= , ==, !=)
		char upperA = 'A';
		char lowerA = 'a';
		if(upperA < lowerA)
			System.out.println("\'A\' is smaller than \'a\'");
		
		//String comparison ( .equals(Str other), .equalsIgnoreCase(Str other), compareTo(Str other))
		String name1 = "Tyler";
		String name2 = "tyler";
		String name3 = "TYLER";
		
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		System.out.println("name1.toUppercase().equals(name2): " + name1.toUpperCase().equals(name2));
		System.out.println("name1.toUppercase().equals(name3): " + name1.toUpperCase().equals(name3));
		System.out.println("name1.equalsIgnoreCase(name3): " + name1.equalsIgnoreCase(name3));
		
		System.out.println("name1.compareTo(name1): " + name1.compareTo(name1));
		System.out.println("name1.compareTo(name2): " + name1.compareTo(name2));
		System.out.println("name1.compareTo(name3): " + name1.compareTo(name3));
		
		//Lexicographic ordering (A 65 and a 97)
		
		
		//double comparison
		double length1 = 123.567892;
		double length2 = 123.567231;
		if(Math.abs(length1-length2)<=0.001)
			System.out.println(length1 + " is close to " + length2);
		
		//increment and decrement operators ++ and --
		count = 1;
		count++;
		System.out.println(count);
		count--;
		System.out.println(count);
		
		//compound assignment operators +=, -=, *=, /=, %=
		count += 6;
		System.out.println(count);
		count -= 6;
		System.out.println(count);
		count *= 6;
		System.out.println(count);
		count /= 6;
		System.out.println(count);
		count %= 6;
		System.out.println(count);
		
		//compound assignment operators += as concatenation and advanced expression on right side
		String h = "Hello";
		String w = "World";
		h+=w;
		System.out.println(h);
		count+=3/2+4*3;
		System.out.println(count);
	}
}
