#include <stdio.h>
#include <stdlib.h>
int binarySearch(int arr[], int l, int r, int x)
{
	if (r >= l) {
		int mid=l+(r-l)/2;
		if (arr[mid] == x)
			return mid;
		if (arr[mid] > x)
			return binarySearch(arr, l, mid - 1, x);
		return binarySearch(arr, mid + 1, r, x);
	}
	return -1;
}
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
	// int arr[] = { 2, 3, 4, 10, 40 };
	printf("Arranged array is: ");
	for(i=0;i<t;i++)
		printf("%d ", arr[i]);
	printf("\nEnter number to be searched: ");
	int x;
	scanf("%d", &x);
	// int n = sizeof(arr) / sizeof(arr[0]);
	int result = binarySearch(arr, 0, t - 1, x);
	(result == -1) ? printf("Element is not present in array"): printf("Element is present at index %d\n", result);
	return 0;
} 