class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Arrays.fill(res,0);
        for(int i=0; i<temps.length; i++){
            int todaytemp = temps[i];
            for(int j=i+1; j<temps.length; j++){
                if(temps[j]>todaytemp){
                    res[i] = j-i;
                    break;
                }
            }
        }
        return res;
    }
}
