
package domain;


public class MainTres {
    public static void main(String[] args) {
        
        
        double precio=calcularIva(100);
        System.out.println("El precio total con iva incluido es de: "+"$"+  precio);
        
     }
    
   
    public static  double calcularIva(double precio){
        
        double iva=precio*0.21;
        return precio+iva;
    }
    }


