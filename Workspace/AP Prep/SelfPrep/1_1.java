public class 1_1 {
    public static void main (String[] args) {


 

 
/*
Question 1
Part A
*/

public boolean record(int score) {
    for (int i = 0; i < scoreList.size(); i++) {
        if (scoreList.get(i).getScore() == score) {
            scoreList.get(i).increment();
            return false;
        } else if (scoreList.get(i).getScore() < score) {
            scoreList.add(i, new ScoreInfo(score));
            return true;
        }
    }

    scoreList.add(new ScoreInfo(score));
    return true;
}




/*
Part B
*/

public void recordScores(int[] stuScores) {
    for (int i = 0; i < stuScores.length; i++) {
        record(stuScores[i]);
    }
}




/*
Part C
*/

//Would add a
private int numSeniors;
//variable and set it to 0 in the original constructor, then I would add a
public void addSenior() {
    numSeniors++;
}
//method, which increases the number of seniors by one. I would also include a
public void incrementSenior() {
    numSeniors++;
    numStudents++;
}
//method for convenience. Then, I would add a
public double getSeniorPercent() {
    return ((double)numSeniors) / numStudents;
}
//method. This will make the process of acquiring the percentage of seniors who received a
//certain score very easy.





    }
}