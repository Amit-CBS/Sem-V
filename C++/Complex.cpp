#include <bits/stdc++.h>
using namespace std;
class Complex
{
    public:
    	float r=0;
        float i=0;
        void set(float a,float b)
        {
            r=a;
            i=b;
        }
        Complex sum(Complex c)
        {
            Complex SUM;
            SUM.r=r+c.r;
            SUM.i=i+c.i;
            return SUM;
        }
};
int main()
{
    float a, b;
    Complex c1, c2, c;
    // c.r=0;
    // c.i=0;

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

    c=c1.sum(c2);
    cout<<"The result is :"<<c.r<<"+"<<c.i<<"i\n";
}