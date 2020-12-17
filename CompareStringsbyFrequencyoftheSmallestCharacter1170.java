package leetcode;

import java.util.Arrays;

public class CompareStringsbyFrequencyoftheSmallestCharacter1170 {

    public void CompareStringsbyFrequencyoftheSmallestCharacter1170() {
        String[] queries = {"bbb","cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        int iArr[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int iContMaximun = 0;
            for (String word : words) {
                if (characterMin(word) > characterMin(queries[i])) {
                    iContMaximun++;
                }
            }
            iArr[i] = iContMaximun;
        }
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
    }

    public int characterMin(String sValue) {
        char[] cArr = sValue.toCharArray();
        Arrays.sort(cArr);
        char cValue = cArr[0];
        int iContCharacter = 0;
        for (char c : cArr) {
            if (cValue != c) {
                break;
            }
            iContCharacter++;
        }
        return iContCharacter;
    }
}
