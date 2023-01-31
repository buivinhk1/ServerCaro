/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import KetNoi.UserDAO;
import javax.swing.JOptionPane;
import Database.User;
import SuLy.Room;
import SuLy.Server;
import SuLy.ServerThread;

/**
 *
 * @author vinhb
 */
public class ServerForm extends javax.swing.JFrame implements Runnable{
    private UserDAO userDAO;
   
    public ServerForm() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        txtAreA_Server.setEditable(false);
        txtArea_Client.setEditable(false);
        userDAO = new UserDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreA_Server = new javax.swing.JTextArea();
        btn_DSLuong = new javax.swing.JButton();
        btn_DanhSachPhong = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtChat = new javax.swing.JTextField();
        btn_Mess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_Client = new javax.swing.JTextArea();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreA_Server.setColumns(20);
        txtAreA_Server.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAreA_Server.setRows(5);
        jScrollPane1.setViewportView(txtAreA_Server);

        btn_DSLuong.setText("Xem danh sách người chơi đang hđộng");
        btn_DSLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DSLuongActionPerformed(evt);
            }
        });

        btn_DanhSachPhong.setText("Xem danh sách phòng");
        btn_DanhSachPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DanhSachPhongActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Máy Chủ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtChat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChatKeyPressed(evt);
            }
        });

        btn_Mess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Mess.setText("Phát thông báo");
        btn_Mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MessActionPerformed(evt);
            }
        });

        txtArea_Client.setColumns(20);
        txtArea_Client.setRows(5);
        jScrollPane2.setViewportView(txtArea_Client);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btn_DSLuong)
                .addGap(73, 73, 73)
                .addComponent(btn_DanhSachPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jScrollPane2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Mess)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_DanhSachPhong)
                    .addComponent(btn_DSLuong, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Mess))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DSLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DSLuongActionPerformed
        String res = "";
        String room="";
        int i=1;
        for(ServerThread serverThread : Server.serverThreadBus.getListServerThreads()){
            if(serverThread.getRoom()==null)
                room = null;
            else room =""+ serverThread.getRoom().getID();
            if(serverThread.getUser()!=null){
                 res+=i+". Client-number: "+serverThread.getClientNumber()+", User-ID: "+serverThread.getUser().getID()+", Room: "+room+"\n";
            }
            else{
                res+=i+". Client-number: "+serverThread.getClientNumber()+", User-ID: null, Room: "+room+"\n";
            }
            i++;
        }
        txtAreA_Server.setText(res);
    }//GEN-LAST:event_btn_DSLuongActionPerformed

    private void btn_DanhSachPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DanhSachPhongActionPerformed
        String res = "";
        int i=1;
        for (ServerThread serverThread : Server.serverThreadBus.getListServerThreads()) {
            Room room1 = serverThread.getRoom();
            String listUser = "List user ID: ";
            if (room1 != null) {
                if (room1.getNumberOfUser() == 1) {
                    listUser += room1.getUser1().getUser().getID();
                } else {
                    listUser += room1.getUser1().getUser().getID() + ", " + room1.getUser2().getUser().getID();
                }
                res +=i+ ". Room_ID: " + room1.getID() + ", Number of player: " + room1.getNumberOfUser() + ", " + listUser + "\n";
                i++;
            }
            
        }
        txtAreA_Server.setText(res);
    }//GEN-LAST:event_btn_DanhSachPhongActionPerformed

    private void btn_MessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MessActionPerformed
        sendMessage();
    }//GEN-LAST:event_btn_MessActionPerformed

    private void txtChatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChatKeyPressed
        if(evt.getKeyCode()==10){
            sendMessage();
        }
    }//GEN-LAST:event_txtChatKeyPressed
    private void sendMessage(){
        String message = txtChat.getText();
        if(message.length()==0) return;
        String temp = txtArea_Client.getText();
        temp+= "Thông báo từ máy chủ : "+message+"\n";
        txtArea_Client.setText(temp);
        txtArea_Client.setCaretPosition(txtArea_Client.getDocument().getLength());
        Server.serverThreadBus.boardCast(-1,"chat-server,Thông báo từ máy chủ : "+ message);
        txtChat.setText("");
    }
    public void addMessage(String message) {
        String tmp = txtArea_Client.getText();
        tmp=tmp+message+"\n";
        txtArea_Client.setText(tmp);
        txtArea_Client.setCaretPosition(txtAreA_Server.getDocument().getLength());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DSLuong;
    private javax.swing.JButton btn_DanhSachPhong;
    private javax.swing.JButton btn_Mess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtAreA_Server;
    public static javax.swing.JTextArea txtArea_Client;
    private javax.swing.JTextField txtChat;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        new ServerForm().setVisible(true);
    }
}