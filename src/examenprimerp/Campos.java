package examenprimerp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Campos extends GridPane {

    public TextField tfNom, tfApe, tfMat, tfSexo, tfEdad, tfPeso;
    public Button regis;
    public String nom, ape, mat, sexo, edad, peso;

    public Campos() {
        
        this.add(new Label("Nombre"), 0, 0, 3, 1);
        tfNom = new TextField();
        nom = tfNom.getText();
        System.out.print("sdbasdhsashadhsavdvsavdhsahvdvsahdvsdvsa" + nom);
        this.add(tfNom, 0, 1, 1, 1);
        
        this.add(new Label("Apellido"), 1, 0, 3, 1);
        tfApe = new TextField();
        ape = tfApe.getText();
        this.add(tfApe, 1, 1, 1, 1);
        
        this.add(new Label("Matricula"), 2, 0, 3, 1);
        tfMat = new TextField();
        mat = tfMat.getText();
        this.add(tfMat, 2, 1, 1, 1);
        
        this.add(new Label("Sexo"), 0, 2, 3, 1);
        tfSexo = new TextField();
        sexo = tfSexo.getText();
        
        this.add(tfSexo, 0, 3, 1, 1);
        
        this.add(new Label("Edad"), 1, 2, 3, 1);
        tfEdad = new TextField();
        edad = tfEdad.getText();
        this.add(tfEdad, 1, 3, 1, 1);
        
        this.add(new Label("Peso"), 2, 2, 3, 1);
        tfPeso = new TextField();
        peso = tfPeso.getText();
        this.add(tfPeso, 2, 3, 1, 1);
        
        regis = new Button("Aceptar");
        regis.setOnAction(e -> {
            Logica.Agregar(tfNom.getText(), tfApe.getText(), tfMat.getText(), tfSexo.getText(), tfEdad.getText(), tfPeso.getText());
        });
        this.add(regis,3, 3);
    }
}
