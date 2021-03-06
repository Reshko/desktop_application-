package sample.connectToDb;

public class TovarList {
    private int idTovar;
    private String nameTovar;
    private int widthTovar;
    private int longTovar;
    private int numberTovar;
    private int priceTovar;

    public TovarList(int idTovar ,String nameTovar, int widthTovar, int longTovar, int numberTovar,int priceTovar) {
        this.idTovar = idTovar;
        this.nameTovar = nameTovar;
        this.widthTovar = widthTovar;
        this.longTovar = longTovar;
        this.numberTovar = numberTovar;
        this.priceTovar = priceTovar;
    }

    public TovarList() {}

    public int getPriceTovar() {
        return priceTovar;
    }

    public void setPriceTovar(int priceTovar) {
        this.priceTovar = priceTovar;
    }

    public int getIdTovar() {
        return idTovar;
    }

    public void setIdTovar(int idTovar) {
        this.idTovar = idTovar;
    }

    public String getNameTovar() {
        return nameTovar;
    }

    public void setNameTovar(String nameTovar) {
        this.nameTovar = nameTovar;
    }

    public int getWidthTovar() {
        return widthTovar;
    }

    public void setWidthTovar(int widthTovar) {
        this.widthTovar = widthTovar;
    }

    public int getLongTovar() {
        return longTovar;
    }

    public void setLongTovar(int longTovar) {
        this.longTovar = longTovar;
    }

    public int getNumberTovar() {
        return numberTovar;
    }

    public void setNumberTovar(int numberTovar) {
        this.numberTovar = numberTovar;
    }
}
