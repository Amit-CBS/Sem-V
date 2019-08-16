#include <bits/stdc++.h>
using namespace std;
class Circle
{
    public:
        string color;
        double radius;
        void getRadius()
        {
            cout<<"Enter radius: ";
            cin>>radius;
        }
        void getColor()
        {
            cout<<"Enter color: ";
            cin>>color;
        }
        double getArea()
        {
            return 3.14*radius*radius;
        }
};
int main()
{
    Circle c1,c2,c3;
    c1.getRadius();
    c1.getColor();
    c2.getRadius();
    c2.getColor();
    c3.getRadius();
    c3.getColor();
    cout<<"\nCircle with radius "<<c1.radius<<" is "<<c1.color<<" and has area = "<<c1.getArea();
    cout<<"\nCircle with radius "<<c2.radius<<" is "<<c2.color<<" and has area = "<<c2.getArea();
    cout<<"\nCircle with radius "<<c3.radius<<" is "<<c3.color<<" and has area = "<<c3.getArea();
}