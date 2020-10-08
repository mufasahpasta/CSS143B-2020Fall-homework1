public class Problem1 {

    // Do not change signature (function name, parameters)

    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int index = -1; // index is going to be what im returning as the index
        for (int i = 0; i < data.length; i++) // loop to go through array and
        // find target
        {
            if (data[i] == target) // when the loop finds the index thats
            // equal to the target, itll set index as i
            {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}

