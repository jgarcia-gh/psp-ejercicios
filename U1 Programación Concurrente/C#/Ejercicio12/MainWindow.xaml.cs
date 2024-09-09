using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Ejercicio12
{
    public partial class MainWindow : Window
    {
        private bool ejecutando;
        public MainWindow()
        {
            InitializeComponent();
            ejecutando = true;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            CambiarColorFondo();
        }

        public void CambiarColorFondo()
        {
            while (ejecutando)
            {
                label.Background = Brushes.Red;
                Task.Delay(2000).Wait();
                label.Background = Brushes.Gray;
                Task.Delay(2000).Wait();
            }
        }


        private void Window_Closing(object sender, System.ComponentModel.CancelEventArgs e)
        {
            // Este método se ejecuta cuando cerramos la ventana
            ejecutando = false;
        }
    }
}
