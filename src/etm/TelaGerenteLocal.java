/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etm;

import java.awt.Component;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

/**
 *
 * @author Felipe Macedo
 */
public class TelaGerenteLocal extends javax.swing.JFrame {

    Component[] elementosPainelEscala;
    boolean escala [];
    public TelaGerenteLocal() {
        initComponents();
        escala = new boolean[7];
        elementosPainelEscala = Cadastrar_P_escala.getComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cadastro = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        ctps = new javax.swing.JLabel();
        cargaHoraria = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        funcao = new javax.swing.JLabel();
        Cadastrar_CB_nome = new javax.swing.JTextField();
        Cadastrar_CT_cpf = new javax.swing.JTextField();
        Cadastrar_CT_ctps = new javax.swing.JTextField();
        Cadastrar_CT_cargaHoraria = new javax.swing.JTextField();
        Cadastrar_CT_Salario = new javax.swing.JTextField();
        Cadastrar_BT_Cadastrar = new javax.swing.JButton();
        Cadastrar_BT_limpar = new javax.swing.JButton();
        Cadastrar_BT_atualizar = new javax.swing.JButton();
        Cadastrar_CB_sexo = new javax.swing.JComboBox();
        Cadastrar_CB_funcao = new javax.swing.JComboBox();
        Cadastrar_P_escala = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cadastrar_CB_domingo = new javax.swing.JCheckBox();
        Cadastrar_CB_segunda = new javax.swing.JCheckBox();
        Cadastrar_CB_terca = new javax.swing.JCheckBox();
        Cadastrar_CB_quarta = new javax.swing.JCheckBox();
        Cadastrar_CB_quinta = new javax.swing.JCheckBox();
        Cadastrar_CB_sexta = new javax.swing.JCheckBox();
        Cadastrar_CB_sabado = new javax.swing.JCheckBox();
        Cadastrar_CB_todos = new javax.swing.JCheckBox();
        Buscar = new javax.swing.JPanel();
        Buscar_nome_nome = new javax.swing.JLabel();
        nome_cpf = new javax.swing.JLabel();
        Buscar_nome_idade = new javax.swing.JLabel();
        Buscar_nome_sexo = new javax.swing.JLabel();
        Buscar_salario = new javax.swing.JLabel();
        Buscar_CT_nome = new javax.swing.JTextField();
        Buscar_CT_cpf = new javax.swing.JTextField();
        Buscar_CT_idade = new javax.swing.JTextField();
        Buscar_CT_salario = new javax.swing.JTextField();
        Buscar_BT_buscar = new javax.swing.JButton();
        Buscar_BT_limpar = new javax.swing.JButton();
        Buscar_BT_descadastrar = new javax.swing.JButton();
        Buscar_BT_atualizar = new javax.swing.JButton();
        Buscar_CT_sexo = new javax.swing.JComboBox();
        Buscar_PN_info = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("NOME:");

        cpf.setText("CPF:");

        ctps.setText("CTPS:");

        cargaHoraria.setText("CARGA HORÁRIA: ");

        salario.setText("SALÁRIO:");

        sexo.setText("SEXO:");

        funcao.setText("FUNÇÃO:");

        Cadastrar_CB_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CB_nomeActionPerformed(evt);
            }
        });

        Cadastrar_CT_ctps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CT_ctpsActionPerformed(evt);
            }
        });

        Cadastrar_CT_cargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CT_cargaHorariaActionPerformed(evt);
            }
        });

        Cadastrar_BT_Cadastrar.setText("Cadastrar");

        Cadastrar_BT_limpar.setText("Limpar");
        Cadastrar_BT_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_BT_limparActionPerformed(evt);
            }
        });

        Cadastrar_BT_atualizar.setText("Atualizar");
        Cadastrar_BT_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_BT_atualizarActionPerformed(evt);
            }
        });

        Cadastrar_CB_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "MASCULINO", "FEMININO" }));
        Cadastrar_CB_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CB_sexoActionPerformed(evt);
            }
        });

        Cadastrar_CB_funcao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "MOTORISTA", "COBRADOR", "MECÂNICO", "GESTOR DE FROTA" }));
        Cadastrar_CB_funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CB_funcaoActionPerformed(evt);
            }
        });

        Cadastrar_P_escala.setVisible(false);

        jLabel1.setText("Escala");

        Cadastrar_CB_domingo.setText("Domingo");

        Cadastrar_CB_segunda.setText("Segunda");

        Cadastrar_CB_terca.setText("Terça");

        Cadastrar_CB_quarta.setText("Quarta");

        Cadastrar_CB_quinta.setText("Quinta");

        Cadastrar_CB_sexta.setText("Sexta");

        Cadastrar_CB_sabado.setText("Sábado");

        Cadastrar_CB_todos.setText("Todos");
        Cadastrar_CB_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_CB_todosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cadastrar_P_escalaLayout = new javax.swing.GroupLayout(Cadastrar_P_escala);
        Cadastrar_P_escala.setLayout(Cadastrar_P_escalaLayout);
        Cadastrar_P_escalaLayout.setHorizontalGroup(
            Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_P_escalaLayout.createSequentialGroup()
                .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastrar_P_escalaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastrar_CB_domingo)
                            .addComponent(Cadastrar_CB_quinta))
                        .addGap(18, 18, 18)
                        .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastrar_CB_segunda)
                            .addComponent(Cadastrar_CB_sexta))
                        .addGap(18, 18, 18)
                        .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastrar_CB_terca)
                            .addComponent(Cadastrar_CB_sabado))
                        .addGap(18, 18, 18)
                        .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastrar_CB_todos)
                            .addComponent(Cadastrar_CB_quarta)))
                    .addGroup(Cadastrar_P_escalaLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Cadastrar_P_escalaLayout.setVerticalGroup(
            Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastrar_P_escalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastrar_CB_segunda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cadastrar_CB_domingo)
                        .addComponent(Cadastrar_CB_terca)
                        .addComponent(Cadastrar_CB_quarta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cadastrar_P_escalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar_CB_quinta)
                    .addComponent(Cadastrar_CB_sexta)
                    .addComponent(Cadastrar_CB_sabado)
                    .addComponent(Cadastrar_CB_todos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroLayout = new javax.swing.GroupLayout(Cadastro);
        Cadastro.setLayout(CadastroLayout);
        CadastroLayout.setHorizontalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addComponent(ctps)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Cadastrar_CT_ctps, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGroup(CadastroLayout.createSequentialGroup()
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nome)
                                .addComponent(cpf))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Cadastrar_CT_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(Cadastrar_CB_nome))))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(cargaHoraria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cadastrar_CT_cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(Cadastrar_BT_Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastrar_BT_atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastrar_BT_limpar))
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addComponent(salario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cadastrar_CT_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroLayout.createSequentialGroup()
                                .addComponent(funcao)
                                .addGap(18, 18, 18)
                                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cadastrar_CB_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cadastrar_CB_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sexo))
                        .addContainerGap(177, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar_P_escala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        CadastroLayout.setVerticalGroup(
            CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(Cadastrar_CB_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo)
                    .addComponent(Cadastrar_CB_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar_CT_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf)
                    .addComponent(funcao)
                    .addComponent(Cadastrar_CB_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroLayout.createSequentialGroup()
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctps)
                            .addComponent(Cadastrar_CT_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cadastrar_CT_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargaHoraria)
                            .addComponent(Cadastrar_CT_cargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cadastrar_BT_Cadastrar)
                            .addComponent(Cadastrar_BT_limpar)
                            .addComponent(Cadastrar_BT_atualizar)))
                    .addComponent(Cadastrar_P_escala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", Cadastro);

        Buscar_nome_nome.setText("NOME:");

        nome_cpf.setText("CPF:");

        Buscar_nome_idade.setText("IDADE:");

        Buscar_nome_sexo.setText("SEXO:");

        Buscar_salario.setText("SALÁRIO");

        Buscar_CT_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_CT_nomeActionPerformed(evt);
            }
        });

        Buscar_CT_salario.setText(" ");

        Buscar_BT_buscar.setText("Buscar");

        Buscar_BT_limpar.setText("Limpar");

        Buscar_BT_descadastrar.setText("Descadastrar");
        Buscar_BT_descadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_BT_descadastrarActionPerformed(evt);
            }
        });

        Buscar_BT_atualizar.setText("Atualizar");

        Buscar_CT_sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "FEMININO", "MASCULINO" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        Buscar_PN_info.setViewportView(jTextArea1);

        javax.swing.GroupLayout BuscarLayout = new javax.swing.GroupLayout(Buscar);
        Buscar.setLayout(BuscarLayout);
        BuscarLayout.setHorizontalGroup(
            BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarLayout.createSequentialGroup()
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buscar_nome_idade)
                            .addComponent(Buscar_salario)
                            .addComponent(Buscar_nome_sexo))
                        .addGap(18, 18, 18)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Buscar_CT_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Buscar_CT_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar_CT_salario)))
                    .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BuscarLayout.createSequentialGroup()
                            .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Buscar_nome_nome)
                                .addComponent(nome_cpf))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Buscar_CT_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(Buscar_CT_nome)))
                        .addGroup(BuscarLayout.createSequentialGroup()
                            .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Buscar_BT_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar_BT_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Buscar_BT_descadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar_BT_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(8, 8, 8)
                .addComponent(Buscar_PN_info, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );
        BuscarLayout.setVerticalGroup(
            BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuscarLayout.createSequentialGroup()
                .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BuscarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_nome_nome)
                            .addComponent(Buscar_CT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_CT_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_cpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buscar_nome_idade)
                            .addComponent(Buscar_CT_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_nome_sexo)
                            .addComponent(Buscar_CT_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_salario)
                            .addComponent(Buscar_CT_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_BT_buscar)
                            .addComponent(Buscar_BT_limpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buscar_BT_descadastrar)
                            .addComponent(Buscar_BT_atualizar)))
                    .addGroup(BuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Buscar_PN_info)))
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Buscar", Buscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Buscar_BT_descadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_BT_descadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_BT_descadastrarActionPerformed

    private void Buscar_CT_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_CT_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_CT_nomeActionPerformed

    private void Cadastrar_BT_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_BT_limparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar_BT_limparActionPerformed

    private void Cadastrar_CB_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CB_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar_CB_sexoActionPerformed

    private void Cadastrar_CT_cargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CT_cargaHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar_CT_cargaHorariaActionPerformed

    private void Cadastrar_CT_ctpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CT_ctpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar_CT_ctpsActionPerformed

    private void Cadastrar_CB_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CB_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cadastrar_CB_nomeActionPerformed

    private void Cadastrar_CB_funcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CB_funcaoActionPerformed
        String tipoDeFuncionario;
        tipoDeFuncionario = Cadastrar_CB_funcao.getSelectedItem().toString();
        switch(tipoDeFuncionario){
            case "MOTORISTA":
                Cadastrar_P_escala.setVisible(true);
                break;
            case "COBRADOR":
                Cadastrar_P_escala.setVisible(true);
                break;
            default:
                Cadastrar_P_escala.setVisible(false);
                break;
        }
    }//GEN-LAST:event_Cadastrar_CB_funcaoActionPerformed

    private void Cadastrar_BT_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_BT_atualizarActionPerformed
        int j=0;
        for(Component c: elementosPainelEscala){
            if(c instanceof JCheckBox && !((AbstractButton)c).getText().equals("Todos")){
                escala[j] = ((AbstractButton)c).isSelected();
                j+=1;
            }
        }
    }//GEN-LAST:event_Cadastrar_BT_atualizarActionPerformed

    private void Cadastrar_CB_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_CB_todosActionPerformed
        for(Component c: elementosPainelEscala){
            if( c instanceof JCheckBox && !((AbstractButton)c).getText().equals("Todos")){
                ((AbstractButton)c).setSelected(Cadastrar_CB_todos.isSelected());
            }
        }
    }//GEN-LAST:event_Cadastrar_CB_todosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenteLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenteLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenteLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenteLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenteLocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buscar;
    private javax.swing.JButton Buscar_BT_atualizar;
    private javax.swing.JButton Buscar_BT_buscar;
    private javax.swing.JButton Buscar_BT_descadastrar;
    private javax.swing.JButton Buscar_BT_limpar;
    private javax.swing.JTextField Buscar_CT_cpf;
    private javax.swing.JTextField Buscar_CT_idade;
    private javax.swing.JTextField Buscar_CT_nome;
    private javax.swing.JTextField Buscar_CT_salario;
    private javax.swing.JComboBox Buscar_CT_sexo;
    private javax.swing.JScrollPane Buscar_PN_info;
    private javax.swing.JLabel Buscar_nome_idade;
    private javax.swing.JLabel Buscar_nome_nome;
    private javax.swing.JLabel Buscar_nome_sexo;
    private javax.swing.JLabel Buscar_salario;
    private javax.swing.JButton Cadastrar_BT_Cadastrar;
    private javax.swing.JButton Cadastrar_BT_atualizar;
    private javax.swing.JButton Cadastrar_BT_limpar;
    private javax.swing.JCheckBox Cadastrar_CB_domingo;
    private javax.swing.JComboBox Cadastrar_CB_funcao;
    private javax.swing.JTextField Cadastrar_CB_nome;
    private javax.swing.JCheckBox Cadastrar_CB_quarta;
    private javax.swing.JCheckBox Cadastrar_CB_quinta;
    private javax.swing.JCheckBox Cadastrar_CB_sabado;
    private javax.swing.JCheckBox Cadastrar_CB_segunda;
    private javax.swing.JComboBox Cadastrar_CB_sexo;
    private javax.swing.JCheckBox Cadastrar_CB_sexta;
    private javax.swing.JCheckBox Cadastrar_CB_terca;
    private javax.swing.JCheckBox Cadastrar_CB_todos;
    private javax.swing.JTextField Cadastrar_CT_Salario;
    private javax.swing.JTextField Cadastrar_CT_cargaHoraria;
    private javax.swing.JTextField Cadastrar_CT_cpf;
    private javax.swing.JTextField Cadastrar_CT_ctps;
    private javax.swing.JPanel Cadastrar_P_escala;
    private javax.swing.JPanel Cadastro;
    private javax.swing.JLabel cargaHoraria;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel ctps;
    private javax.swing.JLabel funcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome_cpf;
    private javax.swing.JLabel salario;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
