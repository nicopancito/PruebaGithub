#include <stdio.h>

int main(){
   int numero;
   printf("Ingrese tu edad: ");
   scanf("%d", &numero);
    return 0;

    if(numero < 17){
        printf("Eres menor de edad");
    }
    else{
        printf("Eres mayor de edad");
    }
}