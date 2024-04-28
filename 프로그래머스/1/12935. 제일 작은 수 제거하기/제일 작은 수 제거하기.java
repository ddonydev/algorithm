import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int[] answer = new int[arr.length - 1];
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}