package searchtarget;

class SearchComparison {

    public static int linearSearch(int[] data,int target)
    {
        for(int i=0; i<data.length; i++)
        {
            if(data[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int target)
    {
        int low = 0;
        int high = data.length-1;
        while(low<=high)
        {
            int  mid = low + (high - low)/2;

            if(data[mid] == target)
            {
                return mid;
            }
            if(data[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void measureTime(int n,int target)
    {
        int[] data = new int[n];
        for(int i=1;i<=data.length;i++)
        {
            data[i-1] = i;
        }

        long startTime = System.nanoTime();
        int idx = linearSearch(data,target);
        long linearSearchTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        idx = binarySearch(data,target);
        long binarySearchTime = System.nanoTime() - startTime;

        System.out.println("Element found at index: " + idx + " by linear search");
        System.out.println("Time required in linear search is: " + (double)linearSearchTime/1000000);
        System.out.println("Element found at index: " + idx + " by binary search");
        System.out.println("Time required in binary search is: " + (double)binarySearchTime/1000000);
        System.out.println();

    }
}
