using System;

namespace SurvedOOP
{
    class Program
    {

        static public event Action Posted;
        static void Main(string[] args)
        {

            var stats = new Stats();
            stats.Start();
            var newSurvey = new Data();
            newSurvey.Name = Util.Console.Ask("What is your name?");
            newSurvey.Age = int.Parse(Util.Console.Ask("What is your age?"));
            newSurvey.Month = Util.Console.Ask("What month were you born in?");

            if (Posted != null)
            Posted();

            newSurvey.Display();

            if (newSurvey.Month == "march")
            {
                Console.WriteLine("You are an Aries.");
            }
            else if (newSurvey.Month == "april")
            {
                Console.WriteLine("You are a Taurus.");
            }
            else if (newSurvey.Month == "may")
            {
                Console.WriteLine("You are a Gemini");
            }
        }


        class Data {
            public string Name;
            public int Age;
            public string Month;

            public void Display()
            {
                Console.WriteLine("Your name is: {0}", Name);
                Console.WriteLine("Your age is: {0}", Age);
                Console.WriteLine("You are born in: {0}", Month);
            }

        }
    }
}
