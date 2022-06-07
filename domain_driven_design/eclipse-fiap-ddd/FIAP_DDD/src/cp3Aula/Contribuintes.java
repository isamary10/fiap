package cp3Aula;

import java.util.ArrayList;

public class Contribuintes {
    ArrayList<Contribuinte> listaContrib = new ArrayList<Contribuinte>();

    public Contribuintes() {

    }

    public void adicionarContribuinte(Contribuinte c) {
        listaContrib.add(c);
    }

    public void apresentarContribuinte() {
        for (int i = 0; i < listaContrib.size(); i++) {
            System.out.println(listaContrib.get(i).toString() + "\n");
        }
    }
}