package pl.coderslab.entity;

public class DeleteTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.delete(2);
    }
}

