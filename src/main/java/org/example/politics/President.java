package org.example.politics;

public class President extends Governor{
    public String country;
    public int stateCount;
    public President(String name, String state, Party party, int lgaCount, int age, String country, int stateCount) {
        super(name, state, party, lgaCount, age);
        this.country = country;
        this.stateCount = stateCount;
    }
}
