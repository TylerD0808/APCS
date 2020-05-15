//Tyler

public class APPractice5 {
    public static void main (String[]args) {
        /*
        A
        */

        //allPairs = new ArrayList<WordPair>();
        
        public wordPairList(String[] words) {
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    allPairs.add(new WordPair(words[i], words[j]));
                }
            }
        }

        /*
        B
        */

        public int numMatches() {
            int count = 0;
            for (int i = 0; i < allPairs.size(); i++) {
                WordPair wp = allPairs.get(i);
                if (wp.getFirst().equals(wp.getSecond())) {
                    count++;
                }
            }

            return count;
        }

        /*
        A
        */

        public digits (int num) {
            digitList = new ArrayList<Integer>();

            if (num == 0) {
                digitList.add(0);
            }
            
            while (num > 0) {
                digitList.add(0, num % 10);
                num = num / 10;
            }
        }

        /*
        B
        */

        public boolean isStrictlyIncreasing() {

            if (digitList.size() == 1) {
                return true;
            }

            for (int i = 0; i < digitList.size() - 1; i++) {
                if (digitList.get(i) >= digitList.get(i + 1)) {
                    return false;
                }
            }

            return true;
        }

    }
}