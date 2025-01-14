package Tema3;

import java.util.List;
import java.util.Arrays;

public class Mobilier {
    private String nume;
    private List<Placa> placi;

    public Mobilier() {}

    public Mobilier(String nume, List<Placa> placi) {
        super();
        this.nume = nume;
        this.placi = placi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Placa> getPlaci() {
        return placi;
    }

    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }

    @Override
    public String toString() {
        return "Mobilier {" +
                "\n Numele: "+ nume +
                "\n Placi: " + placi+
                "\n }";
    }
}
