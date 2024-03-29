package Cadastro;

public class PessoaJuridica extends Pessoas {
    private String cnpj;
    private Long incricaoEstatual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getIncricaoEstatual() {
        return incricaoEstatual;
    }

    public void setIncricaoEstatual(Long incricaoEstatual) {
        this.incricaoEstatual = incricaoEstatual;
    }
}
