class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res, n, n, "");
        return res;
    }

    private void helper(List<String> res, int left, int right, String curr){
        if(left == 0 && right == 0){
            res.add(curr);
            return;
        }

        if(left > 0){
            helper(res, left - 1, right, curr + "(");
        }

        if(right > 0 && right > left){
            helper(res, left, right - 1, curr + ")");
        }
    }
}