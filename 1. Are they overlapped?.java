import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isOverlap(int[] rectangle0, int[] rectangle1){
        int x1=rectangle0[0], y1=rectangle0[1], x2=rectangle0[2], y2=rectangle0[3];
        int x3=rectangle1[0], y3=rectangle1[1], x4=rectangle1[2], y4=rectangle1[3];

        if (x1>=x4 || x3>=x2) return false;

        if (y1>=y4 || y3>=y2) return false;

        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int[] rectangle0=new int[4];
        int[] rectangle1=new int[4];

        for (int i=0; i<4; i++) rectangle0[i]=sc.nextInt();
        
        for (int i=0; i<4; i++) rectangle1[i]=sc.nextInt();

        System.out.println(isOverlap(rectangle0,rectangle1));
    }
}
