package OpenClosed.problem.example2;

public class Movie {

    private VideoTypeEnum type;

    public void calculateInteress() {
        if (type == VideoTypeEnum.MOVIE) {
            // calculates the interess based on the Movie
        }
        else if (type == VideoTypeEnum.TVSHOW) {
            // calculates the interess based on the Tv Show
        }

        // Everytime that surges a new VideoType, we need to add a new if
    }




}
