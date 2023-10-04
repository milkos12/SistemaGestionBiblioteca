public class Users {
    private String name;
    private String lastname;
    private String nameUser;
    private String password;

    public void Users(String name, String lastname, String nameUser, String password) {

    }

    public void setName(String name) {
        if(name != "") {
            this.name = name;
        } else {
            System.out.println("Se requiere un nombre");
        }
    }

    public String getName () {
        return  this.name;
    }


    public void setLastname(String lastname) {
        if(lastname != "") {
            this.lastname = lastname;
        } else {
            System.out.println("Se requiere un apellído");
        }
    }

    public String getLastname () {
        return  this.lastname;
    }


    public void setNameUser (String nameUser) {
        if(nameUser != "") {
            this.nameUser = nameUser;
        } else {
            System.out.println("Se requiere un nombre de usuario");
        }
    }

    public String getNameUser () {
        return  this.nameUser;
    }


    public void setPassword (String password) {
        if(nameUser != "") {
            this.password = password;
        } else {
            System.out.println("Se requiere una contraseña");
        }
    }

    public boolean getPassword (String password) {
        boolean isCorrect = false;

        if(password == this.password) {
            isCorrect = true;
        }

        return isCorrect;
    }



}