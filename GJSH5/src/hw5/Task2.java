package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
  public List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();
    for (String line : paths) {
      String[] files = line.split(" ");
      String directory = files[0];
      for (var i = 1; i < files.length; i++) {
        Pattern pattern1 = Pattern.compile("(.*)(\\(.*\\))");
        Matcher matcher = pattern1.matcher(files[i]);
        if (matcher.find()) {
          String filename = matcher.group(1);
          String data = matcher.group(2).substring(1, matcher.end() - filename.length() - 1);
          if (!map.containsKey(data)) {
            map.put(data, new ArrayList<>());
          }
          map.get(data).add(directory + "/" + filename);
        }
      }
    }
    List<List<String>> resultList = new ArrayList<>();
    for (String key : map.keySet()) {
      if (map.get(key).size() > 1) {
        resultList.add(map.get(key));
      }
    }
    return resultList;
  }
}
