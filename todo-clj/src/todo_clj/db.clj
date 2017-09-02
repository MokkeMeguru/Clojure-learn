;; src/todo_clj/db.clj
(ns todo-clj.db
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec
  {:dbtype "postgresql"
   :dbname "todo_clj_dev"
   :host "localhost"
   :port 5432
   :user "username"
   :password "password"})



;;; this method is invalid ;;;;;;;
(defn migrate []
  (jdbc/db-do-commands
   db-spec
   (jdbc/create-table-ddl
    :todo
    [:id :serial]
    [:title :varchar])))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
