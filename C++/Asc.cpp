#include<iostream>
#include<bits/stdc++.h>
using namespace std;
main()
{
    int n;
    cout<<"Enter no. of terms: ";
    cin>>n;
    int a[n];
    cout<<"Enter "<<n<<" numbers: ";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"Numbers in ascending order are: ";
    sort(a,a+n);
    for(int i=0;i<n;i++)
        cout<<a[i]<<", ";
    cout<<"\b\b  \n";
}