package ro.fasttrackit.curs10.classes;

public class Coffee {
    private String beansOrigin;
    private String flavour;

    public Coffee (String beansOrigin, String flavour) {
        this.beansOrigin = beansOrigin;
        this.flavour = flavour;
    }
    public String getBeansOrigin(){
        return this.beansOrigin;
    }
    public String getFlavour(){
        return this.flavour;
    }
}
