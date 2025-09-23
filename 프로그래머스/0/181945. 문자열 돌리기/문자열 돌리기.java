import java.util.Scanner; // 키보드 입력 받기 위한 스캐너 가져온다

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 키보드와 연결된 스캐너를 만든다.
        String str = sc.next(); //문자열 입력 , 공백 전까지의 문자열 한덩어리를 이벽 받아 str에 저장 
        
        for(int i=0; i<str.length(); i++){ // i는 0부터 시작, 문자열 길이 str.length() 보다 작을 동안 1씩 증가 반복
            System.out.println(str.charAt(i));
    } //str의 i번째 글자를 꺼내서 한줄씩 출력 
    sc. close();
    }
}
