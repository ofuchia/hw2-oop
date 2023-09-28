package problem3;


import static problem3.State.*;


public class VendingMachine{
    //instance vairables
    private int numberOfBars;
    private State currentState;
    private int coins;

    //constructor
    public VendingMachine(int numberOfBars) {
        this.numberOfBars = numberOfBars;
        this.currentState = NOCOINSTATE;
    }

    //state transitions

    //oopsie syntax error on my part :P
    public void insertCoin(){

        if(this.numberOfBars == 0){
            System.out.println("Sorry, we're out...");
            return;
        }

        if(this.currentState.equals(NOCOINSTATE)) {   //if we started at default and inserted a coin, we are now at ContainsOneCoin
            this.currentState = CONTAINSONECOINSTATE;

                System.out.println("One coin inserted...");

                //need to be outside of this condition

            // why does this show when we are pressingButton?
            //does the numBar check go here? or where it is now?
        }
        //imp to recognize when to do if else!!
        else if (this.currentState.equals(CONTAINSONECOINSTATE)) {//wanting to insert another coin
            this.currentState = CONTAINSTWOCOINSSTATE;
            System.out.println("Two coins inserted...please press Buy button...");
        }

    }

    //remember, can only buy ONE chocolate bar with TWO coins. after each purchase, you get sent to nocoins state
    //so long as machine still has bars
    public void pressButton(){

        if(this.numberOfBars == 0){ //how is this supp 2x if method is only called once?
            System.out.println("Sorry, we are out...");
            this.currentState = NOCHOCOBARSTATE;
            return;
        }

        if(this.currentState.equals(CONTAINSONECOINSTATE)){
            System.out.println("Please insert one more coin...");
            return;
        }

        if(this.currentState.equals(CONTAINSTWOCOINSSTATE)){ //
            System.out.println("Buy button pressed...start dispensing");

           if(this.numberOfBars != 0){ //dispense a bar so long as we have them
                this.numberOfBars--;
                this.currentState = NOCOINSTATE;
            }
        }
//
    }

    public void refill(int numberOfBars){
        if(currentState.equals(NOCHOCOBARSTATE))
            this.numberOfBars = numberOfBars;
            this.currentState = State.NOCOINSTATE;

        }
}
