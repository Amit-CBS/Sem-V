#include <bits/stdc++.h>
using namespace std;
class Student
{
    int admno;
    char sname[20];
    float maths, eng, science, total;
    public:
        void TakeData()
        {
            cout<<"Enter the name of the student \n";
            cin>>sname;
            cout<<"Enter the marks in maths,english and science: \n";
            cin>>maths>>eng>>science;
        }
        void ShowData()
        {
            cout<<"The total marks is: "<<total<<endl;
        }
        float ctotal()
        {
            total=maths+eng+science;
        }
};
int main()
{
    Student student1,student2;
    student1.TakeData();
    student1.ctotal();
    student1.ShowData();
    student2.TakeData();
    student2.ctotal();void
    student2.ShowData();
}