package Week3.Q3;

class Student {
    int id, grade;
    String name, major;
    Lab lab;

    public Student(int _id, String _name, String _major, int _grade, Lab _lab) {
        id = _id; name = _name; major = _major; grade = _grade; lab = _lab;
    }

    public void print() {
        System.out.println(id + "\t\t" + name + "\t" +  major + "\t" +  grade + "\t" +  lab.id + "\t\t" +  lab.title);
    }
}