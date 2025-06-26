package org.example.jfxtrasdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.scene.control.agenda.Agenda;

import java.time.LocalDateTime;

public class AgendaApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Agenda agenda = new Agenda();

        Agenda.Appointment appointment = new Agenda.AppointmentImplLocal()
                .withStartLocalDateTime(LocalDateTime.now().plusHours(1))
                .withEndLocalDateTime(LocalDateTime.now().plusHours(2))
                .withSummary("Cita con paciente")
                .withDescription("Consulta de revisión");

        agenda.appointments().add(appointment);

        Scene scene = new Scene(agenda, 800, 600);
        primaryStage.setTitle("Agenda de Pacientes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
