﻿using System;
using System.Collections.Generic;
using System.Text;

namespace SurvedOOP
{
    class Stats
    {
        public void Start()
        {
            Program.Posted += HasPosted;
        }

        void HasPosted()
        {
            Console.WriteLine("Survery posted, run stats");
        }
    }
}
