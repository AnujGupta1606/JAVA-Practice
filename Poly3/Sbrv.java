package Poly3;

import Poly3.Sport.*;

public class Sbrv {
    public static void main(String[] args) {
        Sport sports = new Sport();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
