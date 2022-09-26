public class SelectionSort {

    public static void main(String[] args){
        int[] arr = new int[50000];
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = (int) (Math.random() * 50000);
        }
        arr = selectionSort(arr);
        for (int el : arr)
        {
            System.out.println(el);
        }

    }

    public static int[] selectionSort(int[] arr) throws NullPointerException
    {
        if (arr == null) throw new NullPointerException("arr cannot be null");
        for (int i = 0; i < arr.length; ++i)
        {
            int min_index = i;
            for (int j = i; j < arr.length; ++j)
            {
                if (arr[j] < arr[min_index]) min_index = j;
            }
            if (arr[i] != arr[min_index]) swap(arr, i, min_index);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j)
    {
        int buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
    }
}
