import java.util.*;

public class Solution {
    public int[] solution(int[] arr){
       List<Integer> l = new ArrayList<>();
        l.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                l.add(arr[i]);
            }
        }
        
        int[] res = new int[l.size()];
        for(int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        return res;
}
}