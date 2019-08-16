#include <bits/stdc++.h>
using namespace std;
int i;
class Student
{
    int admno;
    char sname[20];
    float maths, eng, science, total;
    public:
        void TakeData()
        {
            cout<<"For student "<<i+1<<":\n";
            cout<<"\tEnter name: ";
            cin>>sname;
            cout<<"\tEnter admission number: ";
            cin>>admno;
            cout<<"\tEnter the marks in Maths, English and Science: ";
            cin>>maths>>eng>>science;
            cTotal();
        }
        void ShowData()
        {
            cout<<sname<<" (Admission no. "<<admno<<") "<<"has scored a total of "<<total<<" marks\n";
        }
        float cTotal()
        {
            total=maths+eng+science;
        }
};
int main()
{
    int n;
    cout<<"Enter no. of students: ";
    cin>>n;
    Student student[n];
    for(i=0;i<n;i++)
        student[i].TakeData();
    for(i=0;i<n;i++)
        student[i].ShowData();
}