import java.util.ArrayList;
void main() {
    class Pessoa{
        String nome;
        int idade;

        public Pessoa(String nome,int idade){
            this.nome = nome;
            this.idade = idade;
            ArrayList<Pessoa> lista = new ArrayList<>();

            //CREATE
            lista.add(new Pessoa("Igor Antoni Gonçalves de Souza",17));
            lista.add(new Pessoa("Amigao",17));
            lista.add(new Pessoa("alterador",17));

            //READ
            for(Pessoa p : lista){
                System.out.println(p.nome+"-"+p.idade);
            }
            //UPDATE
            lista.get(3).nome = "Joao silva";
            //DELETE
            lista.remove(3);
            //Exibiçao do CRUD
            System.out.println("\nDepois das alterações:");
            for (Pessoa p : lista) {
                System.out.println(p.nome + " - " + p.idade);
            }
        }
    }
}