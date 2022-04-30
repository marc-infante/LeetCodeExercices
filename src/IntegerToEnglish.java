import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Difficulty: hard

Convert a non-negative integer num to its English words representation.
*/

public class IntegerToEnglish {

    private Map<Integer,String> numbers;
    private Map<Integer,String> tens;
    private List<String> thousands;

    public IntegerToEnglish() {
        numbers = new HashMap<>();
        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(3,"Three");
        numbers.put(4,"Four");
        numbers.put(5,"Five");
        numbers.put(6,"Six");
        numbers.put(7,"Seven");
        numbers.put(8,"Eight");
        numbers.put(9,"Nine");
        numbers.put(10,"Ten");
        numbers.put(11,"Eleven");
        numbers.put(12,"Twelve");
        numbers.put(13,"Thirteen");
        numbers.put(14,"Fourteen");
        numbers.put(15,"Fifteen");
        numbers.put(16,"Sixteen");
        numbers.put(17,"Seventeen");
        numbers.put(18,"Eighteen");
        numbers.put(19,"Nineteen");

        tens = new HashMap<>();
        tens.put(2,"Twenty");
        tens.put(3,"Thirty");
        tens.put(4,"Forty");
        tens.put(5,"Fifty");
        tens.put(6,"Sixty");
        tens.put(7,"Seventy");
        tens.put(8,"Eighty");
        tens.put(9,"Ninety");

        thousands = new ArrayList<>();
        thousands.add("");
        thousands.add(" Thousand");
        thousands.add(" Million");
        thousands.add(" Billion");
    }

    public String numberToWords(int num) {
        StringBuilder result = new StringBuilder();
        int i=0;
        if(num==0){
            return "Zero";
        }
        while(num>0){
            String hundred = convertHundredToString(num % 1000);
            if(!hundred.isEmpty()){
                if(result.toString().isEmpty()) {
                    result.insert(0, hundred + thousands.get(i));
                }else{
                    result.insert(0, hundred + thousands.get(i)+" ");
                }
            }
            num/=1000;
            i++;
        }
        return result.toString();
    }

    public String convertHundredToString(int hundred){
        StringBuilder result= new StringBuilder();
        if(hundred>0){
            if(hundred>=100){
                int nHundred = hundred/100;
                append(result,numbers.get(nHundred)+" Hundred");
                hundred = hundred%100;
            }
            if(hundred>0) {
                if (hundred < 20) {
                    append(result,numbers.get(hundred));
                } else {
                    int nTeen = hundred/10;
                    append(result,tens.get(nTeen));
                    hundred = hundred%10;
                    if(hundred>0){
                        append(result,numbers.get(hundred));
                    }
                }
            }
        }
        return result.toString();
    }

    public void append(StringBuilder result,String text){
        if(result.toString().isEmpty()){
            result.append(text);
        }else{
            result.append(" "+text);
        }
    }
}
