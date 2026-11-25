public class PagoTarjetaCredito implements ProcesadorPago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando tarjeta de crédito...");
        return monto > 0 && monto <= 100000;
    }
}
