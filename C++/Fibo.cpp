#include<iostream>
using namespace std;
main()
{
    int n, c, f=0, s=1, nxt;
    cout<<"Enter no. of terms: ";
    cin>>n;
    cout<<"First "<<n<<" terms of Fibonacci Series are: ";
    for(int i=1;i<=n;i++)
    {
        if(i<=2)
            nxt=i-1;
        else
        {
            nxt=f+s;
            f=s;
            s=nxt;
        }
        cout<<nxt<<", ";
    }
    cout<<"\b\b  \n";
}