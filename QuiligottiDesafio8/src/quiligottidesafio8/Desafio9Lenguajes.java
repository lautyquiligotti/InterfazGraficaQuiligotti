package quiligottidesafio8;

import javax.swing.ListSelectionModel;

public class Desafio9Lenguajes extends javax.swing.JFrame {

    public Desafio9Lenguajes() {
        initComponents();

        // Selección simple
        ListLenguajes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Doble clic = mostrar mensaje
        ListLenguajes.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 2) {
                    String lang = ListLenguajes.getSelectedValue();
                    if (lang == null) return;

                    String msg;
                    switch (lang) {
                        case "Java":
                            msg = "Orientado a objetos. Corre en la JVM.";
                            break;
                        case "Python":
                            msg = "Sintaxis simple. Multipropósito y muy usado en data.";
                            break;
                        case "C++":
                            msg = "Compilado y muy rápido. Usado en sistemas y videojuegos.";
                            break;
                        case "JavaScript":
                            msg = "Lenguaje de la web. Navegador y Node.js.";
                            break;
                        default:
                            msg = "Sin info.";
                    }

                    javax.swing.JOptionPane.showMessageDialog(
                        Desafio9Lenguajes.this, msg, lang,
                        javax.swing.JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListLenguajes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListLenguajes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Java", "Python", "C++", "JavaScript" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListLenguajes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListLenguajes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Desafio9Lenguajes().setVisible(true));
    }
}
