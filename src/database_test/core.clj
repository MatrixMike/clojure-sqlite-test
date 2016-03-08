(ns database-test.core
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










(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
