public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> list= new LinkedList<Employee>();

        list.addFirst(new Employee("User1", 6));
        list.addFirst(new Employee("User2", 7));
        list.addFirst(new Employee("User3", 8));
        list.addFirst(new Employee("User4", 9));
        list.addFirst(new Employee("User5", 10));
        list.addFirst(new Employee("User6", 11));
/*
        Employee employee1 = new Employee("aaa", 2);
        Employee employee2 = new Employee("aaa", 3);

        System.out.println(employee1.equals(employee2));

        Employee res = list.contains(new Employee("User5", 10));

        System.out.println(res);

        System.out.println(list);

        //list.sort((new EmployeeComparator()));
*/
        list.reverse();
        System.out.println("\n");
        System.out.println(list);

        list.reverse();
        System.out.println(list);




    }
}