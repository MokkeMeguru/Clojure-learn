(ns clojure.examples.example
  (:gen-class))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Watchers ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn Ex []
  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println  "new-state" new-state)))
  (reset! x 2))

;; The value of the atom has been changed
;; old-state 0
;; new-state 2
;; 2

(defn Ex []
  (def x (atom 0))
  (add-watch x :watcher
             (fn [key atom old-state new-state]
               (println "The value of the atom has been changed")
               (println "old-state" old-state)
               (println "new-state" new-state)))
  (reset! x 2)
  (remove-watch x :watcher)
  (reset! x 4))

;; The value of the atom has been changed
;; old-state 0
;; new-state 2
;; 4

(defmacro Simple []
  (str "Hello"))
(Simple)
(macroexpand '(Simple))

(defmacro Add [x]
  (+ 1 x))
(= (Add 2) (macroexpand '(Add 2)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; reference values ;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def my-ref (ref 1 :validator pos?))
(str @my-ref)

(dosync (ref-set my-ref 2))
(str @my-ref)

(def names (ref []))
(defn change [newname]
  (dosync
   (alter names conj newname)))
(change "John")
(change "Mark")
(str @names)

(def counter (ref 0))
(defn change [counter]
  (dosync
   (commute counter inc)))
(change counter)
(str @counter)

