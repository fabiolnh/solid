package OpenClosed.problem;

public class Video {

    private String type;

    public void calcularInteresse() {
        if (type == "Filme") {
            // calcular interesse baseado no filme
        }
        else if (type == "Série"){
            // Calcular interesse baseado em série
        }
        // else if .........

        // WARNING: This class should be closed for modification and opened for extension
    }


}