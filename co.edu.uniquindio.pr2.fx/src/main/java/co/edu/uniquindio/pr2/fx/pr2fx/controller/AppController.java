package co.edu.uniquindio.pr2.fx.pr2fx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AppController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFijo;

    @FXML
    private TextField txtNombre;

    @FXML
    void onRegistrarCliente(ActionEvent event) {
            registrarCliente();
    }

    @FXML
    void initialize() {

    }

    private void registrarCliente() {
        validarCampos();





    }

    private void validarCampos() {
        if(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCedula.getText().isEmpty()){
            mostrarMensaje("Notificación cliente","Datos invalidos","Faltan campos por diligenciar", Alert.AlertType.WARNING);
        }
    }

    private void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }
}