
package proyecto_sistema;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {
static LinkedList<Vendedores> vendedores = new LinkedList<>();
    
    public Administrador() {
        initComponents();
        Mostrar_Tabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        p_sucursales = new javax.swing.JPanel();
        p_clientes = new javax.swing.JPanel();
        p_productos = new javax.swing.JPanel();
        p_vendedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 255));

        p_sucursales.setBackground(new java.awt.Color(51, 255, 204));

        javax.swing.GroupLayout p_sucursalesLayout = new javax.swing.GroupLayout(p_sucursales);
        p_sucursales.setLayout(p_sucursalesLayout);
        p_sucursalesLayout.setHorizontalGroup(
            p_sucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        p_sucursalesLayout.setVerticalGroup(
            p_sucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Sucursales", p_sucursales);

        p_clientes.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout p_clientesLayout = new javax.swing.GroupLayout(p_clientes);
        p_clientes.setLayout(p_clientesLayout);
        p_clientesLayout.setHorizontalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        p_clientesLayout.setVerticalGroup(
            p_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Clientes", p_clientes);

        p_productos.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout p_productosLayout = new javax.swing.GroupLayout(p_productos);
        p_productos.setLayout(p_productosLayout);
        p_productosLayout.setHorizontalGroup(
            p_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        p_productosLayout.setVerticalGroup(
            p_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Productos", p_productos);

        p_vendedores.setBackground(new java.awt.Color(255, 204, 102));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");

        jButton4.setText("Carga Masiva");

        jButton5.setText("Exportar PDF");

        javax.swing.GroupLayout p_vendedoresLayout = new javax.swing.GroupLayout(p_vendedores);
        p_vendedores.setLayout(p_vendedoresLayout);
        p_vendedoresLayout.setHorizontalGroup(
            p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_vendedoresLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(p_vendedoresLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        p_vendedoresLayout.setVerticalGroup(
            p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_vendedoresLayout.createSequentialGroup()
                .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_vendedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_vendedoresLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(p_vendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendedores", p_vendedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Crear_Vendedores cv  = new Crear_Vendedores();
       cv.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (Tabla.getSelectedRow() < 0){
           JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
       }else{
           Modificar_Vendedor mv = new Modificar_Vendedor();
           mv.Mostrar(Tabla.getSelectedRow());
           mv.setVisible(true);
           dispose();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Mostrar_Tabla(){
        String columnas []= {"Codigo", "Nombre", "Caja", "Ventas", "Genero"};
        DefaultTableModel tablita = new DefaultTableModel(null, columnas);
        
        for (Vendedores sp : Administrador.vendedores){
            Object filas[] = new Object[5];
            filas[0]=sp.getCodigo();
            filas[1]=sp.getNombre();
            filas[2]=sp.getCaja();
            filas[3]=sp.getVentas();
            filas[4]=sp.getGenero();
            tablita.addRow(filas);
        }
        
        Tabla.setModel(tablita);
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel p_clientes;
    private javax.swing.JPanel p_productos;
    private javax.swing.JPanel p_sucursales;
    private javax.swing.JPanel p_vendedores;
    // End of variables declaration//GEN-END:variables
}
