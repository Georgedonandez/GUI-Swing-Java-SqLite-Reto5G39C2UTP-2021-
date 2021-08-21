package utp.misiontic2022.c2.g39.reto5.model.vo;

public class Requerimiento_3 {
    
    private String abrevLider;
    private String nombreLider;
    private String apellidoLider;
    private Integer idLider;
    private Integer salarioLider;
    
    public Requerimiento_3(){
        
    }
    
    public Requerimiento_3(String abrevLider, String nombreLider, String apellidoLider, Integer idLider, Integer salarioLider){
        this.setAbrevLider(abrevLider);
        this.nombreLider = nombreLider;
        this.apellidoLider = apellidoLider;
        this.idLider = idLider;
        this.salarioLider = salarioLider;
    }
    
    public String getAbrevLider(){
        return this.abrevLider;
    }    
    public void setAbrevLider(String abrevLider){
        this.abrevLider = abrevLider;
    }
    public String getNombreLider(){
        return nombreLider;
    }    
    public void setNombreLider(String nombreLider){
        this.nombreLider = nombreLider;
    }
    public String getApellidoLider(){
        return apellidoLider;
    }    
    public void setApellidoLider(String apellidoLider){
        this.apellidoLider = apellidoLider;
    } 
    public Integer getIdLider(){
        return idLider;
    }    
    public void setIdLider(Integer idLider){
        this.idLider = idLider;
    } 
     public Integer getSalarioLider(){
        return salarioLider;
    }    
    public void setSalarioLider(Integer salarioLider){
        this.idLider = salarioLider;
    }   
}
