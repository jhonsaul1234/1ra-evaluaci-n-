import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application {

    private TextField pantalla;

    @Override
    public void start(Stage primaryStage) {
        pantalla = new TextField();
        pantalla.setEditable(false);

        GridPane grid = new GridPane();

        // Añadir botones numéricos
        for (int i = 0; i < 10; i++) {
            Button boton = new Button(String.valueOf(i));
            boton.setOnAction(e -> pantalla.setText(pantalla.getText() + boton.getText()));
            grid.add(boton, i % 3, i / 3);
        }

        Scene scene = new Scene(grid, 300, 400);
        primaryStage.setTitle("Calculadora JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}