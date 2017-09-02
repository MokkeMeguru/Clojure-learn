;; src/todo_clj/view/todo.clj
(ns todo-clj.view.todo
  (:require [todo-clj.view.layout :as layout]))

(defn todo-index-view [req todo-list]
  (->> `([:h1 "TODO List"]
        [:ul
         ~@(for [{:keys [title]} todo-list]
             [:li title])])
      (layout/common req)))


