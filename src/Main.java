import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int answer;
        ArrayList<Integer> a, acopy;
        boolean in = true;

        while(in){
            //Getting User Choice.
            System.out.println(
                    "1 - Find smallest prime\n" +
                    "2 - Reverse Array\n" +
                    "3 - Get the maximum 3 numbers\n" +
                    "4 - Most repeated value\n" +
                    "5 - Count primes\n" +
                    "6 - Get Average\n" +
                    "7 - Sort\n" +
                    "8 - Check palindrome\n" +
                    "9 - Get median\n" +
                    "10 - Check Sorted\n" +
                    "11 - Return only primes\n" +
                    "12 - Zero if less than zero\n" +
                    "13 - Find Largest Prime\n" +
                    "14 - Shuffle\n" +
                    "15 - Shift Array\n" +
                    "16 - Distnict Array\n" +
                    "17 - Get the minimum 3 numbers\n" +
                    "18 - All\n" +
                    "19 - Exit"
            );
            System.out.println("Please Enter The Number of Operation to start: ");
            try{
                answer = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Please Enter a Number.");
                continue;
            }

            //Getting User Input
            try{
                a = new ArrayList<Integer>();
                System.out.println("Please Enter The Array Length: ");
                int n = sc.nextInt();

                for(int i = 0 ; i < n; ++i){
                    int x = sc.nextInt();
                    a.add(x);
                }
            } catch (Exception e) {
                System.out.println("Please Enter Numbers Only.");
                continue;
            }

            //Calling The Functions
            switch (answer){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    max3(a);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    Sort(a);
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    System.out.println("3 - the maximum 3 numbers:");
                    acopy = new ArrayList<>(a);
                    max3(a);
                    System.out.println("/***************************************************************************/");


                    System.out.println("7 - Sort:");
                    acopy = new ArrayList<>(a);
                    Sort(acopy);
                    System.out.println("/***************************************************************************/");

                    break;
                case 19:
                    in = false;
                    break;
                default:
                    System.out.println("Please Enter a Valid Answer.");
                    break;
            }
        }
    }

    private static void max3(ArrayList<Integer> a){
        Collections.sort(a); // sorted in ascending order
        Collections.reverse(a); // now is sorted in descending order
        System.out.println("First Maximum Number : " + a.get(0));
        System.out.println("Second Maximum Number : " + a.get(1));
        System.out.println("Third Maximum Number : " + a.get(2));
    }

    private static void Sort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i = 0 ; i < n-1 ; i++)
            for (int j = 0 ; j < n-i-1 ; j++)
                if (arr.get(j) > arr.get(j+1))
                {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
    }
}