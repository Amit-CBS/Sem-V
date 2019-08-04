#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    printf("Enter array size: ");
	int t, i, j;
	scanf("%d", &t);
    int *arr;
    arr=(int *)calloc(t, sizeof(int));
	printf("Enter %d numbers: ", t);
	for(i=0;i<t;i++)
		scanf("%d", &arr[i]);
	for (i=0;i<t;i++) 
	{
		for (j=i+1;j<t;j++) 
		{
			if (arr[i]>arr[j]) 
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
    printf("Max=%d\nMin=%d\n", arr[t-1], arr[0]);
}