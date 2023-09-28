package problem1;
import java.util.ArrayList;
import java.util.List;


public abstract class FlowerBouquet {
    String description;
    double cost;

    Decorations paperWrap = new Decorations("Paper wrap", 5.0);
    Decorations card = new Decorations("Card", 6.0);
    Decorations balloon = new Decorations("Balloon", 7.0);
    Decorations glitter = new Decorations("Glitter", 8.0);

    List<Decorations> flowerOrder = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }


    //math happens here.
    //manipulating the accmulator (cost)


    //creating methods to do that!

    public void addPaperWrap(int quantity){
        //updating the cost of the order according to how many wraps were ordered
        this.cost += (paperWrap.getCostDeco() * quantity);
        for(int i = 0; i < quantity; i++){
            flowerOrder.add(paperWrap);
        }

    }
    public void addCard(int quantity){
        //updating the cost of the order according to how many cards were ordered
        this.cost += (card.getCostDeco() * quantity);
        for(int i = 0; i < quantity; i++){
            flowerOrder.add(card);
        }
    }
    public void addBalloon(int quantity){
        //updating the cost of the order according to how many balloons were ordered
        this.cost += (balloon.getCostDeco() * quantity);
        for(int i = 0; i < quantity; i++){
            flowerOrder.add(balloon);
        }
    }
    public void addGlitter(int quantity){
        //updating the cost of the order according to how many wraps were ordered
        this.cost += (glitter.getCostDeco() * quantity);
        for(int i = 0; i < quantity; i++){
            flowerOrder.add(glitter);
        }
    }



    //returning the entire order
    public void returnOrder(){
        String finalOrder = new String();

        finalOrder += this.getDescription() + " ";

        for (Decorations deco : flowerOrder){       //declaring an iterator. This is an advanced traversal. Read only.
            finalOrder += deco.getNameDeco();
            finalOrder += " ... ";

        }
        finalOrder += "$"+this.getCost();

        System.out.println(finalOrder);
        System.out.println("-----------------------------------");

    }


}
