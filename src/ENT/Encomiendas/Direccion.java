package ENT.Encomiendas;

import java.io.Serializable;

public class Direccion implements Serializable {
    private Provincia Provincia;
    private Canton Canton;
    private String Calle;
    private String Numero;

    public Direccion(Provincia Provincia, Canton Canton, String Calle, String Numero) {
        this.Provincia = Provincia;
        this.Canton = Canton;
        this.Calle = Calle;
        this.Numero = Numero;
    }
    
    
    
    
}
