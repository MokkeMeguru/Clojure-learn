;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Recursion ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.recursion
  (:gen-class))
(defn Example []
  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; File I/O ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.file_io
  (:gen-class))
(defn Example []
  (def string1 (slurp "Example.txt"))
  (println string1))

;; ?
(defn Example2 []
  (with-open [rdr (clojure.java.io/reader "Example.txt")]
    (reduce conj [] (line-seq rdr))))
;;
(defn Example3 []
  (with-open [w (clojure.java.io/writer "Example.txt" :append true)]
    (.write w (str "hello" "world"))))
(defn Example4 []
  (println (.exists (clojure.java.io/file "Example.txt"))))

;; (read-line)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; String ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.string
  (:gen-class))

(defn hello-world []
  (println "Hello World")
  (println "This is a demo application"))

(defn hello-world2 []
  (println (str "Hello" "World"))
  (println (str "Hello" "World" "Again")))

(defn hello-world3 []
  (println (format "Hello ,%s" "World"))
  (println (format "Pad with leading zeros %06d" 1234)))

(defn hello-world4 []
  (println (count "Hello")))

(defn hello-world5 []
  (println (subs "HelloWorld" 2 5 ))
  (println (subs "HelloWorld" 5 7 )))

(defn hello-world6 []
  (println (compare "Hello" "hello"))
  (println (compare "Hello" "Hello")))

(defn hello-world7 []
  (println (clojure.string/lower-case "HelloWorld"))
  (println (clojure.string/upper-case "HelloWorld")))

(defn hello-world8 []
  (println (clojure.string/join ", " [1 2 3])))

(defn hello-world9 []
  (println (clojure.string/split "Hello World" #" ")))

(defn hello-world10 []
  (println (clojure.string/split-lines "Hello\nWorld")))

(defn hello-world11 []
  (println (clojure.string/reverse "Hello World")))

(defn hello-world12 []
  (println (clojure.string/replace "The tutorial is about Groovy" #"Groovy" "Clojure")))

(= "HELLO WORLD" (.toUpperCase "hello world"))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; trim ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn hello-world13 []
  (println (clojure.string/trim "     White space        "))
  (println (clojure.string/triml "      White space       "))
  (println (clojure.string/trimr "      White space       ")))

