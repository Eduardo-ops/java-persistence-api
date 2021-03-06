package br.com.univas.cliente.modelCliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClienteDAO {

	private static ClienteDAO instance;
	protected EntityManager entityManager;

	public static ClienteDAO getInstance() {
		if (instance == null) {
			instance = new ClienteDAO();
		}
		return instance;
	}

	private ClienteDAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		// Usando a configura??o presente no arquivo persistence.xml, possibilitando
		// assim, cria??o de uma inst?ncia de EntityManagerFactory.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClienteSystemPU");
		// Verificando se nunca foi criado.
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public Cliente getById(final int id) {
		return entityManager.find(Cliente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {
		return entityManager.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}

	// Create
	public void createCliente(Cliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// persistindo no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
	}

	// Read
	public Cliente readById(final int id) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// buscando no banco de dados.
		return entityManager.find(Cliente.class, id);
	}

	// Update
	public void updateCliente(Cliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// realizando modifica??oes no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
	}

	// Delete
	public void deleteCliente(Cliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// deletando no banco de dados.
		entityManager.getTransaction().begin();
		cliente = entityManager.find(Cliente.class, cliente.getId());
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
	}

}
