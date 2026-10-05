
package com.mycompany.ed3s6_practica1;


public class ED3S6_Practica2 <Q, W> {

    Q palabra1;
    W palabra2;

    // Constructor
    public ED3S6_Practica2(Q palabra1, W palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    // Método para unir palabras
    public void unirPalabras() {
        if (palabra1 instanceof String && palabra2 instanceof String) {
            String resultado = palabra1 + " " + palabra2;
            System.out.println("Palabra 1: " + palabra1);
            System.out.println("Palabra 2: " + palabra2);
            System.out.println("Unión: " + resultado);
        } else {
            System.out.println("ERROR: SOLO SE PERMITEN PALABRAS (STRING)");
        }
    }

    // Método principal para ejecutar y probar la clase
    public static void main(String[] args) {
        /*
        ED3S6_Practica1<String, String> obj3 = new ED3S6_Practica1<>("Hola", "Mundo");
        obj3.unirPalabras();*/
        
  
    
        ED3S6_Practica1<Integer,Integer> obj1 = new ED3S6_Practica1<>(5,3);
        obj1.detecta();
          ED3S6_Practica1<Double,Double> obj2 = new ED3S6_Practica1<>(5.5,3.3);
            obj2.detecta();
            ED3S6_Practica1<Float,Float> obj4 = new ED3S6_Practica1<>(5.5f,3.3f);
            obj4.detecta();
       
        //llamoar el metodo para unir
        
    }
    
    
}