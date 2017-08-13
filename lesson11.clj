(ns clojure.examples.example
  (:gen-class))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; destructuring assignment ;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def my-vector [1 2 3 4])
(let [[a b c d] my-vector]
  (str a b c d))

(let [[a b c d e]  my-vector]
  (str a b c d e))

(let [[a b & the-rest] my-vector]
  (str the-rest))

(def my-map {"a" 1 "b" 2})

(let [{a "a" b "b" c "c"} my-map]
  (str a b c))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; date & time ;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def date (.toString (java.util.Date.)))
(str date)

(def date2 (.format (java.text.SimpleDateFormat. "yyyy-mm-dd/E(u)") (new java.util.Date)))
(str date2)

(def date3 (.getTime (java.util.Date.)))
(str date3)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Atoms ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def myatom (atom 1))
(str @myatom)

(reset! myatom 2)
(str @myatom)

(compare-and-set! myatom 1 3)
(str @myatom)
(compare-and-set! myatom 2 3)
(str @myatom)

(swap! myatom inc)
(str @myatom)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; metadata ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def my-map (with-meta [1 2 3] {:prop "values"}))
(str my-map)
(meta my-map)

(def new-my-map (vary-meta my-map assoc :newprop "new values"))
(meta new-my-map)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; struct ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defstruct Employee :EmployeeName :Employeeid)
(str (struct Employee "John" 1))

(def emp (struct-map Employee :EmployeeName "John" :Employeeid 1))
(str emp)
(:EmployeeName emp)

(def newemp (assoc emp :EmployeeName "Mark"))

(:EmployeeName newemp)

(def newemp (assoc emp :EmployeeName "John" :EmployeeRank "A"))

(str newemp)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; agent ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn Ex []
  (def counter (agent 0))
  (str counter)
  (send counter inc)
  (send counter + 100)
  (str @counter))

;; shutdown agents
;; (shutdown-agents)

(defn Ex []
  (def counter (agent 0))
  (send-off counter + 100)
  (await-for 100 counter) ;; wait 100 ms
  (str @counter))

(defn Ex []
  (def counter (agent 0))
  (send-off counter + 100)
  (await counter)
  (shutdown-agents))

(defn Ex []
  (def my-date (agent (java.util.Date.)))
  (send my-date + 100) ;; Date object cannot use as Number
  (await-for 100 my-date)
  (str (agent-error my-date)))
