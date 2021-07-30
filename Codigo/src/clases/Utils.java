/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * José Rodolfo Morel. 		1-16-0328.
   Rudelvi A. Valenzuela 	1-17-1005
   Brayan Isaac Mancebo. 	2-16-0375.

 */
public class Utils {
    
    private static int salto =0;
    
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static int[] stringToArray(String str){
        if(str.isEmpty()){
            JOptionPane.showMessageDialog(null, "Listado de elementos vacios!");
        }
        else{
            String[] items = str.split(", ");
            int[] array = new int[items.length];

            for (int i = 0; i < items.length; i++) {
                try {
                    array[i] = Integer.parseInt(items[i]);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al convertir los datos");
                }
            }
            return array;
        }
        return null;
    }
    
    //Autor: Brayan Isaac Mancebo. 		2-16-0375
    public static int busquedaBinaria(int[] numeros, int busqueda) {
    
        int size = numeros.length;  // Número de elementos
        int middle = size/2;        // Mitad del array
      
        if (numeros[middle] == busqueda){
          return salto;
        }
        else if (size == 1){
          return -1;
        }else if(size == 2){
            return numeros[0]==busqueda? salto: numeros[1]==busqueda?salto:-1;
        }else if (numeros[middle] > busqueda){
           salto += 1;
          return busquedaBinaria(Arrays.copyOfRange(numeros,0,middle),busqueda);
        }else{
            salto+=1;
          return busquedaBinaria(Arrays.copyOfRange(numeros,middle+1,size),busqueda);  
        }
     }
    
    //Autor: Brayan Isaac Mancebo. 		2-16-0375
    public static int busquedaSecuencial(int[] numeros, int busqueda){
        
        int posicion = -1;
        
        for(int b = 0; b < numeros.length; b++){
             
            if(numeros[b]==busqueda){
                posicion = b;
                break;
            }
        }       
        return posicion;
    }
    
    //Autor: Brayan Isaac Mancebo. 		2-16-0375
    public static void ordenamientoBurbuja(int[] numeros) {
         
        for (int x = 0; x < numeros.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < numeros.length - 1; y++) {
                int elementoActual = numeros[y],
                        elementoSiguiente = numeros[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    numeros[y] = elementoSiguiente;
                    numeros[y + 1] = elementoActual;
                }
            }
        }        
    }
    
    //Autor: Rudelvi A. Valenzuela 		1-17-1005
    public static void ordenamientoInsercion(int[] numeros){
        int aux;
        for (int i = 1; i < numeros.length; i++) {
            aux = numeros[i];
            for (int j = i-1; j >=0 && numeros[j]>aux; j--) {
                numeros[j+1]=numeros[j];
                numeros[j]=aux;
            }
        }
    }
    
    //Autor: Rudelvi A. Valenzuela 		1-17-1005
    public static void ordenamientoQuickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {

            int pi = dividir(arr, bajo, alto);
            ordenamientoQuickSort(arr, bajo, pi - 1);
            ordenamientoQuickSort(arr, pi + 1, alto);
        }
    }
    //Autor: Rudelvi A. Valenzuela 		1-17-1005
    static void intercambio(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//Autor: Rudelvi A. Valenzuela 		1-17-1005
    static int dividir(int[] arr, int low, int high) {

        // pivote
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                // Incrementar indice del elemento menor.
                i++;
                intercambio(arr, i, j);
            }
        }
        intercambio(arr, i + 1, high);
        return (i + 1);
    }
    //Autor: José Rodolfo Morel. 		1-16-0328
    public static long memoryHistogram() {
    String name = ManagementFactory.getRuntimeMXBean().getName();
    String PID = name.substring(0, name.indexOf("@"));
    Process p;
        try {
            p = Runtime.getRuntime().exec("jcmd " + PID + " GC.class_histogram");
            try (BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String line = input.lines().filter(str->str.contains("Total")).toArray()[0].toString();
            String[] ele = line.split("(         |        )");
            if(ele.length>0){
                return Long.parseLong(ele[2]);
            }
                
    }
        } catch (IOException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    return 0;
}
}
