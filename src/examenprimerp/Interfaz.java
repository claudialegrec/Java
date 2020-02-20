package examenprimerp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.List;


public class Interfaz extends Application {

  

    public static void main(String[] args) {
        launch(args);
    }
    
   private static TableView<Alumnos> tb = new TableView<>();
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setWidth(700);
        stage.setHeight(700);
        
        Campos campos = new Campos();

        final Label label = new Label("Registro de Alumnos");
        label.setFont(new Font("Arial", 20));

        tb.setEditable(false);

        TableColumn <Alumnos, String> nombre = new TableColumn("Nombre");
        TableColumn <Alumnos, String> apellido = new TableColumn("Apellido");
        TableColumn <Alumnos, String> matricula = new TableColumn("Matrícula");
        TableColumn <Alumnos, String> sexo = new TableColumn("Sexo");
        TableColumn <Alumnos, String> edad = new TableColumn("Edad");
        TableColumn <Alumnos, String> peso = new TableColumn("Peso");
        
        tb.getColumns().addAll(nombre, apellido, matricula, sexo, edad, peso);
        
        nombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        apellido.setCellValueFactory(new PropertyValueFactory<>("ape"));
        matricula.setCellValueFactory(new PropertyValueFactory<>("mat"));
        sexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        edad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        peso.setCellValueFactory(new PropertyValueFactory<>("peso"));
        
        nombre.setSortType(TableColumn.SortType.DESCENDING);
        
        VBox vb = new VBox();
        vb.setSpacing(5);
        vb.setPadding(new Insets(10, 0, 0, 10));
        
        vb.getChildren().addAll(label, campos, tb);
        
        ((Group) scene.getRoot()).getChildren().addAll(vb);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void Crear(){
        List<Alumnos> = ;
        ObservableList<Alumnos> list = FXCollections.observableArrayList();
        
        for (Alumnos clonar : Logica.lista) {
            list.add(clonar);
            System.err.println("1");
        }
        
        tb.setItems(list);
        tb.refresh();
    }

}
