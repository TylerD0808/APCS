public class OfficialAPExam2 {
    public static void main (String[] args) {





/*
Y999UZ89
TD

Question 2
Part A
*/


    public static boolean runSimulation(int sampleSize) {

        private int x = 0;
        private int x1;
        private int y = 0;
        private int y1;

        for (int i = 0; i < sampleSize / 2; i++) {
            x1 = getInt();
            if (isTarget(x1) && x1 > 0) {
                x++;
            }
        }

        for (int i = sampleSize / 2; i < sampleSize; i++) {
            y1 = getInt();
            if (isTarget(y1) && y1 > 0) {
                y++;
            }
        }

        if (x > y) {
            return true;
        } else {
            return false;
        }

    }


/*
Part B
*/

    //I would start off by adding a new
    private static int sampleSize;
    //instance variable. I would add another TargetIntegers class constructor,    
    //which takes in a positive, even int parameter, so the value of sampleSize
    //could be set by the person. I would also add 
    sampleSize = 6;
    //to the default constructor, just in case. This value would feed in directly to
    //the runSimulation parameter.


/*
Part C
*/





    }
}