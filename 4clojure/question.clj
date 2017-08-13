(ns clojure.examples.questions
  (:gen-class))

;; 4Clojure Question 1
;;
;; This is a clojure form.  Enter a value which will make the form evaluate to true.  Don't over think it!  If you are confused, see the <a href='/directions'>getting started</a> page.  Hint: true is equal to true.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= true true)

;; 4Clojure Question 2
;;
;; <p>If you are not familiar with <a href='http://en.wikipedia.org/wiki/Polish_notation'>polish notation</a>, simple arithmetic might seem confusing.</p><p><strong>Note:</strong> Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.</p>
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (- 10 (* 2 3)) 4)

;; 4Clojure Question 3
;;
;; Clojure strings are Java strings.  This means that you can use any of the Java string methods on Clojure strings.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= "HELLO WORLD" (.toUpperCase "hello world"))

;; 4Clojure Question 4
;;
;; Lists can be constructed with either a function or a quoted form.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (list :a :b :c) '(:a :b :c))

;; 4Clojure Question 5
;;
;; <p>When operating on a list, the conj function will return a new list with one or more items "added" to the front.</p>
;;
;; <p>Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.</p>
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (list 1 2 3 4) (conj '(2 3 4) 1))

;; 4Clojure Question 6
;;
;; Vectors can be constructed several ways.  You can compare them with lists.
;;
;; <br/><br/><b>Note</b>: the brackets [] surrounding the blanks __ are part of the test case.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; 4Clojure Question 7
;;
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [1 2 3 4] (conj [1 2 3] 4))

(= [1 2 3 4] (conj [1 2] 3 4))

;; 4Clojure Question 8
;;
;; Sets are collections of unique values.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))

(= (set (vector :a :b :c :d)) (clojure.set/union #{:a :b :c} #{:b :c :d}) #{:a :b :c :d})


;; 4Clojure Question 9
;;
;; When operating on a set, the conj function returns a new set with one or more keys "added".
;;
;; Use M-x 4clojure-check-answers when you're done!

(= #{1 2 3 4} (conj #{1 4 3} 2))

;; 4Clojure Question 10
;;
;; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))

(= 20 (:b {:a 10, :b 20, :c 30}))

;; 4Clojure Question 11
;;
;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
;;
;; Use M-x 4clojure-check-answers when you're done!

(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))


;; 4Clojure Question 12
;;
;; All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 3 (first '(3 2 1)))

(= 3 (second [2 3 4]))

(= 4 (last (list 1 2 3)))

;; 4Clojure Question 13
;;
;; The rest function will return all the items of a sequence except the first.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [20 30 40] (rest [10 20 30 40]))

;; 4Clojure Question 14
;;
;; Clojure has many different ways to create functions.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 8 ((fn add-five [x] (+ x 5)) 3))

(= 8 ((fn [x] (+ x 5)) 3))

(= 8 (#(+ % 5) 3))

(= 8 ((partial + 5) 3))

;; 4Clojure Question 15
;;
;; Write a function which doubles a number.
;;
;; Use M-x 4clojure-check-answers when you're done!


(= ((partial * 2) 2) 4)

(= ((fn [x] (* x 2)) 3) 6)

(= ((partial * 2) 11) 22)

(= ((partial * 2) 7) 14)

;; 4Clojure Question 16
;;
;; Write a function which returns a personalized greeting.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((partial format "Hello, %s!") "Dave") "Hello, Dave!")

(= ((partial format "Hello, %s!") "Jenn") "Hello, Jenn!")

(= ((partial format "Hello, %s!") "Rhea") "Hello, Rhea!")

;; 4Clojure Question 17
;;
;; The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (list 6 7 8) (map #(+ % 5) '(1 2 3)))

;; 4Clojure Question 18
;;
;; The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (list 6 7) (filter #(> % 5) '(3 4 5 6 7)))

;; 4Clojure Question 19
;;
;; Write a function which returns the last element in a sequence.
;;
;; Restrictions (please don't use these function(s)): last
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (last [1 2 3 4 5]) 5)

(= (last '(5 4 3)) 3)

(= (last ["b" "c" "d"]) "d")

;; 4Clojure Question 20
;;
;; Write a function which returns the second to last element from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(second (reverse %))  (list 1 2 3 4 5)) 4)

(= (#(second (reverse %)) ["a" "b" "c"]) "b")

(= (#(second (reverse %)) [[1 2] [3 4]]) [1 2])

;; 4Clojure Question 21
;;
;; Write a function which returns the Nth element from a sequence.
;;
;; Restrictions (please don't use these function(s)): nth
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [l x] (first (drop x l))) '(4 5 6 7) 2) 6)

(= ((fn [l x] (first (drop x l))) [:a :b :c] 0) :a)

(= ((fn [l x] (first (drop x l))) [1 2 3 4] 1) 2)

(= ((fn [l x] (first (drop x l))) '([1 2] [3 4] [5 6]) 2) [5 6])

;; 4Clojure Question 22
;;
;; Write a function which returns the total number of elements in a sequence.
;;
;; Restrictions (please don't use these function(s)): count
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(loop [l % c 0]
       (if (empty? l) c
           (recur (rest l) (inc c))))
    '(1 2 3 3 1)) 5)

(= (#(loop [l % c 0]
       (if (empty? l) c
           (recur (rest l) (inc c))))
    "Hello World") 11)

(= (#(loop [l % c 0]
       (if (empty? l) c
           (recur (rest l) (inc c))))
    [[1 2] [3 4] [5 6]]) 3)

(= (#(reduce + (map (constantly 1) %))
    '(13)) 1)

(= (#(reduce + (map (constantly 1) %))
    '(:a :b :c)) 3)

;; 4Clojure Question 23
;;
;; Write a function which reverses a sequence.
;;
;; Restrictions (please don't use these function(s)): reverse, rseq
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(reduce conj () %) [1 2 3 4 5]) [5 4 3 2 1])

(= (#(reduce conj () %) (sorted-set 5 7 2 7)) '(7 5 2))

(= (#(reduce conj () %)  [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; 4Clojure Question 24
;;
;; Write a function which returns the sum of a sequence of numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(reduce + %) [1 2 3]) 6)

(= (#(reduce + %) (list 0 -2 5 5)) 8)

(= (#(reduce + %) #{4 2 1}) 7)

(= (#(reduce + %) '(0 0 -1)) -1)

(= (#(reduce + %) '(1 10 3)) 14)


;; 4Clojure Question 25
;;
;; Write a function which returns only the odd numbers from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(filter odd? %) #{1 2 3 4 5}) '(1 3 5))

(= (#(filter odd? %) [4 2 1 6]) '(1))

(= (#(filter odd? %) [2 2 4 6]) '())

(= (#(filter odd? %) [1 1 1 3]) '(1 1 1 3))
