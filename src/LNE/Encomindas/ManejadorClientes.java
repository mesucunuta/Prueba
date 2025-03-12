package LNE.Encomindas;

import DAT.Encomiendas.DATArchivoTexto;
import DAT.Encomiendas.DATGuardarArchivoCliente;
import DAT.Encomiendas.DATLeerArchivoCliente;
import ENT.Encomiendas.Provincia;
import ENT.Encomiendas.Canton;
import ENT.Encomiendas.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ManejadorClientes {

    public void ObtenerProvincias(ArrayList<Provincia> listProvincias) throws FileNotFoundException, IOException {
        DATArchivoTexto objProvincias = new DATArchivoTexto();
        objProvincias.AbrirArchivoTexto("src/Recursos/Provincia.csv");
        objProvincias.LeerArchivoProvincia(listProvincias);
        objProvincias.CerrarArchivoTexto();

        // Leer Cantones
        ArrayList<Canton> listCanton = new ArrayList<Canton>();
        DATArchivoTexto objCantones = new DATArchivoTexto();
        objCantones.AbrirArchivoTexto("src/Recursos/Canton.csv");
        objCantones.LeerArchivoCanton(listCanton);
        objCantones.CerrarArchivoTexto();

        for (Provincia p : listProvincias) {
            ArrayList<Canton> listCantonAux = new ArrayList<>();
            for (Canton c : listCanton) {
                if (p.getIdProvincia() == c.getIdProvincia()) {
                    listCantonAux.add(c);
                }
            }
            p.setCantones(listCantonAux);
        }

    }

    public void GuardarCliente(Cliente objCliente) throws IOException {
        DATGuardarArchivoCliente objGuardarArchivo = new DATGuardarArchivoCliente();
        objGuardarArchivo.AbrirArchivo("src/Recursos/Cliente.ser");
        objGuardarArchivo.AgregarRegistro(objCliente);
        objGuardarArchivo.CerrarArchivo();
    }

    public void CargarClientes(ArrayList<Cliente> listClientes) throws IOException, ClassNotFoundException {
        DATLeerArchivoCliente objCliente = new DATLeerArchivoCliente();
        objCliente.AbrirArchivo("src/Recursos/Cliente.ser");
        objCliente.LeerArchivo(listClientes);
        objCliente.CerrarArchivo();
               
    }

}
