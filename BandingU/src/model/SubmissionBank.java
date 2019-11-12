package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xande
 */
public class SubmissionBank implements Serializable {

    private final ArrayList<Submission> subBank;

    public SubmissionBank() {
        subBank = new ArrayList<>();
    }

    public ArrayList<Submission> getSubBank() {
        return subBank;
    }

    public void addSub(Submission sub) {
        this.subBank.add(sub);
    }

    public String[] getNomes() {
        String[] aux = new String[this.subBank.size()];
        for (int i = 0; i < this.subBank.size() ; i++) {
            aux[i] = subBank.get(i).owner.getEmail();
        }
        return aux;
    }
    
}
