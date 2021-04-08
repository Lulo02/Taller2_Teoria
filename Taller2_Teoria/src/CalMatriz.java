
//VENTANAS DE DIALOGO
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class CalMatriz extends javax.swing.JFrame {
//SE DESACTIVA LA OPCION DE QUE EL USUSARIO PUEDE AGRANDAR LA VENTANA
  //Y QUE LA VENTANA EMERGENTE TENGA EL NOMBRE DE LA OPERACION QUE SE VAYA A REALIZAR
    public CalMatriz() {
        initComponents();
        setResizable(false);
        setTitle("CALCULADORA DE MATRIZ");
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matA = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        matB = new javax.swing.JTable();
        jSuma = new javax.swing.JButton();
        jResta = new javax.swing.JButton();
        jMultiplicacion = new javax.swing.JButton();
        jinver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resul = new javax.swing.JTable();
        jIgual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        masFilaMA = new javax.swing.JButton();
        masColMA = new javax.swing.JButton();
        menosFilaMA = new javax.swing.JButton();
        menosColMA = new javax.swing.JButton();
        menosFilaMB = new javax.swing.JButton();
        masFilaMB = new javax.swing.JButton();
        MT = new javax.swing.JButton();
        det = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MATRIZ A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        matA.setModel(matrizA);
        jScrollPane1.setViewportView(matA);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MATRIZ B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        matB.setModel(matrizB);
        jScrollPane2.setViewportView(matB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, -1, 137));

        jSuma.setText("+");
        jSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSumaMouseClicked(evt);
            }
        });
        jSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumaActionPerformed(evt);
            }
        });
        getContentPane().add(jSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 63, -1));

        jResta.setText("-");
        jResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRestaMouseClicked(evt);
            }
        });
        jResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestaActionPerformed(evt);
            }
        });
        getContentPane().add(jResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 63, -1));

        jMultiplicacion.setText("*");
        jMultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMultiplicacionMouseClicked(evt);
            }
        });
        jMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 63, -1));

        jinver.setText("INVER");
        jinver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jinverMouseClicked(evt);
            }
        });
        jinver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinverActionPerformed(evt);
            }
        });
        getContentPane().add(jinver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        resul.setModel(resultado);
        jScrollPane3.setViewportView(resul);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, -1, -1));

        jIgual.setText("=");
        jIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIgualActionPerformed(evt);
            }
        });
        getContentPane().add(jIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 493, 63, -1));

        jLabel1.setText("Ingrese la matriz aumentada para calcular la INVERSA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, -1));

        masFilaMA.setText("Agregar Fila");
        masFilaMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masFilaMAMouseClicked(evt);
            }
        });
        masFilaMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masFilaMAActionPerformed(evt);
            }
        });
        getContentPane().add(masFilaMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        masColMA.setText("Agregar Columna");
        masColMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masColMAMouseClicked(evt);
            }
        });
        getContentPane().add(masColMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        menosFilaMA.setText("Eliminar fila");
        menosFilaMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosFilaMAMouseClicked(evt);
            }
        });
        menosFilaMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosFilaMAActionPerformed(evt);
            }
        });
        getContentPane().add(menosFilaMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        menosColMA.setText("Eliminar Columna");
        menosColMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosColMAMouseClicked(evt);
            }
        });
        getContentPane().add(menosColMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        menosFilaMB.setText("Eliminar fila");
        menosFilaMB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosFilaMBMouseClicked(evt);
            }
        });
        menosFilaMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosFilaMBActionPerformed(evt);
            }
        });
        getContentPane().add(menosFilaMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 20));

        masFilaMB.setText("Agregar Fila");
        masFilaMB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masFilaMBMouseClicked(evt);
            }
        });
        masFilaMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masFilaMBActionPerformed(evt);
            }
        });
        getContentPane().add(masFilaMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        MT.setText("Matriz traspuesta");
        MT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MTMouseClicked(evt);
            }
        });
        MT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTActionPerformed(evt);
            }
        });
        getContentPane().add(MT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        det.setText("Determiante");
        det.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detMouseClicked(evt);
            }
        });
        det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detActionPerformed(evt);
            }
        });
        getContentPane().add(det, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //INICIALIZAMOS LAS VARIABLES 
    String centinela="";
    String A="";
    String B="";
    String r="";
    double x=0;
    double x1=0;
    double x2=0;
    double x3=0;
    double a=0;
    double v=0;
    int tamfilA=3;
    int tamcolA=3;
    int tamfilB=3;
    int tamcolB=3;
    int tamfilR=3;
    int tamcolR=3;
    int determ=0;
    
    private void jSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSumaActionPerformed
        
        try {
        matrizA.setColumnCount(tamcolA);matrizA.setRowCount(tamfilA);
        matrizB.setColumnCount(tamcolA);matrizB.setRowCount(tamfilA);
        resultado.setColumnCount(tamcolA);resultado.setRowCount(tamfilA);
       
        
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(rootPane, "ERROR", null, JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jSumaActionPerformed

    private void jRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestaActionPerformed
       
        try {
       
        matrizA.setColumnCount(tamcolA);matrizA.setRowCount(tamfilA);
        matrizB.setColumnCount(tamcolA);matrizB.setRowCount(tamfilA);
        resultado.setColumnCount(tamcolA);resultado.setRowCount(tamfilA);
        
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(rootPane, "ERROR", null, JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jRestaActionPerformed

    private void jMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplicacionActionPerformed
        //SE LE INDICA AL BOTON QUE PREGUNTE NUMERO DE FILAS Y COLUMNAS
        //DE NO HACER EL PROSEDIMIENTO SALDRA UN ERROR
        try{
        
        matrizA.setColumnCount(tamcolA);matrizA.setRowCount(tamfilA);
        matrizB.setColumnCount(tamcolB);matrizB.setRowCount(tamfilB);
        resultado.setColumnCount(tamcolR);resultado.setRowCount(tamfilR);  
        
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(rootPane, "ERROR", null, JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_jMultiplicacionActionPerformed

    private void jinverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinverActionPerformed
        // SE LE INDICA QUE INGRESE LOS VALORES DE LA MATRIZ QUE QUIERE CALCULAR LA INVERSA
       
    }//GEN-LAST:event_jinverActionPerformed

    private void jIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIgualActionPerformed
        // SE LE VA A INDICAR AL BOTON IGUAL QUE SEGUN LA OTRACION DETREMINE LOS VALORES RESPUESTA
      
        try{
        centinela="i";
        matrizA.setColumnCount(tamcolA);matrizA.setRowCount(tamfilA);
        matrizB.setColumnCount(tamcolA+tamcolA);matrizB.setRowCount(tamcolA);   
        resultado.setColumnCount(tamcolA);resultado.setRowCount(tamfilA);
        
        //EN LA MATRIZ B SE DEBERA COMPLETAR LA MATRIZ AUMENTADA CON LOS VALORES DE LA MATRIZ A
        for(int m=0;m<tamcolA;m++){
           a=0;
             for(int n=tamcolA;n<tamcolA+tamcolA;n++){
             if(m==a){matrizB.setValueAt(1, m, n);
             }
             else{matrizB.setValueAt(0, m, n);  
             }
            a++;
          }
         }
        }
        catch(NumberFormatException e)
        {
           JOptionPane.showMessageDialog(rootPane, "ERROR", null, JOptionPane.ERROR_MESSAGE); 
        }
if(centinela.equals("i")){
         for(int u=0;u<tamcolA;u++){
          x=Double.parseDouble(matrizB.getValueAt(u,u).toString());
          if(x!=1){
            for(int f=u;f<tamcolA+tamcolA;f++){
                x1=Double.parseDouble(matrizB.getValueAt(u,f).toString());
                x2=x1/x;
                matrizB.setValueAt(x2, u, f);                      
                }
            }
            for(int y=0;y<tamcolA;y++){
                if(y==u)
                 y=u;
                else{
                 x=Double.parseDouble(matrizB.getValueAt(u,u).toString());
                 x1=Double.parseDouble(matrizB.getValueAt(y,u).toString());
                 x2=x*(-x1);
            for(int m=u;m<tamcolA+tamcolA;m++){
                 x=Double.parseDouble(matrizB.getValueAt(u,m).toString());
                 x1=Double.parseDouble(matrizB.getValueAt(y,m).toString());
                 x3=(x2*x)+x1;   
                 matrizB.setValueAt(x3, y,m);
            }
           }
          }
         } 
        for(int d=0;d<tamcolA;d++){
         for(int e=0;e<tamcolA;e++){
            v=Double.parseDouble(matrizB.getValueAt(d, e+tamcolA).toString());
            matrizB.setValueAt(v, d,e );
           }
          }
        matrizB.setColumnCount(tamcolA);matrizB.setRowCount(tamcolA);
        for(int m=0;m<tamfilA;m++){
            for(int n=0;n<tamcolA;n++){
                 acum=0;     
                 for(int a=0;a<tamcolA;a++){
                 A=matrizA.getValueAt(m, a).toString();
                 B=matrizB.getValueAt(a, n).toString();
                 acum= acum+(Double.parseDouble(A)*Double.parseDouble(B));
                 resultado.setValueAt(acum, m, n);
                }
              }
            }
        }
       
        
    }//GEN-LAST:event_jIgualActionPerformed

    private void masFilaMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masFilaMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masFilaMAActionPerformed

    private void menosFilaMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosFilaMAActionPerformed
        
       
    }//GEN-LAST:event_menosFilaMAActionPerformed

    private void menosFilaMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosFilaMAMouseClicked
        tamfilA=tamfilA-1;
         matrizA.removeRow(matrizA.getRowCount()-1);
    }//GEN-LAST:event_menosFilaMAMouseClicked

    private void masFilaMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masFilaMAMouseClicked
        tamfilA=tamfilA+1;
        matrizA.addRow(new Object []{});
    }//GEN-LAST:event_masFilaMAMouseClicked

    private void menosFilaMBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosFilaMBMouseClicked
        tamfilB=tamfilB-1;
         matrizB.removeRow(matrizB.getRowCount()-1);
    }//GEN-LAST:event_menosFilaMBMouseClicked

    private void menosFilaMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosFilaMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosFilaMBActionPerformed

    private void masFilaMBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masFilaMBMouseClicked
       tamfilB=tamfilB+1;
        matrizB.addRow(new Object []{});
    }//GEN-LAST:event_masFilaMBMouseClicked

    private void masFilaMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masFilaMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masFilaMBActionPerformed

    private void menosColMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosColMAMouseClicked
        tamfilA=tamfilA-1;
        int tcol = matrizA.getColumnCount();
    //    matrizA.removeColumn(tcol-1);
    }//GEN-LAST:event_menosColMAMouseClicked

    private void masColMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masColMAMouseClicked
        tamfilA=tamfilA+1;
         matrizA.addColumn("");
    }//GEN-LAST:event_masColMAMouseClicked

    private void MTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MTActionPerformed

    private void detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detActionPerformed

    private void MTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MTMouseClicked
        for (int m = 0; m < tamfilA; m++) {

            for (int n = 0; n < tamcolA; n++) {
                    A=matrizA.getValueAt(m, n).toString();
                acum= Double.parseDouble (A);
                resultado.setValueAt(acum, n, m);

            }

        }
    }//GEN-LAST:event_MTMouseClicked

    private void jSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSumaMouseClicked
        
            for(int m=0;m<tamfilA;m++){
                for(int n=0;n<tamcolA;n++){
                   A=matrizA.getValueAt(m, n).toString();
                   B=matrizB.getValueAt(m, n).toString();
                   acum=Double.parseDouble(A)+Double.parseDouble(B);
                   resultado.setValueAt(acum, m, n);
                }
            }
        
    }//GEN-LAST:event_jSumaMouseClicked

    private void jRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRestaMouseClicked
       
            for(int m=0;m<tamfilA;m++){
                for(int n=0;n<tamcolA;n++){
                   A=matrizA.getValueAt(m, n).toString();
                   B=matrizB.getValueAt(m, n).toString();
                   acum=Double.parseDouble(A)-Double.parseDouble(B);
                   resultado.setValueAt(acum, m, n);
                }
            }
        
    }//GEN-LAST:event_jRestaMouseClicked

    private void jinverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jinverMouseClicked
        
    }//GEN-LAST:event_jinverMouseClicked

    private void jMultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMultiplicacionMouseClicked
        
            for(int m=0;m<tamfilA;m++){
                for(int n=0;n<col2;n++){
                  acum=0;     
                  for( int a=0;a<col;a++){
                   A=matrizA.getValueAt(m, a).toString();
                   B=matrizB.getValueAt(a, n).toString();
                   acum= acum+(Double.parseDouble(A)*Double.parseDouble(B));
                   resultado.setValueAt(acum, m, n);
                }
              }
            
        }
    }//GEN-LAST:event_jMultiplicacionMouseClicked

    private void detMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detMouseClicked
         
            for (int m = 0; m < tamfilA; m++) {

            for (int n = 0; n < tamcolA; n++) {
                   
        //    determ = (matrizA.getValueAt(0, 0)*matrizA.getValueAt(1, 1)*matrizA.getValueAt(2, 2)) + (matrizA.getValueAt(0, 1)*matrizA.getValueAt(1, 2)*matrizA.getValueAt(2, 0)) + (matrizA.getValueAt(1, 0)*matrizA.getValueAt(2, 2)*matrizA.getValueAt(0, 2))-(matrizA.getValueAt(0, 2)*matrizA.getValueAt(1, 1)*matrizA.getValueAt(2, 0)) - (matrizA.getValueAt(1, 0)*matrizA.getValueAt(0, 1)*matrizA.getValueAt(2, 2)) - (matrizA.getValueAt(1, 2)*matrizA.getValueAt(2, 1)*matrizA.getValueAt(0, 0));
        }
            }
        
    }//GEN-LAST:event_detMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CalMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalMatriz().setVisible(true);
            }
        });   
    }
    //PARA MOSTRAR LOS VALORES Y SE LE INDICAN LOS VALORES INICIALES
    DefaultTableModel matrizA=new DefaultTableModel();
    DefaultTableModel matrizB=new DefaultTableModel();
    DefaultTableModel resultado=new DefaultTableModel();
    int fil=0,col=0,col2=0;
    double acum=0;       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MT;
    private javax.swing.JButton det;
    private javax.swing.JButton jIgual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMultiplicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jResta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jSuma;
    private javax.swing.JButton jinver;
    private javax.swing.JButton masColMA;
    private javax.swing.JButton masFilaMA;
    private javax.swing.JButton masFilaMB;
    private javax.swing.JTable matA;
    private javax.swing.JTable matB;
    private javax.swing.JButton menosColMA;
    private javax.swing.JButton menosFilaMA;
    private javax.swing.JButton menosFilaMB;
    private javax.swing.JTable resul;
    // End of variables declaration//GEN-END:variables
}
