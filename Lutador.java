
package aula07poolutador;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Método construtor

    public Lutador(String no, String na, int id, float al, 
            float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        //this.peso = pe; O peso atualiza a categoria
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
         //Métodos especiais
    
    public void apresentar() {
        System.out.println("-------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " +  this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
    
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria()+ ".");
        System.out.println("Ganhou " + this.getVitorias() + " lutas.");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas.");
        System.out.println("Empatou " + this.getEmpates()+ " lutas.");
    }
    
    public void ganharLuta() {
            this.setVitorias(this.getVitorias() + 1);
    }
            
    public void perderLuta() {
            this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
            this.setEmpates(this.getEmpates() + 1);
    } 
        //Métodos Setters and Getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) { //Peso seliciona Categoria autom
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(/*String categoria*/) { //por isso apagamos o parâmetro
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
