package ufg.pw.projeto_restaurante.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import antlr.collections.List;

public class ItemVendaDAO {
	
	private static ItemVendaDAO instance;
    protected EntityManager entityManager;
    
    public static ItemVendaDAO getInstance(){
              if (instance == null){
                       instance = new ItemVendaDAO();
              }
              
              return instance;
    }
    
    private ItemVendaDAO() {
	        entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager() {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("restaurantePU");
	        if (entityManager == null) {
	                 entityManager = factory.createEntityManager();
	        }
	
	        return entityManager;
	}
	
	 public ItemVenda getById(final int id) {
         return entityManager.find(ItemVenda.class, id);
	 }
	 
	 @SuppressWarnings("unchecked")
     public List<ItemVenda> findAll() {
               return entityManager.createQuery("FROM " + ItemVenda.class.getName()).getResultList();
     }
	 
	 public void persist(ItemVenda item) {
         try {
                  entityManager.getTransaction().begin();
                  entityManager.persist(item);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
}

public void merge(ItemVenda item) {
         try {
                  entityManager.getTransaction().begin();
                  entityManager.merge(item);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
}

public void remove(ItemVenda item) {
         try {
                  entityManager.getTransaction().begin();
                  item = entityManager.find(ItemVenda.class, item.getId());
                  entityManager.remove(item);
                  entityManager.getTransaction().commit();
         } catch (Exception ex) {
                  ex.printStackTrace();
                  entityManager.getTransaction().rollback();
         }
}

public void removeById(final int id) {
         try {
        	 ItemVenda item = getById(id);
                  remove(item);
         } catch (Exception ex) {
                  ex.printStackTrace();
         }
}


    
}
