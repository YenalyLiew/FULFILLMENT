import java.math.BigInteger;
import java.util.Scanner;

public class HuiWenShuBigInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger x_ = scanner.nextBigInteger();
        int n = 0;
        while (!isPlalindrome(x_)) {
            String x = String.valueOf(x_);
            String xReverseString = new StringBuilder(x).reverse().toString();
            BigInteger xReverseBigInt = new BigInteger(xReverseString);
            x_ = x_.add(xReverseBigInt);
            n++;
            System.out.print("正在尝试第" + n + "次\t");
            System.out.println(x + "+" + xReverseString + "=" + x_);
        }
        System.out.println("回文数之路：" + n);
        System.out.println("最后的回文数：" + x_);
    }

    public static boolean isPlalindrome(BigInteger number) {
        String num = String.valueOf(number);
        return new StringBuilder(num).reverse().toString().equalsIgnoreCase(num);
    }
}
