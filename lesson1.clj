;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Hello World .cls             ;;;;;;;;;;
(ns clojure.examples.hello
 (:gen-class))
(defn hello-world [username]
  (println (format "Hello, %s" username)))
(hello-world "world")
(defn Example []
  (println (hello-world "World"))
  (println (+ 1 2))
  )
(Example)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; defn function                 ;;;;;;;;;;
(defn hello-world []             ;;;;;;;;;;
  (println "Hello World"))       ;;;;;;;;;;
;; exec function                 ;;;;;;;;;;
(hello-world)                    ;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; add operator                  ;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; int float etc..               ;;;;;;;;;;
(+ 4 6)                          ;;;;;;;;;;
;; string ...                    ;;;;;;;;;;
(str "Hello" " " "World")        ;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Namespaces                    ;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
*ns*
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Require-Statemention-Clojure  ;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (require quoted-namespace-symbol)  ;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(ns clojure.examples.myio
  (:gen-class))
;; import 
(use '[clojure.java.io :only (file)])
;; create clojure.java.io-instance as "as-file"
(class (clojure.java.io/as-file "."))
;; defun sample function
(defn Example []
  (.exists (file "Example.txt" )))
;; run function
(Example)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; delimiters ;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.delimiters
  (:gen-class))
(defn Example []
  (println [+ 1 2 3])
  )
(Example)
;; [#function[clojure.core/+] 1 2 3]
(defn Example2 []
  (println (+ 1 2 3)))
(Example2)
