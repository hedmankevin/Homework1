package origami;


// public - everything
// protected (default + anything that extends swan)
// default (no word) visible to everything in the same package
// private (self only)

public class Swan {
    // properties
    // swan.DEFAULT.MATERIAL
    public static final String default_material = "paper";
    public static final double default_width = 3.0;
    public static final double default_length = 5.0;

    // public static final Swan default_swan = new Swan(); // danger - swan is mutable - changeable



    //public static double areaOfRectangle(double height, double width) {return height * width; }

    //public static final double areaOfRectangle(default_height, default_width);

    private String material; // private means only accessable from inside the swan class

    public String getMaterial() {
        return material;
    }

    public int getStep() {
        return step;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private int step;
    private double width;
    private double height;

    public static final int STEPS = 7; // one int called STEPS ever, not recreated for every class
    public static final Swan Default_swan = new Swan("paper", 3, 5);

    public Swan()
    {
        this(default_material, default_width, default_length);
    }

    public Swan(String material, double width, double height) {
        material += " unfolded";
        this.material = material;
        this.step = 0; // redundant but helpful
        this.width = width;
        this.height = height;
    }


    void advance()
    {
        if (step < STEPS)
            ++step;
    }

    public String directions()
    {
        switch(step)
        {
            case 0: return "get the paper";
            case 1: return "fold it up";
            case 2: return "fold it more";
            default: return " look it up";
        }
    }

    boolean finished() {return step >= STEPS;}
}
