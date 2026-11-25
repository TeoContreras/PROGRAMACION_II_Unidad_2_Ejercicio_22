public class main {
    public static void main(String[] args) {
        ModuloCompras compras = new ModuloCompras(new PagoTarjetaCredito());
        compras.comprar(12000);
        compras.cambiarProcesador(new PagoCriptomoneda());
        compras.comprar(8000);
        compras.cambiarProcesador(new PagoBilleteraVirtual());
        compras.comprar(5000);
    }
}
