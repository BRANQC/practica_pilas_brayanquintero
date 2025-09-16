import java.util.Date;

public class Pagina {
    private String url = "";
    private String titulo = "";
    private Date fechaAcceso = new Date();

    public Pagina() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaAcceso() {
        return fechaAcceso;
    }

    public void setFechaAcceso(Date fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }

    public void setFechaAcceso() {
        this.fechaAcceso = new Date();
    }

    @Override
    public String toString() {
        return getTitulo() + " / " + getUrl() + " / " + getFechaAcceso();
    }
}