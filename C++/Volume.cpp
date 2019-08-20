#include<iostream>
using namespace std;
float vol(int,int);
float vol(float);
int vol(double);
    
int main()
{
    int r,h; double a;
    float r1;
    cout<<"Enter radius and height of a cylinder: ";
    cin>>r>>h;
    cout<<"Enter side of cube: ";
    cin>>a;
    cout<<"Enter radius of sphere: ";
    cin>>r1;
    cout<<"Volume of cylinder is "<<vol(r,h);
    cout<<"\nVolume of cube is "<<vol(a);
    cout<<"\nVolume of sphere is "<<vol(r1)<<endl;
}
float vol(int r,int h)
{
    return(3.14*r*r*h);
}
float vol(float r1)
{
    return(4/3.0*3.14*r1*r1*r1);
}
int vol(double a)
{
    return(a*a*a);
}