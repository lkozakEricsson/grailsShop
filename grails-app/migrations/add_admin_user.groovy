/**
 * Created by Łukasz Kozak on 2016-05-07.
 */
databaseChangeLog = {
    changeSet(author: "Lukasz Kozak", id: "add_admin_user") {

        sql(sql: "insert into user (user_name, user_password) values('admin','adminadmin');");
    }
}