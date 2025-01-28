class Solution {
    public boolean isHappy(int n) {
        int s=0;
        int x=0;
        while(n!=0)
        {
            int rem=n%10;
            s=s+rem*rem;
            n=n/10;
            
        }
        if(s==1)
        {
            return true;
        }
        else if(s==4)
        {
            return false;
        }
        else{
            return isHappy(s);
        }
        
    }
}