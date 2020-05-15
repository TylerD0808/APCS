//megan


public class APPractice3 {
    public static void main(String args[]) 
    {
       public WordPairList(String[] words) 
       {
           allPairs = new ArrayList<WordPair>();
           for (int i = 0; i < words.length-1; i++)
            for (int j = 0; j < words.length; j++)
                allPairs.add(new WordPair(words[i], words[j]));
       }
    }
    public int numMatches()
    {
        int matches = 0;
        for (WordPair pair: allPairs)
        {
            if (pair.getFirst().equals(pair.getSecond()))
            {
                matches++;
            }
        }
        return matches;
    }
}