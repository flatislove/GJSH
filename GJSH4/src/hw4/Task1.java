package hw4;

import java.util.ArrayDeque;

public class Task1 {
    public String simplifyPath(String path) {
        String[] strings = path.split("\\/+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String string : strings) {
            if (!stack.isEmpty() && string.equals("..")) {
                stack.pop();
            } else if (!string.isEmpty() && !string.matches("^\\.{1,2}$")) {
                stack.push(string);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sbPath = new StringBuilder();
        while (!stack.isEmpty()) {
            sbPath.insert(0, "/" + stack.pop());
        }
        return sbPath.toString();
    }
}
