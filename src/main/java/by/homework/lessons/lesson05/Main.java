package by.homework.lessons.lesson05;

/**
 * @author ppuchinsky
 */
public class Main {

    public static void main(String[] args) {
        SecurityDepartment securityDepartment = new SecurityDepartment("FBI");

        User maksim = new User("Maksim", 35);
        User pavel = new User("Pavel", 35);
        User sergey = new User("Sergey", 36);

        securityDepartment.addToAccessList(maksim);
        securityDepartment.addToAccessList(pavel);
        securityDepartment.addToAccessList(sergey);

        System.out.println(securityDepartment.findFromAccessList(maksim).toString());
        System.out.println(securityDepartment.findFromAccessList(pavel).toString());
        System.out.println(securityDepartment.findFromAccessList(sergey).toString());

        User sergey2 = new User("Sergey", 36, "Sergey info");
        securityDepartment.updateBio(sergey2);

        System.out.println(securityDepartment.findFromAccessList(maksim).toString());
        System.out.println(securityDepartment.findFromAccessList(pavel).toString());
        System.out.println(securityDepartment.findFromAccessList(sergey).toString());

        User anton = new User("Anton", 34);

        check(securityDepartment, anton);

        check(securityDepartment, maksim);
        check(securityDepartment, pavel);

        securityDepartment.removeFromAccessList(pavel);

        check(securityDepartment, pavel);


        User sergey3 = new User("Sergey", 36, "some nw bio");
        securityDepartment.updateBio(sergey3);

        System.out.println(securityDepartment.findFromAccessList(sergey).toString());
    }

    private static void check(SecurityDepartment securityDepartment, User user) {
        if (securityDepartment.checkAccess(user)) {
            System.out.println("Секретный файл для " + user.getName());
        } else {
            System.out.println("No access " + user.getName());
        }
    }
}
