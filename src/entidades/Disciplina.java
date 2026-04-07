package entidades;

import java.util.ArrayList;

public class Disciplina {
    private String codigo; 
    private String nome;
    private ArrayList<Aluno>ListaDeAlunos = new ArrayList<>();

    public Disciplina(String codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
            "codigo='" + codigo + '\'' +
            ", nome='" + nome + '\'' +
            '}';
    }

    public void addAluno (Aluno Aluno){
        ListaDeAlunos.add(Aluno);
    }

    public ArrayList<Aluno> mostraAprovados(){
        ArrayList<Aluno>ListaDeAprovados = new ArrayList<>();
        for (Aluno obj: ListaDeAlunos){
            if (obj.calcularMedia()>=7){
                ListaDeAprovados.add(obj);
            }
        }
        return ListaDeAprovados;
    }

    public Aluno acharMelhor(){
        Aluno melhor = ListaDeAlunos.get(0);
        for(Aluno obj: ListaDeAlunos){
            if (melhor.calcularMedia()<obj.calcularMedia()){
                melhor=obj;
            }       
        }
        return melhor; 
    }


    
}
