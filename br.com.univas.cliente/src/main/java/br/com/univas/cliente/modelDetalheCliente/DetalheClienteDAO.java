package br.com.univas.cliente.modelDetalheCliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class DetalheClienteDAO {

	private static DetalheClienteDAO instance;
	protected EntityManager entityManager;

	public static DetalheClienteDAO getInstance() {
		if (instance == null) {
			instance = new DetalheClienteDAO();
		}
		return instance;
	}

	private DetalheClienteDAO() {
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

	public DetalheCliente getById(final int id) {
		return entityManager.find(DetalheCliente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<DetalheCliente> findAll() {
		return entityManager.createQuery("FROM" + DetalheCliente.class.getName()).getResultList();
	}

	// Create
	public void createDetalheCliente(DetalheCliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// persistindo no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
	}

	// Read
	public DetalheCliente readById(final int id) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// buscando no banco de dados.
		return entityManager.find(DetalheCliente.class, id);
	}

	// Update
	public void updateCliente(DetalheCliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// realizando modifica??oes no banco de dados.
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
	}

	// Delete
	public void deleteCliente(DetalheCliente cliente) {
		// Objeto cliente sendo gerenciado pelo jpa, pegando a informa??o(dados) e
		// deletando no banco de dados.
		entityManager.getTransaction().begin();
		cliente = entityManager.find(DetalheCliente.class, cliente.getIdDetalhe());
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
	}

}
