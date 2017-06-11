#include<stdio.h>
#include<conio.h> 
void main() 
{
   int *p1, *p2;
   int sum;
 
   printf("\nENTER TWO NUMBERS:");
   scanf("%d %d", p1, p2);
   sum = *p1 + *p2;
   printf("Sum = %d", sum);
   getch();
}
