class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        for (int i = 1; i <= 30; i++) {
            int cnt = 0;
            for(int j = 0; j < strArr.length; j++){
                if(strArr[j].length() == i){
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}