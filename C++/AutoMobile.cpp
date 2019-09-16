#include<iostream>
#include<string>
using namespace std;
class AutoMobile
{
    public:
        int yearModel, speed;
        string make;
        AutoMobile()
        {
            yearModel=0;
            speed=0;
            make="";
        }
        AutoMobile(int yearModel0, string make0, int speed0)
        {
            yearModel=yearModel0;
            make=make0;
            speed=speed0;
        }
        void get_details()
        {
            cout<<"\n"<<yearModel<<" = year model\n";
            cout<<make<<" = make\n";
            cout<<speed<<" = speed\n";
        }
        void accelerate()
        {
            speed+=15;
        }
        void brake()
        {
            speed-=15;
        }
};
main()
{
    int yearModel, speed;
    string make;
    cout<<"Enter year model: ";
    cin>>yearModel;
    cout<<"Enter speed: ";
    cin>>speed;
    cout<<"Enter make: ";
    cin>>make;
    AutoMobile ob1;
    ob1.get_details();
    AutoMobile ob = AutoMobile(yearModel, make, speed);
    ob.accelerate();
    ob.get_details();
    ob.accelerate();
    ob.get_details();
    ob.accelerate();
    ob.get_details();
    ob.brake();
    ob.get_details();
    ob.brake();
    ob.get_details();
    ob.brake();
    ob.get_details();
}