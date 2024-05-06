package co.edu.uniquindio.poo.clasesBanco;

public class CuentaAhorros extends CuentaBancaria {
    private final double interes;

    public CuentaAhorros(String nombreTitular, String apellidosTitular, String numeroCuenta, double interes) {
        super(nombreTitular, apellidosTitular, numeroCuenta);
        this.interes = interes;
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public void retirar(int valor) {
        assert valor > 0;
        if (getSaldo() >= valor) {
            int saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        } else {
           System.out.print("retiro denegado.");
        }
    }

    public static void crearCuentaAhorro(String nombreTitular, String apellidoTitular, String numeroCuenta,
            double interess) {
        CuentaAhorros cuenta_Ahorro = new CuentaAhorros(nombreTitular, apellidoTitular, numeroCuenta, interess);
        Banco.agregarCuenta(cuenta_Ahorro);
    }
}
