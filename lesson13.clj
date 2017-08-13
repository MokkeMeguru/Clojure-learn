
;; I cannot use jdbc
;; because I cannot use clojure-project by my cheap skill ...


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; java interface ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns Project
  (:gen-class))

(str (.toUpperCase "Hello World"))

(str (.indexOf "Hello World", "e"))

(def str1 (new String "Hello"))
(str str1)

(def my-int (new Integer 1))
(+ 2 my-int)

(import java.util.Stack)
(let [stack (Stack.)]
  (.push stack "First Element")
  (.push stack "Second Element")
  (str (.pop stack) " and " (.pop stack)))

(. Math PI)
;; Java.lang.Marh.Pi

(.. System getProperties (get "java.version"))
;; Java.System.getProperties("java.version")

(.. System getProperties (get "user.dir"))
;; Java.System.getProperties("user.dir")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; current clojure ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns clojure.examples.example
  (:gen-class))

(def var1 (ref 10))
(def var2 (ref 20))
(str "var1 " @var1 " / var2 " @var2)
(defn change-value [var1 var2 newvalue]
  (dosync
   (alter var1 - newvalue)
   (alter var2 + newvalue))
  (str "var1 " @var1 " / var2 " @var2))

(defn reset-value [var1 var2]
  (dosync
   (ref-set var1 10)
   (ref-set var2 20))
  (str "var1 " @var1 " / var2 " @var2))

(change-value var1 var2 20)
(reset-value var1 var2)

