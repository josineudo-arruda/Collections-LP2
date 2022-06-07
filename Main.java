import java.util.*;

/*
Código elaborado por:
- Felipe Gutierrez - SP3045021
- Jéssica Aguilar Raya Varella Mendes de Souza - SP3048144
- Josineudo das Chagas Arruda - SP3045439
- Sabrina Ramos dos Reis - SP3045544
*/

public class Main {

  public static void main(String args[]) {
    // Aplicação de ArrayList

    System.out.println("\n---------ArrayList--------\n");
    
    Aluno aluno1 = new Aluno("Isabella Gomes", "Mecânica", "SP3475130");

    aluno1.adicionarDisciplina("Física Aplicada"); 
    aluno1.adicionarDisciplina("Matemática Técnica");
    aluno1.adicionarDisciplina("Manufatura Assistida");
    aluno1.adicionarDisciplina("Desenho Técnico");

    System.out.println("Inserção do aluno 1\n");
    
    Aluno aluno2 = new Aluno("Felipe Gutierrez", "Informática", "SP3045021");

    aluno2.adicionarDisciplina("Lógica 2");
    aluno2.adicionarDisciplina("Aplicação de Web");
    aluno2.adicionarDisciplina("Tópicos profissionais");

    System.out.println("Inserção do aluno 2\n");
    
    Aluno aluno3 = new Aluno("Léo Motta", "Eletrônica", "SP4576885");

    aluno3.adicionarDisciplina("Física Aplicada");
    aluno3.adicionarDisciplina("Eletricidade");
    aluno3.adicionarDisciplina("Circuitos");

    System.out.println("Inserção do aluno 3\n");
    
    Aluno aluno4 = new Aluno("Clarice Motta", "Eletrônica", "SP4576885");

    aluno4.adicionarDisciplina("Física Aplicada");
    aluno4.adicionarDisciplina("Eletricidade");
    aluno4.adicionarDisciplina("Circuitos");
    aluno4.adicionarDisciplina("Desenho");

    System.out.println("Inserção do aluno 4\n");
    
    Aluno aluno5 = new Aluno("Matheus Raya", "Informática", "SP5823078");

    aluno5.adicionarDisciplina("Lógica 1");
    aluno5.adicionarDisciplina("Lógica 3");
    aluno5.adicionarDisciplina("Banco de dados");
    aluno5.adicionarDisciplinas(aluno1.getDisciplinas());

    System.out.println("Inserção do aluno 5");

    // Aplicação do Map

    System.out.println("\n-----------Mapa------------\n");
    
    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

    mapa.put("Isabella Gomes", aluno1);
    mapa.put("Felipe Gutierrez", aluno2);
    mapa.put("Léo Motta", aluno3);
    mapa.put("Clarice Motta", aluno4);
    mapa.put("Matheus Raya", aluno5);
    System.out.println("Alunos em ordem alfabética:\n");
    System.out.println(mapa);

    // Aplicação do Collection

    System.out.println("\n---------Collection--------\n");

    System.out.println("Alunos e suas informações:");

    Collection<Aluno> alunos = mapa.values(); //mapa é usado como parâmetro
    
    for (Aluno aluno : alunos) {
      System.out.println("\n---------------------------\n");
      System.out.println(aluno);
      System.out.println(aluno.getCurso());
      System.out.println(aluno.getProntuario());
    }

    System.out.println("\n---------------------------\n");
    while(alunos.iterator().hasNext()) {
      if(alunos.contains(aluno1))
        alunos.remove(aluno1);
      break;
    }
    System.out.printf("Elemento removido da coleção: "+ aluno1.toString());
    System.out.printf("\nO elemento "+ aluno1.toString() +" existe da coleção? resposta:"+ ((alunos.contains(aluno1)?"sim":"não")));

    // Aplicação do Iterator

    System.out.println("\n\n---------Iterator----------\n");
    
    System.out.print("Disciplinas da aluna " +aluno1.toString() +": "); 
    Iterator itr = aluno1.getDisciplinas().iterator();
    mostrarDisciplinas(itr, aluno1);

    System.out.println("\n---------------------------\n");

    System.out.print("Disciplinas do aluno " +aluno2.toString() +": ");
    Iterator itr2 = aluno2.getDisciplinas().iterator();
    mostrarDisciplinas(itr2, aluno2);

    System.out.println("\n---------------------------\n");

    System.out.print("Disciplinas do aluno " +aluno3.toString() +": ");
    Iterator itr3 = aluno3.getDisciplinas().iterator();
    mostrarDisciplinas(itr3, aluno3);

    System.out.println("\n---------------------------\n");

    System.out.print("Disciplinas da aluna " +aluno4.toString() +": ");
    Iterator itr4 = aluno4.getDisciplinas().iterator();
    mostrarDisciplinas(itr4, aluno4);

    System.out.println("\n---------------------------\n");

    System.out.print("Disciplinas do aluno " +aluno5.toString() +": ");
    Iterator itr5 = aluno5.getDisciplinas().iterator();
    mostrarDisciplinas(itr5, aluno5);
    
    System.out.println("\n---------------------------\n");
  }

  public static void mostrarDisciplinas(Iterator itr, Aluno aluno){
    for(var i = aluno.getTamanho(); i > 0; i--) {
      var elemento = itr.next();
      if(itr.hasNext()){
        if(i == 2)
          System.out.print(elemento + " e ");
        else
          System.out.print(elemento + ", ");
      } else {
        System.out.print(elemento + ".\n");
      }
    }
  }
}