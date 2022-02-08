package Desafio;

public class Jogador {

    private String nome;
    private String posicao;
    private int dataDeNascimento;
    private int idade;
    private int aposentar;


    public int getAposentar() {
        return aposentar;
    }

    public void setAposentar(int aposentar) {
        this.aposentar = aposentar;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {

        this.dataDeNascimento = 1992;
        this.dataDeNascimento = dataDeNascimento;

    }

    public void calculaIdade(){

        this.idade =  2022 - 1992 ;

        System.out.println("o jogador possui  " +this.idade+ " anos");

    }

    public  int aposentarJogador(){


        this.aposentar =  35 -idade ;

        System.out.println("falta " +this.aposentar+ " anos para o jogador se aposentar");

        return  aposentar;

    }

}
