package JAVA;

public class x013timFromMarketing {
    public String print(Integer id, String name, String department) {
        if (department == null) {
            department = "owner";
        }
        if (id == null) {
            return name+" - "+department.toUpperCase();
        }
        return "["+id+"] - "+name+" - "+department.toUpperCase();
    }
}

/*
In this exercise you'll be writing code to print name badges for factory employees:

1. Employees have an ID, name and department name. Employee badge labels are formatted as follows: "[id] - name - DEPARTMENT". Implement the Badge.print() method to return an employee's badge label.

2. Due to a quirk in the computer system, new employees occasionally don't yet have an ID when they start working at the factory. As badges are required, they will receive a temporary badge without the ID prefix. Modify the Badge.print() method to support new employees that don't yet have an ID.

3. Even the factory's owner has to wear a badge at all times. However, an owner does not have a department. In this case, the label should print "OWNER" instead of the department name. Modify the Badge.print() method to print a label for the owner.
Note that it is possible for the owner to also be a new employee.
 */