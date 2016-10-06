/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Helper {
     public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
       } 
   public static void limpiartabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }
    public static void LetraB (JTable tabla1, JTable tabla2){
        int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
            aux = (int) tabla1.getValueAt(i, j);
             if (j==0||i==0 && j!=nc-1||i==nf/2 && j!=nc-1||i==nf-1 && j!=nc-1||j==nc-1 && i!=0 && i!=nf/2 && i!=nf-1){
              tabla2.setValueAt (aux,i,j);    
             }   
            }
 
        }
    }
    public static void LetraK (JTable tabla1,JTable tabla2){
        int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
              aux = (int) tabla1.getValueAt(i, j);
              if (j==0||nf/2-i==j-1||i-(j-1)==nf/2){
                  tabla2.setValueAt(aux,i,j);
              }
            }
        }
    }
    public static void LetraM (JTable tabla1, JTable tabla2){
        int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux=(int) tabla1.getValueAt(i,j);
                if ((j==0)||(j==nc-1)||(i == j && i + j <= nf)||(i + j == nf - 1 && i <= j)){
                  tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void LetraQ (JTable tabla1, JTable tabla2){
        int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
              aux = (int) tabla1.getValueAt(i, j);
              if ((i==0 && j!=0 && j!=nc-1)||(j==0 && i!=nc-1 && i!=0 && i!=nc-2)||(i==nc-2 && j!=0 && j!=nc-1)||(j==nc-1 && i!=0 && i!=nc-2)){
              tabla2.setValueAt(aux, i, j);    
              }
            }
  
        }
    }
    public static void LetraJ (JTable tabla1,JTable tabla2){
      int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
              aux = (int) tabla1.getValueAt(i, j);
              if ((i==0)||(j==0 && i!=1)||(j==nc/2)||(i == nf-1 && j<nc/2)){
              tabla2.setValueAt(aux, i, j);
              }
            }
  
        }  
    }
 
    public static void LetraW (JTable tabla1, JTable tabla2){
        int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
              aux = (int) tabla1.getValueAt(i, j);
              if (j==0||j==nc-1||nf / 2 > j && i == nc - 1||nf / 2 < j && i == nc - 1||j==nc/2 && i >= nf / 2 && i != nc - 1 ){
              tabla2.setValueAt(aux, i, j);
              }
            }
  
        }  
    }
   public static void LetraG (JTable tabla1, JTable tabla2){
       int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
             aux = (int) tabla1.getValueAt(i, j);
             if (i==0||j==0||i==nc/2+1||i==nc-1||(j==nc-1 && i>nf/2)||(j==nc-1 && i==1)){
              tabla2.setValueAt(aux, i, j);   
             }
            }
       }
   }
   public static void LetraR (JTable tabla1, JTable tabla2){
       int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i <nf; i++) {
         for (int j = 0; j <nc; j++) {
          aux = (int) tabla1.getValueAt(i, j);
            if (j==0||i==(nf/2)||i==0||(j==nc-1 && j/i>=2)||(i == j && i + j >= nf)){
             tabla2.setValueAt(aux, i, j);    
                }
            }

        }
    }
   public static void PrimeraFigura (JTable tabla1, JTable tabla2){
      int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
           aux = (int) tabla1.getValueAt(i, j);
if (i==0||(i==1 && j!=nc-1 && j!=0)||(i==2 && j!=nc-2 && j!=nc-1 && j!=1 && j!=0)||(i==3 && j!=nc-3 && j!=nc-1 && j!=2 && j!=0 && j!=nc-2 && j!=1)||(i==4 && j!=nc-4 && j!=nc-1 && j!=3 && j!=0 && j!=nc-3 && j!=1 && j!=2 && j!=nc-2)||((i >= j && nf - 1 - i <= j))){
            tabla2.setValueAt(aux, i, j);    
                }
            }
        }
    }

   public static void SegundaFigura (JTable tabla1, JTable tabla2){
      int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i <nf; i++) {
            for (int j = 0; j <nc; j++) {
            aux = (int) tabla1.getValueAt(i, j);
            if (j==0||(j==1 && i!=nf-1 && i!=0)||(j==2 && i!=nf-2 && i!=nc-1 && i!=1 && i!=0)||(j==3 && i!=nf-3 && i!=nf-1 && i!=2 && i!=0 && i!=nf-2 && i!=1)||(j==4 && i!=nf-4 && i!=nf-1 && i!=3 && i!=0 && i!=nc-3 && i!=1 && i!=2 && i!=nf-2)||j>=i && nc-1-j<= i){
             tabla2.setValueAt(aux, i, j);   
                }
            }
        }
    }
   public static void TerceraFigura (JTable tabla1, JTable tabla2){
      int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
           aux = (int) tabla1.getValueAt(i, j);
           if (j==nc/2||j==nc/2-1||i==nf/2||i==nf/2-1){
            tabla2.setValueAt(aux, i, j);    
                }
            }
        }

    }
   public static void CuartaFigura (JTable tabla1, JTable tabla2){
      int nf,nc,aux;
        
        nf=tabla1.getRowCount();
        nc=tabla1.getColumnCount();
        
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
           aux = (int) tabla1.getValueAt(i, j);
           if (nf/2-i==j||i-j==nf/2||(nf-i+nf/2-1==j)){
            tabla2.setValueAt(aux, i, j);    
                }
            }
        }

    }
   public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

}
