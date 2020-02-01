class Solution {
    public void nextPermutation(int[] nums) {
    
    
        /* Find the index from where to the end, the array would be strictly decreasing
        LOGIC: a strictly decreasing array is one that has taken all options from its decision space, 
        thus its next permutation would be that of the first permutation that is ascending 
        And we would be interested in the index just before this strictly decreasing part of the array*/
        
        //Finding that index ,after which the strictly decreasing array would be obtained.
        int i=nums.length-1;
        while(i-1>=0&&nums[i-1]>=nums[i])
        {
            i--;
        }
        i--;
       
        // if the whole array has taken all options of its decision space.
        //return whole reversed array
        if(i==-1)
        {reverse(nums,0);
        return;}
        
        //find the next minimum number(greater than ith index number and smallest in the decreasing array)
        
        int min=i+1;
        for(int k=i+1;k<nums.length;k++)
        {
            if(nums[k]>nums[i]&&nums[k]<=nums[min])min=k;//
        }
        
        //SWAP min index number with ith index number
        int temp=nums[min];
        nums[min]=nums[i];
        nums[i]=temp;
        
        //reverse array from i+1th to end of array
        //(because what we obtained was largest next and to make it smallest we got to reverse the same )
        reverse(nums,i+1);
        
    }
    
    //program to reverse index from certain index "pos"
    public void reverse(int[] nums,int pos)
    {
        int i=pos,j=nums.length-1;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
}
