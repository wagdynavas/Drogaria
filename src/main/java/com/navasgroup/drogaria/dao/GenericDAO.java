package com.navasgroup.drogaria.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.navasgroup.drogaria.util.HibernateUtil;

public class GenericDAO<Entity> {
	
	private Class<Entity> classe;
	
	@SuppressWarnings("unchecked")
	/*Comando pega a classe atual, depois sua classe generia e por fim  tipo de argumento que foi passado*/
	public GenericDAO(){
		this.classe = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}
	
	
	public void save(Entity entity){
		Session session = HibernateUtil.getSessionFactory().openSession();//captura uma sessao aberta
		Transaction transaction = null;//Transaction serve para controlar transacoes: Use quando for Salvar, Editar, Incluir
		
		
		try{
			//comece uma sessao
			transaction = session.beginTransaction();
			session.save(entity);//salva salva
			transaction.commit();//confirma transacao
		}catch(RuntimeException e){
			if(transaction != null){
				transaction.rollback();//volta a sessao caso a transacao nao seja nula,  mas tenha caido no bloco catch
				
			}
			throw e; //lanca a excecao
		}finally {
			session.close();//fecha a sessao.
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Entity> list(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			//criteria realiza a consulta, 
			Criteria criteria = session.createCriteria(classe);//para criar um criterio vc precisa de uma sessao.
			List<Entity> result = criteria.list(); //recebe a lista de Entidade
			return result; //listagem de todos os Estados que eu tiver
		}catch(RuntimeException e){
			throw e; //lanca a excecao
		}finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public Entity search(Long code){
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try{
			Criteria criteria = session.createCriteria(classe);//para criar um criterio vc precisa de uma sessao.
			criteria.add(Restrictions.idEq(code)) ;
			Entity result = (Entity) criteria.uniqueResult();
			return result; 
		}catch(RuntimeException e){
			throw e; //lanca a excecao
		}finally {
			session.close();
		}
	}
	
	public void delete(Entity entity){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			
		} catch (RuntimeException e) {
			if(transaction != null){
				transaction.rollback();
			}
			throw e;
		}finally {
			session.close();
		}
		
	}
	
	public void update(Entity entity){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
			
		} catch (RuntimeException e) {
			if(transaction != null){
				transaction.rollback();
			}
			throw e;
		}finally {
			session.close();
		}
	}
	
}
