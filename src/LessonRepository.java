import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class LessonRepository {
    private final List<Lesson> lessons;

    public LessonRepository() {
        lessons = new ArrayList<>();
        // Заполняем репозиторий примерами занятий
        lessons.add(new Lesson("Понедельник", "Развитие речи", "Алексеев А.А.", "10:00", "1 Группа"));
        lessons.add(new Lesson("Вторник", "Актерское мастерство", "Панфилов П.Е.", "11:00", "2 Группа"));
        lessons.add(new Lesson("Среда", "История театра", "Котова К.М.", "12:00", "2 Группа"));
        lessons.add(new Lesson("Вторник", "Техника речи ", "Алексеев А.А.", "13:00", "3 Группа"));
        lessons.add(new Lesson("Четверг", "Танец", "Самаркин В.Л.", "13:00","3 Группа"));
        lessons.add(new Lesson("Пятница", "Живопись", "Одинцова А.П.", "14:00","5 Группа"));
        lessons.add(new Lesson("Пятница", "Композиция", "Одинцова А.П.", "12:00","5 Группа"));
        lessons.add(new Lesson("Суббота", "Отдых", "", "",""));
        lessons.add(new Lesson("Воскресенье", "Отдых", "", "",""));
    }

    public List<Lesson> findByDay(String day) {
        List<Lesson> result = new ArrayList<>();
        for (Lesson lesson : lessons) {
            if (lesson.getDay().equalsIgnoreCase(day)) {
                result.add(lesson);
            }
        }
        return result;
    }
}
