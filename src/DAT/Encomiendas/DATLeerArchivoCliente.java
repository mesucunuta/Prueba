package DAT.Encomiendas;

import ENT.Encomiendas.Cliente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DATLeerArchivoCliente {
    private ObjectInputStream Entrada;
    
    public void AbrirArchivo(String NombreArchivo) throws FileNotFoundException, IOException {
        Entrada = new ObjectInputStream(new FileInputStream(NombreArchivo));
    }
    
    public void LeerArchivo(ArrayList<Cliente> listCliente) throws IOException, ClassNotFoundException {
        try {
            Cliente Registro;
            while (true) {            
                Registro = (Cliente)Entrada.readObject();
                listCliente.add(Registro);
            }
        } catch (Exception e) {
        }
        
    }
    
    public void CerrarArchivo() throws IOException {
        if (Entrada != null)
            Entrada.close();
    }
}
