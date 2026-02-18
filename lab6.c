#include <stdio.h>

int main()
{
    int x = 5, y = 6;
    double xd = 5.0, yd = 6.0;

    printf("results of (x+y*x/y-x):\n");
    printf("int result: %d\n", x+y*x/y-x);
    printf("double result: %f\n", xd+yd*xd/yd-xd);

    printf("results of (-x-y/x*y+x):\n");
    printf("int result: %d\n", -x-y/x*y+x);
    printf("double result: %f\n", -xd-yd/xd*yd+xd);

    printf("results of (x+y-x/y(;\n");
    printf("int result: %d\n", x+y-x/y);
    printf("double result: %f\n", xd-yd-xd/yd);

    return 0;
}
