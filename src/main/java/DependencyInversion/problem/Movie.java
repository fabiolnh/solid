package DependencyInversion.problem;

public class Movie {

    private String name;
    private DramaCategory category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // It creates a coupling too strong
    public void setCategory(DramaCategory dramaCategory) {
        this.category = dramaCategory;
    }

    public DramaCategory getCategory() {
        // Instanciating a new Object
        // It creates a coupling too strong
        return new DramaCategory();
    }

}
