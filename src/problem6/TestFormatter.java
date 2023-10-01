package problem6;


public class TestFormatter{

	public static void main(String[] args) {

		Formatter formatter = new NewLineFormatter();

		System.out.println(formatter.formatText("Bing.is.a.good.man."));

		// now switch to the vender's comma formatter
		Formatter formatter1 =  new CSVFormatter();

		// end of your code
		System.out.println(formatter1.formatText("Bing.is.a.good.man.")); // this line should print comma separated text

	}

}
