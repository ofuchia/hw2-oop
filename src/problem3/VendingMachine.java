package problem3;


import static problem3.State.*;


public class VendingMachine{
    //instance vairables
    private int numberOfBars;
    private State currentState;

    //constructor
    public VendingMachine(int numberOfBars) {
        this.numberOfBars = numberOfBars;
        this.currentState = NOCOINSTATE;

    }

    //state transitions

    public void insertCoin(){
        if(currentState.equals(NOCOINSTATE)){   //if we started at default and inserted a coin, we are now at ContainsOneCoin
            this.currentState = CONTAINSONECOINSTATE;
        }
        if (currentState.equals(CONTAINSONECOINSTATE)){
            this.currentState.equals(CONTAINSTWOCOINSSTATE);
        }
    }

//remember, can only buy ONE chocolate bar with TWO coins.
    public void pressButton(int numberOfBars){
        if(currentState.equals(CONTAINSTWOCOINSSTATE)){
            if(this.numberOfBars == 0){ //would this even be hanlded herer? or somwhere else?
                this.currentState = NOCHOCOBARSTATE;
            }
                    this.numberOfBars = numberOfBars--;
            this.currentState = NOCOINSTATE;
        }
    }

    public void refill(){
        if(currentState.equals(NOCHOCOBARSTATE)){
            this.currentState = State.NOCOINSTATE;

        }
    }
}
