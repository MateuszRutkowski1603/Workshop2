package pl.coderslab.entity;

public class TestFindAll {
    public static void main(String[] args) {
        UserDao userDao= new UserDao();
        User secondUser = new User();
        secondUser.setUserName("Adam");
        secondUser.setEmail("Adam.Kowal@op.pl");
        secondUser.setPassword("pass");
        userDao.create(secondUser);
        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }

}
