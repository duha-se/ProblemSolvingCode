class Solution {
    public List<String> generateParenthesis(int n) { 
        List<String> parenthesis = new ArrayList<>();
        char [] temp = new char[n*2];
        generateParenthesis(n, n, temp, 0, parenthesis);
        return parenthesis;
    }

    public void generateParenthesis(int left, int right, char[] temp, int pos, List<String> parenthesis) {
        if(left<0 || right<0 || left>right) return;

        if(left==0 && right==0 ) {
            parenthesis.add(String.copyValueOf(temp));
        }

        if(left>0) {
            temp[pos] ='(';
            generateParenthesis(left-1, right, temp, pos+1, parenthesis);
        }

        if(right> left) {
            temp[pos] = ')';
            generateParenthesis(left, right-1, temp, pos+1, parenthesis);
        }
    }
}
