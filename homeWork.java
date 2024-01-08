public class homeWork {
    public static void main(String[] args) {
        printPrimes();
    }
    public static void printPrimes() {
        for(int i = 1; i <= 1000; i ++) {
            if(isPrime(i)) 
                System.out.print(i + " ");
        }
    }
    // viết hàm in ra các số từ 1 đến 1000
    public static boolean isPrime(int n) {
        if(n < 2) 
            return false;
        else if(n == 2 || n == 3) 
            return true;
        else
            for(int i = 2; i <= Math.sqrt(n); i ++) 
                if(n % i == 0) 
                    return false;
        return true;
    }
}
