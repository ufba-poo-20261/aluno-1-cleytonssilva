package br.ufba.poo.lista2;

/**
 * Crie a classe `Aluno`, que possui os atributos `matricula` e `nome` (ambos do
 * tipo `String`), além dos métodos e construtores relevantes de acordo com a
 * seguinte especificação:
 *
 * - O nome do aluno pode ser alterado, mas nunca o seu número de matrícula
 * - O número de matrícula de um aluno deve poder ser acessado por outras partes
 * do programa
 * - Duas instâncias de `Aluno` são consideradas iguais se possuem o mesmo número
 * de matrícula
 *
 * Assuma, para este exercício, que a classe `Aluno` sempre será instanciada com um
 * número de matrícula e um nome válidos, passados nessa ordem.
 */
public class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome =  nome; 
    }
    
    public boolean equals(Object a) {
    Aluno comparaAluno = (Aluno)a;
    return matricula.equals(comparaAluno.matricula);
    }
    
    public String getMatricula(){
        return matricula;
    }


    public String getNome(){
        return nome;
    }
    
    
    public void setNome(String nomeAlterar){
        this.nome = nomeAlterar;
        
    }

    public static void main(String[] args) {
        Aluno aluno =  new Aluno("412165","Samuel");
        System.err.println(aluno.getMatricula());
        
        Aluno aluno2 = new Aluno("412165", "mateus");
        System.err.println(aluno.equals(aluno2));
    }

         
}

