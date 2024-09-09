using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio11
{
    class Paella { 
        public bool Caliente { get; set; }
        bool Cocinada { get; set; }
        List<string> Ingredientes { get; set; }

        public bool  AñadirIngredientes(List<string> i)
        {
            bool ok = false;
            if (Caliente)
            {
                Ingredientes = i;
                ok = true;
            }
            else
            {
                Console.WriteLine("Antes de añadir ingredientes debes calentar la paella.");
            }
            return ok;
        }

        public bool AñadirCaldo(Caldo c)
        {
            bool ok = false;
            if (Caliente)
            {
                Ingredientes.Add(""+c);
            }
            else
            {
                Console.WriteLine("Antes de añadir el caldo debes calentar la paella.");
            }
            return ok;
        }

        public bool Cocinar()
        {
            bool ok = false;
            if (Caliente)
            {
                ok = true;
                Cocinada = true;
            }
            else
            {
                Console.WriteLine("Para cocinar debes calentar la paella.");
            }
            return ok;
        }


        public override string ToString()
        {
            return "Paella con " + string.Join(",", Ingredientes);  
        }

    }
}
