class Solution {
    public double solution(int[] numbers) {
        int result=0;
        for(int num: numbers){
            result+=num;
        }
        return (double) result/numbers.length;
    }
}