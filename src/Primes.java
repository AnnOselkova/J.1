public class Primes {
    public static void main(String[] args) {
        for (int i=2 ; i<= 100; i++){ //вводим переменную i и ее диапозон
            if(isPrime(i)){
                System.out.println(i);// если число просто, то выводим его
            }
        }
    }
    public static boolean isPrime(int n) // проверка числа 
    {
        if( n < 2 ) return false;
        int prov; // вводим переменную, которая является остатком от деления
        for (int i = 2; i <= n/2; i++){
            prov=n % i;
            if (prov == 0){
                return false;// если число делится без остатка, то оно не подходит
            }
        }
        return true;
    }

}
