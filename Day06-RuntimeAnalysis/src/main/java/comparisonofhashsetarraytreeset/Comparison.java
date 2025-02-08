package comparisonofhashsetarraytreeset;
import java.util.*;
import java.util.HashSet;
import java.util.Random;
class Comparison {
    public static boolean searchByArray(int[] arr,int key)
    {
        for(int num : arr)
        {
            if(num == key)
                return true;
        }
        return false;
    }

    public static boolean searchByHashset(int[] arr,int key)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }
        boolean isFound = false;
        for(int i=0; i<arr.length; i++)
        {
            if(set.contains(key))
            {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static boolean searchByTreeset(int[] arr,int key)
    {
        Set<Integer> seen = new TreeSet<>();
        for(int i=0; i<arr.length; i++)
        {
            seen.add(arr[i]);
        }
        boolean isFound = false;
        for(int i=0; i<arr.length; i++)
        {
            if(seen.contains(key))
            {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static void measureTime(int n)
    {
        Random random = new Random();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = random.nextInt(n*10);
        }

        long startTime = System.nanoTime();
        boolean isFound = searchByArray(arr,n-1);
        double ArrayDuration = (double)(System.nanoTime() - startTime)/1000000;
        System.out.println("Element found in array: " + isFound);
        System.out.println("Array search time: " + ArrayDuration);

        startTime = System.nanoTime();
        boolean isFoundInHashset = searchByHashset(arr,n/5);
        double hashsetDuration = (double)(System.nanoTime() - startTime)/1000000;
        System.out.println("Element found in hashset: " + isFoundInHashset);
        System.out.println("Hashset search time: " + hashsetDuration);

        startTime = System.nanoTime();
        boolean isFoundInTreeset = searchByTreeset(arr,n/2);
        double treesetDuration = (double)(System.nanoTime() - startTime)/1000000;
        System.out.println("Element found in treeset: "+ isFoundInTreeset);
        System.out.println("Treeset search time: " + treesetDuration);
        System.out.println();
    }
}
