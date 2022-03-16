package app.factura;

import java.time.LocalDate;

public class Factura{

    String descripcion;
    int precio;
    LocalDate fecha;
    int cantidadProductos;
    Long codigoFactura;

    public Factura(String descripcion, int precio, LocalDate fecha, Long codigoFactura, int cantidadProductos){
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.codigoFactura = codigoFactura;
        this.cantidadProductos = cantidadProductos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public int getPrecio() {
        return precio;
    }

    public Long getCodigoFactura() {
        return codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
