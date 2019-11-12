package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Users implements Serializable {

    private ArrayList<User> Bank;

    public Users() {
        this.Bank = new ArrayList<>();
    }

    public void insert(User user) {
        Bank.add(user);
    }

    public User[] getArray() {
        return ((User[]) this.Bank.toArray());
    }

    public User getByName(String name) {
        User[] list = new User[1];
        list = this.Bank.toArray(list);
        for (User user : list) {
            if (user.getNome().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public User login(String nome, String senha) {
        Iterator<User> it = this.Bank.iterator();
        while (it.hasNext()) {
            User candidate = it.next();
            if (candidate.getNome().equals(nome) && candidate.getPassword().equals(senha)) {
                return candidate;
            }
        }
        return null;
    }

    public String[] getNames() {
        String[] aux = new String[this.Bank.size()];
        for (int i = 0; i < this.Bank.size(); i++) {
            aux[i] = this.Bank.get(i).getEmail();
        }
        return aux;
    }

    public int nextID() {
        return this.Bank.size();
    }

    public ArrayList<User> getBank() {
        return Bank;
    }
    
    
}
