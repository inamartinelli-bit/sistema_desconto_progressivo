import javax.swing.JOptionPane;//Biblioteca JOptionPane importada
public class SistemaDescontoProgressivo { //Início do programa

    public static void main(String[] args) {//Início da programação
        //Declaração das variáveis
        double vlrtotal, reduz5, reduz10, reduz15;//Variáveis de entrada
   
         //Entrada de dados 
         JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Descontos Progressivos");
         //Entrada de dados com conversão de tipos juntas
         //Conversão do tipo de variável para saída de dados do tipo Double
         vlrtotal= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da sua compra (utilize ponto no lugar da vírgula) R$"));
         reduz5= vlrtotal-vlrtotal*5.0/100.0;
         reduz10= vlrtotal-vlrtotal*10.0/100.0;
         reduz15= vlrtotal-vlrtotal*15.0/100.0;
         
         
         //Processamento e saída
         if (vlrtotal<200.00) { //if o total da compra for menor do que R$ 200,00
                //Comandos se a condição for verdadeira
                JOptionPane.showMessageDialog(null, "Você receberá um desconto de 5% sobre o valor total da sua compra.");
                JOptionPane.showMessageDialog(null, "O valor total da sua compra após o desconto de 5% é de R$" +reduz5);
            } 
         
         else { //Comandos se a condição for falsa
             if (vlrtotal>=200.00 && vlrtotal<300.00) { //if o total da compra for maior ou igual a R$ 200,00 e menor que R$ 300,00
                    //Comandos se a condição for verdadeira
                    JOptionPane.showMessageDialog(null, "Você receberá um desconto de 10% sobre o valor total da sua compra.");
                    JOptionPane.showMessageDialog(null, "O valor total da sua compra após o desconto de 10% é de R$" +reduz10);
            } 
             
             else { //Comamdos se a condição for falsa
                 if (vlrtotal>=300.00) { //if o total da compra for maior ou igual a R$ 300,00
                     //Comandos se a condição for verdadeira
                    JOptionPane.showMessageDialog(null, "Você receberá um desconto de 15% sobre o valor total da sua compra.");
                    JOptionPane.showMessageDialog(null, "O valor total da sua compra após o desconto de 15% é de R$" +reduz15);
            } 
                 
                 else { //Comando se a condição for falsa
                     JOptionPane.showMessageDialog(null, "Valor inválido");
                     
                    }//Fim do if vlrtotal > = R$ 300,00
                 
                } //Fim do if R$ 200,00 = < vlrtotal < R$ 300,00
             
            } //Fim do if vlrtotal<200.00
         
    } //Fim do main   
    
} //Fim da classe