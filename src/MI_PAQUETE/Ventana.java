package MI_PAQUETE;


/*  NOTAS DE MEJORIA: 
        °ARRANCAR MONGODB AL EJECUTARSE LA INTERFAZ
        °MOSTRAR CONSULAS DENTRO DE CAMPOS DEFINIDOS
        °OPTIMIZAR FUNCION ACTUALIZAR CON SITEMA DE 2 BOTONES QUE MUESTRE LOS DATOS ACTUALES EN LOS CAMPOS
*/
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.text.Normalizer.Form;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class Ventana extends javax.swing.JFrame implements ActionListener{

   
    public Ventana() 
    {
        
        
        this.setTitle("Guadalupe");
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setBounds(10, 10, 345, 51);
        setResizable(false);
        
         fields[0]=jLabel1;
         fields[1]=jLabel2;
         fields[2]=jLabel3;
         fields[3]=jLabel4;
         fields[4]=jLabel5;
         fields[5]=jLabel6;
         fields[6]=jLabel7;
         fields[7]=jLabel8;
         fields[8]=jLabel9;
         fields[9]=jLabel10;
         fields[10]=jLabel11;
         fields[11]=jLabel12;
                  
         texts[0]=jTextField1;
         texts[1]=jTextField2;
         texts[2]=jTextField3;
         texts[3]=jTextField4;
         texts[4]=jTextField5;
         texts[5]=jTextField6;
         texts[6]=jTextField7;
         texts[7]=jTextField8;
         texts[8]=jTextField9;
         texts[9]=jTextField10;
         texts[10]=jTextField11;
         texts[11]=jTextField12;
            
        
        
        
        add_to_ActionListenner();
        make_lab_and_text_invisible();
        
        
        try 
        {
            Mongo mongo=new Mongo("localhost",27017);
            
            db=mongo.getDB("Guadalupe");
            
        } 
        catch (UnknownHostException ex) 
        {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
///////////////////////////////////////////////////////////////////////
    
    public void actionPerformed(ActionEvent e) 
    {
        Object source=e.getSource();
        
      
       
       choose_collection(source);
       
       choose_function(source);
       
      
       
       
    }
     
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        doit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();

        jFrame1.setAutoRequestFocus(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        doit.setText("Do it!");
        doit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 255));

        jMenu1.setText("Insertar");

        jMenuItem1.setText("Cambio Aves");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Compra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Detalle Compra");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Direccion Cliente");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Direccion Empleado");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Direccion Proveedor");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Empleado");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Granja");
        jMenu1.add(jMenuItem9);

        jMenuItem10.setText("Pago Nomina");
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Produccion");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Proveedor");
        jMenu1.add(jMenuItem12);

        jMenuItem13.setText("Stock Huevo");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("Venta");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");

        jMenuItem15.setText("Cambio Aves");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("Cliente");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("Compra");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("Detalle Compra");
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("Direccion Cliente");
        jMenu2.add(jMenuItem19);

        jMenuItem20.setText("Direccion Empleado");
        jMenu2.add(jMenuItem20);

        jMenuItem21.setText("Direccion Proveedor");
        jMenu2.add(jMenuItem21);

        jMenuItem22.setText("Empleado");
        jMenu2.add(jMenuItem22);

        jMenuItem23.setText("Granja");
        jMenu2.add(jMenuItem23);

        jMenuItem24.setText("Pago Nomina");
        jMenu2.add(jMenuItem24);

        jMenuItem25.setText("Produccion");
        jMenu2.add(jMenuItem25);

        jMenuItem26.setText("Proveedor");
        jMenu2.add(jMenuItem26);

        jMenuItem27.setText("Stock Huevo");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem27);

        jMenuItem28.setText("Venta");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem28);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Actualizar");

        jMenuItem29.setText("Cambio Aves");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem29);

        jMenuItem30.setText("Cliente");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem30);

        jMenuItem31.setText("Compra");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem31);

        jMenuItem32.setText("Detalle Compra");
        jMenu3.add(jMenuItem32);

        jMenuItem33.setText("Direccion Cliente");
        jMenu3.add(jMenuItem33);

        jMenuItem34.setText("Direccion Empleado");
        jMenu3.add(jMenuItem34);

        jMenuItem35.setText("Direccion Proveedor");
        jMenu3.add(jMenuItem35);

        jMenuItem36.setText("Empleado");
        jMenu3.add(jMenuItem36);

        jMenuItem37.setText("Granja");
        jMenu3.add(jMenuItem37);

        jMenuItem38.setText("Pago Nomina");
        jMenu3.add(jMenuItem38);

        jMenuItem39.setText("Produccion");
        jMenu3.add(jMenuItem39);

        jMenuItem40.setText("Proveedor");
        jMenu3.add(jMenuItem40);

        jMenuItem41.setText("Stock Huevo");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem41);

        jMenuItem42.setText("Venta");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem42);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultar");

        jMenuItem43.setText("Cambio Aves");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem43);

        jMenuItem44.setText("Cliente");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem44);

        jMenuItem45.setText("Compra");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem45);

        jMenuItem46.setText("Detalle Compra");
        jMenu4.add(jMenuItem46);

        jMenuItem47.setText("Direccion Cliente");
        jMenu4.add(jMenuItem47);

        jMenuItem48.setText("Direccion Empleado");
        jMenu4.add(jMenuItem48);

        jMenuItem49.setText("Direccion Proveedor");
        jMenu4.add(jMenuItem49);

        jMenuItem50.setText("Empleado");
        jMenu4.add(jMenuItem50);

        jMenuItem51.setText("Granja");
        jMenu4.add(jMenuItem51);

        jMenuItem52.setText("Pago Nomina");
        jMenu4.add(jMenuItem52);

        jMenuItem53.setText("Produccion");
        jMenu4.add(jMenuItem53);

        jMenuItem54.setText("Proveedor");
        jMenu4.add(jMenuItem54);

        jMenuItem55.setText("Stock Huevo");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem55);

        jMenuItem56.setText("Venta");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem56);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doit))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void doitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doitActionPerformed
        
        String casilla_id=jTextField1.getText();
        
        switch(funcion)
        {
            case INSERTAR:   
                        if(casilla_id.isEmpty())
                            JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                        else
                            {
                             BasicDBObject document=new BasicDBObject();

                             for(int i=0;;i++)
                                {
                                 if(fields[i].isVisible()==true)   
                                    document.put(fields[i].getText(),texts[i].getText());
                                 else
                                     break;
                                }
                             
                             coleccion.insert(document);
                             
                             setSize(345,51);
                             JOptionPane.showMessageDialog(null, "Documento con ID: "+casilla_id+" ha sido INSERTADO");
                            }   
            ;break;
            
            case ELIMINAR:  
                                if(casilla_id.isEmpty())
                                    JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                                else
                                    {
                                     BasicDBObject document=new BasicDBObject();
                                     
                                     document.put(jLabel1.getText(),casilla_id);
                                     coleccion.remove(document);
                                     
                                     setSize(345,51);
                                     JOptionPane.showMessageDialog(null, "Documento(s) con ID: "+casilla_id+" ha sido ELIMINADO");
                                     setSize(345,51);
                                     consultar();
                                    }
                
                

                
                
                
                ;break;
                
            case ACTUALIZAR:   
                            if(casilla_id.isEmpty())
                                                JOptionPane.showMessageDialog(null, "No hay datos en la casilla ID");
                                            else
                                                {
                                                 BasicDBObject document_OLD=new BasicDBObject();
                                                 BasicDBObject document_NEW=new BasicDBObject();

                                                 document_OLD.put(jLabel1.getText(),casilla_id);
                                                 document_NEW.put(jLabel1.getText(),casilla_id);
                                                 
                                                 for(int i=1;;i++)
                                                    {
                                                     if(fields[i].isVisible()==true)   
                                                        document_NEW.put(fields[i].getText(),texts[i].getText());
                                                     else
                                                         break;
                                                    }
                                                 
                                                 
                                                 coleccion.update(document_OLD,document_NEW);

                                                 setSize(345,51);
                                                 JOptionPane.showMessageDialog(null, "Documento con ID: "+casilla_id+" ha sido ACTUALIZADO");
                                                setSize(345,51);
                                                consultar();
                                                }

                            
                
                
                
                
                
                
                
                ;break;
        
        
        
        
        
        
        }
        
        
        
        
        
        
             

             
        
    
    }//GEN-LAST:event_doitActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem56ActionPerformed

   
    ////////////////////////////////////////////////////////////////
    public void choose_collection(Object source)
    {
     if(source==jMenuItem1 || source==jMenuItem15 || source==jMenuItem29 || source==jMenuItem43)
           coleccion=db.getCollection("CambioAves");
       if(source==jMenuItem2 || source==jMenuItem16 || source==jMenuItem30 || source==jMenuItem44)
           coleccion=db.getCollection("Cliente");
       if(source==jMenuItem3 || source==jMenuItem17 || source==jMenuItem31 || source==jMenuItem45)
           coleccion=db.getCollection("Compra");
       if(source==jMenuItem4 || source==jMenuItem18 || source==jMenuItem32 || source==jMenuItem46)
           coleccion=db.getCollection("DetalleCompra");
       if(source==jMenuItem5 || source==jMenuItem19 || source==jMenuItem33 || source==jMenuItem47)
           coleccion=db.getCollection("DireccionCliente");
       if(source==jMenuItem6 || source==jMenuItem20 || source==jMenuItem34|| source==jMenuItem48)
           coleccion=db.getCollection("DireccionEmpleado");
       if(source==jMenuItem7 || source==jMenuItem21 || source==jMenuItem35 || source==jMenuItem49)
           coleccion=db.getCollection("DireccionProveedor");
       if(source==jMenuItem8 || source==jMenuItem22 || source==jMenuItem36|| source==jMenuItem50)
           coleccion=db.getCollection("Empleado");
       if(source==jMenuItem9 || source==jMenuItem23 || source==jMenuItem37 || source==jMenuItem51)
           coleccion=db.getCollection("Granja");
       if(source==jMenuItem10 || source==jMenuItem24 || source==jMenuItem38 || source==jMenuItem52)
           coleccion=db.getCollection("PagoNomina");
       if(source==jMenuItem11 || source==jMenuItem25 || source==jMenuItem39 || source==jMenuItem53)
           coleccion=db.getCollection("Produccion");
       if(source==jMenuItem12 || source==jMenuItem26 || source==jMenuItem40 || source==jMenuItem54)
           coleccion=db.getCollection("Proveedor");
       if(source==jMenuItem13 || source==jMenuItem27 || source==jMenuItem41 || source==jMenuItem55)
           coleccion=db.getCollection("StockHuevo");
       if(source==jMenuItem14 || source==jMenuItem28 || source==jMenuItem42|| source==jMenuItem56)
           coleccion=db.getCollection("Venta");
       
       
       
       
       
       jLabel14.setText(coleccion.getName());
    }
    
    
    ///////////////////////////////////////////////////////
    
    public void choose_function(Object source)
    {
       if(source==jMenuItem1 || source==jMenuItem2 || source==jMenuItem3 || source==jMenuItem4|| source==jMenuItem5 || source==jMenuItem6 || source==jMenuItem7|| source==jMenuItem8 || source==jMenuItem9 || source==jMenuItem10|| source==jMenuItem11 || source==jMenuItem12 || source==jMenuItem13||source==jMenuItem14)
           insertar(source);
       else if(source==jMenuItem15 || source==jMenuItem16 || source==jMenuItem17|| source==jMenuItem18 || source==jMenuItem19 || source==jMenuItem20||source==jMenuItem21|| source==jMenuItem22 || source==jMenuItem23 || source==jMenuItem24|| source==jMenuItem25 || source==jMenuItem26 || source==jMenuItem27|| source==jMenuItem28)
              eliminar(source);
            else if(source==jMenuItem29 || source==jMenuItem30 || source==jMenuItem31 || source==jMenuItem32 || source==jMenuItem33 || source==jMenuItem34|| source==jMenuItem35 || source==jMenuItem36 || source==jMenuItem37|| source==jMenuItem38 || source==jMenuItem39 || source==jMenuItem40||source==jMenuItem41 || source==jMenuItem42 )
                    actualizar(source);
                      else if(source==jMenuItem43 || source==jMenuItem44||source==jMenuItem45 || source==jMenuItem46||source==jMenuItem47 || source==jMenuItem48||source==jMenuItem49 || source==jMenuItem50||source==jMenuItem51 || source==jMenuItem52||source==jMenuItem53 || source==jMenuItem54||source==jMenuItem55 || source==jMenuItem56)
                                consultar();
                            
    }
    
    ////////////////////////////////////////////////////
    
    public void insertar(Object source)
    {
     this.setSize(460, 650); 
     make_lab_and_text_invisible();
        setResizable(false);
     
    int op=this.INSERTAR;
     
    
      
       
       
       
       if(source==jMenuItem1 || source==jMenuItem15 || source==jMenuItem29 || source==jMenuItem43)
           recognize_fields(op,c1); 
       if(source==jMenuItem2 || source==jMenuItem16 || source==jMenuItem30 || source==jMenuItem44)
           recognize_fields(op,c2); 
       if(source==jMenuItem3 || source==jMenuItem17 || source==jMenuItem31 || source==jMenuItem45)
           recognize_fields(op,c3); 
       if(source==jMenuItem4 || source==jMenuItem18 || source==jMenuItem32 || source==jMenuItem46)
           recognize_fields(op,c4); 
       if(source==jMenuItem5 || source==jMenuItem19 || source==jMenuItem33 || source==jMenuItem47)
          recognize_fields(op,c5); 
       if(source==jMenuItem6 || source==jMenuItem20 || source==jMenuItem34|| source==jMenuItem48)
           recognize_fields(op,c6); 
       if(source==jMenuItem7 || source==jMenuItem21 || source==jMenuItem35 || source==jMenuItem49)
           recognize_fields(op,c7); 
       if(source==jMenuItem8 || source==jMenuItem22 || source==jMenuItem36|| source==jMenuItem50)
           recognize_fields(op,c8); 
       if(source==jMenuItem9 || source==jMenuItem23 || source==jMenuItem37 || source==jMenuItem51)
           recognize_fields(op,c9); 
       if(source==jMenuItem10 || source==jMenuItem24 || source==jMenuItem38 || source==jMenuItem52)
           recognize_fields(op,c10); 
       if(source==jMenuItem11 || source==jMenuItem25 || source==jMenuItem39 || source==jMenuItem53)
           recognize_fields(op,c11); 
       if(source==jMenuItem12 || source==jMenuItem26 || source==jMenuItem40 || source==jMenuItem54)
           recognize_fields(op,c12); 
       if(source==jMenuItem13 || source==jMenuItem27 || source==jMenuItem41 || source==jMenuItem55)
           recognize_fields(op,c13); 
       if(source==jMenuItem14 || source==jMenuItem28 || source==jMenuItem42|| source==jMenuItem56)
           recognize_fields(op,c14); 
       
       
       funcion=this.INSERTAR;
      jLabel13.setText("INSERTAR");
       
     
     
     
     
     
     
     
     
     
    }
    
    ////////////////////////////////////////////////////
    
    public void eliminar(Object source)
    {
     this.setSize( 460, 210); 
        make_lab_and_text_invisible();
     setResizable(false);
     
     int op=this.ELIMINAR;
     
      if(source==jMenuItem1 || source==jMenuItem15 || source==jMenuItem29 || source==jMenuItem43)
           recognize_fields(op,c1); 
       if(source==jMenuItem2 || source==jMenuItem16 || source==jMenuItem30 || source==jMenuItem44)
           recognize_fields(op,c2); 
       if(source==jMenuItem3 || source==jMenuItem17 || source==jMenuItem31 || source==jMenuItem45)
           recognize_fields(op,c3); 
       if(source==jMenuItem4 || source==jMenuItem18 || source==jMenuItem32 || source==jMenuItem46)
           recognize_fields(op,c4); 
       if(source==jMenuItem5 || source==jMenuItem19 || source==jMenuItem33 || source==jMenuItem47)
          recognize_fields(op,c5); 
       if(source==jMenuItem6 || source==jMenuItem20 || source==jMenuItem34|| source==jMenuItem48)
           recognize_fields(op,c6); 
       if(source==jMenuItem7 || source==jMenuItem21 || source==jMenuItem35 || source==jMenuItem49)
           recognize_fields(op,c7); 
       if(source==jMenuItem8 || source==jMenuItem22 || source==jMenuItem36|| source==jMenuItem50)
           recognize_fields(op,c8); 
       if(source==jMenuItem9 || source==jMenuItem23 || source==jMenuItem37 || source==jMenuItem51)
           recognize_fields(op,c9); 
       if(source==jMenuItem10 || source==jMenuItem24 || source==jMenuItem38 || source==jMenuItem52)
           recognize_fields(op,c10); 
       if(source==jMenuItem11 || source==jMenuItem25 || source==jMenuItem39 || source==jMenuItem53)
           recognize_fields(op,c11); 
       if(source==jMenuItem12 || source==jMenuItem26 || source==jMenuItem40 || source==jMenuItem54)
           recognize_fields(op,c12); 
       if(source==jMenuItem13 || source==jMenuItem27 || source==jMenuItem41 || source==jMenuItem55)
           recognize_fields(op,c13); 
       if(source==jMenuItem14 || source==jMenuItem28 || source==jMenuItem42|| source==jMenuItem56)
           recognize_fields(op,c14); 
     
     
     
     
     
     
     funcion=this.ELIMINAR;
     jLabel13.setText("ELIMINAR");
    }
    
    ////////////////////////////////////////////////////
    
    public void actualizar(Object source)
    {
     this.setSize( 460, 650); 
        make_lab_and_text_invisible();
     setResizable(false);
     
     int op=this.ACTUALIZAR;
     
      if(source==jMenuItem1 || source==jMenuItem15 || source==jMenuItem29 || source==jMenuItem43)
           recognize_fields(op,c1); 
       if(source==jMenuItem2 || source==jMenuItem16 || source==jMenuItem30 || source==jMenuItem44)
           recognize_fields(op,c2); 
       if(source==jMenuItem3 || source==jMenuItem17 || source==jMenuItem31 || source==jMenuItem45)
           recognize_fields(op,c3); 
       if(source==jMenuItem4 || source==jMenuItem18 || source==jMenuItem32 || source==jMenuItem46)
           recognize_fields(op,c4); 
       if(source==jMenuItem5 || source==jMenuItem19 || source==jMenuItem33 || source==jMenuItem47)
          recognize_fields(op,c5); 
       if(source==jMenuItem6 || source==jMenuItem20 || source==jMenuItem34|| source==jMenuItem48)
           recognize_fields(op,c6); 
       if(source==jMenuItem7 || source==jMenuItem21 || source==jMenuItem35 || source==jMenuItem49)
           recognize_fields(op,c7); 
       if(source==jMenuItem8 || source==jMenuItem22 || source==jMenuItem36|| source==jMenuItem50)
           recognize_fields(op,c8); 
       if(source==jMenuItem9 || source==jMenuItem23 || source==jMenuItem37 || source==jMenuItem51)
           recognize_fields(op,c9); 
       if(source==jMenuItem10 || source==jMenuItem24 || source==jMenuItem38 || source==jMenuItem52)
           recognize_fields(op,c10); 
       if(source==jMenuItem11 || source==jMenuItem25 || source==jMenuItem39 || source==jMenuItem53)
           recognize_fields(op,c11); 
       if(source==jMenuItem12 || source==jMenuItem26 || source==jMenuItem40 || source==jMenuItem54)
           recognize_fields(op,c12); 
       if(source==jMenuItem13 || source==jMenuItem27 || source==jMenuItem41 || source==jMenuItem55)
           recognize_fields(op,c13); 
       if(source==jMenuItem14 || source==jMenuItem28 || source==jMenuItem42|| source==jMenuItem56)
           recognize_fields(op,c14); 
     
     
     
     
     funcion=this.ACTUALIZAR;
     jLabel13.setText("ACTUALIZAR");
     
    
    }
    
    ////////////////////////////////////////////////////
    
    public void consultar()
    {
     DBCursor cursor=coleccion.find();
        
        jFrame1.setVisible(true);
        jFrame1.setBounds(463,0,850,650);
     
        jTextArea1.setText(" ");
        while(cursor.hasNext())
        {
          jTextArea1.setText(jTextArea1.getText()+cursor.next()+"\n");
        
        }
    
    }
    
  
    ///////////////////////////////////////////////////
    
    public void recognize_fields(int funcion,String[] cam)
    {
        
        switch(funcion)
        {
            case INSERTAR:
                        for(int i=0;i<cam.length;i++)
                            {
                             fields[i].setVisible(true);
                             fields[i].setText(cam[i]);

                             texts[i].setVisible(true);
                            }
            ;break;
            
            case ELIMINAR:
                        fields[0].setVisible(true);
                        fields[0].setText(cam[0]);

                        texts[0].setVisible(true);

            ;break;
            
            case ACTUALIZAR:
                        for(int i=0;i<cam.length;i++)
                            {
                             fields[i].setVisible(true);
                             fields[i].setText(cam[i]);

                             texts[i].setVisible(true);
                             
                             
                                 
                            }
            ;break;
        
        
        
        
        }
      
         
         
      
       
       
       
       
       
    }
            
    ///////////////////////////////////////////////////
    
    public void add_to_ActionListenner()
    {
        jMenuItem1.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem3.addActionListener(this);
        jMenuItem4.addActionListener(this);
        jMenuItem5.addActionListener(this);
        jMenuItem6.addActionListener(this);
        jMenuItem7.addActionListener(this);
        jMenuItem8.addActionListener(this);
        jMenuItem9.addActionListener(this);
        jMenuItem10.addActionListener(this);
        jMenuItem11.addActionListener(this);
        jMenuItem12.addActionListener(this);
        jMenuItem13.addActionListener(this);
        jMenuItem14.addActionListener(this);
        jMenuItem15.addActionListener(this);
        jMenuItem16.addActionListener(this);
        jMenuItem17.addActionListener(this);
        jMenuItem18.addActionListener(this);
        jMenuItem19.addActionListener(this);
        jMenuItem20.addActionListener(this);
        jMenuItem21.addActionListener(this);
        jMenuItem22.addActionListener(this);
        jMenuItem23.addActionListener(this);
        jMenuItem24.addActionListener(this);
        jMenuItem25.addActionListener(this);
        jMenuItem26.addActionListener(this);
        jMenuItem27.addActionListener(this);
        jMenuItem28.addActionListener(this);
        jMenuItem29.addActionListener(this);
        jMenuItem30.addActionListener(this);
        jMenuItem31.addActionListener(this);
        jMenuItem32.addActionListener(this);
        jMenuItem33.addActionListener(this);
        jMenuItem34.addActionListener(this);
        jMenuItem35.addActionListener(this);
        jMenuItem36.addActionListener(this);
        jMenuItem37.addActionListener(this);
        jMenuItem38.addActionListener(this);
        jMenuItem39.addActionListener(this);
        jMenuItem40.addActionListener(this);
        jMenuItem41.addActionListener(this);
        jMenuItem41.addActionListener(this);
        jMenuItem43.addActionListener(this);
        jMenuItem44.addActionListener(this);
        jMenuItem45.addActionListener(this);
        jMenuItem46.addActionListener(this);
        jMenuItem47.addActionListener(this);
        jMenuItem48.addActionListener(this);
        jMenuItem49.addActionListener(this);
        jMenuItem50.addActionListener(this);
        jMenuItem51.addActionListener(this);
        jMenuItem52.addActionListener(this);
        jMenuItem53.addActionListener(this);
        jMenuItem54.addActionListener(this);
        jMenuItem55.addActionListener(this);
        jMenuItem56.addActionListener(this);
       
       
       
    
    
    
    
    
    
    
    
    
    
    }
    
    /////////////////////////////////////////////////
    
    public void make_lab_and_text_invisible()
    {
     jLabel1.setVisible(true);
        
     for(int i=1;i<fields.length;i++)
         fields[i].setVisible(false);
     
      
      
      jTextField1.setVisible(true);
      jTextField1.setText("");
        
     for(int i=1;i<texts.length;i++)
        {
        texts[i].setVisible(false);
        texts[i].setText("");
        }

    }
    
    
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doit;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    
    DB db;
   DBCollection coleccion;
    
    JLabel [] fields=new JLabel[12]; 
    JTextField [] texts=new JTextField[12]; 
    
    String [] c1 ={"IdGranja", "Fecha","NumeroAves"};
    String [] c2 ={"IdCliente", "Nombre", "Descripcion", "Telefono", "RFC","Email"};
    String [] c3 ={ "IdCompra", "IdProveedor", "Fecha"};
    String [] c4 ={ "IdCompra", "IdGranja", "Cantidad"};
    String [] c5 ={ "IdCliente", "Calle","Colonia","Numero","Estado","Municipio","Cp"};
    String [] c6 ={"IdEmpleado", "Calle","Colonia","Numero","Estado","Municipio","Cp"};
    String [] c7 ={"IdProveedor", "Calle","Colonia","Numero","Estado","Municipio","Cp"};
    String [] c8 ={"IdEmpleado","IdGranja","Nombre","ApPaterno","ApMaterno","Telefono","Salario"};
    String [] c9  ={"IdGranja", "Telefono", "Calle" , "Colonia", "Estado","Municipio","Cp","NumEmpleados"};
    String [] c10 ={ "NumeroNomina", "IdEmpleado" , "DiasLaborados" };
    String [] c11 ={"IdGranja","Fecha","ProduccionDelDia"};
    String [] c12 ={"IdProveedor", "Nombre", "Descripcion", "Telefono", "RFC", "Email"};
    String [] c13 ={ "IdGranja", "Importe", "Cantidad", "Fecha"};
    String [] c14 ={"IdVenta", "IdGranja" , "IdCliente","Cantidad","Fecha"};
   
         
   static final int INSERTAR=1,ELIMINAR=2,ACTUALIZAR=3;
   int funcion;
    
}
