/*
Difficulty: medium

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
the numeral for four is not IIII. Instead, the number four is written as IV.
Because the one is before the five we subtract it making four. The same principle
applies to the number nine, which is written as IX. There are six instances where
subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral.
*/

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result =  new StringBuilder();
        while(num>0){
            if(num>=900){
                if(num>=1000) {
                    result.append("M");
                    num -= 1000;
                }else{
                    result.append("CM");
                    num -=900;
                }
            }else if(num>=400){
                if(num>=500) {
                    result.append("D");
                    num -= 500;
                }else{
                    result.append("CD");
                    num -=400;
                }
            }else if(num>=90){
                if(num>=100) {
                    result.append("C");
                    num -= 100;
                }else{
                    result.append("XC");
                    num -=90;
                }
            }else if(num>=40){
                if(num>=50) {
                    result.append("L");
                    num -= 50;
                }else{
                    result.append("XL");
                    num -=40;
                }
            }else if(num>=9){
                if(num>=10) {
                    result.append("X");
                    num -= 10;
                }else{
                    result.append("IX");
                    num -=9;
                }
            }else if(num>=4){
                if(num>=5) {
                    result.append("V");
                    num -= 5;
                }else{
                    result.append("IV");
                    num -=4;
                }
            }else{
                result.append("I");
                num-=1;
            }
        }
        return result.toString();
    }
}
