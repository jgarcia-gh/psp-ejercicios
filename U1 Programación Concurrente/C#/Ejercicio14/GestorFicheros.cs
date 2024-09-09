using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio14
{
    class GestorFicheros
    {

        public void LeerArchivo(string rutaFichero)
        {
                try
                {
                    // Obtenemos el tamaño del fichero en bytes
                    FileInfo infoFichero = new FileInfo(rutaFichero);
                    long tamañoFichero = infoFichero.Length;
                    long leidosTotales = 0;

                    // Abrir el archivo utilizando FileStream
                    using (FileStream fileStream = new FileStream(rutaFichero, FileMode.Open, FileAccess.Read))
                    {
                        // Crear un buffer para leer bloques de bytes
                        byte[] buffer = new byte[8192]; // 8 KB buffer
                        int bytesLeidos;

                        // Leer el archivo en bloques de 1024 bytes
                        while ((bytesLeidos = fileStream.Read(buffer, 0, buffer.Length)) > 0)
                        {
                            // Aquí puedes procesar los bytes leídos, por ejemplo, convertir a texto y mostrar por pantalla
                            string chunk = System.Text.Encoding.UTF8.GetString(buffer, 0, bytesLeidos);
                            Console.WriteLine(chunk);

                            leidosTotales += bytesLeidos;
                            float porcentaje = ((leidosTotales / (float)tamañoFichero) * 100);
                            Console.WriteLine(porcentaje);
                        }
                    }
                }
                catch (FileNotFoundException ex)
                {
                    Console.WriteLine("El archivo no fue encontrado: " + ex.Message);
                }
                catch (IOException ex)
                {
                    Console.WriteLine("Ocurrió un error al leer el archivo: " + ex.Message);
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Ocurrió un error inesperado: " + ex.Message);
                }

        }
    }
}
