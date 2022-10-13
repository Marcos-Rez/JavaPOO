import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produto> catalogo = new ArrayList<>();
    private Endereco endereco;

    public Restaurante() {
    }

    public Restaurante(long id, String nomeFantasia, String cnpj, Endereco endereco) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;ss                                                                awq
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", catalogo=" + catalogo +
                ", endereco=" + endereco +
                '}';
    }
}
