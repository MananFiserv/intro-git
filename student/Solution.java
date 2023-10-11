public class Solution{
    public static void main(String[] args){
        System.out.println(isPrime(2)); //Solution.isPrime(2); //-> true
        System.out.println(isPrime(0)); //Solution.isPrime(0); //-> false
        System.out.println(isPrime(1)); //Solution.isPrime(1);//-> false
        System.out.println(isPrime(31));//Solution.isPrime(31); //-> true

    }
    public static Boolean isPrime (int num){
        if(num == 2){
            return true;
        }
        if (num <=1){
            return false;
        }
        for(int i=2; i <=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
