package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.es", 3);
        histogram.increment("ull.es", 7);
        histogram.increment("hotmail.com", 9);
        histogram.increment("gmail.com", 20);
        new HistogramDisplay(histogram).execute();
    }
}
