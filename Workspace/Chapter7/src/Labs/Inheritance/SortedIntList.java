public class SortedIntList extends IntList
{
    public SortedIntList(int size)
    {
        super(size);
    }

    public void add(int value)
    {
    if (numElements == list.length)
        System.out.println("Can't add, list is full");
    else if (numElements == 0)
    {
        list[0] = value;
        numElements++;
    }
	else
	    {
            for (int y = 0; y < numElements; y++)
            { 
                if (value < list[y])
                {
                    for (int x = list.length - 1; x > y; x--)
                    {
                        list[x] = list[x - 1];
                    }
                    list[y] = value;
                    break;
                }
            }
            if 
            {
                numElements++;
            }
            numElements++;
	    }
    }
}