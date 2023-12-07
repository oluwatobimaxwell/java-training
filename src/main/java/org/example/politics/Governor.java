package org.example.politics;

public class Governor {
    public String name;
    public String state;
    public Party party;
    public int lgaCount;
    public int age;

    public Governor(String name, String state, Party party, int lgaCount, int age){
        this.name = name;
        this.state = state;
        this.party = party;
        this.lgaCount = lgaCount;
        this.age = age;
    }

    public boolean hasTenureEnded(){
        // TODO: Implement this method later
        return false;
    }
}