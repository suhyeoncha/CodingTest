class Solution {
    public int[] solution(int[] num_list) {
       int oddCount = 0;
        int evenCount = 0;
      for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenCount++; // 짝수일 경우 짝수 개수 증가
            } else {
                oddCount++; // 홀수일 경우 홀수 개수 증가
            }
        }
        
        int[] answer = {evenCount, oddCount}; // 결과 배열 초기화
        return answer; // 결과 반환
    }
}