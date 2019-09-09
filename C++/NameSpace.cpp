#include<iostream>
using namespace std;
namespace myNS
{
    class Test
    {
        private:
            int x=5;
        public:
            Test()
            {
            }
            void setVal()
            {
                cout<<"Enter the value of x\n";
                cin>>x;
            }
            void getVal()
            {
                cout<<"x="<<x<<"\n";
            }
    };
};
using namespace myNS;
int main()
{
    myNS::Test ob;
    ob.setVal();
    ob.getVal();
    return 0;
}