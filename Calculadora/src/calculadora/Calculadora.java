/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Christian Ramirez
 */
public class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonPotencia = new javax.swing.JButton();
        botonInversa = new javax.swing.JButton();
        btnPotenciaCubica = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnPotenciaN = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(7, 4));

        botonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        panel.add(botonC);

        botonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        panel.add(botonRaiz);

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        panel.add(botonDivision);

        botonCE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        panel.add(botonCE);

        jButton35.setBackground(new java.awt.Color(204, 204, 204));
        jButton35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton35.setText("7");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        panel.add(jButton35);

        jButton28.setBackground(new java.awt.Color(204, 204, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setText("8");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        panel.add(jButton28);

        jButton29.setBackground(new java.awt.Color(204, 204, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton29.setText("9");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        panel.add(jButton29);

        botonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMultiplicar.setText("X");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        panel.add(botonMultiplicar);

        jButton32.setBackground(new java.awt.Color(204, 204, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton32.setText("4");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        panel.add(jButton32);

        jButton33.setBackground(new java.awt.Color(204, 204, 204));
        jButton33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton33.setText("5");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        panel.add(jButton33);

        jButton34.setBackground(new java.awt.Color(204, 204, 204));
        jButton34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton34.setText("6");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        panel.add(jButton34);

        botonRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        panel.add(botonRestar);

        jButton37.setBackground(new java.awt.Color(204, 204, 204));
        jButton37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton37.setText("1");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        panel.add(jButton37);

        jButton40.setBackground(new java.awt.Color(204, 204, 204));
        jButton40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton40.setText("2");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        panel.add(jButton40);

        jButton38.setBackground(new java.awt.Color(204, 204, 204));
        jButton38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton38.setText("3");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        panel.add(jButton38);

        botonSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        panel.add(botonSumar);

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton41.setText("+/-");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        panel.add(jButton41);

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton42.setText("0");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        panel.add(jButton42);

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        panel.add(botonPunto);

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        panel.add(botonIgual);

        botonPotencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPotencia.setText("X²");
        botonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPotenciaActionPerformed(evt);
            }
        });
        panel.add(botonPotencia);

        botonInversa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonInversa.setText("1/X");
        botonInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInversaActionPerformed(evt);
            }
        });
        panel.add(botonInversa);

        btnPotenciaCubica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPotenciaCubica.setText("X³");
        btnPotenciaCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaCubicaActionPerformed(evt);
            }
        });
        panel.add(btnPotenciaCubica);

        btnPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        panel.add(btnPorcentaje);

        btnPotenciaN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPotenciaN.setText("Xⁿ");
        btnPotenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaNActionPerformed(evt);
            }
        });
        panel.add(btnPotenciaN);

        etiquetaNumeros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton42ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double segundoNumero;
        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenaNumeros);
        } else if(!cadenaNumeros.equals("")){
            if (operacion.equals("sumar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero + segundoNumero;;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("restar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero - segundoNumero;;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("multiplicar")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero * segundoNumero;;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("dividir")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                if (segundoNumero == 0) {
                    etiquetaNumeros.setText("NoSeDividePor0");
                } else {
                    resultado = primerNumero / segundoNumero;;
                    etiquetaNumeros.setText(String.format("% .2f", resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }
            } //Se evaluar si la opreacion es el porncentaje
            else if (operacion.equals("porcentaje")){
                //Se obtiene el segundo numero
               segundoNumero = Double.parseDouble(cadenaNumeros);
               //Se evalua el caso si el segundo numero es 0 
               if (segundoNumero == 0) {
                    etiquetaNumeros.setText("NoSeSacaPorcentajeDe0");
                } else {
                   //En caso la operacion sea valida 
                   // se saca el porcentaje de los numeros
                    resultado = (primerNumero / 100) * segundoNumero;;
                    //Se pita el resultado
                    etiquetaNumeros.setText(String.format("% .2f", resultado));
                    //Se guarda el resultado
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }
            } else if (operacion.equals("potencia")) {
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = Math.pow(primerNumero, segundoNumero);
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            }
            etiquetaMuestra.setText("");
            activado = true;
            punto = false;
        }        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false;
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt(" + cadenaNumeros + ")");
        resultado = Math.sqrt(primerNumero);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto == true) {
            if (cadenaNumeros.equals("")) {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        int tamaño = cadenaNumeros.length();
        if (tamaño > 0) {
            if (tamaño == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPotenciaActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("potencia(" + cadenaNumeros + ")");
        resultado = Math.pow(primerNumero, 2);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonPotenciaActionPerformed

    private void botonInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInversaActionPerformed
        /*
            Inversa 1/X = X^(-1)
            Donde: 
            'X' es el primerNumero
         */
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText(cadenaNumeros + "^(-1)");
        if (primerNumero == 0) {
            etiquetaNumeros.setText("No divisible por 0");
        } else {
            resultado = Math.pow(primerNumero, -1);
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
        }
    }//GEN-LAST:event_botonInversaActionPerformed

    private void btnPotenciaCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaCubicaActionPerformed
        // modifica etiqueta en pantalla
        etiquetaMuestra.setText("Potencia cúbica de (" + cadenaNumeros + ")");

        // obtiene resultado
        resultado = getPotenciaCubica(cadenaNumeros);

        // imprime resultado en pantalla
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
    }//GEN-LAST:event_btnPotenciaCubicaActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        //Se Evalua el flag de activado para ver si la calculadora esta en uso
        if (activado == true) {
            //se obitne el primero numero
            primerNumero = Double.parseDouble(cadenaNumeros);
            //Secoloca el simbolo del porcentaje
            etiquetaMuestra.setText(cadenaNumeros + " % ");
            cadenaNumeros = "";
            //Valor que se evaluara cuando se necesite igualar
            operacion = "porcentaje";

            activado = false;
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnPotenciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaNActionPerformed
        if (activado) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " ^ ");
            cadenaNumeros = "";
            operacion = "potencia";

            activado = false;
        }
    }//GEN-LAST:event_btnPotenciaNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // obtener número al cubo
    public double getPotenciaCubica(String entrada) {
        return Math.pow(Double.parseDouble(entrada), 3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonInversa;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonPotencia;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnPotenciaCubica;
    private javax.swing.JButton btnPotenciaN;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
