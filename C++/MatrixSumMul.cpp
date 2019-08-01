#include<iostream>
using namespace std;
main()
{
    int m1, n1, m2, n2;
    cout<<"For First matrix:\n";
    cout<<"\tEnter no. of rows of matrix: ";
    cin>>m1;
    cout<<"\tEnter no. of columns of matrix: ";
    cin>>n1;

    int x1[m1][n1];
    cout<<"\tEnter matrix elements: ";
    for(int i=0;i<m1;i++)   
        for(int j=0;j<n1;j++)
            cin>>x1[i][j];

    cout<<"For Second matrix:\n";
    cout<<"\tEnter no. of rows of matrix: ";
    cin>>m2;
    cout<<"\tEnter no. of columns of matrix: ";
    cin>>n2;

    int x2[m2][n2];
    cout<<"\tEnter matrix elements: ";
    for(int i=0;i<m2;i++)   
        for(int j=0;j<n2;j++)
            cin>>x2[i][j];

    cout<<"\nFirst Matrix is:\n";
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n1;j++)
            cout<<x1[i][j]<<" ";
        cout<<"\n";
    }
    cout<<"\nSecond Matrix is:\n";
    for(int i=0;i<m2;i++)
    {
        for(int j=0;j<n2;j++)
            cout<<x2[i][j]<<" ";
        cout<<"\n";
    }
    if(m1==m2 && n1==n2)
    {
        int sum[m1][n1];
        for(int i=0;i<m1;i++)
            for(int j=0;j<n2;j++)
                sum[i][j]=x1[i][j]+x2[i][j];

        cout<<"\nSummation of the two Matrices is:\n";
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
                cout<<sum[i][j]<<" ";
            cout<<"\n";
        }
    }
    else
        cout<<"\nSummation of the two matrices is not possible.\n";
    if(n1==m2)
    {
        int pro[m1][n2];
        for(int i=0;i<m1;i++)
            for(int j=0;j<n2;j++)
            {
                pro[i][j]=0;
                for(int k=0; k<n1; k++)
                    pro[i][j]+=x1[i][k]*x2[k][j];
            }
        cout<<"\nProduct of the two Matrices is:\n";
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
                cout<<pro[i][j]<<" ";
            cout<<"\n";
        }
    }
    else
        cout<<"\nMultiplication of the two matrices is not possible.\n";
}