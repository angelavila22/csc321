public class lab6
{
    public static void main(String[] args)
    {
        int x = 5, y = 6;
        double xd = 5.0, yd = 6.0;

        System.out.println("results for (x + y * x / y - x):");
        System.out.println("int result:"+(x+y*x/y-x));
        System.out.println("double result: "+(xd+yd*xd/yd-xd));

        System.out.println("results for (-x - y / x * y + x):");
        System.out.println("int result:"+(-x-y/x*y+x));
        System.out.println("double result: "+(-xd-yd/xd*yd+xd));

        System.out.println("results for (x + y - x / y):");
        System.out.println("int result:"+(x+y-x/y));
        System.out.println("double result: "+(xd+yd-xd/yd));

    }
}
