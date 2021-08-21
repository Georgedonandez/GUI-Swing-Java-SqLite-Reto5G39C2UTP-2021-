package utp.misiontic2022.c2.g39.reto5.model.vo;

public class Requerimiento_2 {

    private String fecIni;
    private String nombreCiudad;
    private String nomConstructora;
    private String nombreLider;
    private Integer codigoTipo;
    private Integer estrato;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String fecIni, String nombreCiudad, String nomConstructora, 
                           String nombreLider, Integer codigoTipo, Integer estrato){
        this.fecIni = fecIni;
        this.nombreCiudad = nombreCiudad;
        this.nomConstructora = nomConstructora;
        this.nombreLider = nombreLider;
        this.codigoTipo = codigoTipo;
        this.estrato = estrato;
    }

    public Integer getEstrato() {
        return estrato;
    }
    public String getFecIni() {
        return fecIni;
    }
    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String getNomConstructora() {
        return nomConstructora;
    }
    public void setNomConstructora(String nomConstructora) {
        this.nomConstructora = nomConstructora;
    }
    public String getNombreLider() {
        return nombreLider;
    }
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    public Integer getCodigoTipo() {
        return codigoTipo;
    }
    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
 
}
