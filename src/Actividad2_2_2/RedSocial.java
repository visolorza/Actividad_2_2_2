package Actividad2_2_2;

/**
 *
 * @author Bichoms
 */
public class RedSocial {
    //Espero que este código esté tan mal hecho que no me dejen volver a programar.
    protected String usuario;
    protected String password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "usuario=" + usuario + ", password=" + password + '}';
    }
      
    public String visualizar() {
        //La teoría recomienda usar getUsuario();
        return this.usuario;
    }
    
}
