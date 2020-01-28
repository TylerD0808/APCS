public class IntegerList
{
    int[] list; //values in the list
    int numInts;
    int listSize;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numInts = 0;
        listSize = size;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int)(Math.random() * 100) + 1;
        }
        
        numInts = listSize;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(i + ":\t" + list[i]);
        }
    }

    public void increaseSize()
    {
        int[] newList = new int[2 * listSize];
        for (int k = 0; k < listSize; k++)
        {
            newList[k] = list[k];
        }

        list = new int[2 * listSize];

        for (int k = 0; k < listSize; k++)
        {
            list[k] = newList[k];
        }

        listSize *= 2;
    }

    public void addElement(int newVal)
    {
        if (numInts == listSize)
        {
            increaseSize();
        }

        list[numInts] = newVal;
        numInts++;
    }

    public void removeFirst(int newVal)
    {
        for (int i = 0; i < listSize; i++)
        {
            if (list[i] == newVal)
            {
                for (int c = i; c < (numInts - 1); c++)
                {
                    list[i] = list[i + 1];
                }

                list[numInts - 1] = 0;
                numInts--;
                break;
            }
        }
    }

    public void removeAll(int newVal)
    {
        int valCount = 0;
        
        for (int p = 0; p < listSize; p++)
        {
            if (list[p] == newVal)
            {
                valCount++;
            }
        }

        for (int y = 0; y < valCount; y++)
        {
            removeFirst(newVal);
        }
    }
}