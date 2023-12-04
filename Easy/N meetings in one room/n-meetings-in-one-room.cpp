//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
    public:
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    int maxMeetings(int start[], int end[], int n)
    {
        // Your code here
          int cnt=1;
        vector<pair<int,int>>vp;
        
        for(int i=0;i<n;i++)  vp.push_back({start[i],end[i]});
        sort(vp.begin(),vp.end());
        
        for(int i=0;i<n-1;i++)
        {
            if(vp[i].second>=vp[i+1].first)
            {
                vp[i+1].second=min(vp[i].second,vp[i+1].second);
            }
            else cnt++;
            
        }        
        
        return cnt;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int start[n], end[n];
        for (int i = 0; i < n; i++) cin >> start[i];

        for (int i = 0; i < n; i++) cin >> end[i];

        Solution ob;
        int ans = ob.maxMeetings(start, end, n);
        cout << ans << endl;
    }
    return 0;
}
// } Driver Code Ends