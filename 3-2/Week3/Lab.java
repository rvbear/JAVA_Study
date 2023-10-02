package Week3.Q3;

class Lab {
    int id;
    String title;

    public Lab(int _id, String _title) {
        id = _id; title = _title;
    }
    public void print() {
        System.out.println(id + "\t\t\t" + title);
    }
}