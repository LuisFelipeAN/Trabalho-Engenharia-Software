/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author btd1337
 */

public class Main {

    /**
     *
     */
    public static ArrayList< Departamento > ListadeDepartamentos = new ArrayList< Departamento >();
    public static ArrayList< Professor > ListadeProfessores = new ArrayList< Professor >();
    public static ArrayList< Disciplina > ListadeDisciplina = new ArrayList< Disciplina >();
    public static CadastroDepartamento telaCadastroDepartamento = new CadastroDepartamento();
     public static CadastroProfessor telaCadastroProfessor = new CadastroProfessor();
      public static CadastroDisciplina telaCadastrDisciplina = new CadastroDisciplina();
     
     public static TelaMenu telaMenu = new TelaMenu();
     public static int opMenu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        do{
            exibeMenu();
            try{
                opMenu = scanner.nextInt();
                getOpcaoEscolhida(opMenu);
            }catch(InputMismatchException ex){
                System.out.println("Valor inválido!");
                opMenu = -1;
            }
            
        }while(opMenu != 0);
        
    }

    private static void exibeMenu() {
         telaMenu.setVisible(true);
         System.out.println("1 - Criar Departamento");
         System.out.println("2 - Listar Departamentos");
         System.out.println("3 - Criar Curso");
         System.out.println("4 - Listar Cursos");
         System.out.println("5 - Criar Professor");
         System.out.println("6 - Listar Professores");
         System.out.println("0 - Sair");
         System.out.print("Op: ");
    }

    private static void getOpcaoEscolhida(int opMenu) {
        switch(opMenu){
            case 1 : {
                telaCadastroDepartamento.setVisible(true);
             
                        
               // criaDepartamento();
                break;
            }
            case 2 : {
               // listaDepartamentos();
                break;
            }
            case 3 : {
               // criaCurso();
                break;
            }
            case 4 : {
                //listaCursos();
                break;
            }
            case 5 : {
             
                break;
            }
            case 6 : {
               // listaProfessores();
                break;
            }
            case 7 : {
               // criaDisciplina();
                break;
            }
            case 8 : {
                //listaDisciplinas();
                break;
            }
            case 9 : {
                //criaGrade();
                break;
            }
            case 10 : {
                //listaGrade();
                break;
            }
            case 0 : {
                System.out.println("\nSistema Encerrado!");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
            }
        }
    }
    
    /**
     *
     * @param novo
     */
    public static void criaDepartamento(Departamento novo)
    {
          
    }
    
}
