#include<stdio.h>
int main() 
{ 
	int arr[100], i;
    printf("Enter 5 numbers: ");
    for(i=0;i<5;i++)
        scanf("%d", &arr[i]);
    for(i=0;i<5;i++)
        printf("%d", arr[i]);
    return 0;
}