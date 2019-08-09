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
    cout<<"Enter no. of employees:";
    cin>>n;
    Employee ob[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter employee's name: ";
        cin>>ob[i].name;
        cout<<"Enter stock: ";
        cin>>ob[i].stock;
    }
    for(int i=0;i<n;i++)
        for(int j=i+1;j<n;j++)
            if(ob[i].stock>ob[j].stock)
            {
                float tempS=ob[i].stock;
				ob[i].stock=ob[j].stock;
				ob[j].stock=tempS;
                // string tempN=ob[i].name[20];
                char tempN[20]={ob[i].name[20]};
                ob[i].name[20]=ob[j].name[20];
                ob[j].name[20]=tempN[20];
            }
    cout<<ob[n-1].name<<" has the highest stock."<<endl;
}