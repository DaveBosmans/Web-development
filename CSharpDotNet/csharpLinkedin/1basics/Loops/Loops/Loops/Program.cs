using System;

namespace Loops
{
    class Program
    {
        static void Main(string[] args)
        {
            var code = "";
            while (code != "secret") {
                Console.WriteLine("What is your passcode?");
                code = Console.ReadLine();

                if (code != "secret")
                {
                    Console.WriteLine("Wrong Passcode");
                }
            }
            Console.WriteLine("You are Authenticated");
        }
    }
}
