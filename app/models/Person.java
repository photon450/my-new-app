package models;

import play.db.ebean.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by senoid on 10/27/2015.
 */
@Entity
public class Person extends Model {
    @Id
        public String id;
        public String name;

}
