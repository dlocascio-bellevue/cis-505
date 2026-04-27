/**
 *  Locascio, D. (2026). CIS 505 Intermediate Java Programming. Bellevue University.
*/

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    private List<Composer> composers;

    //no-arg default constructor that creates list of five composer objects
    public MemComposerDao() {
        composers = new ArrayList<>();
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    /**
     * Overridden findAll method 
     * @return a list of composer objects
     */
    @Override
    public List<Composer> findAll() {
        return composers;
    }
    
    /**
     * Overridden findBy method
     * @return a single composer object matching the arguments id
     */
    @Override 
    public Composer findBy(Integer id) {
        for (Composer composer : composers) {
            if (composer.getId() == id) {
                return composer;
            }
        }
        return null;
    }

    //Overridden insert method that adds a new composer object to the list of composers
    @Override 
    public void insert(Composer composer) {
        composers.add(composer);
    }
}