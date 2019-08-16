#include <bits/stdc++.h>
using namespace std;
double C2F(double C)
{
    return (C*1.8+32);
}
int main()
{
    double C, F;
    cout<<"Enter the temperature in degree Celcius: ";
    cin>>C;
    cout<<"Equivalent temperature in Fahrenheit = "<<C2F(C)<<"\n";
}