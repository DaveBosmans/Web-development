using System;
using System.Collections.Generic;

namespace StudentManager
{

    enum School
    {
        TechGrounds = 0,
        DaveSchool = 1,
        Harvard = 2
    }

    class Program
    {
        static List<Student> students = new List<Student>();
        static void Main(string[] args)
        {

            Payroll payroll = new Payroll();
            payroll.PayAll();

            var adding = true;

            while (adding)
            {
                try
                {
                    var newStudent = new Student();
                    newStudent.Name = Util.Console.Ask("Student Name: ");

                    newStudent.Grade = Util.Console.AskInt("Student Grade: ");

                    newStudent.School = (School) Util.Console.AskInt("School name: (type the corresponding number): \n 0: TechGrounds \n 1: DaveSchool \n 2: Harvard) \n");

                    newStudent.Birthday = Util.Console.Ask("Student Birthday: ");

                    newStudent.Address = Util.Console.Ask("Student Adress: ");

                    newStudent.Phone = Util.Console.AskInt("Student Phonenumber: ");

                    students.Add(newStudent);
                    Student.Count++;
                    Console.WriteLine("Student Count: {0}", Student.Count);

                    Console.WriteLine("Add another? y/n");

                    if (Console.ReadLine() != "y")
                        adding = false;
                    
                }
                catch (FormatException msg)
                {
                    Console.WriteLine(msg.Message);
                }
                catch (Exception)
                {

                    Console.WriteLine("Error adding student, Please try again");
                }
               

                foreach (var student in students)
                {
                    Console.WriteLine("Name: {0}, Grade: {1}", student.Name, student.Grade);
                }
            }
            Exports();
                
                


        }

        static void Import()
        {
            var importedStudent = new Student("Dave", 10, "birthday", "address", 123456);
            Console.WriteLine(importedStudent.Name);
        }

        static void Exports()
        {
            foreach (var student in students)
            {
                switch (student.School)
                {
                    case School.TechGrounds:
                        Console.WriteLine("Exporting to TechGrounds");
                        break;
                    case School.DaveSchool:
                        Console.WriteLine("Exporting to DaveSchool");
                        break;
                    case School.Harvard:
                        Console.WriteLine("Exoirting to Harvard");
                        break;
                }
            }
        }
    }
}


class Member
{
    public string Name;
    public string Address;
    protected int phone;

    public int Phone
    {
        set { phone = value; }
    }
}
class Student : Member
{

    static public int Count;
    public int Grade;
    public string Birthday;
    public StudentManager.School School;

    public Student()
    {

    }
    public Student(string name, int grade, string birthday, string address, int phone)
    {
        Name = name;
        Grade = grade;
        Birthday = birthday;
        Address = address;
        Phone = phone;
    }
}