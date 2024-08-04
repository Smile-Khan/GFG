package Array;

public class N meetings in one room {
    
    QUESTION LINK :-

    https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
    
    class GFG {
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
    
            while (t-- > 0) {
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
    
                int start[] = new int[n];
                int end[] = new int[n];
    
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);
    
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);
    
                int ans = new Solution().maxMeetings(n, start, end);
                System.out.println(ans);
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        // Function to find the maximum number of meetings that can
        // be performed in a meeting room.
        class Meeting 
        {
            int start;
            int end;
            
            Meeting(int start, int end)
            {
                this.start = start;
                this.end = end;
            }
        }
        public int maxMeetings(int n, int start[], int end[]) {
            // add your code here
            
            Meeting[] meetings = new Meeting[n];
            
            for(int i = 0; i<n; i++)
            {
                meetings[i] = new Meeting(start[i], end[i]);
            }
            Arrays.sort(meetings, (a,b) -> a.end - b.end);
            
            int maxMeetings = 0;
            int lastEndTime = -1;
            
            for(Meeting meeting : meetings)
            {
                if(meeting.start > lastEndTime)
                {
                    maxMeetings++;
                    lastEndTime = meeting.end;
                }
            }
            return maxMeetings;
        }
    }
    
        // // USING PRIORITY QUEUE
        // class Meeting {
        //     int start;
        //     int end;
        
        //     Meeting(int start, int end) {
        //         this.start = start;
        //         this.end = end;
        //     }
        // }
        
        // class Solution {
        //     public int maxMeetings(int n, int start[], int end[]) {
        //         Meeting[] meetings = new Meeting[n];
        //         for (int i = 0; i < n; i++) {
        //             meetings[i] = new Meeting(start[i], end[i]);
        //         }
        
        //         Arrays.sort(meetings, (a, b) -> a.end - b.end);
        
        //         int maxMeetings = 0;
        //         int lastEndTime = -1;
        
        //         for (Meeting meeting : meetings) {
        //             if (meeting.start > lastEndTime) {
        //                 maxMeetings++;
        //                 lastEndTime = meeting.end;
        //             }
        //         }
        
        //         return maxMeetings;
        //     }
        // }
    
