package Week2.Q1;

class Student {
    String name, major, lab_title;
    int id, grade, lab_id;

    public Student(int _id, String _name, String _major, int _grade, int _lab_id, String _lab_title) {
        id = _id; name = _name; major = _major; grade = _grade; lab_id = _lab_id; lab_title = _lab_title;
    }

    public void print() {
        System.out.println(id + "\t" + name + "\t" + major + "\t" + grade + "\t" + lab_id + "\t\t" + lab_title);
    }
}