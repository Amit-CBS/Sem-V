#include<iostream>
using namespace std;
class Employee
{
    public:
        char name[20];
        float stock;
};
main()
{
    int n;
    Employee ob[n];
    cout<<"Enter no. of employees:";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cout<<"Enter employee's name: ";
        cin>>ob[i].name;
        cout<<"Enter stock: ";
        cin>>ob[i].stock;
    }
    for(int i=0;i<n;i++)
    {
        cout<<ob[i].name<<endl;
    }
}