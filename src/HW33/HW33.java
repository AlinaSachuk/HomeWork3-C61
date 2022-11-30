package HW33;

public class HW33 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Willy", 45);
        User userClone = user1.clone();
        System.out.println(user1.equals(userClone));
        System.out.println(user1.hashCode());
        System.out.println(userClone.hashCode());
        userClone.setUserName("Bobby");
        userClone.setUserAge(33);
        System.out.println(user1.equals(userClone));
        System.out.println(userClone.hashCode());
        System.out.println(user1.toString());
        System.out.println(userClone.toString());
    }
}
