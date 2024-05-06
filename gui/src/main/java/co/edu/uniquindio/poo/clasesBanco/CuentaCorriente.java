package co.edu.uniquindio.poo.clasesBanco;

public class CuentaCorriente extends CuentaBancaria {
    private int sobregiro;

    public CuentaCorriente(String nombreTitular, String apellidosTitular, String numeroCuenta, int sobregiro) {
        super(nombreTitular, apellidosTitular, numeroCuenta);
        this.sobregiro = sobregiro;
    }

    public int getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria nombreTitular = " + getNombreTitular() + ", apellidosTitular = " + getApellidosTitular()+ ", numeroCuenta = " + getNumeroCuenta() + ", saldo = " + saldo + ", estado = " ;
    }

    @Override
    public void retirar(int valor) {
        assert valor > 0;
        assert sobregiro > 0;
        if(valor<=getSaldo()){
            int saldoNuevo = getSaldo() - valor;
            setSaldo(saldoNuevo);
        }
        else if(sobregiro+getSaldo()>valor){
            
            setSaldo(getSaldo()-valor);
            int nuevoSobregiro = sobregiro + valor;
            sobregiro = nuevoSobregiro;
        }
        else{
            System.out.println("No se pudo realizar el retiro.");
        }
        
    }

    public static void crearCuentaCorriente(String nombreTitularField, String apellidoField,
        String numeroCuentaField, int sobregiro) {
            
        CuentaCorriente cuentaCorriente = new CuentaCorriente(nombreTitularField, apellidoField, numeroCuentaField, sobregiro);
        Banco.agregarCuenta(cuentaCorriente);

    }

}
