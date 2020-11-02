public class Producto {
    int codigo;
    String  nombre;
    float precio_venta;
    float precio_compra;

    public Producto(int codigo, String nombre, float precio_compra, float precio_venta){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }
    public float getPrecio_compra() {
        return precio_compra;
    }
    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }


}
