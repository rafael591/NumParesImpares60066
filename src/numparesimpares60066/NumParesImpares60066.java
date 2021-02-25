/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares60066;

/**
 *
 * @author Rafael Moreno
 */
public class NumParesImpares60066 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        int sumaImp = 0;
        int sumPar = 0;
        
        while (numero < 101){
            if (numero % 2 == 0){
                sumPar = (sumPar + numero);
            }
            else if (numero % 2 != 0) {
                sumaImp = numero + sumaImp;
            }
            ++numero;
        }
        System.out.println("La suma de los números pares es: " + sumPar);
        System.out.println("La suma de los números impares es: " + sumaImp);
            
    }

}
