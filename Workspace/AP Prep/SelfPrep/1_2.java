public class 1_2 {
    public static void main (String[] args) {





/*
Question 2
Part A
*/

private String recombine (String word1, String word2) {
    String x = word1.substring(0, word1.length() / 2);
    String y = word2.substring(word2.length() / 2);

    return x + y;
}




/*
Part B
*/

//Method header would be
public boolean checkValidLength (String word1, String word2)
//I would first use the recombine method with these 2 words and store it into a new
private String combinedWord;
//variable. I would then compare the lengths of word1, word2, and combinedWord in an if
//statement. If the combinedWord's length is greater than or equal to the length of word1
//and greater than or equal to the length of word2, then return false. Then I would add an
//else statement, which returns true. Nothing else is required because at that point, we have
//already determined that combinedWord is valid.



/*
Part C
*/





    }
}