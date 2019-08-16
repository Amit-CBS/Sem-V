#include <bits/stdc++.h>
using namespace std;
class Complex
{
    public:
    	float r;
        float i;
        void set(float a,float b)
        {
            r=a;
            i=b;
        }
        void sum(Complex c)
        {
            r+=c.r;
            i+=c.i;
        }
};
int main()
{
    float a, b;
    Complex c1, c2, c;
    c.r=0;
    c.i=0;
    cout<<"For first number:\n\tEnter real part: ";
    cin>>a;
    cout<<"\tEnter imaginary part: ";
    cin>>b;
    c1.set(a,b);

    cout<<"For second number:\n\tEnter real part: ";
    cin>>a;
    cout<<"\tEnter imaginary part: ";
    cin>>b;
    c2.set(a,b);
    c.sum(c2);
    c.sum(c1);
    cout<<"The result is :"<<c.r<<"+"<<c.i<<"i\n";
}