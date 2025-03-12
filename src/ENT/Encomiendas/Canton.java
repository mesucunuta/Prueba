package ENT.Encomiendas;

import java.io.Serializable;

public class Canton implements Serializable {
    private int IdCanton;
    private int IdProvincia;
    private String Canton;

    public Canton(int IdCanton, int IdProvincia, String Canton) {
        this.IdCanton = IdCanton;
        this.IdProvincia = IdProvincia;
        this.Canton = Canton;
    }
    
    public Canton() {
        
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    

    @Override
    public String toString() {
        return IdCanton + ", " + Canton;
    }
}
