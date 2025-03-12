package ENT.Encomiendas;

import java.io.Serializable;
import java.sql.Date;

public class Cliente implements Serializable{
    private int IdCliente;
    private String Identificacion;
    private String Apellidos;
    private String Nombres;
    private Date FechaNacimiento;
    private Direccion LugarResidencia;

    public Cliente(int IdCliente, String Identificacion, String Apellidos, String Nombres, Date FechaNacimiento, Direccion LugarResidencia) {
        this.IdCliente = IdCliente;
        this.Identificacion = Identificacion;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.FechaNacimiento = FechaNacimiento;
        this.LugarResidencia = LugarResidencia;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public Direccion getLugarResidencia() {
        return LugarResidencia;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", IdCliente, Identificacion, Apellidos, Nombres, FechaNacimiento, LugarResidencia);
    }
    
    
    
}
