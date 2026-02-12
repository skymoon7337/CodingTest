class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int[] answer = new int[size];
        
        int value = 1;
        for (int i = 0; i < size; i++) {
            answer[i] = value;
            value += 2;
        }
        
        return answer;
    }
}
