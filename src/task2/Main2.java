package task2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Богдан", "Хмельницкий ", 25);
        Employee emp2 = new Employee(1, "Иван", "Ступка ", 19);
        Employee emp3 = new Employee(1, "Григорий", "Сковорода ", 20);
        Employee emp4 = new Employee(1, "Петр", "Мницкий ", 47);
        Employee emp5 = new Employee(1, "Стефан", "Вишневецкий", 31);
        Employee emp6 = new Employee(1, "Иван", "Ермак ", 36);
        Employee emp7 = new Employee(1, "Лев", "Сапега ", 52);
        Employee emp8 = new Employee(1, "Черный", "Радзивил ", 43);

        Map<Employee, String> empStr = new HashMap<>();
        empStr.put(emp1, "Сантехник");
        empStr.put(emp2, "Директор");
        empStr.put(emp3, "Зам директора");
        empStr.put(emp4, "Учитель");
        empStr.put(emp5, "Агроном");
        empStr.put(emp6, "Офицер");
        empStr.put(emp7, "Водитель");
        empStr.put(emp8, "Кассир");

        Map<String, Collection<Employee>> qualifications = new HashMap<>();
        for (Map.Entry<Employee, String> entry : empStr.entrySet()) {
            String qualification = entry.getValue();
            Employee employee = entry.getKey();
            if (qualifications.containsKey(qualification)) {
                qualifications.get(qualification).add(employee);
            } else {
                List<Employee> employeeList = new ArrayList<>();
                employeeList.add(employee);
                qualifications.put(qualification, employeeList);
            }
        }
        for (Map.Entry< String,Collection<Employee>> entry : qualifications.entrySet()) {
            Collection<Employee> employeeCollection= entry.getValue();
            for (Employee employee: employeeCollection){
                System.out.println("Квалификация: "+entry.getKey()+" Сотрудник: "+employee.getSurname());
            }
        }

    }
}
