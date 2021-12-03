import java.util.Scanner;

public class ShuiXianHua {
    public static void main(String[] args) {
        boolean isSHU = false;
        for (int num = 10; num <= 100000; num++) {
            String numString = Integer.toString(num);
            int res = 0;
            String[] numSplit = numString.split("");
            for (int i = 0; i < numString.length(); i++) {
                res += Math.pow(Integer.parseInt(numSplit[i]), numString.length());
            }
            if (res == num) isSHU = true;
            if (isSHU) System.out.println(num);
            isSHU = false;
        }
    }
}
