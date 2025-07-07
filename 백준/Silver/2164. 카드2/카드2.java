import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i); //큐에 1 ~ n까지 넣음
        }

        while (queue.size() > 1) {
            //처음 카드는 버리고 다음 카드는 맨 아래로
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
    }
}
