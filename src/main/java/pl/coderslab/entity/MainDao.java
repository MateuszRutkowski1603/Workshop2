package pl.coderslab.entity;

public class MainDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Bartek");
        user.setEmail("Bartek.Kozioł@o2.pl");
        user.setPassword("Kozioł");
        userDao.create(user);
    }
}






