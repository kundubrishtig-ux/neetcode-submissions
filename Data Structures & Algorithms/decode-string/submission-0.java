class Solution {
    public String decodeString(String s) {

        Stack<Integer> nums = new Stack<>();
        Stack<String> stack = new Stack<>();

        String str = "";
        int num = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '[') {
                nums.push(num);
                stack.push(str);
                num = 0;
                str = "";
            }
            else if (c == ']') {
                int n = nums.pop();
                String old = stack.pop();

                String temp = "";
                for (int i = 0; i < n; i++) {
                    temp += str;
                }

                str = old + temp;
            }
            else {
                str += c;
            }
        }

        return str;
    }
}