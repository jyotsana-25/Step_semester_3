public class PrimeNumber {
    public static void main(string[] args) {
        Scanner sc = new scanner(system.in)

        system.out.print("enter a number:");
        int n = sc.nextint();

        boolean isprime = true;
        if(n<=1)
        {
            isprime=false;
        } else{
            for(int=2; i<= math.sqrt(n); i++){
                if (n % i == 0) {
                    isPrime = false;
                    break;
            }
        }
        if (isPrime)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is not a Prime Number.");

        sc.close();
    }
}