package programmers.level1;

public class lesson_12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; i < answer.length; i++)
        	answer[i] = x * (i + 1L);
        
        return answer;
    }
}