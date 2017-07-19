;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Numbers ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.numbers
  (:gen-class))

(defn Example []
  (def x 5)
  (def y 5.25)
  (println (type x))
  (println (type y)))
(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Number Tests ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.number_test
  (:gen-class))

(defn Example []
  (def x (zero? 0))
  (println x)
  (def x (zero? 0.0))
  (println x)
  (def x (zero? 1))
  (println x))

(Example)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; pos? & neg? ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn Example2 []
  (def x (pos? -1))
  (println x)
  (def x (pos? 0))
  (println x)
  (def x (pos? 1))
  (println x))
(Example2)


(defn Example3 []
  (def x (neg? -1))
  (println x)
  (def x (neg? 0))
  (println x)
  (def x (neg? 1))
  (println x))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; even? & odd? & ?number & integer? ;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn Example4 []
  (def x (even? 0))
  (println x)
  (def x (even? 2))
  (println x)
  (def x (even? 3))
  (println x))

(defn Example5 []
  (def x (odd? 0))
  (println x)
  (def x (odd? 2))
  (println x)
  (def x (odd? 3))
  (println x))

(defn Example6 []
  (def x (number? 0))
  (println x)
  (def x (number? 0.0))
  (println x)
  (def x (number? :a))
  (println x))

(defn Example7 []
  (def x (integer? 0))
  (println x)
  (def x (integer? 0.0))
  (println x))

(defn Example8 []
  (def x (float? 0))
  (println x)
  (def x (float? 0.0))
  (println x))
