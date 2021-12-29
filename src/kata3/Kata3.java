package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gugel.es");
        histogram.increment("gugel.es");
        histogram.increment("gugel.es");
        histogram.increment("coldmail.com");
        histogram.increment("coldmail.com");
        histogram.increment("coldmail.com");
        histogram.increment("web");
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
