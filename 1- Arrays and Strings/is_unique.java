public class Main {
    public static void is_unique(String word){
        char[] wordArray = word.toCharArray();
        ArrayList<Character>  arrayList = new ArrayList<Character>();
        arrayList.add(wordArray[0]);
        
        boolean unique = true;
        for(int i =1; i<wordArray.length;i++){
            if(wordArray[i]==' '){
                continue;
            }


                for(int j = 0; j<arrayList.size();j++) {
                if(wordArray[i] == arrayList.get(j)){
                    System.out.println("false");
                    System.out.print("The letter '"+wordArray[i]+"' is already in String");
                    unique = false;
                }
                }

            if(unique == false){
                break;
            }else{
                arrayList.add(wordArray[i]);
                //System.out.println(arrayList.size());
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        is_unique("Legolas bir elftir");
    }
}

