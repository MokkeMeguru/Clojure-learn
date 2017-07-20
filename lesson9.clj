;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Lists ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.lists
  (:gen-class)
  (:require [clojure.set :as set]))

(defn example 
  ""
  []
  (println (list 'a 'b 'c 'd)))

;; list*
(defn example2 []
  (println (list* 1 [2,3])))

;; first
(defn example3 []
  (println (first (list 1 2 3))))

;; nth
(defn example4 []
  (println (nth (list 1 2 3) 2))
  (println (nth (list 1 2 3) 0)))

;; cons
(defn example5 []
  (println (cons 0 (list 1 2 3))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; conj ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn example6 []
  (println (conj (list 1 2 3) 4 5)))

;; (5 4 1 2 3)

;; rest
(defn example7 []
  (println (rest (list 1 2 3))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; sets ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.sets
  (:require [clojure.set :as set])
  (:gen-class))

(defn example1 []
  (println (set `(1 1 2 2))))

(defn example2 []
  (println (sorted-set 3 2 1)))

(defn example3 []
  (println (get (set `(3 2 1)) 2))
  (println (get (set `(3 2 1)) 1)))

(defn example4 []
  (println (contains? (set `(3 2 1)) 1))
  (println (contains? (set `(3 2 1)) 4)))

(defn example5 []
  (println (conj (set `(3 2 1)) 5)))

(defn example6 []
  (println (disj (set `(1 2 3)) 1)))

(defn example7 []
  (println (set/union #{1 2} #{3 4})))

(defn example8 []
  (println (set/difference #{1 2} #{2 3})))

;; #{1}

(defn example9 []
  (println (set/intersection #{1 2} #{2 3})))

(defn example10 []
  (println (set/subset? #{1 2} #{2 3}))
  (println (set/subset? #{1 2} #{1 2 3})))

(defn example11 []
  (println (set/superset? #{1 2} #{1 2 3}))
  (println (set/superset? #{1 2 3} #{1 2})))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Vectors ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.vector
  (:require [clojure.set :as set])
  (:gen-class))

(defn example1 []
  (println (vector 1 2 3)))

(defn example2 []
  (println (vector-of :int 1 2 3)))

(defn example3 []
  (println (nth (vector 1 2 3) 0))
  (println (nth (vector 1 2 3) 2)))

(defn example4 []
  (println (get (vector 3 2 1) 2))
  (println (get (vector 3 2 1) 1)))

(defn example5 []
  (println (conj (vector 3 2 1) 5)))

(defn example6 []
  (println (pop (vector 3 2 1))))

(defn example7 []
  (println (subvec (vector 1 2 3 4 5 6 7) 2 5)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Maps ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.maps
  (:gen-class))

(defn example1 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (print demokeys))
;; {z 1, a 3, b 2}

(defn example2 []
  (def demokeys (sorted-map "z" "1" "b" "2" "a" "3"))
  (println demokeys))
;; {a 3, b 2, z 1}

(defn example3 []
  (def demokeys (hash-map "z" "1"
                          "b" "2"
                          "a" "3"))
  (println demokeys)
  (println (get demokeys "b"))
  )
;; 2

(defn example4 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (contains? demokeys "b"))
  (println (contains? demokeys "x")))

(defn example5 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (find demokeys "b"))
  (println (find demokeys "x")))
;; [b 2]
;; nil

(defn example6 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (keys demokeys)))
;; (z b a)

(defn example7 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (vals demokeys)))

(defn example8 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (println (dissoc demokeys "b")))

(defn example9 []
  (def demokeys (hash-map "z" "1" "b" "2" "a" "3"))
  (def demokeys1 (hash-map "x" "4" "h" "5" "i" "7"))
  (println (merge demokeys demokeys1)))

(defn example9 []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demokeys1 (hash-map "a" 2 "h" 5 "i" 6))
  (println (merge-with + demokeys demokeys1)))
;; a 5

(defn example10 []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (println (select-keys demokeys ["z" "a"])))

(defn example11 []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 3))
  (def demonew (clojure.set/rename-keys demokeys {"z" "newz" "b" "newb"}))
  (println demonew))
;; {newb 2, a 3, newz 1}

(defn example12 []
  (def demokeys (hash-map "z" 1 "b" 2 "a" 1))
  (def demonew (clojure.set/map-invert demokeys))
  (println demonew))
;; {1 a, 2 b}
