package OOP;

public class accessMod {
    public static void main(String[] agrs){
        Banker bk = new Banker();
        bk.username="Ravet Branch";
        System.out.println(bk.username);

        bk.setUser("Akurdi Branch");
        bk.getUser();

        bk.changePass("abc");
        bk.getPass();
    }
}

class Banker {
    public String username;
    private String password;

    public void setUser(String username){
        this.username = username;
    }

    public void getUser(){
        System.out.println(username);
    }

    public void changePass(String pass){
        this.password = pass;
    }

    public void getPass(){
        System.out.println(password);
    }
}
