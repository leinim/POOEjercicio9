/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pooej9;

import Entidades.Matematica;
import Servicios.ServicioMatematica;

/**
 *
 * @author Mile
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioMatematica sm = new ServicioMatematica();
        Matematica m1 = new Matematica();
        
        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);
        
        System.out.println(m1.toString());
        
        System.out.println("El mayor de los dos números es " + sm.devolverMayor(m1));
        System.out.println("La potencia del numero mayor elevado al numero menor es " + sm.calcularPotencia(m1));
        System.out.println("La raiz del numero menor es: " + sm.calcularRaiz(m1));
    }
    
}
