public class ModuloCompras {
    private ProcesadorPago procesador;
    public ModuloCompras(ProcesadorPago procesador) { this.procesador = procesador; }
    public void cambiarProcesador(ProcesadorPago procesador) { this.procesador = procesador; }
    public void comprar(double monto) {
        if (procesador.procesarPago(monto)) System.out.println("Compra aprobada. Total: $" + monto);
        else System.out.println("Pago rechazado.");
    }
}
