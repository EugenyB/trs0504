package dao;

import tables.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by eugen on 05.04.2017.
 */
@Stateless
public class StudentDAO {
    @PersistenceContext
    EntityManager em;

    public List<Student> findAll() {
        return em.createQuery("select s from Student s").getResultList();
    }
}
