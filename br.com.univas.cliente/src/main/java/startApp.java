import java.util.Scanner;

import java.util.Date;
import br.com.univas.cliente.modelCliente.Cliente;
import br.com.univas.cliente.modelCliente.ClienteDAO;
import br.com.univas.cliente.modelDetalheCliente.DetalheCliente;
import br.com.univas.cliente.modelDetalheCliente.DetalheClienteDAO;
import br.com.univas.cliente.modelPedidos.Pedidos;
import br.com.univas.cliente.modelPedidos.PedidosDAO;

public class startApp {

	public static void main(String[] args) {

		DetalheCliente detalhes = new DetalheCliente();
		Pedidos pedido = new Pedidos();
		Scanner ler = new Scanner(System.in);

		int opcao = 0;
		int opcao2 = 0;

		System.out.println("\n");
		System.out.println("-------------- Bancos de Dados Clientes --------------");
		System.out.println("\n");
		System.out.println("Escolhe uma das op??es abaixo para ajudar em seu trabalho:");
		System.out.println("\n");

		do {

			System.out.println("1 - Cliente");
			System.out.println("2 - Detalhes do Cliente");
			System.out.println("3 - Pedidos");
			System.out.println("0 - sair");

			opcao = ler.nextInt();
			System.out.printf("\n");

			// Cliente
			if (opcao == 1) {

				System.out.println("1 - Cadastrar cliente");
				System.out.println("2 - Listar clientes");
				System.out.println("3 - Atualizar cliente");
				System.out.println("4 - Deletar cliente");
				System.out.println("");

				opcao2 = ler.nextInt();

				if (opcao2 == 1) {

					Cliente cliente = new Cliente();
					String nome;

					System.out.printf("\n");
					System.out.println("Informe o nome do cliente:");
					cliente.setNome(nome = ler.next());
					cliente.setDataCadastro(new Date());

					ClienteDAO.getInstance().createCliente(cliente);

					System.out.printf("\n");
					System.out.println("Cadastro com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 2) {
					int id;

					System.out.println("Informe o id do cliente:");
					id = ler.nextInt();

					Cliente cliente = ClienteDAO.getInstance().getById(id);

					System.out.printf("\n");
					System.out.println("Nome cliente: " + cliente.getNome());
					System.out.println("Data do cadastro do cliente: " + cliente.getClass());
					System.out.printf("\n");

				}

				if (opcao2 == 3) {

					int id;
					String nome;
					String data_nascimento;

					System.out.println("Informe o id do cliente:");
					id = ler.nextInt();

					Cliente cliente = ClienteDAO.getInstance().getById(id);

					System.out.println("Digite o nome para altera??o:");
					cliente.setNome(nome = ler.next());
					cliente.setDataCadastro(new Date());

					ClienteDAO.getInstance().updateCliente(cliente);

					System.out.printf("\n");
					System.out.println("Alterado com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 4) {

					int id;

					System.out.println("Informe o id do cliente a ser exclu?do:");
					id = ler.nextInt();

					Cliente cliente = ClienteDAO.getInstance().getById(id);

					ClienteDAO.getInstance().deleteCliente(cliente);

					System.out.println("Exclu?do com sucesso!");
				}

			}

			// Detalhes Cliente
			if (opcao == 2) {

				System.out.println("1 - Cadastrar algum detalhe do cliente");
				System.out.println("2 - Listar detalhes do cliente");
				System.out.println("3 - Atualizar detalhes do cliente");
				System.out.println("4 - Deletar detalhes cliente");
				System.out.println("");

				opcao2 = ler.nextInt();

				if (opcao2 == 1) {

					DetalheCliente detalhe = new DetalheCliente();
					String nome;
					String data_nascimento;
					int idade;
					String cidade;
					String endereco;

					System.out.printf("\n");
					System.out.println("Informe o nome do cliente a ser detalhado:");
					detalhe.setNome(nome = ler.next());
					System.out.println("Informe a idade:");
					detalhe.setIdade(idade = ler.nextInt());
					System.out.println("Informe a cidade:");
					detalhe.setCidade(cidade = ler.next());
					System.out.println("Informe o endereco:");
					detalhe.setEndereco(endereco = ler.next());
					detalhe.setDataCadastro(new Date());

					DetalheClienteDAO.getInstance().createDetalheCliente(detalhe);

					System.out.printf("\n");
					System.out.println("Cadastro com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 2) {
					int id;

					System.out.println("Informe o id do cliente  detalhes:");
					id = ler.nextInt();

					DetalheCliente detalhe = DetalheClienteDAO.getInstance().getById(id);

					System.out.printf("\n");
					System.out.println("Nome: " + detalhe.getNome());
					System.out.println("Idade: " + detalhe.getIdade());
					System.out.println("Cidade: " + detalhe.getCidade());
					System.out.println("Endereco: " + detalhe.getEndereco());
					System.out.println("Data de cadastro dos detalhes do cliente: " + detalhe.getDataCadastro());
					System.out.printf("\n");

				}

				if (opcao2 == 3) {

					int id;
					String nome;
					String data_nascimento;
					int idade;
					String cidade;
					String endereco;

					System.out.println("Informe o id do cliente  detalhes:");
					id = ler.nextInt();

					DetalheCliente detalhe = DetalheClienteDAO.getInstance().getById(id);

					System.out.println("Digite o nome para altera??o:");
					detalhe.setNome(nome = ler.next());
					System.out.println("Digite a idade para altera??o:");
					detalhe.setIdade(idade = ler.nextInt());
					System.out.println("Digite a cidade para altera??o:");
					detalhe.setCidade(cidade = ler.next());
					System.out.println("Digite o endereco para altera??o:");
					detalhe.setEndereco(endereco = ler.next());
					detalhe.setDataCadastro(new Date());
					DetalheClienteDAO.getInstance().updateCliente(detalhe);

					System.out.printf("\n");
					System.out.println("Alterado com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 4) {

					int id;

					System.out.println("Informe o id do cliente detlhado a ser exclu?do:");
					id = ler.nextInt();

					DetalheCliente detalhe = DetalheClienteDAO.getInstance().getById(id);

					DetalheClienteDAO.getInstance().deleteCliente(detalhe);

					System.out.println("Exclu?do com sucesso!");
				}

			}

			// Pedidos
			if (opcao == 3) {

				System.out.println("1 - Cadastrar pedido:");
				System.out.println("2 - Listar pedidos");
				System.out.println("3 - Atualizar pedidos");
				System.out.println("4 - Deletar pedido");
				System.out.println("");

				opcao2 = ler.nextInt();

				if (opcao2 == 1) {

					Pedidos pedidos = new Pedidos();
					String nome;
					String data_pedido;
					int quantidade;
					Double valor;

					System.out.printf("\n");
					System.out.println("Nome do pedido:");
					pedidos.setNome(nome = ler.next());
					pedidos.setDataPedido(new Date());
					System.out.println("Quantidade do pedido:");
					pedidos.setQuantidade(quantidade = ler.nextInt());
					System.out.println("Informe o valor:");
					pedidos.setValor(valor = ler.nextDouble());

					PedidosDAO.getInstance().createPedido(pedidos);

					System.out.printf("\n");
					System.out.println("Cadastro com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 2) {
					int id;

					System.out.println("Informe o id do pedido:");
					id = ler.nextInt();

					Pedidos pedidos = PedidosDAO.getInstance().getById(id);

					System.out.printf("\n");
					System.out.println("Nome: " + pedidos.getNome());
					System.out.println("Data do pedido: " + pedidos.getDataPedido());
					System.out.println("Quantidade: " + pedidos.getQuantidade());
					System.out.println("Valor: " + pedidos.getValor());
					System.out.printf("\n");

				}

				if (opcao2 == 3) {

					int id;
					String nome;
					String data_pedido;
					int quantidade;
					Double valor;

					System.out.println("Informe o id do pedido:");
					id = ler.nextInt();

					Pedidos pedidos = PedidosDAO.getInstance().getById(id);

					System.out.println("Digite o nome para altera??o:");
					pedidos.setNome(nome = ler.next());
					pedido.setDataPedido(new Date());
					System.out.println("Digite a quantidade para altera??o:");
					pedidos.setQuantidade(quantidade = ler.nextInt());
					System.out.println("Digite o valor para altera??o:");
					pedidos.setValor(valor = ler.nextDouble());

					PedidosDAO.getInstance().updatePedido(pedido);

					System.out.printf("\n");
					System.out.println("Alterado com sucesso!");
					System.out.printf("\n");

				}

				if (opcao2 == 4) {

					int id;

					System.out.println("Informe o id do pedido a ser exclu?do:");
					id = ler.nextInt();

					Pedidos pedidos = PedidosDAO.getInstance().getById(id);

					PedidosDAO.getInstance().deletePedido(pedidos);

					System.out.println("Exclu?do com sucesso!");
				}

			}

		} while (opcao != 0);

		System.out.println("Obrigado(a)!");

	}

}
