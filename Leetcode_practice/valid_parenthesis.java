import java.util.Stack;
class valid_parenthesis {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char arr[] = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (stk.isEmpty() || match(stk.pop(), c)==false) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    private boolean match(char l, char r) {
        return (l == '(' && r == ')') || (l == '{' && r == '}') || (l == '[' && r == ']');
    }

    public static void main(String[] args) {
        valid_parenthesis sol = new valid_parenthesis();
        System.out.println(sol.isValid("()[]{}")); // true
        System.out.println(sol.isValid("(]"));     // false
        System.out.println(sol.isValid("([)]"));   // false
        System.out.println(sol.isValid("{[]}"));   // true
    }
}