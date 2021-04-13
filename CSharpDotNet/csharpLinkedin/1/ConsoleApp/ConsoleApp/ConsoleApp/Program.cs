using System;

namespace ConsoleApp
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Press a Key and Enter");
            var anything = Console.ReadLine();
            Console.WriteLine(anything);

            Console.WriteLine("What is your name?");
            var name = Console.ReadLine();
            Console.WriteLine("How old are you?");
            var age = Console.ReadLine();
            Console.WriteLine("What month were you born in?");  
            var month = Console.ReadLine();

            Console.WriteLine("Your name is: {0}", name);
            Console.WriteLine("Your age is: {0}", age);
            Console.WriteLine("Your birth month is: {0}", month);

            if(month == "march")
            {
                Console.WriteLine("You are an Aries.");
            }

            else if (month == "april")
            {
                Console.WriteLine("You are a Taurus.");
            }

            else if (month == "may")
            {
                Console.WriteLine("You are a Gemini.");
            }

        }
    }
}
