class Main {
    public static void main(String[] args) {
     int num = 1101;
     int rem = 0;
     int ans = 0;
     int pow2 = 1;
     while(num!=0){
         rem = num%10;
         ans = ((rem*pow2)+ans);
         num/=10;
         pow2*=2;
     }
     System.out.println(ans);
    }
}
