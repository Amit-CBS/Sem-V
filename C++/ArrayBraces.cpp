#include<iostream>
using namespace std;
class Employee
{
    public:
        char name[20];
};
main()
{
    Employee ob[1];
    cout<<"Enter employee's name: ";
    cin>>ob[1].name;
    // char tempN[20];
    // tempN[20]=ob[1].name[20];
    char tempN[20]=ob[1].name[20];
}