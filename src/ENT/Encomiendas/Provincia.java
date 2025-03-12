package ENT.Encomiendas;

import java.io.Serializable;
import java.util.ArrayList;

public class Provincia implements Serializable {
    private int IdProvincia;
    private String Provincia;
    private ArrayList<Canton> Cantones;

    public Provincia(int IdProvincia, String Provincia) {
        this.IdProvincia = IdProvincia;
        this.Provincia = Provincia;
        this.Cantones = null;
    }
    
    public Provincia() {
        
    }
            

    public void setCantones(ArrayList<Canton> Cantones) {
        this.Cantones = Cantones;
    }  

    public int getIdProvincia() {
        return IdProvincia;
    }

    public ArrayList<Canton> getCantones() {
        return Cantones;
    }
    
    
    
    

    @Override
    public String toString() {
        return String.format("%s\n", Provincia);
    }
}
