import java.util.ArrayList;
import java.util.Arrays;

public class Counting_Elements_In_two_Arrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 7, 9 };
        int arr2[] = { 0, 1, 2, 1, 1, 4 };
        ArrayList<Integer> ans = new ArrayList<>();
        ans = countEleLessThanOrEqual(
                arr1, arr2, arr1.length,
                arr2.length);
        System.out.println(ans);
    }
        public static ArrayList<Integer> countEleLessThanOrEqual(int[] a1, int[] a2, int l1, int l2){
            ArrayList<Integer> ans = new ArrayList<>();
            Arrays.sort(a2);
            for(int i=0;i<l1;i++)
                ans.add(search(a2,a1[i],0,l2-1));
            return ans;
        }
        public static int search(int[] a2, int x, int l, int h){
            while(l<=h){
                int m = (l+h)/2;
                if(a2[m] <= x )
                    l = m+1;
                else
                    h = m-1;
            }
            return (h+1);
        }

}
