package GUI.Encomiendas;

import ENT.Encomiendas.Provincia;
import LNE.Encomindas.ManejadorClientes;
import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<Provincia> listProvincias = new ArrayList<Provincia>();
        ManejadorClientes objProvincias = new ManejadorClientes();
        try {
            objProvincias.ObtenerProvincias(listProvincias);
        for (Provincia p : listProvincias)
            System.out.printf("%s", p);
        } catch (Exception e) {
            System.err.println("Error");
            
        }
        
    }
}
