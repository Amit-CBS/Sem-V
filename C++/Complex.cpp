#include <bits/stdc++.h>
using namespace std;
class Complex
{
    public:
    	int real;
        int imaginary;
        void getdata()
        {
            cout<<"Enter the real of the Complex \n";
            cin>>real;
            cout<<"Enter the imaginary of the Complex \n";
            cin>>imaginary;
        }
        void sum(Complex number)
        {
            real+=number.real;
            imaginary+=number.imaginary;
        }
};
int main()
{
    Complex c1,c2;
    c1.getdata();
    c2.getdata();
    c1.sum(c2);
    cout<<"The result is :"<<c1.real<<" 	"<<c1.imaginary<<endl;
}