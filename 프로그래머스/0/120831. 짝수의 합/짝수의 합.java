class Solution {
    public int solution(int n) {
       int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // 짝수인지 판별
                sum += i;
            }
        }
        return sum; // 모든 짝수의 합을 반환
    }
}