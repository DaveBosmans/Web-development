using System;

namespace Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            var studentGrades = new int[] { 3, 5, 3, 8, 9, 10, 8, 6, 5, 7, 1};

            foreach (var studentGrade in studentGrades)
            {
                Console.WriteLine(studentGrade);
            }
         
        }
    }
}
