// SCAN Disk Scheduling algorithm
import java.util.*;
 
class ScanSchedulingAlgo{
 
static int size = 8;
static int disk_size = 200;
 
static void SCAN(int arr[], int head, String direction)
{
    int seek_count = 0;
    int distance, cur_track;
    Vector<Integer> left = new Vector<Integer>(),
                    right = new Vector<Integer>();
    Vector<Integer> seek_sequence = new Vector<Integer>();
 
    // appending end values
    // which has to be visited
    // before reversing the direction
    if (direction == "left")
        left.add(0);
    else if (direction == "right")
        right.add(disk_size - 1);
 
    for (int i = 0; i < size; i++) 
    {
        if (arr[i] < head)
            left.add(arr[i]);
        if (arr[i] > head)
            right.add(arr[i]);
    }
 
    // sorting left and right vectors
    Collections.sort(left);
    Collections.sort(right);
 
    // run the while loop two times.
    // one by one scanning right
    // and left of the head
    int run = 2;
    while (run-- >0)
    {
        if (direction == "left") 
        {
            for (int i = left.size() - 1; i >= 0; i--) 
            {
                cur_track = left.get(i);
 
                // appending current track to seek sequence
                seek_sequence.add(cur_track);
 
                // calculate absolute distance
                distance = Math.abs(cur_track - head);
 
                // increase the total count
                seek_count += distance;
 
                // accessed track is now the new head
                head = cur_track;
            }
            direction = "right";
        }
        else if (direction == "right") 
        {
            for (int i = 0; i < right.size(); i++) 
            {
                cur_track = right.get(i);
                 
                // appending current track to seek sequence
                seek_sequence.add(cur_track);
 
                // calculate absolute distance
                distance = Math.abs(cur_track - head);
 
                // increase the total count
                seek_count += distance;
 
                // accessed track is now new head
                head = cur_track;
            }
            direction = "left";
        }
    }
 
    System.out.print("Total number of seek operations = "
                        + seek_count + "\n");
 
    System.out.print("Seek Sequence is" + "\n");
 
    for (int i = 0; i < seek_sequence.size(); i++)
    {
        System.out.print(seek_sequence.get(i) + "\n");
    }
}
 
// Driver code
public static void main(String[] args){
 
    // request array
    int arr[] = { 176, 79, 34, 60,
                    92, 11, 41, 114 };
    int head = 50;
    String direction = "left";
 
    SCAN(arr, head, direction);
}
}