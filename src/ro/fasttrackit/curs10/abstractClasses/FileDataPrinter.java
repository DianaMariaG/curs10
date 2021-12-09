package ro.fasttrackit.curs10.abstractClasses;

public class FileDataPrinter extends DataPrinter{
    @Override
    public String[] getDateFromSource() {
        System.out.println("reading from file");
        return new String[]{
                "line1",
                "line2",
                "line3"
        };
    }
}
