class Shapes
{
    int area(int side)
    {
        return side*side;
    }
    int area(int l,int b)
    {
        return l*b;
    }
    int area(int base,int height,int radius)
    {
        return (base*height)/2;
    }
}
class Formula
{
    public static void main(String[] args)
    {
        Shapes obj = new Shapes();
        int square = obj.area(Integer.parseInt(args[0]));
        int triangle = obj.area(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int rectangle = obj.area(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        System.out.println("Area of square: "+square);
        System.out.println("Area of triangle: "+triangle);
        System.out.println("Area of rectangle: "+rectangle);
    }
}
