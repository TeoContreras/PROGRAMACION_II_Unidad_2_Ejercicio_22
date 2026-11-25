public class PagoCriptomoneda implements ProcesadorPago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando criptomoneda...");
        return monto > 0 && monto <= 50000;
    }
}
