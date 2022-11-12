package ohrman.max;

public abstract class Team {
    private final String name;
    private int wins;
    private int losses;
    private int draw;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
