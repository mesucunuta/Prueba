package DAT.Encomiendas;

import ENT.Encomiendas.Canton;
import ENT.Encomiendas.Provincia;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DATArchivoTexto {
    private BufferedReader Entrada;
    
    public void AbrirArchivoTexto(String NombreArchivo) throws FileNotFoundException {
        try {
            Entrada = new BufferedReader(new FileReader(NombreArchivo));
        } catch (Exception e) {
            System.err.println("errrorrrr");
        }
        
    }
    
    // Leer desde archivo de texto las Provincias
    public void LeerArchivoProvincia(ArrayList<Provincia> listProvincias) throws IOException {
        String strLinea;
        String[] Columnas;
        while((strLinea = Entrada.readLine()) != null) {
            Columnas = strLinea.split(";");
            listProvincias.add(new Provincia(Integer.parseInt(Columnas[0]), Columnas[1]));
        }          
    }
    
    // Leer desde archivo de texto Los Cantones
    public void LeerArchivoCanton(ArrayList<Canton> listCanton) throws IOException {
        String Linea;
        String[] Columnas;
        while ((Linea = Entrada.readLine()) != null) {
            Columnas = Linea.split(";");
            listCanton.add(new Canton(Integer.parseInt(Columnas[0]), Integer.parseInt(Columnas[1]), Columnas[2]));
        }
    }
    public void CerrarArchivoTexto() throws IOException {
        if (Entrada != null)
            Entrada.close();
    }
}
