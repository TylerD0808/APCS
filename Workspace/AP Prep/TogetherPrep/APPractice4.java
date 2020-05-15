//ming's practice ayyyy

public class APPractice4 {
    public static void main(String args[]) {

    }
    private ArrayList<WordPair> allPairs;



    //part a
    public WordPairList(String[] words) {
        for(int i = 0; i < words.length-1; i++) {
            for(int j = i; j < words.length; j++) {
                WordPair newPair = WordPair(words[i], words[j]);
                allPairs.add(newPair);
            }
        }
    }





    //part b
    public int numMatches() {
        int count = 0;
        for (int i = 0; i < allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSeconds())){
                count++;
            }
        }
        return count;
    }

}