#include <bits/stdc++.h>
using namespace std;
class Circle
{
    public:
    	Circle()
        {
            getdata();
        }
        string color;
        int radius;
        getdata()
        {
            cout<<"Enter the color of the circle \n";
            cin>>color;
            cout<<"Enter the radius \n";
            cin>>radius;
        }
};
int main()
{
    Circle c1,c2,c3;
    cout<<((c1.radius>c2.radius && c1.radius>c3.radius)?c1.color:((c2.radius>c1.radius && c2.radius>c3.radius)?c2.color:c3.color))<<endl;
}