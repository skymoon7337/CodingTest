// 바꿀 인덱스의 합이 배열의 크기 -> 인덱스 0과 5, 1과 4 식으로 교환 
// 인덱스(i와 length-i-1)의 교환 -> 둘의 인덱스 합은 length-1로 일정
// 홀수>중앙은 안바꿈,짝수>중앙이 없음 > 그래서 반복은 중앙값 미만까지

class Solution {
    public int[] solution(int[] num_list) {
        for (int i=0;i< num_list.length/2;i++){
            int temp=num_list[i];
            num_list[i]=num_list[num_list.length-1-i];
            num_list[num_list.length-1-i]=temp;
        }
        return num_list;
    }
}