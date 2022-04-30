import java.util.HashMap;
import java.util.Map;

/*
Difficulty: easy

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However,
the numeral for four is not IIII. Instead, the number four is written as IV. Because
the one is before the five we subtract it making four. The same principle applies to
the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
*/

public class RomanToInteger {

    private Map<Character,Integer> romanNumbers = new HashMap();

    public RomanToInteger() {
        this.romanNumbers.put('I',1);
        this.romanNumbers.put('V',5);
        this.romanNumbers.put('X',10);
        this.romanNumbers.put('L',50);
        this.romanNumbers.put('C',100);
        this.romanNumbers.put('D',500);
        this.romanNumbers.put('M',1000);
    }

    public int romanToInt(String s) {
        char[] number = s.toCharArray();
        int result=0;
        for(int i =0; i<number.length;i++){
            if(i<number.length-1){
                int actualValue = romanNumbers.get(number[i]);
                int nextValue = romanNumbers.get(number[i+1]);
                if(actualValue<nextValue){
                    result+=nextValue-actualValue;
                    i++;
                }else{
                    result+=actualValue;
                }
            }else{
                result+= romanNumbers.get(number[i]);
            }
        }
        return result;
    }

}
