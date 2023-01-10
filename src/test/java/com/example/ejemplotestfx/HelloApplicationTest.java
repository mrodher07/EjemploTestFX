package com.example.ejemplotestfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.TextInputControlMatchers;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ApplicationExtension.class)
class HelloApplicationTest {

    Pane mainroot;
    Stage mainStage;

    @Start
    public void start(Stage stage) throws IOException {
        mainroot = (Pane) FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        mainStage = stage;
        stage.setScene(new Scene(mainroot));
        stage.show();
        stage.toFront();
    }

    @Test
    public void validarEscribirEnCampoTexto(FxRobot robot){
        robot.clickOn("#tfEjemplo");
        robot.write("Esto es un texto de prueba");
        FxAssert.verifyThat("#tfEjemplo", TextInputControlMatchers.hasText("Esto es un texto de prueba"));
    }
}
