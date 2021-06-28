package br.com.univas.cliente.modelPedidos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class PedidosDAO {

	private static PedidosDAO instance;
	protected EntityManager entityManager;

	public static PedidosDAO getInstance() {
		if (instance == null) {
			instance = new PedidosDAO();
		}
		return instance;
	}

	private PedidosDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		// Usando a configuração presente no arquivo persistence.xml, possibilitando
		// assim, criação de uma instância de EntityManagerFactory.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClienteSystemPU");
		// Verificando se nunca foi criado.
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Pedidos getById(final int id) {
		return entityManager.find(Pedidos.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Pedidos> findAll() {
		return entityManager.createQuery("FROM" + Pedidos.class.getName()).getResultList();
	}

	// Create
	public void createPedido(Pedidos pedido) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informação(dados) e
		// persistindo no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
	}

	// Read
	public Pedidos readById(final int id) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informação(dados) e
		// buscando no banco de dados.
		return entityManager.find(Pedidos.class, id);
	}

	// Update
	public void updatePedido(Pedidos pedido) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informação(dados) e
		// realizando modificaççoes no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.merge(pedido);
		entityManager.getTransaction().commit();
	}

	// Delete
	public void deletePedido(Pedidos pedido) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informação(dados) e
		// deletando no banco de dados.
		entityManager.getTransaction().begin();
		pedido = entityManager.find(Pedidos.class, pedido.getIdPedido());
		entityManager.remove(pedido);
		entityManager.getTransaction().commit();
	}
}
