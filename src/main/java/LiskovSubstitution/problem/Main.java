package LiskovSubstitution.problem;

import LiskovSubstitution.problem.common.BaseMovie;

public class Main {

    public static void main(String[] args) {

        // OK!
        TheLionKing theLionKing = new TheLionKing();
        // OK!
        BaseMovie theLionKingBaseMovie = new TheLionKing();
        // OK
        CharlieChaplin charlieChaplin = new CharlieChaplin();
        // NOT OK! The Charlie Chaplin movie is silent!! and the super class has the "increaseVolume" method
        BaseMovie movie = new CharlieChaplin();
    }
}
