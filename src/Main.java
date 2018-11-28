import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = sc.nextInt();

        for(int i = 0 ; i < n; ++i){
            int x = sc.nextInt();
            a.add(x);
        }


    }

    public static void max3(ArrayList<Integer> a){
        Collections.sort(a); // sorted in ascending order
        Collections.reverse(a); // now is sorted in descending order
        System.out.println("First Maximum Number : " + a.get(0));
        System.out.println("Second Maximum Number : " + a.get(1));
        System.out.println("Third Maximum Number : " + a.get(2));
    }
     public static int mostRepeatedValue(ArrayList<Integer> arr) {
        int menual = 0;
        int counter = 0;
        int tmpCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            counter = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (temp == arr.get(j)) {
                    counter++;
                   }
            }
            if (counter > tmpCount) {
                menual = temp;
                tmpCount = counter;
            }
        }

        return menual;
    }
}
