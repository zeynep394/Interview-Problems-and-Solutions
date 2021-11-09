public class Main {

    public static boolean checkPermutation(String word1, String word2){
        boolean permutation = false;
        
        int wordList1[] = new int[26];
        int wordList2[] = new int[26];

        if(word1.length() != word2.length()){
            return false;
        }else {
            for (int i = 0; i < word1.length(); i++) {
                wordList1[(int) word1.charAt(i) - 97] += 1;
                wordList2[(int) word2.charAt(i) - 97] += 1;
            }
        }
        if(Arrays.equals(wordList1,wordList2)){
            permutation = true;
        }
        return permutation;
    }
    public static void main(String[] args) {
	// write your code here
        boolean value = checkPermutation("abcd","bcda");
        System.out.println(value);
    }
}
