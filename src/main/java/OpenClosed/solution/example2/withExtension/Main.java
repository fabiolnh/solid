package OpenClosed.solution.example2.withExtension;

import OpenClosed.solution.example2.withExtension.common.BaseVideo;

public class Main {

    public static void main(String[] args) {
        BaseVideo movie = new Movie();
        movie.calculateInteress();

        BaseVideo tvShow = new TVShow();
        tvShow.calculateInteress();
    }
}
