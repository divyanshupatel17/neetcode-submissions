
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int len = temperatures.length;
        int[] res = new int[len];
        Arrays.fill(res,0);

        for(int i=0; i<len; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int j = stack.pop();
                res[j] = i-j;
            }
            stack.push(i);
        }
        return res;
    }
}