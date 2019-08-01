#include<iostream>
using namespace std;
main()
{
    int n, p=1;
    cout<<"Enter a number: ";
    cin>>n;
    if(n>=0)
    {
        for(int i=1;i<=n;i++)
            p=p*i;
        cout<<n<<"!="<<p<<"\n";
    }
    else
        cout<<"You should have gone for a whole number\n";
}