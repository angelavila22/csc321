//Angel Avila
//CSC-321
//Lab 4a

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{

    int x = 5;
    float a = 5.55;
    char b = 'A';
    double y =21.21;

    printf("Variable x = %d \n", x);
    printf("Variable a = %f \n", a);
    printf("Variable b = %c \n", b);
    printf("Variable y = %lf \n", y);


    if (a > 3)
    {
        int scope = 100;
        printf("inside: %d\n", scope);
    }

        //printf("Outside: ", scope);

    int yeah[10] = {0,1,2,3,4,5,6,7,8,9};
    int i;

    for (i = 0; i < 10; i++)
    {
        printf("yeah[%d] = %d \n", i, yeah[i]);
        printf("yeah[%d] address = %p \n", i, &yeah[i]);
    }

    return EXIT_SUCCESS;
}
