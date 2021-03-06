;; src/todo-clj/handler/main.clj
(ns todo-clj.handler.main
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [todo-clj.util.response :as res]
            [todo-clj.view.main :as view]))

(defn home-view [req]
  "<h1>Home</h1>
  <a href=\"/todo\">TODO List</a>")

;; (defn home [req]
;;   (->
;;    (home-view req)
;;    res/response
;;    res/html))

(defn home [req]
  (-> (view/home-view req)
      res/response
      res/html))

(defroutes main-routes
  (GET "/" _ home)
  (route/not-found "<h1>Not found</h1>"))
