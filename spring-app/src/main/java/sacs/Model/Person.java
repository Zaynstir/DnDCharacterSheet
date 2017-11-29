package sacs;

public class Person {
    private final long id;
    private final String name;
    private final boolean isFemale;

    public Person(long id, String name, boolean isFemale) {
        this.id = id;
        this.name = name;
        this.isFemale = isFemale;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public boolean getIsFemale(){
        return isFemale;
    }
}
