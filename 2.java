/*
给一个只包含'('和')'的string，判断需要删除多少个char才能达到平衡。这题用stack的概念做就行，easy。
input: "()()("
ouput: 1
input: ")(()))()"
output: 2
*/

import java.util.Stack;

class solution2{
    public static void main(String[] args){
        System.out.println(helper("()()("));
        System.out.println(helper(")(()))()"));
    }
    private static int helper(String s){
        Stack<Character> stack = new Stack<>();
        int res = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(') stack.push(c);
            else if(c==')' && stack.isEmpty()){
                res++;
            }else{
                stack.pop();
            }
        }
        return res+stack.size();
    }
}
