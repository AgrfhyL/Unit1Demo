import java.util.ArrayList;

public class Employee {
    private int id;
    private static ArrayList<Integer> idList;

    public Employee() {
        idList = new ArrayList<Integer>();
        boolean repeat = true;
        int rand = 0;
        while (repeat) {
            repeat = false;
            rand = (int) (Math.random() * 1000);
            for (int i = 0; i < idList.size(); i++) {
                if (rand == idList.get(i)) {
                    repeat = true;
                }
            }
        }
        id = rand;
        idList.add(rand);
    }

    public Employee(int val) {
        id = val;
    }

    public int getID() {
        return id;
    }

    public void setID(int val) {
        id = val;
    }
}
