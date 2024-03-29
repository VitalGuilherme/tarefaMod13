package Cadastro;

public class Programa {

    public static void main(String args []) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Francisco Pereira");
        pessoaFisica.setCpf("568.078.998-80");
        pessoaFisica.setRg("52987356-0");
        pessoaFisica.setEndereço("Avenida 10");
        pessoaFisica.setFone("(12) 9458-5582");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Aéreos Internacional");
        pessoaJuridica.setCnpj("25.896.788/0002-54");
        pessoaJuridica.setIncricaoEstatual(Long.valueOf(578964855234L));
        pessoaJuridica.setEndereço("Rua 13");
        pessoaJuridica.setFone("(88) 4899-5582");
        imprimir(pessoaJuridica);
    }
        public static void imprimir (Pessoas pessoas) {
            System.out.println("\n" + pessoas.getNome() + "\n" + pessoas.getEndereço() + "\n" + pessoas.getFone());
            if (pessoas instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoas;
                System.out.println("Cpf: " + pf.getCpf() + "\n" + "Rg: " + pf.getRg());
            }else if (pessoas instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoas;
                System.out.println("Cnpj: " + pj.getCnpj() + "\n" + "Inscrição Estatual : " + pj.getIncricaoEstatual());
            }
        }
}
