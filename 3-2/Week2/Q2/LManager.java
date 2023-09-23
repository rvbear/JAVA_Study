package Week2.Q2;

public class LManager {
    Lab[] lList = new Lab[50];
    int index = 0;

    public void init() {
        lList[index++] = new Lab(1, "객체지향연구소");
        lList[index++] = new Lab(2, "Cpp연구소");
        lList[index++] = new Lab(3, "웹연구소");
        lList[index++] = new Lab(4, "Java연구소");
    }
    public void printAll() {
        for(Lab l : lList) {
            if(l != null) {
                l.print();
            }
        }
    }
    public void printOne(int id) {
        lList[id-1].print();
    }
}