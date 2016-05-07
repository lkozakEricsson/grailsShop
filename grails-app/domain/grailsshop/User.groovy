package grailsshop

import grails.rest.Resource

@Resource(formats = ['json', 'xml'])
class User {

    String name
    String password

    static constraints = {
        name nullable: false, blank: false
        password nullable: false, blank: false
    }

    static mapping = {
        table 'user'
        id column: "user_id"
        name column: 'user_name'
        password column: 'user_password'
        version false
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", version=" + version +
                '}';
    }
}
