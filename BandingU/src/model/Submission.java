package model;

public class Submission implements java.io.Serializable{
    
    protected String subText;
    protected User owner;
    
    public Submission(String text, User owner){
    this.subText = text;
    this.owner = owner;
    }
    
    public Submission(){}

    public String getSubText() {
        return subText;
    }

    public User getOwner() {
        return owner;
    }
    
    
}
