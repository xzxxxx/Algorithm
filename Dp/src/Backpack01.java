import java.util.Scanner;

public class Backpack01 {
    /*
有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。

第 i 件物品的体积是 vi，价值是 wi。

求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
输出最大价值。

输入格式
第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。

接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。

输出格式
输出一个整数，表示最大价值。
    */

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
//二维dp
//        int[][] dp = new int[N + 1][V + 1]; //2维数组，j正序遍历
//        for(int i = 1; i <= N; i++){
//            for(int j = 1; j <= V; j++){
//                 dp[i][j] = dp[i - 1][j];
//                if(j >= v[i]) dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - v[i]] + w[i]);
//            }
//        }
//        System.out.println(dp[N][V]);

        int[] dp = new int[V + 1];
        for(int i = 1; i <= N; i++){ //因为j从大到小，所以第i层的时候dp[j -v[i]]的值还没有更新
            for(int j = V; j >= v[i]; j--){//一维数组 j倒序遍历 dp[j-v[i]]中的值实际上是dp[i - 1][j - v[i]]
                dp[j] = Math.max(dp[j],dp[j - v[i]] + w[i]); //max中dp[j]的值实际上是dp[i-1][j]的值
            }
        }
        System.out.println(dp[V]);
    }
}
