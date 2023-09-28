package problem1;

public class Decorations {

    String nameDeco;
    double costDeco;

    public Decorations(String nameDeco, double costDeco) {
        this.nameDeco = nameDeco;
        this.costDeco = costDeco;
    }

    public String getNameDeco(){
        return this.nameDeco;
    }

    public double getCostDeco(){
        return this.costDeco;
    }

}
