public class APPractice1 {
    public static void main(String args[])
    {

        public int countElectronicsByMaker() {
            for (int i= 0; i < purchases.size(); i++)
            {
                if (purchases.get(i).isElectronic)
                {
                    if (purchases.get(i).getMaker == "maker")
                    {
                        int electronicCount = 0;
                        electronicCount++;
                    }
                    
                }
            }
            return electronicCount;

        }


        public boolean hasAdjacentEqualPair() {
            for (int i = 0; i <purchases.size()-1; i++)
            {
                if (purchases.get(i) == purchases.get(i+1))
                {
                    return true;
                }
                return false;

            }
        //return false
        }

        public Gizmo getCheapestGizmoByMaker() {}


        //I would be a loser cus i didnt answer part c


        public static boolean isValid(int numWithCheckDigit) {

            
            if (numWithCheckDigit.getCheck() == numWithCheckDigit%10)
            {
                return true;
            }
            return false;
        }

        // I would instantiate a variable called count (int count=0;) in the beginning of the program, where I could
        //keep track of how many times isValid is made with an incorrect check digit.
        //Then everytime isValid is returned false, the count variable would be incremented
        //by one (count++;). Then I would add a method called getCount() that returns an int, that would return
        //this value from the isValid method.
        


        




    }
}