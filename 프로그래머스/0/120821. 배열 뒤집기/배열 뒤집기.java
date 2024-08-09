class Solution {
    public int[] solution(int[] num_list) {
        int[] a = new int[num_list.length];
        for(int i = 0; i<num_list.length; i++) {
            a[i] = num_list[num_list.length-i-1];
        }
        
        
        
        return a;
    }
}