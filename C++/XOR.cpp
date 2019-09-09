#include<iostream>
using namespace std;
class XoR
{
    public:
        bool XOR(int n, int m)
        {
            if(n==m)
                return false;
            else
                return true;
        }
};
int main()
{
    XoR ob;
    int n, m;
    cout<<"Input two numbers: ";
    cin>>n>>m;
    if(!cin)
        cout<<"Wrong input\n";
    else
        cout<<"Result: "<<ob.XOR(n,m)<<"\n";
}