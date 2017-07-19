;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; if statement ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.if_statement
  (:gen-class))
(defn Example
  ""
  []
  (if (= 2 2)
    (println "Values are equal")
    (println "Values are not equal")))
(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; if/do expression ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.if-do_expression
  (:gen-class))

(defn Example
  ""
  []
  (if (= 2 2)
    (do
      (println "Both the values are equal")
      (println "true"))
    (do
      (println "Both the value are not equal")
      (println "false"))))

(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Nested if statement ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.nasted_statement
  (:gen-class))

(defn Example
  ""
  []
  (if (and (= 2 2) (= 3 3))
    (println "Values are equal")
    (println "Values are not equal")))
(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Case statement ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.case_statement
  (:gen-class))
(defn Example [] 
  (def x 5)
  (case x
    5 (println "x is 5")
    10 (println "x is 10")
    (println "x is neither 5 nor 10")))
(Example)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Cond statement ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.cond_statement
  (:gen-class))

(defn Example []
  (def x 5)
  (cond
    (= x 5) (println "x is 5")
    (= x 10) (println "x is 10")
    :else (println "x is not defined")))
(Example)
