public class Zona {

    private String name;
    private double surface;

public Zona (String name, double surface){
    this.name=name;
    this.surface=surface;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getSurface() {
        return surface;
    }
}
