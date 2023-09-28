package problem1;

public class TestFlowerBouquet {

	public static void main(String[] args) {
		//first order
		Rose firstOrder = new Rose();
		firstOrder.addPaperWrap(1);
		firstOrder.addCard(1);
		firstOrder.returnOrder();

		//second order
		Rose secondOrder = new Rose();
		secondOrder.addPaperWrap(2);
		secondOrder.addGlitter(1);
		secondOrder.returnOrder();

		//third order
		Daisy thirdOrder = new Daisy();
		thirdOrder.returnOrder();

	}

}
