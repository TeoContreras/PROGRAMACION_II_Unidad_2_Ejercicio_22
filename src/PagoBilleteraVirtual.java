public class PagoBilleteraVirtual implements ProcesadorPago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando billetera virtual...");
        return monto > 0;
    }
}
