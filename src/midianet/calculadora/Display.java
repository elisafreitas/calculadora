package midianet.calculadora;

import midianet.util.RoundedBorder;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Display extends JFrame {

    private String valorA = "0";
    private String valorB = "";
    private String operacao;
    private JLabel lbTotal;
    private Calculadora calculadora = new Calculadora();

    public Display(){
        super("Calculadora");
        constuirTela2();
    }

    private void constuirTela2(){
        int x = 15;
        int y = 80;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(265,350);
        setResizable(false);
        setLayout(null);

        lbTotal = new JLabel("0", SwingConstants.RIGHT);
        lbTotal.setSize(230,40);
        lbTotal.setLocation(15,20);
        lbTotal.setBorder(new LineBorder(Color.black));
        Border border = lbTotal.getBorder();
        Border margin = new EmptyBorder(5,5,5,5);
        lbTotal.setBorder(new CompoundBorder(border, margin));

        lbTotal.setBackground(Color.green);
        lbTotal.setOpaque(true);
        lbTotal.setFont(new Font("Verdana", Font.BOLD,20));
        getContentPane().add(lbTotal);

        getContentPane().add(criaBotaoNumero(x, y, "1"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "2"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "3"));
        x += 60;
        getContentPane().add(criaBotaoOperacao(x, y, "÷"));
        x = 15;
        y+= 60;
        getContentPane().add(criaBotaoNumero(x, y, "4"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "5"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "6"));
        x += 60;
        getContentPane().add(criaBotaoOperacao(x, y, "x"));
        x = 15;
        y+= 60;
        getContentPane().add(criaBotaoNumero(x, y, "7"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "8"));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "9"));
        x += 60;
        getContentPane().add(criaBotaoOperacao(x, y, "-"));
        x = 15;
        y+= 60;
        getContentPane().add(criaBotao(x, y, "C", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        }, new Color(129,197,230)));
        x += 60;
        getContentPane().add(criaBotaoNumero(x, y, "0"));
        x += 60;
        getContentPane().add(criaBotao(x, y, "=", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        }, new Color(246,26,48)));
        x += 60;
        getContentPane().add(criaBotaoOperacao(x, y, "+"));
        setVisible(true);
    }

    private JButton criaBotao(int x, int y, String texto, ActionListener funcao, Color cor){
        JButton botao = new JButton(texto);
        botao.setSize(50,50);
        botao.setBorder(new RoundedBorder(10));
        botao.setMargin(new Insets(0,0,0,0));
        botao.setLocation(x,y);
        if(cor != null){
            botao.setBackground(cor);
            botao.setOpaque(true);
        }
        botao.addActionListener(funcao);
        return botao;
    }

    private JButton criaBotaoNumero(int x, int y, String texto){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor(texto);
            }
        };
      return criaBotao(x,y,texto,action,null);
    }

    private JButton criaBotaoOperacao(int x, int y, String texto){
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherOperacao(texto);
            }
        };
        return criaBotao(x,y,texto,action,Color.orange);
    }

    private void construirTela(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setResizable(false);
        setLayout(null);

        lbTotal = new JLabel("0", SwingConstants.RIGHT);
        lbTotal.setSize(250,40);
        lbTotal.setLocation(15,20);
        lbTotal.setBorder(new LineBorder(Color.black));
        Border border = lbTotal.getBorder();
        Border margin = new EmptyBorder(5,5,5,5);
        lbTotal.setBorder(new CompoundBorder(border, margin));

        lbTotal.setBackground(Color.green);
        lbTotal.setOpaque(true);
        lbTotal.setFont(new Font("Verdana", Font.BOLD,20));
        getContentPane().add(lbTotal);

        JButton bt1 = new JButton("1");
        bt1.setSize(50,50);
        bt1.setBorder(new RoundedBorder(10));
        bt1.setMargin(new Insets(0,0,0,0));
        bt1.setLocation(15,80);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("1");
            }
        });
        getContentPane().add(bt1);

        JButton bt2 = new JButton("2");
        bt2.setSize(40,40);
        bt2.setBorder(new RoundedBorder(10));
        bt2.setMargin(new Insets(0,0,0,0));
        bt2.setLocation(75,80);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("2");
            }
        });
        getContentPane().add(bt2);


        JButton bt3 = new JButton("3");
        bt3.setSize(40,40);
        bt3.setBorder(new RoundedBorder(10));
        bt3.setMargin(new Insets(0,0,0,0));
        bt3.setLocation(145,80);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("3");
            }
        });
        getContentPane().add(bt3);

        JButton btDividir = new JButton("/");
        btDividir.setSize(40,40);
        btDividir.setBorder(new RoundedBorder(10));
        btDividir.setMargin(new Insets(0,0,0,0));
        btDividir.setBackground(Color.orange);
        btDividir.setOpaque(true);
        btDividir.setLocation(205,80);
        btDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherOperacao("/");
            }
        });
        getContentPane().add(btDividir);

        JButton bt4 = new JButton("4");
        bt4.setSize(40,40);
        bt4.setBorder(new RoundedBorder(10));
        bt4.setMargin(new Insets(0,0,0,0));
        bt4.setLocation(25,140);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("4");
            }
        });
        getContentPane().add(bt4);

        JButton bt5 = new JButton("5");
        bt5.setSize(40,40);
        bt5.setBorder(new RoundedBorder(10));
        bt5.setMargin(new Insets(0,0,0,0));
        bt5.setLocation(85,140);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("5");
            }
        });
        getContentPane().add(bt5);

        JButton bt6 = new JButton("6");
        bt6.setSize(40,40);
        bt6.setBorder(new RoundedBorder(10));
        bt6.setMargin(new Insets(0,0,0,0));
        bt6.setLocation(145,140);
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("6");
            }
        });
        getContentPane().add(bt6);

        JButton btMultiplicar = new JButton("*");
        btMultiplicar.setSize(40,40);
        btMultiplicar.setBorder(new RoundedBorder(10));
        btMultiplicar.setMargin(new Insets(0,0,0,0));
        btMultiplicar.setBackground(Color.orange);
        btMultiplicar.setOpaque(true);
        btMultiplicar.setLocation(205,140);
        btMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherOperacao("*");
            }
        });
        getContentPane().add(btMultiplicar);

        JButton bt7 = new JButton("7");
        bt7.setSize(40,40);
        bt7.setBorder(new RoundedBorder(10));
        bt7.setMargin(new Insets(0,0,0,0));
        bt7.setLocation(25,200);
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("7");
            }
        });
        getContentPane().add(bt7);

        JButton bt8 = new JButton("8");
        bt8.setSize(40,40);
        bt8.setBorder(new RoundedBorder(10));
        bt8.setMargin(new Insets(0,0,0,0));
        bt8.setLocation(85,200);
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("8");
            }
        });
        getContentPane().add(bt8);

        JButton bt9 = new JButton("9");
        bt9.setSize(40,40);
        bt9.setBorder(new RoundedBorder(10));
        bt9.setMargin(new Insets(0,0,0,0));
        bt9.setLocation(145,200);
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("9");
            }
        });
        getContentPane().add(bt9);

        JButton btDiminuir = new JButton("-");
        btDiminuir.setSize(40,40);
        btDiminuir.setBorder(new RoundedBorder(10));
        btDiminuir.setMargin(new Insets(0,0,0,0));
        btDiminuir.setBackground(Color.orange);
        btDiminuir.setOpaque(true);
        btDiminuir.setLocation(205,200);
        btDiminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherOperacao("-");
            }
        });
        getContentPane().add(btDiminuir);

        JButton btLimpar = new JButton("C");
        btLimpar.setSize(40,40);
        btLimpar.setBorder(new RoundedBorder(10));
        btLimpar.setMargin(new Insets(0,0,0,0));
        btLimpar.setBackground(new Color(129,197,230));
        btLimpar.setOpaque(true);
        btLimpar.setLocation(25,260);
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        getContentPane().add(btLimpar);

        JButton bt0 = new JButton("0");
        bt0.setSize(40,40);
        bt0.setBorder(new RoundedBorder(10));
        bt0.setMargin(new Insets(0,0,0,0));
        bt0.setLocation(85,260);
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherValor("0");
            }
        });
        getContentPane().add(bt0);

        JButton btIgual = new JButton("=");
        btIgual.setSize(40,40);
        btIgual.setBorder(new RoundedBorder(10));
        btIgual.setMargin(new Insets(0,0,0,0));
        btIgual.setBackground(new Color(246,26,48));
        btIgual.setOpaque(true);
        btIgual.setLocation(145,260);
        btIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
        getContentPane().add(btIgual);

        JButton btSomar = new JButton("+");
        btSomar.setSize(40,40);
        btSomar.setBorder(new RoundedBorder(10));
        btSomar.setMargin(new Insets(0,0,0,0));
        btSomar.setBackground(Color.orange);
        btSomar.setOpaque(true);
        btSomar.setOpaque(true);
        btSomar.setLocation(205    ,260);
        btSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                preencherOperacao("+");
            }
        });
        getContentPane().add(btSomar);

        setVisible(true);
    }

    private void preencherValor(String valor) {
        if (operacao == null) {
            if(valorA.length() == 8) return;
            if(valorA.equals("0")){
                valorA = valor;
            }else{
                valorA = valorA + valor;
            }
            lbTotal.setText(valorA);
        } else {
            if(valorB.length() == 8) return;
            valorB = valorB + valor;
            lbTotal.setText(valorB);
        }
    }

    private void preencherOperacao (String operacao) {
        if(!valorB.isEmpty()) return;
        this.operacao = operacao;
        lbTotal.setText("");
    }

    private void calcular (){
        if(valorA.isEmpty() || valorB.isEmpty()) return;
        double valor1 = Double.parseDouble(valorA);
        double valor2 = Double.parseDouble(valorB);
        Double resultado = 0.0;
        try {
            if (operacao.equals("÷")) resultado = calculadora.dividir(valor1, valor2);
            if (operacao.equals("x")) resultado = calculadora.multiplicar(valor1, valor2);
            if (operacao.equals("-")) resultado = calculadora.subtrair(valor1, valor2);
            if (operacao.equals("+")) resultado = calculadora.somar(valor1, valor2);
            NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
            operacao = null;
            valorB = "";
            if(resultado % 1 == 0){
                lbTotal.setText(String.valueOf(resultado.intValue()));
                valorA = lbTotal.getText();
            }else{
                lbTotal.setText(nf.format(resultado));
                valorA = String.valueOf(lbTotal);
            }
        }catch (Exception e){
            limpar();
            lbTotal.setText("Erro");
        }
    }

    private void limpar(){
        valorA = "0";
        valorB = "";
        operacao = null;
        lbTotal.setText("0");
    }
}