package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import app.factura.Factura;
import app.filtros.Filtros;

public class App {

    public static void main(String[] args) {
        Factura factura1 = new Factura("ordenador", 1000, LocalDate.of(2022, 03, 16), 12345L, 1);
        Factura factura2 = new Factura("movil", 300, LocalDate.of(2022, 04, 16), 23456L, 25);
        Factura factura3 = new Factura("impresora", 200, LocalDate.of(2010, 03, 16), 34567L, 10);
        Factura factura4 = new Factura("imac", 1500, LocalDate.of(2022, 03, 25), 45678L, 1001);

        List<Factura> lista = new ArrayList<Factura>();

        lista.add(factura1);
        lista.add(factura2);
        lista.add(factura3);
        lista.add(factura4);

        

        System.out.println("\nLista de facturas con precio mayor a 300: ");
        List<Factura> FacturasFiltroImporteMayor = lista.stream()
            .filter(Filtros.predicadoImporteMayor)
            .collect(Collectors.toList());
        for (Factura factura : FacturasFiltroImporteMayor) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroFechaMayorActual = lista.stream()
            .filter(Filtros.predicadoFechaMayor)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con fecha mayor a la actual: ");
        for (Factura factura : facturasFiltroFechaMayorActual) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroFechaMenorActual = lista.stream()
            .filter(Filtros.predicadoFechaMenor)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con fecha menor a la actual: ");
        for (Factura factura : facturasFiltroFechaMenorActual) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroCantidadProductosMenor = lista.stream()
            .filter(Filtros.predicadoCantidadProductosMenor)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con cantidad de productos menor a 10: ");
        for (Factura factura : facturasFiltroCantidadProductosMenor) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroCantidadProductosMayor = lista.stream()
            .filter(Filtros.predicadoCantidadProductosMayor)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con cantidad de productos mayor a 10: ");
        for (Factura factura : facturasFiltroCantidadProductosMayor) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroCantidadProductosIgual = lista.stream()
            .filter(Filtros.predicadoCantidadProductosIgual)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con cantidad de productos igual a 10: ");
        for (Factura factura : facturasFiltroCantidadProductosIgual) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

        List<Factura> facturasFiltroCodigoFactura = lista.stream()
            .filter(Filtros.predicadoCodigoFactura)
            .collect(Collectors.toList());
        System.out.println("\nLista de facturas con código de factura 12345: ");
        for (Factura factura : facturasFiltroCodigoFactura) {
            System.out.println("- FACTURA N°"+factura.getCodigoFactura()+" | Precio: $"+factura.getPrecio()+" | Fecha: "+factura.getFecha()+" | Cantidad de productos: "+factura.getCantidadProductos()+".");
        }

    }

}
