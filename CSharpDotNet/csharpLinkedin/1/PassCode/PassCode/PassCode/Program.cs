using System;

namespace PassCode
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("What is you passcode?");
            var passcode = Console.ReadLine();

            if(passcode == "secret")
            {
                Console.WriteLine("You are Authenticated.");
            } else if  (passcode != "secret")
            {
                Console.WriteLine("Wrong password.");
            }
        }
    }
}
