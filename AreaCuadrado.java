
package areacuadrado;

import java.util.Scanner;
        
public class AreaCuadrado {

  
    public static void main(String[] args) {
        
        Scanner teclado =new Scanner(System.in);
        int lado;
        int area;
         
        System.out.print("Indique el valor de uno de los lados: ");
        
        lado=teclado.nextInt();
        area=lado*lado;
        
        System.out.print("El area del cuadrado es: ");
        System.out.print(area);
    }
    
}
