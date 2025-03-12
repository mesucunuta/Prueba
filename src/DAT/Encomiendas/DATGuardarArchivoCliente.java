package DAT.Encomiendas;

import ENT.Encomiendas.Cliente;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DATGuardarArchivoCliente {
    private ObjectOutputStream Salida;
    
    public void AbrirArchivo(String NombreArchivo) throws FileNotFoundException, IOException {
        Salida = new ObjectOutputStream(new FileOutputStream(NombreArchivo));
    }
    
    public void AgregarRegistro(Cliente RegistroCliente) throws IOException {
        Salida.writeObject(RegistroCliente);
    }
    
    public void CerrarArchivo() throws IOException {
        if (Salida !=null)
            Salida.close();
    }
}
