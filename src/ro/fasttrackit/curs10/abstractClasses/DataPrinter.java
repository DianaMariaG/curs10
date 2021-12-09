package ro.fasttrackit.curs10.abstractClasses;

public abstract class DataPrinter {
    public void printDate() {
        String[] data = getDateFromSource();

        for(String line : data) {
            System.out.println("-----" + line);
        }
    }

    public abstract String[] getDateFromSource(); //nu are body, nu poate fi private, poate fi protected

}
