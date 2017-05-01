using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Kalkuliatorius
{
    public partial class Form1 : Form
    {
        public string  X;
        public string y;
        public string operacija;

        public Form1()
        {
            InitializeComponent();
        }
        
        private void Ekranas_TextChanged(object sender, EventArgs e)
        {
       
        }

        private void Vienas_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text.Length < 8)
            {
                Ekranas.Text = Ekranas.Text + "1";
            }
                   }

        private void du_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "2";
        }

        private void trys_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "3";
        }

        private void keturi_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "4";
        }

        private void penki_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "5";
        }

        private void sesi_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "6";
        }

        private void septyni_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "7";
        }

        private void astuoni_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "8";
        }

        private void devyni_Click(object sender, EventArgs e)
        {
            Ekranas.Text = Ekranas.Text + "9";
        }

        private void nulis_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text == "0")
            {
                return;
            }
            Ekranas.Text = Ekranas.Text + "0";
        }

        private void suma_Click(object sender, EventArgs e)
        {
            X = Ekranas.Text;
            Ekranas.Clear();
            operacija = "+";
        }

        private void skirtumas_Click(object sender, EventArgs e)
        {
            X = Ekranas.Text;
            Ekranas.Clear();
            operacija = "-";
        }
        private void dalyba_Click(object sender, EventArgs e)
        {
            X = Ekranas.Text;
            Ekranas.Clear();
            operacija = "/";
        }

        private void daugyba_Click(object sender, EventArgs e)
        {
            X = Ekranas.Text;
            Ekranas.Clear();
            operacija = "*";
        }

        private void Lygu_Click(object sender, EventArgs e)
        {

            if (Ekranas.Text == "" || X=="")

            {
                return;
            }
            
            float x = Convert.ToSingle(X);
            float y = Convert.ToSingle(Ekranas.Text);
           

            float rezultatas = 0;

            if (operacija == "+")
            {
                rezultatas = x + y;
            }

            else if (operacija == "-")      
            {
                 rezultatas = x - y;
            }

            else if (operacija == "*")
            {
                rezultatas = x * y;
            }

            else if (operacija == "/")
            {
                rezultatas = x - y;
            }

            Ekranas.Text = rezultatas.ToString();

        }

        private void CE_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text == "") { return; }

            Ekranas.Text = Ekranas.Text.Remove(Ekranas.Text.Length - 1);          
        }

        private void PliusMinus_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text == ""){return;}

            float y = Convert.ToSingle(Ekranas.Text);
            Ekranas.Text = (y * -1).ToString();
        }

        private void taskas_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text == "")

            {
                Ekranas.Text = Ekranas.Text + "0";
            }

            if (!Ekranas.Text.Contains("."))
            {
                Ekranas.Text = Ekranas.Text + ".";
            }


        }

        private void C_Click(object sender, EventArgs e)
        {
            Ekranas.Clear();
        }

        private void saknis_Click(object sender, EventArgs e)
        {
            if (Ekranas.Text == "") { return; }
            float y = Convert.ToSingle(Ekranas.Text);

            Ekranas.Text = Math.Sqrt(y).ToString();
        
        }
    }
}



