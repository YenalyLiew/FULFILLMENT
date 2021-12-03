import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Joseph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNUM = sc.nextInt();
        ArrayList<Integer> people = new ArrayList<>();
        for (int i = 1; i <= peopleNUM; i++) people.add(i);
        System.out.println(people);
        int whoDead = sc.nextInt();
        while (people.size() >= whoDead) {
            people.remove(whoDead - 1);
            for (int j = 0; j < whoDead - 1; j++) {
                people.add(0);
                Collections.swap(people, 0, people.size() - 1);
                people.remove(0);
            }
            System.out.println(people);
        }
        Collections.sort(people);
        System.out.println("在" + peopleNUM + "个人中，如果第" + whoDead + "个人会死，则最后能存活" + people.size() + "个人，存活的位数：\n" + people);
    }
}
