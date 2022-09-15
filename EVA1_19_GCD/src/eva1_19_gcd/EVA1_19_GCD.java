/*
 * "Evaluación 1 Práctica 19 "GRATEST COMMON DIVISOR"
 *  15 / 09 / 2022 "
 */
package eva1_19_gcd;
/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_19_GCD {

    public static void main(String[] args) {
        System.out.println(gcd(181, 7));
    }
    
    public static int gcd (int dividendo, int divisor){
        int residuo = dividendo % divisor;
        //Debo determinar si el algoritmo contunua o se detiene
        
        if (residuo == 0) { // Me detengo, encontré el MCD
            return divisor;
        }else{
            return gcd(divisor, residuo);
        }
    }
    
}
