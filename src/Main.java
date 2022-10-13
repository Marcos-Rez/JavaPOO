public class Main {
    public static void main(String[] args) {
        Endereco enderecoRestauranteMarcos = new Endereco();
        Restaurante restaurante2 = new Restaurante();
        enderecoRestauranteMarcos.setCep("66635000");
        enderecoRestauranteMarcos.setComplemento("Rua dos Louros");
        restaurante2.setEndereco(enderecoRestauranteMarcos);
        restaurante2.setCnpj("000000-00");
        restaurante2.setId(2L);
        restaurante2.setNomeFantasia("Restaurante do Naruto Lamem");
        System.out.println(restaurante2);

        Endereco enderecoRestauranteCami = new Endereco("66635000", "Rua dos Louros");
        Restaurante restaurante1 = new Restaurante();
        restaurante1.setId(1L);
        restaurante1.setNomeFantasia("Restaurante da Cami");
        restaurante1.setCnpj("0000001-11");
        restaurante1.setEndereco(enderecoRestauranteCami);
        System.out.println(restaurante1.toString());
    }
}