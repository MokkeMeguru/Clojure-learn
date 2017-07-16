;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; data-type ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.data-type
  (:gen-class))

(defn Example []
  ;; int
  (def x 1)
  ;; float
  (def y 1.25)
  ;; string
  (def str1 "Hello")
  ;; output variable
  (println x)
  (println y)
  (println str1)
  )

(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; data-variable ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.example.data-vatiable
  (:gen-class))

(defn Example []
  (def x 1)
  (def t 1.25)
  (def str1 "Hello")
  ;; boolean 
  (def status true)
  )
(Example)

;; naming-variables
(defn Example2 []
  ;; ok 
  (def status true)
  ;; ok! (status != STATUS)
  (def STATUS false)
  ;; ok! (names which include _ is valid )
  (def _num1 2)
  )
(Example2)

;;printing-variables
(defn Example3 []
  (def x 1)
  (def y 1.25)
  (def str1 "Hello")
  (println x)
  (println y)
  (println str1)
  )
(Example3)
