package Entidad;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Personas {

    int Id;
    String perNombre;
    String perApellido;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date perFechaNacimiento;
    String perTipoDocumento;
    String perNumeroDocumento;

    public Personas() {
    }

    public Personas(int Id, String perNombre, String perApellido, Date perFechaNacimiento, String perTipoDocumento, String perNumeroDocumento) {
        this.Id = Id;
        this.perNombre = perNombre;
        this.perApellido = perApellido;
        this.perFechaNacimiento = perFechaNacimiento;
        this.perTipoDocumento = perTipoDocumento;
        this.perNumeroDocumento = perNumeroDocumento;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public String getPerApellido() {
        return perApellido;
    }

    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }

    public Date getPerFechaNacimiento() {
        return perFechaNacimiento;
    }

    public void setPerFechaNacimiento(Date perFechaNacimiento) {
        this.perFechaNacimiento = perFechaNacimiento;
    }

    public String getPerTipoDocumento() {
        return perTipoDocumento;
    }

    public void setPerTipoDocumento(String perTipoDocumento) {
        this.perTipoDocumento = perTipoDocumento;
    }

    public String getPerNumeroDocumento() {
        return perNumeroDocumento;
    }

    public void setPerNumeroDocumento(String perNumeroDocumento) {
        this.perNumeroDocumento = perNumeroDocumento;
    }

}
