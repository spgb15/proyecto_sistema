
package modelo;


public class usuario {
    private String usuario;
    private String contrasenia;
    private int id;

    public usuario(){
        this("","", 0);
    }
    
    public usuario(String usuario, String contrasenia, int id) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "usuario{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + ", id=" + id + '}';
    }

    
    
}
