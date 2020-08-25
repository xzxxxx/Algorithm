import java.util.Scanner;

/*

有 N 种物品和一个容量是 V 的背包，每种物品都有无限件可用。

第 i 种物品的体积是 vi，价值是 wi。

求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
输出最大价值。

输入格式
第一行两个整数，N，V，用空格隔开，分别表示物品种数和背包容积。

接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 种物品的体积和价值
 */
//与01背包的区别就是一次可以选0~n件物品
public class BackPackFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int[] v = new int[N + 1];
        int[] w = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        sc.close();

//        int[][] dp = new int[N + 1][V + 1];
//
//        for(int i = 1; i <= N; i++){
//            for(int j = 1; j <= V; j++){
//                dp[i][j] = dp[i - 1][j];
//                if(j >= v[i]) dp[i][j] = Math.max(dp[i][j],dp[i][j - v[i]] + w[i]);
//            }
//        }
//        System.out.println(dp[N][V]);

        int[] dp = new int[V + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = v[i]; j <= V; j++) {
                dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
            }
        }

    }
}
