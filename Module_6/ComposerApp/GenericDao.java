/**
 *  Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.List;

/**
 * GenericDao is a generic interface that defines the basic CRUD operations for a data access object (DAO).
 */
public interface GenericDao<E, K> {
    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
}