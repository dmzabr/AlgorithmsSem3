import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getName().compareTo(o2.getName());

        if(res == 0){
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        return res;
    }
}
