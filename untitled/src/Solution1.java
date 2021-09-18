import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {
    private static class WordAndCount implements Comparable<WordAndCount>{

        String word;
        int count;

        @Override
        public String toString() {
            return "WordAndCount{" +
                    "word='" + word + '\'' +
                    ", count=" + count +
                    '}';
        }

        public WordAndCount(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(WordAndCount o) {
           if (count > o.count){
               return -1;
           }else if (count < o.count){
               return 1;
           }else {
               return word.compareTo(o.word);
           }
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>每个单词出现的次数 = 统计每个单词出现的次数(words);
        WordAndCount[] array = new WordAndCount[每个单词出现的次数.size()];
        int idx = 0;
        for (Map.Entry<String,Integer> entry:每个单词出现的次数.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            WordAndCount wc = new WordAndCount(word,count);
            array[idx++] = wc;

        }
        Arrays.sort(array);
        for (WordAndCount wc: array){
            System.out.println(wc);
        }
         return null;
    }


    private Map<String, Integer> 统计每个单词出现的次数(String[] words) {
        Map<String,Integer>出现的次数 = new TreeMap<>();
        for (String word: words){
            int count = 出现的次数.getOrDefault(word,0);
            出现的次数.put(word,count + 1);
        }
        return 出现的次数;
    }
}
