public class Vendedor {
    int codigoVendedor;
    String nombreVendedor;

    Vendedor(int codigoVendedor, String nombreVendedor){
        this.codigoVendedor = codigoVendedor;
        this.nombreVendedor = nombreVendedor;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombreVendedor;
    }
}
