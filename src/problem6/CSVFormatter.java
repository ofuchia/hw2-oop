package problem6;

public class CSVFormatter implements Formatter {
    @Override
    public String formatText(String s) {
        return s.replace(".", ",");
    }
}
