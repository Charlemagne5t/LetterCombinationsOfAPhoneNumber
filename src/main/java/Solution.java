import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }

        HashMap<Character, char[]> phone = new HashMap<>();
        phone.put('2', new char[]{'a', 'b', 'c'});
        phone.put('3', new char[]{'d', 'e', 'f'});
        phone.put('4', new char[]{'g', 'h', 'i'});
        phone.put('5', new char[]{'j', 'k', 'l'});
        phone.put('6', new char[]{'m', 'n', 'o'});
        phone.put('7', new char[]{'p', 'q', 'r', 's'});
        phone.put('8', new char[]{'t', 'u', 'v'});
        phone.put('9', new char[]{'w', 'x', 'y', 'z'});
        char[] digitsArray = digits.toCharArray();
        List<String> resultList = new ArrayList<>();
        backtrack(digitsArray, resultList, "", 0, phone);
        System.out.println(resultList);
        return resultList;
    }

    private void backtrack(char[] digitsArray, List<String> resultList, String currentString, int i, HashMap<Character, char[]> phone) {
        if (i == digitsArray.length) {
            resultList.add(currentString);
            return;
        }
        for (char ch : phone.get(digitsArray[i])) {
            backtrack(digitsArray, resultList, currentString + ch, i + 1, phone);

        }
    }
}