class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int sum = 0;
        while(true) {
            if (coupon >= 10) {
                int a = coupon/10;
                int b = coupon%10;
                coupon = a + b;
                sum += a;
                    if(coupon<10) {
                        break;
                    }
           
            } 
            if(coupon<10)
                break;
        }
        return sum;
    }
}