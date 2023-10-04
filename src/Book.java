public class Book{
        private String title;
        private String autor;
        private int id;
        private boolean status;

    public Book(String title, String autor, int id, boolean status) {
        this.title = title;
        this.autor = autor;
        this.id = id;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {

        return status;
    }


    public void setTitle(String title) {
        if(title != "") {
            this.title = title;
        } else {
            System.out.println("Se requiere un titulo");
        }

    }

    public void setAutor(String autor) {
        if(autor != "") {
            this.autor = autor;
        } else {
            System.out.println("Se requiere un autor");
        }

    }

    public void setId(int id) {
        if(id != 0) {
            this.id = id;
        } else {
            System.out.println("Se requiere un ID");
        }
    }

    public void setStatus(boolean status) {

        if (status == true && this.status == true) {
            System.out.println("El libro ya esta prestado");
        }

        if (status == false) {
            System.out.println("Gracias por devolver el Libro ;)");
            this.status = status;
        }

        if (status == true && this.status == false) {
            System.out.println("Que disfrutes el libro");
            this.status = status;
        }


    }
}