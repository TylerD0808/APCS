package Labs1;
// *******************************************************************
//   Coin.java            Author: Lewis and Loftus
//
//   Represents a coin with two sides that can be flipped.
// *******************************************************************

public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;

    private int face;


    public Coin ()
    {
	flip();
    }

    
    public void flip()
    {
	face = (int) (Math.random() * 2);
    }

    
    public boolean isHeads()
    {
	return (face == HEADS);
    }

    
    public String toString()
    {
	String faceName;

	
	if (face == HEADS)
	    faceName = "Heads";
	else
	    faceName = "Tails";

	return faceName;
    }
}