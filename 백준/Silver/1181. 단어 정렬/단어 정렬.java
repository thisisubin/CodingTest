import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> dictionary = new HashSet<>();

        int n = sc.nextInt(); //단어의 개수
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            dictionary.add(sc.next()); //set으로 했기 때문에 중복 자동 제거됨
        }
// List로 변환해서 정렬
        List<String> list = new ArrayList<>(dictionary);

        list.sort((o1, o2) -> {
            if (o1.length() != o2.length())
                return o1.length() - o2.length(); //길이 오름차순
            else
                return o1.compareTo(o2); //길이 같으면 사전순
        });

        for (String word : list) {
            System.out.println(word);
        }
    }
}
