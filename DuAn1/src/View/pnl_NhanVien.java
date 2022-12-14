/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.NhanVien;
import Service.INhanvien_services;
import Service_impl.NhanVienServices;
import Ulti.Chk;
import Ulti.XImage;
import ViewModel.NhanVienViewModel;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lequy
 */
public class pnl_NhanVien extends javax.swing.JPanel {

    public static pnl_NhanVien form;

    private INhanvien_services nhanvien_services = new NhanVienServices();
    List<NhanVienViewModel> list;
    private DefaultTableModel tableModel;
    private String anh;

    /**
     * Creates new form pnl_NhanVien
     */
    public pnl_NhanVien() {
        initComponents();
        form = this;
        fillTable();
    }

    public void fillTable() {
        list = nhanvien_services.getAll();
        tableModel = (DefaultTableModel) tblbang.getModel();
        tableModel.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            Object[] data = new Object[]{list.get(i).getTkNv(), list
                .get(i).getMkNv(), list.get(i).getHoTen(), list.get(i).Hiengt(), list.get(i).getSdt(), list.get(i).getLuong(),
                list.get(i).getAnh(), list.get(i).getNgaySinh(), list.get(i).getDiaChi(),
                list.get(i).hienTrangth()};
            tableModel.addRow(data);
        }
    }

    public NhanVien getByform() {

        try {
            String tentk = txttaikhoan.getText();
            String matkhau = txtmatkhau.getText();
            String hoten = txthotten.getText();
            int gioitinh;
            if (rdonam.isSelected()) {
                gioitinh = 0;
            } else {
                gioitinh = 1;
            }
            String sdt = txtsdt.getText();

            Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(txtngsinh.getText());

            String diachi = txtdiachi.getText();
            int Trangthai;
            if (cbotrangthai.getSelectedIndex() == 0) {
                Trangthai = 0;
            } else {
                Trangthai = 1;
            }
            float luong = Float.parseFloat(txtluong.getText());
            anh = lblanh.getToolTipText();
            return new NhanVien("", tentk, matkhau, hoten, ngaysinh, gioitinh, diachi, sdt, luong, anh, Trangthai);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean checkv() {
        if (Chk.chknull("Kh??ng ????? tr???ng t??i kho???n", txttaikhoan)) {
            return false;
        } else if (Chk.chknull("Kh??ng ????? tr???ng m???t kh???u", txtmatkhau)) {
            return false;
        } else if (Chk.chknull("Kh??ng ????? tr???ng h??? t??n", txthotten)) {
            return false;
        } else if (Chk.chknull("Kh??ng ????? tr???ng m???t kh???u", txtmatkhau)) {
            return false;
        } else if (Chk.chknull("Kh??ng ????? tr???ng ng??y sinh", txtngsinh)) {
            return false;
        } else if (Chk.chkDate("Ng??y sinh sai ?????nh d???ng", txtngsinh)) {
            return false;
        } else if (Chk.chknull("Kh??ng ????? ?????a ch???", txtdiachi)) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txthotten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtngsinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmatkhau = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbotrangthai = new javax.swing.JComboBox<>();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        btntim = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblanh = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbang = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1700, 900));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("H??? T??n");

        txthotten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Ng??y Sinh");

        txtsdt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("S??T");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Gioi T??nh");

        txtngsinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("?????a Ch???");

        txtdiachi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("T??i Kho???n");

        txttaikhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("M???t Kh???u");

        txtmatkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Tr???ng Th??i");

        cbotrangthai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbotrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??i l??m ", "Ngh??? vi???c" }));

        buttonGroup1.add(rdonam);
        rdonam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdonu.setText("N???");

        btnsua.setBackground(new java.awt.Color(255, 255, 255));
        btnsua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_30px.png"))); // NOI18N
        btnsua.setText("S???A");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(255, 255, 255));
        btnxoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_30px.png"))); // NOI18N
        btnxoa.setText("X??A");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnnew.setBackground(new java.awt.Color(255, 255, 255));
        btnnew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_refresh_30px.png"))); // NOI18N
        btnnew.setText("NEW");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnthem.setBackground(new java.awt.Color(255, 255, 255));
        btnthem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_30px_1.png"))); // NOI18N
        btnthem.setText("TH??M");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        txttim.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txttimCaretUpdate(evt);
            }
        });
        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });

        btntim.setBackground(new java.awt.Color(255, 255, 255));
        btntim.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btntim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_30px.png"))); // NOI18N
        btntim.setText("T??M");
        btntim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 400));

        lblanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblanhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblanh, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("L????ng");

        txtluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("???NH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(txthotten, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdonam)
                                .addGap(32, 32, 32)
                                .addComponent(rdonu))
                            .addComponent(txtngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(50, 50, 50)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbotrangthai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btntim)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txthotten, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5)
                                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(txtngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(rdonam)
                                    .addComponent(rdonu)))
                            .addComponent(jLabel6)
                            .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbotrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(57, 57, 57)
                                .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntim, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(232, Short.MAX_VALUE))))
        );

        tblbang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??i Kho???n", "M???t kh???u", "H??? T??n", "Gioi T??nh", "S??T", "L????ng", "???nh", "Ng??y Sinh", "?????a ch???", "Tr???ng Th??i"
            }
        ));
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed

        NhanVien nv = getByform();
        try {
            nhanvien_services.add(nv);
            JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng");
            fillTable();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        NhanVien nv = getByform();

        nhanvien_services.delete(nv);
        JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
        fillTable();


    }//GEN-LAST:event_btnxoaActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

    }//GEN-LAST:event_jPanel2MouseClicked

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
        int row = tblbang.getSelectedRow();
        txttaikhoan.setText(tblbang.getValueAt(row, 0).toString());
        txtmatkhau.setText(tblbang.getValueAt(row, 1).toString());

        txthotten.setText(tblbang.getValueAt(row, 2).toString());
        if (tblbang.getValueAt(row, 3).equals("Nam")) {
            rdonam.setSelected(true);
        } else {
            rdonu.setSelected(true);
        }
        txtsdt.setText(tblbang.getValueAt(row, 4).toString());
        txtluong.setText(tblbang.getValueAt(row, 5).toString());
        String anh = this.tblbang.getValueAt(row, 6).toString();
        lblanh.setToolTipText(anh);
        lblanh.setIcon(XImage.read(anh));
        txtngsinh.setText(tblbang.getValueAt(row, 7).toString());

        txtdiachi.setText(tblbang.getValueAt(row, 8).toString());

        if (tblbang.getValueAt(row, 9).equals("??i l??m")) {
            cbotrangthai.setSelectedIndex(0);
        } else {
            cbotrangthai.setSelectedIndex(1);
        }


    }//GEN-LAST:event_tblbangMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        NhanVien nv = getByform();
        nhanvien_services.update(nv);
        JOptionPane.showMessageDialog(this, "Update th??nh c??ng");
        fillTable();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed

    }//GEN-LAST:event_txttimActionPerformed

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed

    }//GEN-LAST:event_btntimActionPerformed

    private void txttimCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txttimCaretUpdate

    }//GEN-LAST:event_txttimCaretUpdate

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txthotten.setText("");
        txtmatkhau.setText("");
        txtngsinh.setText("");
        txttaikhoan.setText("");
        txtsdt.setText("");
        txtdiachi.setText("");
        cbotrangthai.setSelectedIndex(0);


    }//GEN-LAST:event_btnnewActionPerformed

    private void lblanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblanhMouseClicked

        JFileChooser chon = new JFileChooser();
        if (chon.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File file = chon.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblanh.setIcon(icon);
            lblanh.setToolTipText(file.getName());
        }


    }//GEN-LAST:event_lblanhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntim;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbotrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblanh;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblbang;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthotten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txtngsinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
