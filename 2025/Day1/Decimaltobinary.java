// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int num = 13;
         int bin =  dtob(num);
         System .out.println(reverse(bin));
          
    }
  // To get binary but in reverse order
    static int dtob(int rev){
        int s=0;
        int r =0;
        while(rev!=0){
          r = rev%2;
          s = (s*10)+r;
          rev/=2;
        }
        return s;
    }

  // To reverse the answer
    static int reverse(int n){
        int rem = 0;
        int ans = 0;
        while(n!=0){
            rem = n%10;
            ans = (ans*10)+rem;
            n/=10;
        }
        return ans;
    }
}
