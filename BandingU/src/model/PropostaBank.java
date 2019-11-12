package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xande
 */
public class PropostaBank implements Serializable {

    private final ArrayList<Proposta> bank;

    public PropostaBank() {
        this.bank = new ArrayList<>();
    }

    public ArrayList<Proposta> getBank() {
        return bank;
    }

    public void addProposta(Proposta purp) {
        bank.add(purp);
    }

    public String[] getNomes(User me) {
        ArrayList<String> aux = new ArrayList<>();
        for (int i = 0; i < this.bank.size(); i++) {
            if (this.bank.get(i).getClient().getEmail().equals(me.getEmail())) {
                aux.add(this.bank.get(i).getPrestador().getNome());
            }
        }
        String[] aux2 = new String[aux.size()];
        return aux.toArray(aux2);
    }

    public HashMap<Integer, Integer> getMyBank(User me) {
        HashMap<Integer, Integer> aux = new HashMap<>();
        int j=0;
        for (int i = 0; i < this.bank.size(); i++) {
            if (this.bank.get(i).getClient().getEmail().equals(me.getEmail())) {
                aux.put(j, i);
                j++;
            }
        }
        return aux;
    }

}
