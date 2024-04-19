package pl.coderslab.entity;

public class ReadTest {
    public static void main(String[] args) {
        UserDao userDao= new UserDao();
        User read= userDao.read(2);
        System.out.println(read);
    }

}
