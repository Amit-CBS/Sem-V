#include<iostream>
using namespace std;
class Box
{
    private: int length, width;
    public:
        Box()
        {
            length=0;
            width=0;
        }
        Box(int l, int w)
        {
            length=l;
            width=w;
        }
        void print_values()
        {
            cout<<"Length ="<<length<<"\tWidth="<<width<<"\n";
        }
        void operator++()
        {
            length++;
            width++;
        }
        void operator--()
        {
            length--;
            width--;
        }
        void operator=(Box temp)
        {
            this->length=temp.length;
            this->width=temp.width;
        }
        void operator==(Box temp)
        {
            if((this->length==temp.length) && (this->width==temp.width))
                cout<<"Successful validation\n";
            else
                cout<<"UnSuccessful validation\n";
        }
        friend istream & operator>>(istream &is, Box &ob)
        {
            is>>ob.length>>ob.width;
        }
        friend ostream & operator<<(ostream &os, Box &ob)
        {
            os<<ob.length<<" "<<ob.width;
        }
};
main()
{
    Box IronBox(2,4);
    IronBox.print_values();
    ++IronBox;
    IronBox.print_values();
    --IronBox;
    IronBox.print_values();
    
    Box NewIronBox=IronBox;
    NewIronBox.print_values();
    NewIronBox=IronBox;
    Box SilverBox;
    cin>>SilverBox;
    cout<<SilverBox;
}