package utp.misiontic2022.c2.g39.reto5.view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import utp.misiontic2022.c2.g39.reto5.controller.*;
import utp.misiontic2022.c2.g39.reto5.model.vo.*;

/**
 * @author JEHM - edhernandez65@hotmail.com
 */
public class FrmConsultas extends javax.swing.JFrame {
    // ATRIBUTOS DEL FORMULARIO
    private final Color BG_COLOR = new Color(0, 155, 169, 255);
    private final Color BUTTON_COLOR = Color.BLUE;
    private final Color FONT_COLOR = new Color(0, 248, 248, 255);
    private final Color PANEL_COLOR = new Color(2, 129, 105, 255);
    private final Font fuente = new Font("Verdana", Font.BOLD, 12);
 
    private Container _contenedor;
    private ControllerRequerimientos _controlador;
    private JTable datosTabla;
    private String columnas[];
    // CONSTRUCTOR DEL FORMULARIO
    public FrmConsultas() {
        inicializarComponentes();
        _contenedor = getContentPane();
        _controlador = new ControllerRequerimientos();
        crearVentana();
    }
    // METODOS DEL FORMULARIO
    private void obtenerDatosCompras() {
        try {
            ArrayList<Requerimiento_1> compras = new ArrayList<Requerimiento_1>();
            compras = _controlador.consultaRequerimiento_1();
            DefaultTableModel modelo = new DefaultTableModel();
            Object datosFila[] = new Object[5];
            columnas = new String[] { "FECHA", "PROVEEDOR", "CODIGO", "PAGADO ?", "CANTIDAD" };
            modelo.setColumnIdentifiers(columnas);

            for (int i = 0; i < compras.size(); i++) {
                datosFila[0] = compras.get(i).getFechaCompra();
                datosFila[1] = compras.get(i).getNombreProveedor();
                datosFila[2] = compras.get(i).getCodCompra();
                datosFila[3] = compras.get(i).getPagado();
                datosFila[4] = compras.get(i).getCantidad();
                modelo.addRow(datosFila);
            }

            datosTabla.setModel(modelo);
            _contenedor.getComponent(1).setVisible(true);
        } catch (Exception e) {
            System.err.println("Error SQL en FrmConsultas para requerimiento 1" + e.getMessage());
        }
    }

    private void obtenerDatosLideres() {
        try {
            ArrayList<Requerimiento_3> lideres = new ArrayList<Requerimiento_3>();
            lideres = _controlador.consultaRequerimiento_3();
            DefaultTableModel modelo = new DefaultTableModel();
            Object datosFila[] = new Object[5];
            columnas = new String[] { "ABREV.","NOMBRE", "APELLIDO", "ID", "SALARIO" };
            modelo.setColumnIdentifiers(columnas);

            for (int i = 0; i < lideres.size(); i++) {
                datosFila[0] = lideres.get(i).getAbrevLider();
                datosFila[1] = lideres.get(i).getNombreLider();
                datosFila[2] = lideres.get(i).getApellidoLider();
                datosFila[3] = lideres.get(i).getIdLider();
                datosFila[4] = lideres.get(i).getSalarioLider();
                modelo.addRow(datosFila);
            }

            datosTabla.setModel(modelo);
            _contenedor.getComponent(1).setVisible(true);
        } catch (Exception e) {
            System.err.println("Error en consulta de requerimiento 3" + e.getMessage());
        }
    }

    private void obtenerDatosProyectos() {
        try {
            ArrayList<Requerimiento_2> proyectos = new ArrayList<Requerimiento_2>();
            proyectos = _controlador.consultaRequerimiento_2();
            DefaultTableModel modelo = new DefaultTableModel();
            Object datosFila[] = new Object[5];
            columnas = new String[] { "FECHA", "CIUDAD", "CONSTRUCTORA", "LIDER", "ESTRATO" };
            modelo.setColumnIdentifiers(columnas);

            for (int i = 0; i < proyectos.size(); i++) {
                datosFila[0] = proyectos.get(i).getFecIni();
                datosFila[1] = proyectos.get(i).getNombreCiudad();
                datosFila[2] = proyectos.get(i).getNomConstructora();
                datosFila[3] = proyectos.get(i).getNombreLider();
                datosFila[4] = proyectos.get(i).getEstrato();
                modelo.addRow(datosFila);
            }

            datosTabla.setModel(modelo);
            _contenedor.getComponent(1).setVisible(true);
        } catch (Exception e) {
            System.err.println("Error en consulta de requerimiento 2" + e.getMessage());
        }
    }
     
    private void lanzarBuscadorProyectos() {                                      
        new FrmRequerimientosBusqueda().setVisible(true);
    } 

    private JPanel crearPanelSuperior() {
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelSuperior.setName("Encabezado");
        panelSuperior.setBackground(PANEL_COLOR);

        JButton botonCompras = new JButton("CONSULTA 1 - COMPRAS");
        botonCompras.setBackground(BUTTON_COLOR);
        botonCompras.setFont(fuente);
        botonCompras.setForeground(FONT_COLOR);
        botonCompras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obtenerDatosCompras();
            }
        });

        JButton botonProyectos = new JButton("CONSULTA 2 - PROYECTOS");
        botonProyectos.setBackground(BUTTON_COLOR);
        botonProyectos.setFont(fuente);
        botonProyectos.setForeground(FONT_COLOR);
        botonProyectos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obtenerDatosProyectos();
            }
        });

        JButton botonLideres = new JButton("CONSULTA 3 - LIDERES");
        botonLideres.setBackground(BUTTON_COLOR);
        botonLideres.setFont(fuente);
        botonLideres.setForeground(FONT_COLOR);
        botonLideres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                obtenerDatosLideres();
            }
        });

        JButton botonBuscador = new JButton("BUSCADOR DE PROYECTOS");
        botonBuscador.setBackground(BUTTON_COLOR);
        botonBuscador.setFont(fuente);
        botonBuscador.setForeground(FONT_COLOR);
        botonBuscador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lanzarBuscadorProyectos();
            }
        });
        
        panelSuperior.add(botonCompras);
        panelSuperior.add(botonProyectos);
        panelSuperior.add(botonLideres);
        panelSuperior.add(botonBuscador);
        return panelSuperior;
    }    
    
    @SuppressWarnings("unchecked")    
    private void inicializarComponentes(){
        setTitle("I & M CONSTRUCTORA | PRESENTACION EN MODO GUI DEL INFORME DE CONSULTAS A LA BD DEL CONSORCIO | INFORMACION ACTUALIZADA HASTA 16/8/2021");    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();      
    }
    
    private JPanel crearPanelCentral() {
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BoxLayout(panelCentral, BoxLayout.Y_AXIS));
        panelCentral.setName("Content");
        panelCentral.setPreferredSize(new Dimension(500, 500));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panelCentral.setBackground(BG_COLOR);

        Object datos[][] = new Object[0][0];
        columnas = new String[] { "", "", "", "", "" };
        datosTabla = new JTable(datos, columnas);
        datosTabla.setGridColor(Color.lightGray);
        datosTabla.setAutoResizeMode(5);
        datosTabla.setEnabled(false);

        JTableHeader encabezado = datosTabla.getTableHeader();
        encabezado.setFont(new Font("Verdana", Font.BOLD, 12));
        encabezado.setForeground(Color.white);
        encabezado.setBackground(PANEL_COLOR);

        JScrollPane deslizador = new JScrollPane(datosTabla);
        deslizador.setPreferredSize(new Dimension(500, 450));
        deslizador.setBackground(BG_COLOR);

        JButton botonRefresco = new JButton("REFRESCAR");
        botonRefresco.setBackground(new Color(236, 115, 7, 255));
        botonRefresco.setFont(fuente);
        botonRefresco.setForeground(FONT_COLOR);
        botonRefresco.setAlignmentX(LEFT_ALIGNMENT);
        botonRefresco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                _contenedor.getComponent(1).setVisible(false);
            }
        });

        panelCentral.add(deslizador, BorderLayout.CENTER);
        panelCentral.add(Box.createRigidArea(new Dimension(0, 20)));
        panelCentral.add(botonRefresco, BorderLayout.SOUTH);
        panelCentral.setVisible(false);
        return panelCentral;
    }

    private JPanel crearPanelInferior() {
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.setName("Footer");
        panelInferior.setBackground(PANEL_COLOR);
        JLabel autor = new JLabel(" MISION TIC 2022 – UTP | PROGRAMACION CICLO 2 | GRUPO 39 | RETO 5 | POR: JORGE HERNANDEZ | PROFESOR: ISRAEL ARBONA | AÑO: 2021 ");
        autor.setFont(new Font("Verdana", Font.BOLD, 11));
        autor.setForeground(FONT_COLOR);
        panelInferior.add(autor);
        return panelInferior;
    }
   
    private void crearVentana() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();        
        int largo = 1000;
        int alto = 600;
        int xPos = (int) size.getWidth() / 2 - largo / 2;
        int yPos = (int) size.getHeight() / 2 - alto / 2;
        setBounds(xPos, yPos, largo, alto);
       
        _contenedor.setBackground(BG_COLOR);
        _contenedor.add(crearPanelSuperior(), BorderLayout.NORTH);
        _contenedor.add(crearPanelCentral(), BorderLayout.CENTER);
        _contenedor.add(crearPanelInferior(), BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    

