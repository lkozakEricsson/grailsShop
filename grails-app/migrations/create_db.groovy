/**
 * Created by Łukasz Kozak on 2016-05-07.
 */
databaseChangeLog = {
    changeSet(author: "Lukasz Kozak", id: "create_db") {
        createTable(tableName: "user") {
            column(autoIncrement: "true", name: "user_id", type: "bigint") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "usersPK")
            }

            column(name: "name", type: "longtext")
        }
    }
}