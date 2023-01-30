package com.company;
import java.util.*;

public class Onlineexamination {
    public static void main(String[] args) {
        int ch=4;
        int choice;
        String name;
        int id=0;
        Scanner in=new Scanner(System.in);

        System.out.print("Enter your username :");
        name=in.next();
        System.out.print("Enter your Roll number :");
        id=in.nextInt();
        int count=0;
        System.out.println("\t\t!! Welcome "+name+" to Online Examination !!");

        do
        {


            System.out.println("1.Take Examination ");
            System.out.println("2.Show Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            ch=in.nextInt();
            if(ch==4)
            {
                System.out.println("Thank you for giving examination");
                break;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Select Programming Language:");
                    System.out.println("1.C  \n2.Java  \n3.C++ ");
                    System.out.println("Enter your choice:");
                    int lan=in.nextInt();
                    System.out.println("There are 5 questions in the examination");


                    System.out.println("Each question consist of 4 option you have to choose correct answer");
                    if(lan==2)
                    {
                        count=0;
                        System.out.println("** Q1) When is the finalize() method called? :");
                        System.out.println("1.Before Garbage Collection \n2.Before an object goes out of scope \n3.Before a variable goes out of scope\n4.None ");
                        System.out.print("Enter your answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            count++;
                        }
                        System.out.println("** Q2) Java is a _ programming language :");
                        System.out.println("1.Low Level\n2.High Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter your answer:");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            count++;
                        }
                        System.out.println("** Q3)Java is developed by:");

                        System.out.println("1.Dennis Ritchie \n2.James Gosling\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter your answer :");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            count++;
                        }
                        System.out.println("** Q4)Java is a _ programming language :");
                        System.out.println("1.Platform Independent\n2.Platform Depenedent\n3.None of these\n4.Both 1 and 2");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            count++;
                        }
                        System.out.println("** Q5) Arrays in java are :");
                        System.out.println("1.Object References\n2.objects\n3.Primitive data type\n4.None");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            count++;
                        }

                    }
                    else if(lan==1)
                    {
                        count=0;
                        System.out.println("** Q1) C is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("** Q2) C is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("** Q3) C is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("** Q4) C is:");
                        System.out.println("1.Procedure Oriented\n2.Object Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("** Q5)C is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None of these");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }
                    else
                    {
                        count=0;
                        System.out.println("** Q1)C++ is developed by:");

                        System.out.println("1.Steve Jobs\n2.Dennis Ritchie\n3.Bjarne Strousrup\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("** Q2) C++ is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("**Q3) C++ is:");
                        System.out.println("1.Platform Inependent\n2.Platform Depenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("** Q4) C++ is:");
                        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Both 1 and 2\n4.None");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("**Q5) C++ is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=in.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }


                    break;
                }
                case 2:
                {
                    System.out.println("Congratulations !!  "+name+"  You scored "+count+" marks"+" out of 5");
                }



            }


        }while(true);
    }
}
