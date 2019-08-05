#include <bits/stdc++.h>
using namespace std;
int convert(int cel)
{
    cout<<(cel*1.8+32);
    return 0;
}
int main()
{
    double cel;
    double far;
    cout<<"Enter the temperaturein deg C"<<endl;
    cin>>cel;
    convert(cel);
}