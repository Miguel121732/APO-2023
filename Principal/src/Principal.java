import java.util.Scanner;

//nombre de la clase
public class Principal {
  
    //metodo principal (main)
    public static void main(String[] args) {
    	
    	System.out.println("ingrese la palabra");
    	//clase que permite capturar datos por consola
        Scanner sc = new Scanner (System.in);

 String prueba = sc.next();
 System.out.println("la cantidad de letras que tiene la palabra es :".concat(prueba).toUpperCase());
	}
}
