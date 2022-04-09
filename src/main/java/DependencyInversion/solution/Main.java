package DependencyInversion.solution;

public class Main {
    public static void main(String[] args) {
        Movie movieDrama = new Movie("test", new DramaCategory());
        Movie movieComedy = new Movie("test", new ComedyCategory());
    }
}
