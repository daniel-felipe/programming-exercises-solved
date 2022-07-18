#include <stdio.h>

int factorial(int number);

int main() {
    printf("%d\n", factorial(4));

    return 0;
}

int factorial(int number) {
    return (number == 0) 
        ? 1 
        : number * factorial(number - 1);
}
