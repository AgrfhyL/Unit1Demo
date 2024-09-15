import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee guy = new Employee();
            list.add(guy);
        }
        list = sortList(list);
        for (Employee guy: list) {
            System.out.println(guy.getID());
        }

    }

    public static ArrayList<Employee> sortList(ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                Employee empMin = list.get(min);
                Employee empCur = list.get(j);
                if (empCur.getID() < empMin.getID()) {
                    min = j;
                }
            }
            Employee temp = new Employee(list.get(min).getID());
            list.set(min, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}
