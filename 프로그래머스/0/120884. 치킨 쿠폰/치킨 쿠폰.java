class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int answer = 0;
        while(true){
            if(coupon<10){
                break;
            }
            answer +=coupon/10;
            coupon = coupon/10 + coupon%10;
            
            
            
        }
      
        
        
        return answer;
    }
}