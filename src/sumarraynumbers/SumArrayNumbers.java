
package sumarraynumbers;

import java.util.Scanner;

public class SumArrayNumbers {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        double num=0;
       
        System.out.println("Ingrese la cantidad de numeros que quiere sumar");
        
        n=sc.nextInt();
        
        int Vector []=new int[n];
        
         double suma=0;
        
        
        
        for (int i=0;i<Vector.length;i++){
        
            System.out.println("Ingrese los numeros a sumar");
        
              num = sc.nextDouble();
                             
           
            suma= suma+num;        
        
    }
    
        System.out.println("El total de la suma es: " + suma);
}
}