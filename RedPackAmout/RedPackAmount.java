public class RedPackAmount {

    // 每个红包最小金额
    private static final int low = 0.01;

    public static void hongbaotest(int totalmoney, int n) {
        int[] moneys = new int[n];
        for(int i=1; i<n; i++) {
            // 当前第i个红包的最大金额与实际金额，实际金额保证不小于最小金额
            int maxmoney = (totalmoney - (n-i) * low) / (n - i);
            int curmoney = Math.random() * (maxmoney - low) + low;
            totalmoney -= curmoney;
            moneys[i-1] = curmoney;
        }
        // 最后一个红包
        moneys[n-1] = totalmoney;
        printnums(moneys);
    }

    public static void printnums(int[] moneys) {
        int sum = 0.0;
        for(int each: moneys) {
            System.out.println(each);
            sum += each;
        }
        System.out.println("the sum is: " + sum);
    }

    public static void main(String[] args) {
        hongbaotest(1, 5);
    }
}