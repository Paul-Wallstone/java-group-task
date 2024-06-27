package by.homework.lessons.lesson05;

/**
 * @author ppuchinsky
 */
public class SecurityDepartment {
    private String title;
    private int count = 0;
    private final User[] ACCESS_LIST = new User[10];

    public SecurityDepartment(String title) {
        this.title = title;
    }

    public boolean checkAccess(User user) {
        for (User existUser : ACCESS_LIST) {
            if (existUser != null && existUser.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public void addToAccessList(User user) {
        if (count < 10) {
            for (int i = 0; i < ACCESS_LIST.length; i++) {
                if (ACCESS_LIST[i] == null) {
                    ACCESS_LIST[i] = user;
                    count++;
                    break;
                }
            }
        }
    }

    public void removeFromAccessList(User user) {
        for (int i = 0; i < ACCESS_LIST.length; i++) {
            if (ACCESS_LIST[i] != null && ACCESS_LIST[i].equals(user)) {
                ACCESS_LIST[i] = null;
                count++;
            }
        }
    }

    public User findFromAccessList(User user) {
        for (int i = 0; i < ACCESS_LIST.length; i++) {
            if (ACCESS_LIST[i] != null && ACCESS_LIST[i].equals(user)) {
                return ACCESS_LIST[i];
            }
        }
        return null;
    }

    public boolean updateBio(User user) {
        String bio = user.getBio();
        User fromAccessList = findFromAccessList(user);
        if (fromAccessList == null) {
            return false;
        }
        fromAccessList.setBio(bio);
        return true;
    }

}
