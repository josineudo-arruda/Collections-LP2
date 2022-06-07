import java.util.*;
/*
Código elaborado por:
- Felipe Gutierrez - SP3045021
- Jéssica Aguilar Raya Varella Mendes de Souza - SP3048144
- Josineudo das Chagas Arruda - SP3045439
- Sabrina Ramos dos Reis - SP3045544
*/

public class Aluno { // classe criada apenas para ser utilizada durante a execução da lista na main
  private String nome;
  private String curso;
  private String prontuario;
  private List<String> disciplinas; //O arrayList faz parte do List

  Aluno(String nome, String curso, String prontuario) {
    this.nome = nome;
    this.curso = curso;
    this.prontuario = prontuario;
    this.disciplinas = new ArrayList<String>();
  }

  public void adicionarDisciplina(String disciplina) {
    disciplinas.add(disciplina);
  }

  // inserir uma lista em outra lista

  public void adicionarDisciplinas(List<String> disciplinasNovas) {
    disciplinas.addAll(disciplinasNovas); // método do ArrayList
  }

  public void removerTodosElementos() {
    disciplinas.clear(); //método do List
  }

  public List<String> getDisciplinas() {
    return disciplinas;
  }

  public String toString() {
    return this.nome;
  }
  
  public String getCurso() {
    return this.curso;
  }

  public String getProntuario() {
    return this.prontuario;
  }

  public int getTamanho() {
    return disciplinas.size();
  }
}