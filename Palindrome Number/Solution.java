public class Solution {
    public boolean isPalindrome(int x) {
        int remainder,reversed=0;
        int number=x;
        
        if(x<0)
            return false;
        
        while(x!=0){
            remainder=x%10;
            reversed=reversed*10+remainder;
            x/=10;
        }
        
        if(reversed==number)
            return true;
        else
            return false;
    }
}
