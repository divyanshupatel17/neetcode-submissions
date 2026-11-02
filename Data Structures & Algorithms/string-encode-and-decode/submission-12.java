class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            // 1. Find delimiter '#'
            int j = i;

            // 2. Move j until '#'
            while(str.charAt(j) != '#') j++;

            // 3. Extract length using substring(i, j)
            int length = Integer.parseInt(str.substring(i,j));

            // 4. Extract actual word using substring()
            String word = str.substring(j+1,j+1+length);
            arr.add(word);

            // 5. Move i to the next encoded string
            i = j+1+length;
        }

        return arr;
    }
}
