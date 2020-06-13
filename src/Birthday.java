import java.util.ArrayList;

public class Birthday {
    public static void main(String[] args) {
        int n = 365;
        int trials = 1000000;
        int[] count = new int[n];
        int[] birthdayList;


        for(int i = 0; i < trials; i++) {

            boolean match = false;
            int peopleNum = 0;
            birthdayList = new int[n];

            while (!match) {
                int newBirth = (int) ((Math.random() * n));
                peopleNum += 1;
                boolean contains = false;
                for (int j = 0; j < birthdayList.length; j++) {
                    if (newBirth == birthdayList[j]) {
                        contains = true;
                    }
                }

                if (contains) {
                    match = true;
                } else {
                    birthdayList[peopleNum -1] = newBirth;
                }
            }
            count[peopleNum] += 1;
        }

        double ans = 0;
        for(int i = 0; i < count.length; i++) {
            if (ans < 0.5) {
                int sums = 0;
                for(int j = 0; j <= i; j++) {
                    sums += count[j];
                }
                ans = sums/(double)trials;
                String answ = Double.toString(ans);
                System.out.println(Integer.toString(i+1) + "\t" + count[i] + "\t" + answ);

            }
        }



    }
}
