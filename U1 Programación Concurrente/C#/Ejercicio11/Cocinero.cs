using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio11
{
    class Cocinero
    {

        public Caldo PrepararCaldo()
        {
            Console.WriteLine("Preparando caldo...");
            Task.Delay(5000).Wait();
            Caldo c = new Caldo();
            Console.WriteLine("Caldo preparado.");
            return c;
        }

        public void CalentarPaella(Paella p)
        {
            Console.WriteLine("Caletando aceite en la paella...");
            Task.Delay(2000).Wait();
            p.Caliente = true;
            Console.WriteLine("Aceite caliente.");
        }

        public void SofreirIngredientes(Paella p, List<string> i)
        {
            if (p.AñadirIngredientes(i))
            {
                Console.WriteLine("Sofriendo ingredientes...");
                Task.Delay(3000).Wait();
                Console.WriteLine("Ingredientes sofritos.");
            }
        }

        public void EcharCaldo(Paella p, Caldo c)
        {
            Console.WriteLine("Echando caldo a la paella...");
            p.AñadirCaldo(c);
            Task.Delay(1000).Wait();
            Console.WriteLine("Caldo echado a la paella.");
        }

        public void Cocinar(Paella p)
        {
            Console.WriteLine("Cocinando paella...");
            Task.Delay(5000).Wait();
            p.Cocinar();
            Console.WriteLine("Paella terminada.");
        }

    }
}
