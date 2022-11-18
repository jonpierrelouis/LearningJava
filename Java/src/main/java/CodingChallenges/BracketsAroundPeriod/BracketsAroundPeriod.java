package CodingChallenges.BracketsAroundPeriod;

public class BracketsAroundPeriod {

    /**
     * Place brackets around periods in a string - eg, abc.def.ghi becomes abc[.]def[.]ghi
     * @param in A String that may contain periods.
     * @return a String, but with parentheses around all periods.
     */
    public String placeBrackets(String in){

        char[] charArr = in.toCharArray();

        String newString = "";
        for(char i : charArr){
            if(i == '.'){
                newString +="[.]";
            }else{
                newString += i;
            }
        }

        return newString;
    }
}
