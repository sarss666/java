import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private List<List<String>> wordBreakInternal(String s, Set<String> wordDict){

        List<List<String>> wordList = new ArrayList<>();
        if (s.isEmpty()){
            return wordList;
        }

        for (int endIndex = 1; endIndex <= s.length();endIndex++){
            String word = s.substring(0,endIndex);
            if (!wordDict.contains(word)){
                continue;
            }
            String remainS = s.substring(endIndex);
            List<List<String>> remainList = wordBreakInternal(remainS,wordDict);

            if (remainList != null){
                if (remainList.isEmpty()){
                    List<String> sentence = new ArrayList<>();
                    sentence.add(word);
                    wordList.add(sentence);
                }else {
                    for (List<String> remainSentence : remainList) {
                        List<String> sentence = new ArrayList<>();
                        sentence.add(word);
                        sentence.addAll(remainSentence);
                        wordList.add(sentence);
                    }
                }
            }
        }
        if (wordList.isEmpty()){
            return null;
        }else {
            return wordList;
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);
        List<List<String>> wordList = wordBreakInternal(s,dict);

        List<String> ans = new ArrayList<>();
        if (wordList != null) {
            for (List<String> words : wordList) {
                String sentence = String.join(" ", words);
                ans.add(sentence);
            }

        }
        return ans;
    }
}
