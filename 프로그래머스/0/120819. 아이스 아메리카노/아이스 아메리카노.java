class Solution {
    public int[] solution(int money) {
        int price = 5500;
        
        int count = money / price;
        int rest = money % price;
        
        int[] answer = {count, rest};
        return answer;
    }
}