package CodingChallenges.RemoveAllCharacter;

public class RemoveAllCharacter {

    /**
     * Return a String that has all the character of a String removed.
     * @param str
     * @param ch
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){

        char[] charArr = str.toCharArray();
        char[] remove = ch.toCharArray();

        String ans = "";
        for(char i : charArr){
            if(i != remove[0] ){
                ans += i;
            }
        }

        return ans;
    }
}
