package DependencyInversion.solution;

import DependencyInversion.solution.common.ICategory;

public class Movie {

    private String name;
    private ICategory category;

    // We have to pass the dependency in the time that we instantiate this object
    public Movie(String name, ICategory category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ICategory dramaCategory) {
        this.category = dramaCategory;
    }

    public ICategory getCategory() {
        return category;
    }

}
