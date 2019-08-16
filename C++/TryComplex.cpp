#include <bits/stdc++.h>
using namespace std;
class TryComplex
{
    public:
    	float r, i;
        void sum(TryComplex c)
        {
            c.r+=r;
            c.i+=i;
        }
};
int main()
{
    float a, b;
    TryComplex c1, c2, c;
    c.r=0;
    c.i=0;

    c1.r=1;
    c1.i=2;

    c2.r=3;
    c2.i=5;

    c1.sum(c);
    c2.sum(c);
    cout<<c.r<<"+"<<c.i<<"i\n";
}