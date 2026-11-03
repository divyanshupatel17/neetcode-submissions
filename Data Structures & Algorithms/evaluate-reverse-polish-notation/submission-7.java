class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop()); 
            } else if(s.equals("-")){
                int first = stack.pop(); int sec = stack.pop();
                stack.push(sec-first);
            } else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            } else if(s.equals("/")){
                int first = stack.pop(); int sec = stack.pop();
                stack.push((first==0) ? 0 : sec/first);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
