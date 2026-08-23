import controller.*;
import java.util.ArrayList;
import java.util.List;
import model.*;
import repository.*;

public class Main {

    public static void main(String[] args) {

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Cliente ===");

        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        nomeCliente = "joao";
        cpf = "123.456.789-00";
        email = "joao@email.com";   

        Cliente cliente = new Cliente(nomeCliente, cpf, email);
        
        */


        Cliente cliente = new Cliente("Joao", "123.456.789-00", "joao@email.com");

         /*
        // se a classe nao tivesse construtor, poderia instanciar assim: (depois que esses atributos foram encapsulados, nao é mais possivel fazer isso)
        Cliente cliente = new Cliente();

        cliente.nome = "joao";
        cliente.cpf = "123.456.789-00";
        cliente.email = "joao@email.com";
         */
      


        System.out.println();

        /*

        System.out.println("=== Cadastro de Produto ===");

        System.out.print("Produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nomeProduto, preco, quantidade);
        */

        Produto notebook = new Produto("Notebook", 3.500, 2);
        Produto mouse = new Produto("Mouse", 100, 5);
        Produto teclado = new Produto("Teclado", 200, 3);

        cliente.setNome("Carlos");

        notebook.setPreco(4200);


        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(notebook);
        carrinho.adicionarProduto(mouse);
        carrinho.adicionarProduto(teclado);
        /////////////////////////////////////////////////////
      
        System.out.println();

        cliente.exibirInformacoes();

        System.out.println();

        notebook.exibirProduto();

        System.out.println();

        carrinho.listarProdutos();

        //scanner.close();

        ///////
        System.out.println("Quantidade de produtos: " + carrinho.quantidadeProdutos());

        System.out.println();

        carrinho.removerProduto(mouse);

        System.out.println("Apos remover o mouse:");

        carrinho.listarProdutos();

        System.out.println("Quantidade de produtos: " + carrinho.quantidadeProdutos());

        ///////
        cliente.getCarrinho().adicionarProduto(notebook);

        cliente.getCarrinho().adicionarProduto(mouse);

        cliente.getCarrinho().adicionarProduto(teclado);

        cliente.exibirInformacoes();

        System.out.println();

        cliente.getCarrinho().listarProdutos();

        ///
        
        cliente.adicionarProdutoAoCarrinho(notebook);

        cliente.adicionarProdutoAoCarrinho(mouse);

        cliente.adicionarProdutoAoCarrinho(teclado);

        cliente.exibirInformacoes();

        System.out.println();

        cliente.listarCarrinho();

         ///
         
        Pedido pedido = new Pedido();

        pedido.adicionarItem(notebook,2);

        pedido.adicionarItem(mouse,3);

        pedido.adicionarItem(teclado,1);

        pedido.listarPedido();

        /////////
        Funcionario funcionario = new Funcionario("Maria","11111111111","maria@loja.com",3000);

        Administrador admin = new Administrador("Carlos","22222222222","admin@loja.com",7000);

        System.out.println("===== CLIENTE =====");

        cliente.exibirInformacoes();

        System.out.println();

        System.out.println("===== FUNCIONÁRIO =====");

        funcionario.exibirInformacoes();

        funcionario.trabalhar();

        System.out.println();

        System.out.println("===== ADMINISTRADOR =====");

        admin.exibirInformacoes();

        admin.trabalhar();

        admin.aprovarDesconto();

        ////////////////
       
        Vendedor vendedor = new Vendedor("José", "333","jose@email.com", 2500,10000);

        System.out.println(funcionario.calcularSalario());

        System.out.println(admin.calcularSalario());

        System.out.println(vendedor.calcularSalario());

        ////
       
        Funcionario funcionarios = new Administrador("Carlos","222","admin@email.com",7000);

        System.out.println(funcionarios.calcularSalario());

        ///
        
        Pix pix = new Pix();
        pix.pagar(350);


        //

        Pagamento pagamento;

        pagamento = new Pix();
        pagamento.pagar(500);

        pagamento = new CartaoCredito();
        pagamento.pagar(500);

        pagamento = new Boleto();
        pagamento.pagar(500);

        //

        System.out.println("PIX");

        pedido.finalizarPedido(new Pix());

        System.out.println();

        System.out.println("CARTÃO");

        pedido.finalizarPedido(new CartaoCredito());

        System.out.println();

        System.out.println("BOLETO");

        pedido.finalizarPedido(new Boleto());

        //

        Pessoa pessoa1 = new Cliente("João","111","joao@email.com");

        Pessoa pessoa2 =new Administrador("Carlos","222","carlos@email.com",7000);

        Pessoa pessoa3 =new Vendedor("Maria","333","maria@email.com",2500,10000);

        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
        pessoa3.exibirInformacoes();

        //

        Cliente joao = new Cliente("João", "11111111111", "joao@email.com");

        Cliente maria = new Cliente( "Maria","22222222222","maria@email.com");

        Cliente carlos =new Cliente("Carlos","33333333333","carlos@email.com");

        GerenciadorClientes gerenciador =new GerenciadorClientes();

        gerenciador.adicionarCliente(joao);

        gerenciador.adicionarCliente(maria);

        gerenciador.adicionarCliente(carlos);

        gerenciador.listarClientes();

        ///
        
   
        
        Produto notebook1 = new Produto("Notebook",3500,10);

        Produto notebook2 =new Produto( "Notebook",3500,10);

        
        carrinho.adicionarProduto(notebook1);
        carrinho.adicionarProduto(notebook2);
        //notebook1.equals(notebook2);
        System.out.println(notebook1.equals(notebook2));

        ///
        
  

        Cliente clienteEncontrado = gerenciador.buscarClientePorCpf( "11111111111");

        if (clienteEncontrado != null) {

            clienteEncontrado.exibirInformacoes();

        }

       ///
       List<Cliente> clientes = new ArrayList<>();

       Cliente cliente1 = new Cliente("Bart", "4745", "bart@emial");
       Cliente cliente2 = new Cliente("Lisa", "47999", "lisa@emial");


       clientes.add(cliente1);
       clientes.add(cliente2);

    //

        Produto notebook5 =new Produto("Notebook",3500,10);

        Caixa<Produto> caixaProduto = new Caixa<>(notebook5);

        Produto produto =caixaProduto.getObjeto();

        System.out.println("Produto: " + produto);


        Cliente cliente9 = new Cliente("João","111","joao@email.com");

        Caixa<Cliente> caixaCliente = new Caixa<>(cliente9);

        Cliente clienteRecuperado = caixaCliente.getObjeto();

        System.out.println("Cliente: " +  clienteRecuperado);


        Caixa<Pedido> caixaPedido =new Caixa<>(pedido);

        Pedido pedidoRecuperado = caixaPedido.getObjeto();

        //

        //

        List<Produto> produtos = new ArrayList<>();

        Produto primeiroProduto = Util.primeiro(produtos);

        List<Cliente> clientess = new ArrayList<>();

        Cliente primeiroCliente = Util.primeiro(clientess);

        List<Pedido> pedidos = new ArrayList<>();

        Pedido primeiroPedido = Util.primeiro(pedidos);

        //

        GerenciadorGenerico<Produto> produtoss = new GerenciadorGenerico<>();

        produtoss.adicionar(notebook);

        produtoss.adicionar(mouse);

        GerenciadorGenerico<Cliente> clientesss = new GerenciadorGenerico<>();

        clientesss.adicionar(cliente1);

        clientesss.adicionar(cliente2);

    }

}
