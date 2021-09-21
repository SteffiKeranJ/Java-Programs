class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
    public PerformOperation isOdd() {
        return (a) -> a%2 == 1;
        
    }
    
    public PerformOperation isPrime() {
        return (a) -> {
            for(int i = 2; i < a/2; ++i) {
                if(a%i == 0) return false;
            }
            return true;
        };
    }
    
    public PerformOperation isPalindrome() {
        return (a) -> {
            int rev = 0; int r = 0; int n = a;
            while(n!=0) {
                r = n%10;
                rev = rev*10 + r;
                n = n/10;
            }
            return (rev == a);
            
        };
    }

}
