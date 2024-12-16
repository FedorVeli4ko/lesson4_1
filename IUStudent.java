class IUStudent extends Student {
    // Конструктор
    public IUStudent(String name, String surname, int course, int last_mark) {
        super(name, surname, course, last_mark);
    }

    @Override
    public void writeExam() {
        String exam = " (IU Student) пишет экзамен по направлению 'Информационные технологии'.";
        String message = name + " " + surname + exam;
        System.out.println(message);
    }
}
