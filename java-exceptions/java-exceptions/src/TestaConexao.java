public class TestaConexao {
    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception e) {
            System.out.println("Exception: erro na conexão.");
            e.printStackTrace();
        }

        //        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        } catch (IllegalStateException e) {
//            System.out.println("Exception: erro na conexão.");
//            e.printStackTrace();
//        } finally {
//            assert conexao != null;
//            conexao.fecha();
//        }
    }
}
