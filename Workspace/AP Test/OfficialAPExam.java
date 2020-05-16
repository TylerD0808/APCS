public class OfficialAPExam {
    public static void main (String[] args) {


 


/*
Y999UZ89
TD

Question 1
Part A
*/


public double getCompoundAvg(String comp) {

    private int x = 0;
    private int total = 0;
    private double avg = -1.0;

    for (int i = 0; i < trialList.size(); i++) {
        Trial t = trialList.get(i);
        if (t.getCompound().equals(comp))
        {
            total += t.getTemp();
            x++;
        }
    }

    if (x != 0) {
        avg = ((double)total) / x;
    }

    return avg;
}


/*
Part B
*/


    public String getCompoundWithHigheestAvg() {

        private String c = getCompoundList.get(0);

        for (int i = 1; i < getCompoundList.size(); i++) {
           if (getCompoundAvg(getCompoundList.get(i) >= getCompoundAvg(c))) {
               c = getCompoundList.get(i);
           }
        }

        return c;
    }


/*
Part C
*/


    //Method header:
    public double getCompoundAmountUsed(String comp)
    //I would add a new private instance variable
    private double amountUsed;
    //into Trial. This would be instantiated in the new Trial constructor. This new
    //constructor will contain another parameter, which takes in a double, representing
    //the amount of that compound used. I would also add a
    public double getAmountUsed()
    //method, which returns the value of the amount used instance variable. No changes would
    //be made to the science experiment class to support this modification.

    }
}