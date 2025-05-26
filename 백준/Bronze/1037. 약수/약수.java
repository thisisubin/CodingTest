import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 입력 - 약수의 개수 (50이하의 개수)
        int count = sc.nextInt();
        int[] measures = new int[count]; //약수들을 저장할 배열
        //2. 입력 - N의 약수들 (중복 금지, 1과 N 제외)
        for (int i = 0; i < count; i++) {
            measures[i] = sc.nextInt();
        }
        Arrays.sort(measures);
        int result = measures[0] * measures[count - 1];
        System.out.println(result);
    }
}
