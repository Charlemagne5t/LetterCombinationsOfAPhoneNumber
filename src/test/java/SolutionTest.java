import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void letterCombinationsTest1(){
        String digits = "23";
        List<String> expected = new ArrayList<>(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"));
        List<String> actual = new Solution().letterCombinations(digits);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void letterCombinationsTest2(){
        String digits = "";
        List<String> expected = new ArrayList<>();
        List<String> actual = new Solution().letterCombinations(digits);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void letterCombinationsTest3(){
        String digits = "2";
        List<String> expected = new ArrayList<>(List.of("a","b","c"));
        List<String> actual = new Solution().letterCombinations(digits);

        Assert.assertEquals(expected, actual);

    }
}
