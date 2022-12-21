package hw5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
  public int countWords(String[] words1, String[] words2) {
    if (words1.length > words2.length) {
      return countWords(words2, words1);
    }
    Map<String, Integer> map = new HashMap<>();
    for (String s : words1) {
      map.putIfAbsent(s, 0);
      map.put(s, map.get(s) + 1);
    }
    map.entrySet().removeIf(entry -> entry.getValue() > 1);
    for (String s2 : words2) {
      if (map.containsKey(s2)) {
        map.put(s2, map.get(s2) - 1);
      }
    }
    return (int) map.values().stream().filter(v -> v==0).count();
  }

  public int countWordsVersion(String[] words1, String[] words2) {
    int count = 0;
    int result_count = 0;
    for (String s : words1) {
      for (String value : words1) {
        if (s.equals(value)) {
          count++;
        }
      }
      if (count==1) {
        for (String value : words2) {
          if (s.equals(value)) {
            count++;
          }
        }
        if (count==2) {
          result_count++;
        }
      }
      count = 0;
    }
    return result_count;
  }
}
