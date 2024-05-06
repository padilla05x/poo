package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.clasesBanco.CuentaAhorros;
import co.edu.uniquindio.poo.clasesBanco.CuentaBancaria;
import co.edu.uniquindio.poo.clasesBanco.CuentaCorriente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BancoApp extends Application {

    private CuentaBancaria cuenta;

    public static void main(String[] args) {
        launch(args);
    }

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gestor de Cuenta Bancaria");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(8);
        grid.setHgap(10);


        /*
         * Campo de texto para ingresar el nombre del Titular.
         */
        Label nombreLabel = new Label("Nombre del Titular:");
        GridPane.setConstraints(nombreLabel, 0, 0);
        TextField nombreInput = new TextField();
        GridPane.setConstraints(nombreInput, 1, 0);

        
        /*
         * Campo de texto para ingresar el apellido del Titular.
         */
        Label apellidosLabel = new Label("Apellido del Titular:");
        GridPane.setConstraints(apellidosLabel, 0, 1);
        TextField apellidosInput = new TextField();
        GridPane.setConstraints(apellidosInput, 1, 1);


        /*
         * Campo de texto para ingresar el número de cuenta del Titular.
         */
        Label numeroLabel = new Label("Número de Cuenta:");
        GridPane.setConstraints(numeroLabel, 0, 2);
        TextField numeroInput = new TextField();
        GridPane.setConstraints(numeroInput, 1, 2);


        /*
         * Elegir tipo de cuenta del Titular.
         */
        Label tipoLabel = new Label("Tipo de Cuenta:");
        GridPane.setConstraints(tipoLabel, 0, 3);
        ComboBox<String> tipoComboBox = new ComboBox<>();
        tipoComboBox.getItems().addAll("Cuenta de Ahorros", "Cuenta Corriente");
        tipoComboBox.setValue("Elige el Tipo de Cuenta");
        GridPane.setConstraints(tipoComboBox, 1, 3);


        Button crearCuentaButton = new Button("Crear Cuenta");
        GridPane.setConstraints(crearCuentaButton, 1, 4);


        Label resultadoLabel = new Label();
        GridPane.setConstraints(resultadoLabel, 1, 5);


        grid.getChildren().addAll(nombreLabel, nombreInput, apellidosLabel, apellidosInput, numeroLabel, numeroInput, tipoLabel, tipoComboBox, crearCuentaButton, resultadoLabel);
                

        Button depositarButton = new Button("Depositar");
        GridPane.setConstraints(depositarButton, 0, 6);


        Button retirarButton = new Button("Retirar");
        GridPane.setConstraints(retirarButton, 1, 6);


        TextField cantidadInput = new TextField();
        cantidadInput.setPromptText("Cantidad");
        GridPane.setConstraints(cantidadInput, 0, 7);


        Label saldoActualLabel = new Label("Saldo Actual: $0.00"); // Saldo inicial
        GridPane.setConstraints(saldoActualLabel, 1, 7);


        grid.getChildren().addAll(depositarButton, retirarButton, cantidadInput, saldoActualLabel);


        /*
         * Acciones del botón crear cuenta.
         */
        crearCuentaButton.setOnAction(e -> {
            String nombre = nombreInput.getText();
            String apellidos = apellidosInput.getText();
            String numero = numeroInput.getText();
            String tipo = tipoComboBox.getValue();

            if (tipo.equals("Cuenta de Ahorros")) {
                cuenta = new CuentaAhorros(nombre, apellidos, numero, 0);
            } else {
                cuenta = new CuentaCorriente(nombre, apellidos, numero, 0);
            }

            saldoActualLabel.setText("Saldo Actual: $0.00"); // Actualizar el saldo
            resultadoLabel.setText("Cuenta creada exitosamente");

            
        /*
         * Imprimir mensaje en la consola
         */
         System.out.println("CUENTA AGREGADA: " + cuenta);
        });


        /*
         * Acciones del botón depositar.
         */
        depositarButton.setOnAction(event -> {
            double cantidad = Double.parseDouble(cantidadInput.getText());
            if (cantidad < 0) {
                resultadoLabel.setText("ERROR: La cantidad a depositar no puede ser negativa");
                return;
            }
            cuenta.depositar((int) cantidad);
            saldoActualLabel.setText("Saldo Actual: " + cuenta.consultarSaldo());
            resultadoLabel.setText("Depósito realizado correctamente");
        });


        /*
         * Acciones del botón retirar.
         */
        retirarButton.setOnAction(event -> {
            double cantidad = Double.parseDouble(cantidadInput.getText());
            if (cantidad < 0) {
                resultadoLabel.setText("ERROR: La cantidad a retirar no puede ser negativa");
                return;
            }
            if (cantidad > cuenta.getSaldo()) {
                resultadoLabel.setText("ERROR: La cantidad a retirar es mayor que el saldo disponible");
                return;
            }
            cuenta.retirar((int) cantidad);
            saldoActualLabel.setText("Saldo Actual: " + cuenta.consultarSaldo());
            resultadoLabel.setText("Retiro realizado correctamente");
        });


        Scene scene = new Scene(grid, 580, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
