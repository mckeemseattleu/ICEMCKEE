package ICE1Pack;

public class Triangle
{
    private double side1;
    private double side2;
    private double side3;

    public void setSide1(double len)
    {
        side1 = len;
    }

    public void setSide2(double len)
    {
        side2 = len;
    }

    public void setSide3(double len)
    {
        side3 = len;
    }

    public String getTriangleType(double side1, double side2, double side3)
    {
        if (side1 == side2 && side2 == side3)
        {
            return "equilateral";
        }
        else if (side1 == side2 && side3 != side2)
        {
            return "isosceles";
        }
        else if ((side1 * side1 + side2 * side2) == side3 * side3)
        {
            return "right";
        }

        return "none of the above";
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        String response = t.getTriangleType(4,4,4);
        System.out.println(response);
    }
}
