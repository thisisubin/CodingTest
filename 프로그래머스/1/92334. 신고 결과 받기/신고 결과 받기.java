
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    // id리스트            레포트          횟수
    // {muzi,frodo..}    {muzi frod, ..}  2
    public int[] solution(String[] id_list, String[] report, int k) {
        //{"muzi","frodo","apeach","neo"} : id_list
        //        //{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"} : report

        //1. 신고당한 사람 / 신고한 사람
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        //2. 메일을 보낼 사람 맵
        //      id_list / k
        HashMap<String, Integer> mailSend_map = new HashMap<>();
        //map 초기화 작업
        for (String name : id_list) { //id_list에 있는 원소들을 name변수에 하나씩 집어넣는다
            map.put(name, new ArrayList<String>()); //map에 push name(key) : 신고당한 사람, ArrayList(value) : 신고한 사람
            mailSend_map.put(name, 0);
        }

        //report 데이터 집어넣기 0번째 : 신고자, 1번째 : 신고당한자
        for (int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            String a = temp[0]; //신고자
            String b = temp[1]; //신고당한자
            ArrayList<String> arr = map.get(b);

            if (arr.contains(a)) {
                continue;
            }
                arr.add(a);
                map.put(b, arr);

        }

        for (String name : map.keySet()) { //map에 있는 키 모두 추출해서 name에 넣는다
            ArrayList<String> arr = map.get(name); //맵에서 name을 꺼냄 => arr 리스트에 삽입
            if (arr.size() >= k) {
                for (int i = 0; i < arr.size(); i++) {
                    //count를 malSend_map애 k(value)에 넣을 거임
                    int count = mailSend_map.get(arr.get(i)) + 1;
                    mailSend_map.put(arr.get(i), count);
                    
                }
            }
        }


        int[] answer = new int[id_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mailSend_map.get(id_list[i]);
        }
        return answer;
    }
}

