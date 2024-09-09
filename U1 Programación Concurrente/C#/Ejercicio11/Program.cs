using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio11
{
    class Program
    {
        static void Main(string[] args)
        {

            Paella p = new Paella();

            // Preparar caldo
            Cocinero cocinero = new Cocinero();
            Caldo c = cocinero.PrepararCaldo();

            // Calentar paella y sofreir ingredientes
            cocinero.CalentarPaella(p);
            cocinero.SofreirIngredientes(p, new List<string>(){ "tomate", "pollo", "judías planas", "garrafó", "arroz"});

            // Echar el caldo
            cocinero.EcharCaldo(p, c);

            //Cocinar
            cocinero.Cocinar(p);

            Console.WriteLine("Paella lista: " + p);
            Console.ReadKey();

        }
    }
}
