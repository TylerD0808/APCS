//ming
public class APPractice2 {
    public static void main (String[] args) {
    }

/*
PART A
*/
public static boolean isValid(int numWithCheckDigit){
    int lastDigit = numWithCheckDigit % 10;
    int checkDigit = getCheck(((int)numWithCheckDigit / 10));
    if (checkDigit == lastDigit) {
        return true;
    }
    return false;
}


/*
PART B
*/

//The CheckDigit class needs a new private static instance variable
private static int failedAttempts = 0;

//Before the return false statement in isValid, increment failedAttempts by 1
//...
failedAttempts++;
return false;
//...

//There should also be a get method to get the number of failed attempts
public int getFailedAttempts() {
    return failedAttempts;
}












/*
PART A
*/

    public int countElectronicsByMaker(String maker) {
        int count = 0;
        for(int i = 0; i < purchases.size() - 1; i++) {
            if(purchase.get(i).isElectronic == true && purchase.get(i).getMaker() == maker) {
                count++;
            }
        }
        return count;
    }

/*
PART B
*/
    
    public boolean hasAdjacentEqualPair() {
        for(int i = 0; i < purchases.size() - 1; i++) {
            if(purchases.get(i).equals(purchases.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

/*
PART C
*/

    //OnlinePurchaseManager class will need a new method:
    public Gizmo getCheapestGizmoByMaker(String maker) {

    }

    //Gizmos class needs a getPrice method and a price variable to be set by the contructor (by passing in a value or pre-assigning one)
    // price will be a private int variable
    private int price;

    //getPrice() will be a public method that returns an int
    public int getPrice() {

    }

    //constructor will need another argument (int price) and will set the private price variable 

}
}