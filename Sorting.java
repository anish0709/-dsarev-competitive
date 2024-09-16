public class Sorting
{
    public void bubblesort(int arr[])
    {
        int n = arr.length;
        boolean isSwapped;

        for(int i=0; i<n-1; i++)
        {
            isSwapped = false;
            for(int j=0; j<n-i-1; j++)
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            if(isSwapped == false)
                break;
        }
    }

    public void insertionSort(int arr[])
    {
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public void selectionsort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min_index = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[min_index] > arr[j])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[])
    {

    }
}