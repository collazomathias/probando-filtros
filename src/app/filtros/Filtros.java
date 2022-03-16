package app.filtros;

import java.time.LocalDate;
import java.util.function.Predicate;

import app.factura.Factura;

public class Filtros {
    public static Predicate<Factura> predicadoImporteMayor = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getPrecio() > 300;
        }
    };

    public static Predicate<Factura> predicadoFechaMenor = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getFecha().isBefore(LocalDate.now());
        }
    };

    public static Predicate<Factura> predicadoFechaMayor = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getFecha().isAfter(LocalDate.now());
        }
    };

    public static Predicate<Factura> predicadoCodigoFactura = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getCodigoFactura() == 12345;
        }
    };

    public static Predicate<Factura> predicadoCantidadProductosMenor = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getCantidadProductos() < 10;
        }
    };

    public static Predicate<Factura> predicadoCantidadProductosMayor = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getCantidadProductos() > 10;
        }
    };

    public static Predicate<Factura> predicadoCantidadProductosIgual = new Predicate<Factura>() {
        @Override
        public boolean test(Factura factura) {
            return factura.getCantidadProductos() == 10;
        }
    };
}
