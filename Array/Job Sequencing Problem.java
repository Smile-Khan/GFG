import java.util.Arrays;
import java.util.Comparator;

public class Job Sequencing Problem {
    

    QUESTION LINK: -


    https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1

}

SOLUTION: -

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    public int[] JobScheduling(Job arr[], int n) {
        // Step 1: Sort the jobs in descending order of profit
        Arrays.sort(arr, new Comparator<Job>() 
        {
            public int compare(Job a, Job b)
            {
                return b.profit - a.profit; // Sort by profit in descending order
            }
        });

        // Step 2: Find the maximum deadline to know the size of the time slot array
        int maxDeadline = 0;
        for (Job job : arr)
        {
            if (job.deadline > maxDeadline) 
            {
                maxDeadline = job.deadline;
            }
        }

        // Step 3: Create an array to keep track of free time slots
        boolean[] slots = new boolean[maxDeadline + 1];
        Arrays.fill(slots, false);

        int jobsCount = 0;
        int maxProfit = 0;

        // Step 4: Allocate the jobs
        for (Job job : arr) {
            // Find a free slot for this job (starting from its deadline)
            for (int j = job.deadline; j > 0; j--) {
                if (!slots[j]) { // If the slot is free
                    slots[j] = true; // Mark this slot as occupied
                    jobsCount++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }

        // Return the number of jobs done and the maximum profit
        return new int[]{jobsCount, maxProfit};
    }
}
