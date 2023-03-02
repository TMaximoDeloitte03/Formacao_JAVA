public class Maquina {
    private long contadorCocaCola = 50;
    private long contadorPepsi = 50;
    private long contadorIceTea = 50;
    private long casheNoBau = 0;

    public Maquina(long contadorCocaCola, long contadorPepsi, long contadorIceTea, long casheNoBau) {
        this.contadorCocaCola = contadorCocaCola;
        this.contadorPepsi = contadorPepsi;
        this.contadorIceTea = contadorIceTea;
        this.casheNoBau = casheNoBau;
    }

    public long getContadorCocaCola() {
        return contadorCocaCola;
    }

    public long getContadorPepsi() {
        return contadorPepsi;
    }

    public long getContadorIceTea() {
        return contadorIceTea;
    }

    public long getCasheNoBau() {
        return casheNoBau;
    }

    public void setContadorCocaCola(long contadorCocaCola) {
        this.contadorCocaCola = contadorCocaCola;
    }

    public void setContadorPepsi(long contadorPepsi) {
        this.contadorPepsi = contadorPepsi;
    }

    public void setContadorIceTea(long contadorIceTea) {
        this.contadorIceTea = contadorIceTea;
    }

    public void setCasheNoBau(long casheNoBau) {
        this.casheNoBau = casheNoBau;
    }

    public void menosCocaCola(){
        contadorCocaCola--;
    }

    public void menosPepsi(){
        contadorPepsi--;
    }

    public void menosIceTea(){
        contadorIceTea--;
    }

    public void maisCasheNoBau (long casheInserido){
        this.casheNoBau += casheInserido;
    }
}
