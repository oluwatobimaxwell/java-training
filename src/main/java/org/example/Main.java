package org.example;

import org.example.politics.Governor;
import org.example.politics.Party;
import org.example.politics.President;

public class Main {
    public static void main(String[] args) {
        Governor sanwoOlu = new Governor("Sanwo Olu", "Lagos", Party.APC, 20, 55);
        President tinubu = new President("Tinubu", "Abuja", Party.SDP, 30, 68, "Nigeria", 36);
    }
}