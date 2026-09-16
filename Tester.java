public class Tester{
  public static void main(String[] args){
    int[] nValues = {0,1,2,3,4,5};
    int[] primes = {2,3,5,7,11,13};
    for (int i = 0; i < nValues.length; i++){
      if (nthPrime(nValues[i])==primes[i]){
        System.out.println("pass");
      }
      else{
        System.out.println("fail expected " + primes[i] + ", but value returned was " + nValues[i]);
      }
    }
  }

  public static boolean isPrime(int x){
    boolean result = true;
    for (int i = 2; i <= x-1; i++){
      if (x%i == 0){
        result = false;
      }
    }
    return result;
  }

  public static int nthPrime(int n){
    int counter = -1;
    for (int i = 2;; i++){
      if (isPrime(i)){
        counter++;
        if (counter == n){
          return i;
        }
      }
    }
  }
}
