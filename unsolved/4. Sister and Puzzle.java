import java.util.*;

public class SisterProblemTemp {

    public static int minToggles(int[] arr) {
        int moves = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                moves++;
                toggleArrayElements(arr, i);
            }
        }

        return moves;
    }

    public static int[] toggleArrayElements(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        for (int i = index; i < arr.length; i += index + 1) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] sister = new int[sc.nextInt()];

        int[] oState = new int[str.length()];

        for (int i = 0; i < sister.length; i++)
            sister[i] = sc.nextInt();

        for (int i = 0; i < str.length(); i++)
            oState[i] = str.charAt(i) - '0';

        for (int sis : sister) {
            oState = toggleArrayElements(oState, sis - 1); // Adjust index to 0-based
        }

        int moves = minToggles(oState);
        System.out.println(moves);
    }
}
