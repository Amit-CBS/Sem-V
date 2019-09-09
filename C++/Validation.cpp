#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Input a number: ";
    cin>>n;
    if(!cin)
        cout<<"Wrong input\n";
    else
        cout<<"Result: "<<(n+n*n+n*n*n)<<"\n";
}