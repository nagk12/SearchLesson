public class Lesson {
    private final String day;
    private final String subject;
    private final String teacherName;
    private final String time;
    private final String group;

    public Lesson(String day, String subject, String teacherName, String time, String group) {
        this.day = day;
        this.subject = subject;
        this.teacherName = teacherName;
        this.time = time;
        this.group = group;
    }

    public String getDay() {
        return day;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTime() {
        return time;
    }
    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Занятие: " + subject + ", Преподаватель: " + teacherName + ", Время: " + time;
    }
}
