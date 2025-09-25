import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();
        
          // 1. 길이 확인 (1 ~ 20 사이여야 함)
        if (a.length() < 1 || a.length() > 20) {
            System.out.println("문자열 길이는 1 이상 20 이하만 가능합니다.");
            return; // 프로그램 끝내기
        }
        
        for(int i = 0; i< a.length();i++){
            char ch = a.charAt(i); // i번째 문자 꺼내기
            
            if (Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            } else{
                System.out.print(Character.toUpperCase(ch));

            }
              
        }
    }
}