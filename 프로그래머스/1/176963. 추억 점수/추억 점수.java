import java.util.HashMap;
import java.util.Map;

class Solution {
    //Stringp[] name = {"may", "kein", "kain", "radi};
    //int[] yearning = {5, 10, 1, 3};
    //String[][] photo = {{"may", "kein", "kain", "radi}, {"may", "kein", "brin", "deny"} {"kon", "kain", "may", "coni"}}
    //                      00      01      02      03      10      11      12      13      20      21      22     23

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>(); //name : key //yearning : value
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]); //map에 값들 집어넣기
        }
        int[] answer = new int[photo.length];
        //photo[i]에 있는 값들이 map의 key와 같은지 확인해서
        //같으면 해당 value를 total 변수에 누적후 반환
        for (int i = 0; i < photo.length; i++) { //i = 0일 때
            int total = 0;
            for (int j = 0; j < photo[i].length; j++) { //j가 0~3 돌면서
                if (map.containsKey(photo[i][j])) { //map의 키들이 photo[i][j]와 같으면
                   total += map.get(photo[i][j]); //해당 키의 값을 추출해서 total에 누적

                }
            }
            answer[i] = total;
        }
        return answer;

    }
}