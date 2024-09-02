public class resta{
    public static void main(String[] args){
        package examen;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto(1, "Laptop", 1500.00);
        Producto producto2 = new Producto(2, "Mouse", 50.00);
        ReporteVentas reporte = new ReporteVentas();
        Compra compra1 = new Compra(producto1, 2);
        reporte.registrarCompra(compra1);

        Compra compra2 = new Compra(producto2, 2);
        reporte.registrarCompra(compra2);
        reporte.mostrarReporte();
    }
}
class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}

class Compra {
    private Producto producto;
    private int cantidad;

    public Compra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return producto.getPrecio() * cantidad;
    }
}

class ReporteVentas {
    private List<Compra> compras;

    public ReporteVentas() {
        compras = new ArrayList<>();
    }

    public void registrarCompra(Compra compra) {
        compras.add(compra);
    }

    public void mostrarReporte() {
        double totalGasto = 0;

        System.out.println("Reporte de Ventas:");
        for (Compra compra : compras) {
            Producto producto = compra.getProducto();
            int cantidad = compra.getCantidad();
            double totalCompra = compra.getTotal();
            totalGasto += totalCompra;

            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Total Gastado en esta Compra: " + totalCompra);
            System.out.println();
        }
        System.out.println("Gasto Total en Todas las Compras: " + totalGasto);
    }
}
    }
}
