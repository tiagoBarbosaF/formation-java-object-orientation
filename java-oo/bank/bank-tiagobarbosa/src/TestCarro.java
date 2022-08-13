import model.Carro;

public class TestCarro {
    public static void main(String[] args) {
        Carro brasilia = new Carro(1800, null, 0);

        System.out.println(brasilia.getAno());
        System.out.println(brasilia.getModelo());
        System.out.println(brasilia.getPreco());
        System.out.println(Carro.getTotalCarros());
    }
}
