abstract class Student {
    protected String name;
    protected String surname;
    protected int course;
    protected int last_mark;

    // Конструктор
    public Student(String name, String surname, int course, int last_mark) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.last_mark = last_mark;
    }

    // Абстрактный метод
    public abstract void writeExam();

    // Метод для вывода информации о студенте
    public void printInfo() {
        System.out.println("ФИО: " + name + " " + surname  + ", Курс: " + course + ", Оценка за последний экзамен: " + last_mark);
    }
}
