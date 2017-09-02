;; src/todo_clj/view/main.clj
(ns todo-clj.view.main
  (:require [todo-clj.view.layout :as layout]))

(defn home-view [req]
  (->>
   [:section.card
    [:h2 "Home"]
    [:a {:href "/todo"} "TODO List"]]
   (layout/common req)))

