import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //행렬 크기 n
        int m = sc.nextInt(); //행렬 크기 m

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] AB = new int[n][m];
        //A행렬 입력시키기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //B행렬 입력시키기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        //A행렬과 B행렬의 각 원소 더하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                AB[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < AB.length; i++) {
            for (int j = 0; j < AB[i].length; j++) {
                System.out.print(AB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
