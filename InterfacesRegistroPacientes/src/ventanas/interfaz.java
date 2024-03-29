/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/**
 *
 * @author alejandro
 */
public class interfaz extends javax.swing.JFrame {
    private String pathRegistros;
    private String pathPaint;
    private String pathOdontograma;
    private String pathHistClinica;
    private LectorDeTxt lector;

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.lector = new LectorDeTxt();
        inicializarPath();
        /*System.out.println("pathRegistros"+pathRegistros);
        System.out.println("pathPaint"+pathPaint);
        System.out.println("pathOdontograma"+pathOdontograma);
        System.out.println("pathHistClinica"+pathHistClinica);*/
    }
    public void inicializarPath(){
        this.pathRegistros = lector.leerTxt("src\\path\\registros.txt");
        this.pathPaint = lector.leerTxt("src\\path\\paint.txt");
        this.pathOdontograma = lector.leerTxt("src\\path\\odontograma.txt");
        this.pathHistClinica = lector.leerTxt("src\\path\\historia clinica.txt");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto = new javax.swing.JTextField();
        jLabelPaciente = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        jLabelDiente = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        histClinCheck = new javax.swing.JCheckBox();
        odontogramaCheck = new javax.swing.JCheckBox();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador de registro de pacientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 420));
        setSize(new java.awt.Dimension(500, 400));

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });

        jLabelPaciente.setFont(new java.awt.Font("Remachine Script Personal Use", 0, 36)); // NOI18N
        jLabelPaciente.setText("Paciente");

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa2.png"))); // NOI18N
        botonBuscar.setBorder(null);
        botonBuscar.setBorderPainted(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa4.png"))); // NOI18N
        botonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa3.png"))); // NOI18N
        botonBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa3.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabelDiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diente2.png"))); // NOI18N
        jLabelDiente.setText("jLabel1");

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        histClinCheck.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        histClinCheck.setText("Historia Clínica");
        histClinCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histClinCheckActionPerformed(evt);
            }
        });

        odontogramaCheck.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        odontogramaCheck.setText("Odontograma");

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper.jpg"))); // NOI18N
        jLabelFondo.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelDiente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(odontogramaCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(histClinCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(botonCrear))
                    .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelDiente)
                        .addGap(70, 70, 70)
                        .addComponent(odontogramaCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(histClinCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(botonCrear)))
                .addGap(27, 35, Short.MAX_VALUE))
            .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        ProcessBuilder proceso = new ProcessBuilder();

        if(histClinCheck.isSelected()){
            try {
            String ruta = pathRegistros + campoTexto.getText() + ".docx";
            proceso.command("cmd.exe","/c", ruta);
            proceso.start();
            } catch (IOException ex) {
            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(odontogramaCheck.isSelected()){
            try{
            String ruta = pathRegistros + campoTexto.getText() + ".png";
            String url_programa = pathPaint;
            proceso.command(url_programa, ruta);
            proceso.start();
            } catch (IOException ex) {
            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(!(histClinCheck.isSelected()||odontogramaCheck.isSelected())){
            JOptionPane.showMessageDialog(null, "¡Debes elegir qué archivo abrir!","Error", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_botonBuscarActionPerformed

    private void histClinCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histClinCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_histClinCheckActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        
            // TODO add your handling code here:
        if(histClinCheck.isSelected()){
            
                int resultado = copyFile(pathHistClinica, pathRegistros + campoTexto.getText() + ".docx");
                switch(resultado){
                    case 0:
                        JOptionPane.showMessageDialog(null, "La historia clinica de " + campoTexto.getText() + " fue creada satisfactoriamente","Correcto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ya existe un fichero " + campoTexto.getText() + ".docx","Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "No existe el archivo plantilla historia clinica.docx","Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Error al intentar crear el archivo","Error", JOptionPane.ERROR_MESSAGE);
                    default:       
                }
            
        }
        if(odontogramaCheck.isSelected()){
            int resultado = copyFile(pathOdontograma, pathRegistros + campoTexto.getText() + ".png");
            switch(resultado){
                case 0:
                    JOptionPane.showMessageDialog(null, "El odontograma de " + campoTexto.getText() + " fue creado satisfactoriamente","Correcto", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Ya existe un fichero " + campoTexto.getText() + ".png","Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "No existe el archivo plantilla odontograma.png","Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Error al intentar crear el archivo","Error", JOptionPane.ERROR_MESSAGE);
                default:
            }
        }
        if(!(histClinCheck.isSelected()||odontogramaCheck.isSelected())){
            JOptionPane.showMessageDialog(null, "¡Debes elegir qué archivo crear!","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonCrearActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JCheckBox histClinCheck;
    private javax.swing.JLabel jLabelDiente;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JCheckBox odontogramaCheck;
    // End of variables declaration//GEN-END:variables
    @Override
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagenes/diente (1).png"));
   return retValue;
}
public void renombrarArchivo(String nombreViejo, String nombreNuevo){
    File f1 = new File(pathRegistros + nombreViejo + ".docx");
    File f2 = new File(pathRegistros + nombreNuevo + ".docx");
    if (!f1.exists()) {
        System.out.println("Error. No existe un fichero con la ruta indicada");
        JOptionPane.showMessageDialog(null, "No existe archivo " + nombreViejo + ".docx","Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(f2.exists()) {
        System.out.println("Error. Ya existe un fichero " + nombreNuevo + ".docx");
        JOptionPane.showMessageDialog(null, "Ya existe un fichero " + nombreNuevo + ".docx","Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    boolean resultado = f1.renameTo(f2);
    if (resultado)
        JOptionPane.showMessageDialog(null, "El archivo fue creado satisfactoriamente","Correcto", JOptionPane.INFORMATION_MESSAGE);
    else
        JOptionPane.showMessageDialog(null, "Error al crear el archivo","Error", JOptionPane.ERROR_MESSAGE);
}

public int copyFile(String fromFile, String toFile) {
        File origin = new File(fromFile);
        File destination = new File(toFile);
        if(destination.exists()){
            return 1;
        }
      
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // We use a buffer for the copy (Usamos un buffer para la copia).
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return 0;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return 3;
            }
        } else {
            return 2;
        }
    }                     

}
