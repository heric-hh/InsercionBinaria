package insercionBinaria;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InsercionBinaria obj = new InsercionBinaria();
        
        // Setear longitud del array
        obj.setNumElementos();
        
        // Llenar arreglo
        obj.setElementos();
        
        // Ordenar arreglo
        obj.ordenaPorInsercion();
        
        // Imprimir arreglo
        obj.imprimeArreglo();
        
    }
}
