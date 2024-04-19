package pl.coderslab.entity;

public class TestUpdate {
    public static void main(String[] args) {

        UserDao userDao= new UserDao();
        User uptadeUser = userDao.read(2);
        uptadeUser.setUserName("Robert");
        uptadeUser.setEmail("Robert.Siwek@wp.pl");
        uptadeUser.setPassword("PasswordWord");
        userDao.update(uptadeUser);


    }

}
