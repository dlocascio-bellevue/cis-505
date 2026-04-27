/**
 *  Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

/**
 * ComposerDao is an interface that extends the GenericDao interface, specifying that it will work with Composer objects and use Integer as the key type.
 * This interface will define the data access operations for Composer objects, such as finding all composers, finding a composer by ID, and inserting a new composer.
 */ 
public interface ComposerDao extends GenericDao<Composer, Integer> {
    
}