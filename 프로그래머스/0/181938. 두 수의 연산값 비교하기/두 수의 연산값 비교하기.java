class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a+""+b); //정수 a와 b를 문자열로 붙여 int타입으로 변환, Integer.parseInt(a+b)로쓰면 자동 정수로 나옴 ?? 그래서 ""
        
        int multi = 2*a*b;
        
        if(ab>=multi){
            return ab;
        } else{
            return multi;

        }
            
   
    }
}