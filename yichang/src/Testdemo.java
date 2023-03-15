

class LogIn{
    private String userName ="aoligei";
    private String userPassword ="123456";
    public void LoginInfo(String userName,String userPassword) throws UserNameErrorException, PasswordErrorException {
        if(!this.userName.equals(userName))
            throw new UserNameErrorException();
        if(!this.userPassword.equals(userPassword)){
            throw new PasswordErrorException();
        }
    }

}

public class Testdemo {


    public static void main(String[] args) {

        try {
            LogIn logIn =new LogIn();
            logIn.LoginInfo("aoligei","123456");
        } catch (UserNameErrorException e) {
            e.printStackTrace();
            System.out.println("这是一个用户名异常");
        } catch (PasswordErrorException e) {
            e.printStackTrace();
            System.out.println("这是一个密码日常" +
                    "" +
                    "");
        }

    }
}
