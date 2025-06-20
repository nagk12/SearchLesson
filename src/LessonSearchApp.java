import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;


import java.util.List;

public class LessonSearchApp extends Application {

    private final LessonRepository lessonRepository = new LessonRepository();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Поиск занятий");

        Label dayLabel = new Label("Введите день недели:");
        TextField dayInput = new TextField();
        Button searchButton = new Button("Найти занятия");
        Label resultLabel = new Label();


        searchButton.setOnAction(e -> {
            String day = dayInput.getText().trim();
            List<Lesson> lessonsForDay = lessonRepository.findByDay(day);
            if (!lessonsForDay.isEmpty()) {
                StringBuilder result = new StringBuilder("Занятия в " + day + ": \n");
                for (Lesson lesson : lessonsForDay) {
                    result.append(lesson.toString()).append("\n");
                }
                resultLabel.setText(result.toString());
            } else {
                resultLabel.setText("Занятий нет для " + day);
            }
        });

        VBox vbox = new VBox(10, dayLabel, dayInput, searchButton, resultLabel);
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
