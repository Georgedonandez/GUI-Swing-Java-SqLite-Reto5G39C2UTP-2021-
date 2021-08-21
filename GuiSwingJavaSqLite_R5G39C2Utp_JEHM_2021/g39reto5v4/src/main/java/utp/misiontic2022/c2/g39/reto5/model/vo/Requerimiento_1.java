package utp.misiontic2022.c2.g39.reto5.model.vo;

public class Requerimiento_1 {
    
    private String fechaCompra;
    private Integer codCompra;
    private String nombreProveedor;
    private String pagado;
    private Integer cantidad;
    
    public Requerimiento_1() {

    }

    public Requerimiento_1(String fechaCompra, Integer codCompra, String nombreProveedor, String pagado, Integer cantidad){
        this.fechaCompra = fechaCompra;
        this.codCompra = codCompra;
        this.nombreProveedor = nombreProveedor;
        this.pagado = pagado;
        this.cantidad = cantidad;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public Integer getCodCompra() {
        return codCompra;
    }
    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public String getPagado() {
        return pagado;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
