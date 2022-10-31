package insercionBinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsercionBinaria {
    private int[]arr;
    private int item;
    private int low;
    private int high;
    private int numElementos;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public void setNumElementos() throws IOException {
        System.out.println("Ingresa el número de elementos del arreglo");
        numElementos = Integer.parseInt(bf.readLine());
        this.arr = new int[numElementos];
    }
    
    public void setElementos() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ".- Teclea un número: ");
            arr[i] = Integer.parseInt(bf.readLine());
        }
    }
    
   // Funcion para ordenar un arreglo 
    public void ordenaPorInsercion() {
        int i, pos, j, k, seleccionado;
        
        for (i = 1; i < arr.length; i++) {
            j = i - 1;
            seleccionado = arr[i];
            
            // Encontrar la posicion donde debe ser insertado
            pos = busquedaBinaria(seleccionado, 0, j);
            
            // Mover elementos para hacer espacio
            while( j >= pos) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = seleccionado;
        }
    }
    
    public int busquedaBinaria(int item, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (item == arr[mid]) {
                return mid + 1;
            } else if(item > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    
    public void imprimeArreglo() {
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +  " - ");
        }
    }
}
