package CodingChallenges.Prime;

public class Prime {

    /**
     * A prime number isn't divisible by any number other than itself and 1 - like 3, 5, 7
     * @param n a int.
     * @return true if n is a prime number, false if n is not a prime number.
     */
    public boolean isPrime(int n){
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3; i < n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
