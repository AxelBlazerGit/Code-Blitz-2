import java.io.*;
import java.util.*;

public class Solution {
    
    public static int maxDrinks(int n, int m){
        if(n<m) return 0;
        return 1+maxDrinks(n+1-m,m);
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int totalBottles =n+ maxDrinks(n, m);

        System.out.println(totalBottles);
    }
}
