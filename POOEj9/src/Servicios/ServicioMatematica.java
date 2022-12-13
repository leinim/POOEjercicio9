/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calcularRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author Mile
 */
public class ServicioMatematica {
    
    public double devolverMayor(Matematica m){
        double retorno = m.getNum2();
        if (m.getNum1() > m.getNum2()){
            retorno = m.getNum1();           
        }
        return retorno;
    }
    
    public double calcularPotencia(Matematica m){
        double num1 = Math.floor(m.getNum1());
        double num2 = Math.floor(m.getNum2());
        double potencia;
        if (num1 > num2){
            potencia = Math.pow(num1, num2);
        } else {
            potencia = Math.pow(num2, num1);
        }
               
        return potencia;
                
    }
    
    public double calcularRaiz(Matematica m){
        double num1 = Math.floor(m.getNum1());
        double num2 = Math.floor(m.getNum2());
        double raiz;
        if (num1 > num2){
            raiz = Math.sqrt(num2);
        } else {
            raiz = Math.sqrt(num1);
        }
        return raiz;
    }
            
        
}
