(ns database-test.core
    (:gen-class)
  (:require [clojure.java.jdbc :refer :all]))


(def db {:classname "org.sqlite.JDBC"
         :subprotocol "sqlite"
         :subname     "db/database.db"
})

(defn get-output []
  (query db ["select * from students"])
)

(defn add-student [age name] 
  (insert! db :students {
    :age age, :name name  
  })
)

(defn create-a-table [tablename] 
  (execute! db [(str "CREATE TABLE " tablename "(firstname varchar(255), lastname varchar(255))")])
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
