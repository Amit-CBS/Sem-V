import java.io.*;
class student
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        float stud[][]=new float[10][6],temp;
        System.out.println("Enter 5 subject marks for each student");
        int i,j,max=0, studno=10;
        for(i=0;i<studno;i++)
        {
            System.out.println(i+"th Student");
            for(j=0;j<5;j++)
               stud[i][j]=Float.parseFloat(br.readLine());
        }
            
        //Average &max calcualtion
        for(i=0;i<studno;i++)
        {
            temp=0;
            for(j=0;j<5;j++)
                temp+=stud[i][j];
            temp=temp/5;
            stud[i][j]=temp;
            if(temp>stud[max][5])
                max=i;
        }

        //Deatil show
        System.out.println("Best Student Marks and Average");
        for(i=0;i<6;i++)
            System.out.print(stud[max][i]+"  ");
    }
}