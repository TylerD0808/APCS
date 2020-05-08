/*
(a) Write the countElectronicsByMaker method. The method
examines the ArrayList instance variable purchases to determine
how many Gizmo objects purchased are electronic and are manufactured
by maker.
Assume that the OnlinePurchaseManager object opm has been
declared and initialized so that the ArrayList purchases contains
Gizmo objects as represented in the following table.

Index in purchases
0 1 2 3 4 5

Value returned by method call isElectronic()
true false true false true false

Value returned by method call getMaker()
“ABC” “ABC” “XYZ” “lmnop” “ABC” “ABC”

The following table shows the value returned by
some calls to countElectronicsByMaker.
Method Call Return Value
opm.countElectronicsByMaker(“ABC”) 2
opm.countElectronicsByMaker(“lmnop”) 0
opm.countElectronicsByMaker(“XYZ”) 1
opm.countElectronicsByMaker(“QRP”) 0
*/
//Practice for AP Exam

//Tyler
public class APPractice {
    public static void main(String args[]) {

        
        public int returnElectronicsByMaker (String maker) {
            int n = 0;
            for (int i = 0; i < purchases.size(); i++) {
                if ((purchases.get(i).getMaker()).equals(maker) && purchases.get(i).isElectronic()) {
                    n++;
                }
            }

            return n;
        }

        





        public boolean hasAdjacentPair() {
            if (purchases.size < 2) {
                return false;
            } else {
                for (int j = 1; j < purchases.size(); j++) {
                    if (purchases.get(j).equals(purchases.get(j - 1))) {
                        return true;
                    }
                }

                return false;
            }
        }





        public Gizmo getCheapestGizmoByMaker(String maker)

        /*I would change Gizmo by adding an instance variable called “private double price”. 
        This would be instantiated in the Gizmo constructor. I would then add a method 
        inside of the Gizmo class called “public double getPrice()”, which returns the 
        price of the Gizmo. This method would be implemented in the getCheapestGizmoByMaker
        method of the OnlinePurchaseManager class. It would be compared to the other items
        made by the same maker, and saved into another variable “double lowestPriceByMaker”
        inside getCheapestGizmoByMaker. This would track the lowest price of a Gizmo made
        by the specific maker, then be returned at the end of the method.*/















2. a.

        public static boolean isValid (int numWithCheckDigit) {
            if (numWithCheckDigit % 10 == getCheck(((int)numWithCheckDigit / 10))) {
                return true;
            } else {
                return false;
            }
        }
b.

    /*I would add a new variable "private static int n = 0" to the CheckDigit class, which keeps track of how many times
    check digit is run. So, each time that isValid is run, n would increase by 1 when isValid would return false.
    */
    }
}






















//yoyoyoyoyoyoyoyoyo