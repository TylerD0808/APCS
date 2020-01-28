package Labs1;

public class Lab4Class 
{
	String f, m, l, name, nameWithoutSpace;
	
	public Lab4Class (String first, String middle, String last)
	{
		f = first;
		m = middle;
		l = last;
		name = f + " " + m + " " + l;
	}
	
	public String getFirst()
	{
		return f;
	}
	
	public String getMiddle()
	{
		return m;
	}
	
	public String getLast()
	{
		return l;
	}
	
	public String firstMiddleLast()
	{
		return name;
	}
	
	public String lastFirstMiddle()
	{
		return l + ", " + f + " " + m;
	}
	
	public boolean equals(Lab4Class otherName)
	{
		if (name.equalsIgnoreCase(otherName.firstMiddleLast()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String initials()
	{
		String fInitial = f.substring(0, 1);
		String mInitial = m.substring(0, 1);
		String lInitial = l.substring(0, 1);
		return fInitial.toUpperCase() + mInitial.toUpperCase() + lInitial.toUpperCase();
	}
	
	public int length()
	{
		int nameLength = name.length();
		int length = 0;
		int i = 0;
		
		while (nameLength > 0)
		{
			if (name.charAt(i) != ' ')
			{
				length++;
			}
			
			i++;
			nameLength--;
		}
		
		return length;
	}
}