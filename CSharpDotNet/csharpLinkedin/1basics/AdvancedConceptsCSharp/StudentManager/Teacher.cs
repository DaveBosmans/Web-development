using System;
using System.Collections.Generic;
using System.Text;

namespace StudentManager
{
    class Teacher : Member, IPayee
    {
        public void Pay()
        {
            Console.WriteLine("Paying Teacher");
        }
    }
}
