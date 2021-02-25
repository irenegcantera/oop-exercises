
package matematicas;

/**
 * Clase que contiene métodos para calcular el factorial, el número fibonacci,
 * la suma de un número, si es primo o no, la potencia de un número, el mínimo
 * común múltiplo y el máximo como divisor.
 * @author Irene
 */
public class Matematicas {
    
    //Factorial
    public static long factorial(int n){
        long fac = 1;
        for(int i = 0; i < n; i++){
            fac *= i;
        }
        return fac;
    }
    
    //Fibonacci
    public static long fibonacci(int n){
        long fibo = (n-1) + (n-2);
        return fibo;
    }
    
    //Sumatorio
    public static long sumatorio(int n){
        long suma = 0;
        for(int i = 0; i < n; i++){
            suma += i;
        }
        return suma;
    }
    
    //Es primo
    public static boolean esPrimo(int n){
        boolean primo = false;
        if(n % 1 == 0 && n % n == 0){
            primo = true;
        }
        return primo;
    }
    
    //Potencia
    public static long potencia(int x, int n){
        long pot = 1;
        for(int i = 0; i < n; i++){
            pot *= x;
        }
        return pot;
    }
    
    //mcm
    public static int mcm(int x, int n){
        int mcm = 1, i = 2;
        while(i <= x || i <= n){
            if(x % i == 0 || n % i == 0){
                mcm = mcm * i;
                if(x % i == 0){
                    x = x/i;
                }
                if(n % i == 0){
                    n = n/i;
                }
            }else{
                i = i + 1;
            }
        }
        return mcm;
    }
    
    //MCD
    public static int mcd(int num1, int num2){
        while(num1 != num2){
            if(num1 > num2){
               num1 = num1 - num2; 
            }else{
                num2 = num2 - num1;
            }
        }
        return num1;
    }
    
    public static void main(String[] args) {
        System.out.println(mcd(45,65));
    }
}
