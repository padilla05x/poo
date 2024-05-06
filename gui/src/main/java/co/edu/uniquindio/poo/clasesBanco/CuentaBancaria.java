package co.edu.uniquindio.poo.clasesBanco;


public abstract class CuentaBancaria {
    protected final String nombreTitular;
    private final String apellidosTitular;
    private final String numeroCuenta;
    public  int saldo;
    private  boolean estado;
    protected Object getNumeroCuenta;

    public CuentaBancaria(String nombreTitular, String apellidosTitular, String numeroCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.estado = false;
    }


    @Override
    public String toString() {
        return "Cuenta Bancaria nombreTitular = " + nombreTitular + ", apellidosTitular = " + apellidosTitular+ ", numeroCuenta = " + numeroCuenta + ", saldo = " + saldo + ", estado = " + estado + "";
    }

    public abstract void retirar(int valor);

    public void depositar(int valor) {
        assert valor > 0 : "ERROR: La cantidad a depositar no puede ser negativa";
        int saldoNuevo = getSaldo() + valor;
        setSaldo(saldoNuevo);
        setEstado(true);
    }



    public String consultarSaldo() {
       String saldoConsultado = "";
       int valorConsultado = 0;
        if(isEstado()== true){
            valorConsultado = valorConsultado + getSaldo();
            saldoConsultado = "$" + getSaldo();
       }
       else{
        saldoConsultado = "Su cuenta esta desactivada";
       }
        return saldoConsultado;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public  int getSaldo() {
        return saldo;
    }

    public  void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}