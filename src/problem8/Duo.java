package problem8;

public class Duo {
    //make these generic fields?
    private E first;
    private E second;

    public Duo() {
    }

    public Duo(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    //a method to get the minium and maximum of an array of elements.
    //input: an array (arr) of elements (we dont know what type)
    //output: a Duo object with the min and max value or null if arr is nullempty
    public <E> Duo minmax(E [] arr){
        if(arr == null){
            return null;
        }
        for(int i =0; i<arr.length; i++){
            Duo retDuo = new Duo();  //new Duo object to return
            //input the min as first and max as second, i guess.

        }

    }
}
