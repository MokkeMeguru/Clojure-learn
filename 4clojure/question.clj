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

;; 4Clojure Question 26
;;
;; Write a function which returns the first X fibonacci numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(take %
           (map first
                (iterate
                 (fn [[a b]] [b (+ a b)]) [1 1]))) 3)
   '(1 1 2))

(= (#(take %
           (map first
                (iterate
                 (fn [[a b]] [b (+ a b)]) [1 1]))) 6)
   '(1 1 2 3 5 8))

(= (#(take %
           (map first
                (iterate
                 (fn [[a b]] [b (+ a b)]) [1 1]))) 8)
   '(1 1 2 3 5 8 13 21))

;; #(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))
;; (take 3 (iterate (fn [[x]] [(+ 1 x)]) [1]))
;; ([1] [2] [3]) ;; fn [1] = 2 -> fn [2] = 3 -> fn [3] = 4 ...
;; (map first '([1] [2] [3]))

;; 4Clojure Question 27
;;
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;;
;; Use M-x 4clojure-check-answers when you're done!

(false? (#(= (seq %) (reverse (seq %))) '(1 2 3 4 5)))

(true? (#(= (seq %) (reverse (seq %))) "racecar"))

(true? (#(= (seq %) (reverse (seq %))) [:foo :bar :foo]))

(true? (#(= (seq %) (reverse (seq %))) '(1 1 3 3 1 1)))

(false? (#(= (seq %) (reverse (seq %))) '(:a :b :c)))

;; #(= (seq %) (reverse (seq %)))

;; 4Clojure Question 28
;;
;; Write a function which flattens a sequence.
;;
;; Restrictions (please don't use these function(s)): flatten
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 (#(filter (complement sequential?)
           (rest (tree-seq sequential? seq %)))
  '((1 2) 3 [4 [5 6]]))
 '(1 2 3 4 5 6))

(=
 (#(filter (complement sequential?)
           (rest (tree-seq sequential? seq %)))
  ["a" ["b"] "c"])
 '("a" "b" "c"))

(=
 (#(filter (complement sequential?)
           (rest (tree-seq sequential? seq %)))
  '((((:a)))))
 '(:a))

;; 4Clojure Question 29
;;
;; Write a function which takes a string and returns a new string containing only the capital letters.
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 (#(clojure.string/join
    ""
    (re-seq (re-pattern #"[A-Z]+") %))
  "HeLlO, WoRlD!")
 "HLOWRD")

(empty?
 (#(clojure.string/join
    ""
    (re-seq (re-pattern #"[A-Z]+") %))
  "nothing"))

(=
 (#(clojure.string/join
    ""
    (re-seq (re-pattern #"[A-Z]+") %))
  "$#A(*&987Zf") "AZ")

;; 4Clojure Question 30
;;
;; Write a function which removes consecutive duplicates from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (apply str
          (#(map first (partition-by identity %))
           "Leeeeeerrroyyy"))
   "Leroy")

(= (#(map first (partition-by identity %))
    [1 1 2 3 3 2 2 3])
   '(1 2 3 2 3))

(= (#(map first (partition-by identity %))
    [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

;; 4Clojure Question 31
;;
;; Write a function which packs consecutive duplicates into sub-lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 (partition-by identity [1 1 2 1 1 1 3 3])
 '((1 1) (2) (1 1 1) (3 3)))

(=
 (partition-by identity [:a :a :b :b :c])
 '((:a :a) (:b :b) (:c)))

(=
 (partition-by identity [[1 2] [1 2] [3 4]])
 '(([1 2] [1 2]) ([3 4])))

;; 4Clojure Question 32
;;
;; Write a function which duplicates each element of a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (mapcat #(list % %) [1 2 3]) '(1 1 2 2 3 3))

(= (mapcat #(list % %) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (mapcat #(list % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (mapcat #(list % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

;; 4Clojure Question 33
;;
;; Write a function which replicates each element of a sequence a variable number of times.
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 ((fn [x n] (mapcat #(repeat n %) x))
  [1 2 3] 2)
 '(1 1 2 2 3 3))

(=
 ((fn [x n] (mapcat #(repeat n %) x))
  [:a :b] 4)
 '(:a :a :a :a :b :b :b :b))

(=
 ((fn [x n] (mapcat #(repeat n %) x))
  [4 5 6] 1)
 '(4 5 6))

(=
 ((fn [x n] (mapcat #(repeat n %) x))
  [[1 2] [3 4]] 2)
 '([1 2] [1 2] [3 4] [3 4]))

(=
 ((fn [x n] (mapcat #(repeat n %) x))
  [44 33] 2)
 [44 44 33 33])

;; 4Clojure Question 34
;;
;; Write a function which creates a list of all integers in a given range.
;;
;; Restrictions (please don't use these function(s)): range
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(take (- %2 %1) (iterate inc %1)) 1 4) '(1 2 3))

(= (#(take (- %2 %1) (iterate inc %1)) -2 2) '(-2 -1 0 1))

(= (#(take (- %2 %1) (iterate inc %1)) 5 8) '(5 6 7))

;; 4Clojure Question 35
;;
;; Clojure lets you give local names to values using the special let-form.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 7 (let [x 5] (+ 2 x)))

(= 7 (let [x 3, y 10] (- y x)))

(= 7 (let [x 21] (let [y 3] (/ x y))))

;; 4Clojure Question 36
;;
;; Can you bind x, y, and z so that these are all true?
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 10 (let [x 7, y 3] (+ x y)))

(= 4 (let [y 3, z 1] (+ y z)))

(= 1 (let [z 1] z))

;; 4Clojure Question 37
;;
;; Regex patterns are supported with a special reader macro.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; 4Clojure Question 38
;;
;; Write a function which takes a variable number of parameters and returns the maximum value.
;;
;; Restrictions (please don't use these function(s)): max, max-key
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(-> %& sort reverse first)  1 8 3 4) 8)

(= (#(-> %& sort reverse first) 30 20) 30)

(= (#(-> %& sort reverse first) 45 67 11) 67)

;; 4Clojure Question 39
;;
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;;
;; Restrictions (please don't use these function(s)): interleave
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(mapcat vector %1 %2) [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (#(mapcat vector %1 %2) [1 2] [3 4 5 6]) '(1 3 2 4))

(= (#(mapcat vector %1 %2) [1 2 3 4] [5]) [1 5])

(= (#(mapcat vector %1 %2) [30 20] [25 15]) [30 25 20 15])

;; 4Clojure Question 40
;;
;; Write a function which separates the items of a sequence by an arbitrary value.
;;
;; Restrictions (please don't use these function(s)): interpose
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [mid col]
      (butlast(mapcat #(list % mid) col)))
    0 [1 2 3])
   [1 0 2 0 3])

(= (apply str
          ((fn [mid col]
             (butlast(mapcat #(list % mid) col)))
           ", " ["one" "two" "three"]))
   "one, two, three")

(= ((fn [mid col]
      (butlast(mapcat #(list % mid) col)))
    :z [:a :b :c :d])
   [:a :z :b :z :c :z :d])
;; 4Clojure Question 41
;;
;; Write a function which drops every Nth item from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(reduce concat (partition-all (dec %2) %2 %1)) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= (#(reduce concat (partition-all (dec %2) %2 %1)) [:a :b :c :d :e :f] 2) [:a :c :e])

(= (#(reduce concat (partition-all (dec %2) %2 %1)) [1 2 3 4 5 6] 4) [1 2 3 5 6])

;; 4Clojure Question 42
;;
;; Write a function which calculates factorials.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(reduce * (take % (iterate inc 1))) 1) 1)

(= (#(reduce * (take % (iterate inc 1))) 3) 6)

(= (#(reduce * (take % (iterate inc 1))) 5) 120)

(= (#(reduce * (take % (iterate inc 1))) 8) 40320)

;; 4Clojure Question 43
;;
;; Write a function which reverses the interleave process into x number of subsequences.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [coll n] (map #(take-nth n (drop % coll)) (range n))) [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))

(= ((fn [coll n] (map #(take-nth n (drop % coll)) (range n))) (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

(= ((fn [coll n] (map #(take-nth n (drop % coll)) (range n))) (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))

;; 4Clojure Question 44
;;
;; Write a function which can rotate a sequence in either direction.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(->> (cycle %2) (drop (mod %1 (count %2))) (take (count %2))) 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (#(->> (cycle %2) (drop (mod %1 (count %2))) (take (count %2))) -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (#(->> (cycle %2) (drop (mod %1 (count %2))) (take (count %2))) 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (#(->> (cycle %2) (drop (mod %1 (count %2))) (take (count %2))) 1 '(:a :b :c)) '(:b :c :a))

(= (#(->> (cycle %2) (drop (mod %1 (count %2))) (take (count %2))) -4 '(:a :b :c)) '(:c :a :b))

;; 4Clojure Question 45
;;
;; The iterate function can be used to produce an infinite lazy sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= '(1 4 7 10 13) (take 5 (iterate #(+ 3 %) 1)))

;; 4Clojure Question 46
;;
;; Write a higher-order function which flips the order of the arguments of an input function.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 3 (((fn [f] (fn [& args] (apply f (reverse args)))) nth) 2 [1 2 3 4 5]))

(= true (((fn [f] (fn [& args] (apply f (reverse args)))) >) 7 8))

(= 4 (((fn [f] (fn [& args] (apply f (reverse args)))) quot) 2 8))

(= [1 2 3] (((fn [f] (fn [& args] (apply f (reverse args)))) take) [1 2 3 4 5] 3))

;; 4Clojure Question 47
;;
;; The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;;
;; Use M-x 4clojure-check-answers when you're done!

(contains? #{4 5 6} 4)

(contains? [1 1 1 1 1] 4)

(contains? {4 :a 2 :b} 4)

(not (contains? [1 2 4] 4))

;; 4Clojure Question 48
;;
;; The some function takes a predicate function and a collection.  It returns the first logical true value of (predicate x) where x is an item in the collection.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 6 (some #{2 7 6} [5 6 7 8]))

(= 6 (some #(when (even? %) %) [5 6 7 8]))

;; 4Clojure Question 49
;;
;; Write a function which will split a sequence into two parts.
;;
;; Restrictions (please don't use these function(s)): split-at
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(vector (take %1 %2) (drop %1 %2)) 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= (#(vector (take %1 %2) (drop %1 %2)) 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= (#(vector (take %1 %2) (drop %1 %2)) 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

;; 4Clojure Question 50
;;
;; Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (set
    ((comp vals (partial group-by type))
     [1 :a 2 :b 3 :c]))
   #{[1 2 3] [:a :b :c]})

(= (set
    ((comp vals (partial group-by type))
     [:a "foo"  "bar" :b]))
   #{[:a :b] ["foo" "bar"]})

(= (set
    ((comp vals (partial group-by type))
     [[1 2] :a [3 4] 5 6 :b]))
   #{[[1 2] [3 4]] [:a :b] [5 6]})

;; 4Clojure Question 51
;;
;; Here is an example of some more sophisticated destructuring.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [1 2 [3 4 5] [1 2 3 4 5]]
   (let [[a b & c :as d] (range 1 6)]
     [a b c d]))

;; 4Clojure Question 52
;;
;; Let bindings and function parameter lists support destructuring.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [2 4] (let [[a b c d e] [0 1 2 3 4]] [c e]))

;; 4Clojure Question 53
;;
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [coll]
      (#(concat (first %)
                (map second (rest %)))
       (->> coll
            (partition 2 1)
            (partition-by
             #(reduce (fn [x y] (= (inc x) y)) %))
            (filter (fn [[[x1 x2]]] (< x1 x2)))
            (sort-by count >)
            first)))
    [1 0 1 2 3 0 4 5])
   [0 1 2 3])

(= ((fn [coll]
      (#(concat (first %)
                (map second (rest %)))
       (->> coll
            (partition 2 1)
            (partition-by
             #(reduce (fn [x y] (= (inc x) y)) %))
            (filter (fn [[[x1 x2]]] (< x1 x2)))
            (sort-by count >)
            first)))
    [5 6 1 3 2 7]) [5 6])

(= ((fn [coll]
      (#(concat (first %)
                (map second (rest %)))
       (->> coll
            (partition 2 1)
            (partition-by
             #(reduce (fn [x y] (= (inc x) y)) %))
            (filter (fn [[[x1 x2]]] (< x1 x2)))
            (sort-by count >)
            first)))
    [2 3 3 4 5]) [3 4 5])

(= ((fn [coll]
      (#(concat (first %)
                (map second (rest %)))
       (->> coll
            (partition 2 1)
            (partition-by
             #(reduce (fn [x y] (= (inc x) y)) %))
            (filter (fn [[[x1 x2]]] (< x1 x2)))
            (sort-by count >)
            first)))
    [7 6 5 4]) [])

;; 4Clojure Question 54
;;
;; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
;;
;; Restrictions (please don't use these function(s)): partition, partition-all
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn func [n c]
      (when (>= (count c) n)
        (cons (take n c)
              (func n (drop n c)))))
    3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))

(= ((fn func [n c]
      (when (>= (count c) n)
        (cons (take n c)
              (func n (drop n c)))))
    2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= ((fn func [n c]
      (when (>= (count c) n)
        (cons (take n c)
              (func n (drop n c)))))
    3 (range 8)) '((0 1 2) (3 4 5)))

;; 4Clojure Question 55
;;
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;;
;; Restrictions (please don't use these function(s)): frequencies
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 (#(apply merge-with +
          (for [elem %] {elem 1}))
  [1 1 2 3 2 1 1])
 {1 4, 2 2, 3 1})

(=
 (#(apply merge-with +
          (for [elem %] {elem 1}))
  [:b :a :b :a :b])
 {:a 2, :b 3})

(=
 (#(apply merge-with +
          (for [elem %] {elem 1}))
  '([1 2] [1 3] [1 3]))
 {[1 2] 1, [1 3] 2})

;; 4Clojure Question 56
;;
;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;;
;; Restrictions (please don't use these function(s)): distinct
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 (reduce
  #(if ((set %1) %2) %1 (conj %1 %2))
  [] [1 2 1 3 1 2 4])
 [1 2 3 4])

(=
 (reduce
  #(if ((set %1) %2) %1 (conj %1 %2))
  [] [:a :a :b :b :c :c])
 [:a :b :c])

(=
 (reduce
  #(if ((set %1) %2) %1 (conj %1 %2))
  [] '([2 4] [1 2] [1 3] [1 3]))
 '([2 4] [1 2] [1 3]))

(=
 (reduce
  #(if ((set %1) %2) %1 (conj %1 %2))
  [] (range 50))
 (range 50))

;; 4Clojure Question 57
;;
;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= '(5 4 3 2 1)
   ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; 4Clojure Question 58
;;
;; Write a function which allows you to create function compositions.  The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.
;;
;; Restrictions (please don't use these function(s)): comp
;;
;; Use M-x 4clojure-check-answers when you're done!

(=
 [3 2 1]
 (((fn [& args]
     (reduce
      (fn [f g] #(f (apply g %&))) args))
   rest reverse)
  [1 2 3 4]))

(=
 5
 (((fn [& args]
     (reduce
      (fn [f g] #(f (apply g %&))) args))
   (partial + 3) second)
  [1 2 3 4]))

(=
 true
 (((fn [& args]
     (reduce
      (fn [f g] #(f (apply g %&))) args))
   zero? #(mod % 8) +)
  3 5 7 9))

;; 4Clojure Question 59
;;
;; Take a set of functions and return a new function that takes a variable number of arguments and returns a sequence containing the result of applying each function left-to-right to the argument list.
;;
;; Restrictions (please don't use these function(s)): juxt
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [21 6 1]
   (((fn [& args]
       (fn [& args2]
         (map #(apply % args2) args)))
     + max min) 2 3 5 1 6 4))

(= ["HELLO" 5]
   (((fn [& args]
       (fn [& args2]
         (map #(apply % args2) args)))
     #(.toUpperCase %) count) "hello"))

(= [2 6 4]
   (((fn [& args]
       (fn [& args2]
         (map #(apply % args2) args)))
     :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))

;; 4Clojure Question 60
;;
;; Write a function which behaves like reduce, but returns each intermediate value of the reduction.  Your function must accept either two or three arguments, and the return sequence must be lazy.
;;
;; Restrictions (please don't use these function(s)): reductions
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (take 5
         ((fn reduce-
            ([f coll]
             (reduce- f (first coll) (next coll)))
            ([f init [h & t :as coll]]
             (cons init
                   (lazy-seq
                    (if (seq coll)
                      (reduce- f (f init h) t))))))
          + (range))) [0 1 3 6 10])

(= ((fn reduce-
      ([f coll]
       (reduce- f (first coll) (next coll)))
      ([f init [h & t :as coll]]
       (cons init
             (lazy-seq
              (if (seq coll)
                (reduce- f (f init h) t))))))
    conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last
    ((fn reduce-
       ([f coll]
        (reduce- f (first coll) (next coll)))
       ([f init [h & t :as coll]]
        (cons init
              (lazy-seq
               (if (seq coll)
                 (reduce- f (f init h) t))))))
     * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)

;; 4Clojure Question 61
;;
;; Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;;
;; Restrictions (please don't use these function(s)): zipmap
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(apply hash-map (interleave %1 %2))
    [:a :b :c] [1 2 3])
   {:a 1, :b 2, :c 3})

(= (#(apply hash-map (interleave %1 %2))
    [1 2 3 4] ["one" "two" "three"])
   {1 "one", 2 "two", 3 "three"})

(= (#(apply hash-map (interleave %1 %2))
    [:foo :bar] ["foo" "bar" "baz"])
   {:foo "foo", :bar "bar"})

;; 4Clojure Question 62
;;
;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;;
;; Restrictions (please don't use these function(s)): iterate
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (take 5 ((fn iterate- [f init]
              (cons init
                    (lazy-seq
                     (iterate- f (f init)))))
            #(* 2 %) 1))
   [1 2 4 8 16])

(= (take 100 ((fn iterate- [f init]
                (cons init
                      (lazy-seq
                       (iterate- f (f init)))))
              inc 0))
   (take 100 (range)))

(= (take 9 ((fn iterate- [f init]
              (cons init
                    (lazy-seq
                     (iterate- f (f init)))))
            #(inc (mod % 3)) 1))
   (take 9 (cycle [1 2 3])))

;; 4Clojure Question 63
;;
;; Given a function f and a sequence s, write a function which returns a map.  The keys should be the values of f applied to each item in s.  The value at each key should be a vector of corresponding items in the order they appear in s.
;;
;; Restrictions (please don't use these function(s)): group-by
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(apply merge-with into
            (for [elem %2]
              {(%1 elem) [elem]}))
    #(> % 5) [1 3 6 8])
   {false [1 3], true [6 8]})

(= (#(apply merge-with into
            (for [elem %2]
              {(%1 elem) [elem]}))
    #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

(= (#(apply merge-with into
            (for [elem %2]
              {(%1 elem) [elem]}))
    count [[1] [1 2] [3] [1 2 3] [2 3]])
   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

;; 4Clojure Question 64
;;
;; <a href='http://clojuredocs.org/clojure_core/clojure.core/reduce'>Reduce</a> takes a 2 argument function and an optional starting value. It then applies the function to the first 2 items in the sequence (or the starting value and the first element of the sequence). In the next iteration the function will be called on the previous return value and the next item from the sequence, thus reducing the entire collection to one value. Don't worry, it's not as complicated as it sounds.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= 15 (reduce + [1 2 3 4 5]))

(=  0 (reduce + []))

(=  6 (reduce + 1 [2 3]))

;; 4Clojure Question 65
;;
;; Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.<br /><br />Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.<br />You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
;;
;; Restrictions (please don't use these function(s)): class, type, Class, vector?, sequential?, list?, seq?, map?, set?, instance?, getClass
;;
;; Use M-x 4clojure-check-answers when you're done!

(= :map
   (#(cond (= (get (conj % [:t "t"]) :t) "t") :map
           (= (get (conj % :t) :t) :t) :set
           (= (first (conj (conj % :a) :b)) :b) :list
           (= (last (conj (conj % :a) :b)) :b) :vector)
    {:a 1, :b 2}))

(= :list
   (#(cond (= (get (conj % [:t "t"]) :t) "t") :map
           (= (get (conj % :t) :t) :t) :set
           (= (first (conj (conj % :a) :b)) :b) :list
           (= (last (conj (conj % :a) :b)) :b) :vector)
    (range (rand-int 20))))

(= :vector
   (#(cond (= (get (conj % [:t "t"]) :t) "t") :map
           (= (get (conj % :t) :t) :t) :set
           (= (first (conj (conj % :a) :b)) :b) :list
           (= (last (conj (conj % :a) :b)) :b) :vector)
    [1 2 3 4 5 6]))

(= :set
   (#(cond (= (get (conj % [:t "t"]) :t) "t") :map
               (= (get (conj % :t) :t) :t) :set
               (= (first (conj (conj % :a) :b)) :b) :list
               (= (last (conj (conj % :a) :b)) :b) :vector)
        #{10 (rand-int 5)}))

(= [:map :set :vector :list]
   (map #(cond (= (get (conj % [:t "t"]) :t) "t") :map
               (= (get (conj % :t) :t) :t) :set
               (= (first (conj (conj % :a) :b)) :b) :list
               (= (last (conj (conj % :a) :b)) :b) :vector)
        [{} #{} [] ()]))

;; 4Clojure Question 66
;;
;; Given two integers, write a function which
;;
;; returns the greatest common divisor.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn gcd [a b]
      (if (zero? b) a (recur b (mod a b))))
    2 4) 2)

(= ((fn gcd [a b]
      (if (zero? b) a (recur b (mod a b))))
    10 5) 5)

(= ((fn gcd [a b]
      (if (zero? b) a (recur b (mod a b))))
    5 7) 1)

(= ((fn gcd [a b]
      (if (zero? b) a (recur b (mod a b))))
    1023 858) 33)

;; 4Clojure Question 67
;;
;; Write a function which returns the first x
;;
;; number of prime numbers.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn prime-gen [cnt]
      (let [prime?
            (fn [n]
              (not (some #(and (not= n %)
                               (zero? (mod n %)))
                         (range 2 (inc (Math/sqrt n))))))]
        (take cnt (filter prime? (iterate inc 2))))) 2)
   [2 3])

(= ((fn prime-gen [cnt]
      (let [prime?
            (fn [n]
              (not (some #(and (not= n %)
                               (zero? (mod n %)))
                         (range 2 (inc (Math/sqrt n))))))]
        (take cnt (filter prime? (iterate inc 2))))) 5)
   [2 3 5 7 11])

(= (last
    ((fn prime-gen [cnt]
       (let [prime?
             (fn [n]
               (not (some #(and (not= n %)
                                (zero? (mod n %)))
                          (range 2 (inc (Math/sqrt n))))))]
         (take cnt (filter prime? (iterate inc 2))))) 100))
   541)

;; 4Clojure Question 68
;;
;; Clojure only has one non-stack-consuming looping construct: recur.  Either a function or a loop can be used as the recursion point.  Either way, recur rebinds the bindings of the recursion point to the values it is passed.  Recur must be called from the tail-position, and calling it elsewhere will result in an error.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= [7 6 5 4 3]
   (loop [x 5
          result []]
     (if (> x 0)
       (recur (dec x) (conj result (+ 2 x)))
       result)))

;; 4Clojure Question 69
;;
;; Write a function which takes a function f and a variable number of maps.  Your function should return a map that consists of the rest of the maps conj-ed onto the first.  If a key occurs in more than one map, the mapping(s) from the latter (left-to-right) should be combined with the mapping in the result by calling (f val-in-result val-in-latter)
;;
;; Restrictions (please don't use these function(s)): merge-with
;;
;; Use M-x 4clojure-check-answers when you're done!

(= ((fn [f & maps]
      (reduce (fn [map1 map2]
                (reduce (fn [map [key val]]
                          (if (contains? map key)
                            (update-in map [key] f val)
                            (assoc map key val)))
                        map1 map2))
              maps))
    * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})

(= ((fn [f & maps]
      (reduce (fn [map1 map2]
                (reduce (fn [map [key val]]
                          (if (contains? map key)
                            (update-in map [key] f val)
                            (assoc map key val)))
                        map1 map2))
              maps))
    - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

(= ((fn [f & maps]
      (reduce (fn [map1 map2]
                (reduce (fn [map [key val]]
                          (if (contains? map key)
                            (update-in map [key] f val)
                            (assoc map key val)))
                        map1 map2))
              maps))
    concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})

;; 4Clojure Question 70
;;
;; Write a function that splits a sentence up into a sorted list of words.  Capitalization should not affect sort order and punctuation should be ignored.
;;
;; Use M-x 4clojure-check-answers when you're done!

(= (#(->> %
          (re-seq #"[A-za-z]+")
          (sort-by clojure.string/lower-case))
    "Have a nice day.")
   ["a" "day" "Have" "nice"])

(= (#(->> %
          (re-seq #"[A-za-z]+")
          (sort-by clojure.string/lower-case))
    "Clojure is a fun language!")
   ["a" "Clojure" "fun" "is" "language"])

(= (#(->> %
          (re-seq #"[A-za-z]+")
          (sort-by clojure.string/lower-case))
    "Fools fall for foolish follies.")
   ["fall" "follies" "foolish" "Fools" "for"])
