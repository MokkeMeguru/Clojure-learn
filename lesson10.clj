;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; name-space ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.example
  (:require [clojure.set :as set])
  (:gen-class))
(println *ns*)

(alias 'string 'clojure.string)

(all-ns)

(find-ns 'clojure.string)

(ns-name 'clojure.string)

(ns-aliases 'clojure.core)

(count (ns-map 'clojure.core))

(alias 'string 'clojure.string)

(ns-unalias 'clojure.string 'string)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; exception ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(try
  (aget (int-array [1 2 3]) 5)
  (catch Exception e
    (println (str "caught exception: " (.toString e))))
  (finally (println "This is our final block")))
(println "Lets move on")

(try
  (def string1 (slurp "Example3.txt"))
  (println string1)
  (catch java.io.FileNotFoundException e
    (println (str "caught file exception: " (.toString e))))
  (catch Exception e
    (println (str "caught exception: " (.getMessage e))))
  (finally (println "This is our final block")))
(println "Lets move on")

(seq [1 2 3])

(cons 0 (seq [1 2 3]))

(conj [1 2 3] 4)

(concat (seq [1 2]) (seq [3 4]))

(distinct (seq [1 1 2 2]))

(reverse (seq [1 2 3]))

(first (seq [1 2 3]))

(second (seq [1 2 3]))

(last (seq [1 2 3]))

(rest (seq [1 2 3]))

(sort (seq [1 3 5 2 4]))

(drop 2 (seq [1 2 3 4]))

(drop-last 2 (seq [1 2 3 4]))

(take 2 (seq [1 2 3 4]))

(take-last 2 (seq [1 2 3 4]))

(split-at 3 (seq [1 2 3 4 5]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; regular expressions ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def pat (re-pattern "\\d+"))

(re-find pat "foo123bar")

(clojure.string/replace "foo123bar456" pat "789")

(clojure.string/replace-first "foo123bar456" pat "789")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; predicates ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

((every-pred number? even?) :a 1 2 3)

((every-pred number? odd?) 1 3 5)

(every? number? '(1 2 3 4 5))

(some even? '(1 2 3 4))

(not-any? even? '(1 3 5))
