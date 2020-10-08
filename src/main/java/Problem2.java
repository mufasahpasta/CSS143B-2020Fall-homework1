public class Problem2
{

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data)
    {
        // Add your solution
        //***I WILL BE ASCENDING***
        int temp = 0;
        for(int i = 0; i <= data.length; i++)
        {
            for (int j = 0; j < data.length - 1 - i; j++)
            {
                if(data[j] > data[j + 1])
                {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
