package mx.edu.iebem.api.models;

public class Curp {
    private int id;
    private String rfc;
    private String cve_unica;
    private String nombre;
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCve_unica() {
        return this.cve_unica;
    }

    public void setCve_unica(String cve_unica) {
        this.cve_unica = cve_unica;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
