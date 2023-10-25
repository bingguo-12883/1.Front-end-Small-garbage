public class cj {
    public static void main(String[] args) {
        lengthOfLongestSubstring("asdfff");
        // System.out.print();
    }

    public static int lengthOfLongestSubstring(String s) {
            // 记录字符上一次出现的位置
            int[] last = new int[128];
            for(int i = 0; i < 128; i++) {
                last[i] = -1;
            }

            int n = s.length();

            int res = 0;
            int start = 0; // 窗口开始位置

            for(int i = 0; i < n; i++) {
                int index = s.charAt(i);
                start = Math.max(start, last[index] + 1);
                res   = Math.max(res, i - start + 1);
                last[index] = i;
            }
            
            System.out.print(res);
            return res;
        }
    
}
