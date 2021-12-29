(ns cljcw.core
  (:require [clojure.string :as str]))

(defn square-sum [lst]
  ;; TODO
  (reduce + 
    (map #(* % %) lst))
  )


(defn jaden-case 
  ; title words in string

  [s]
  (->> 
    (str/split (str s) #" ")
    (map str/capitalize)
    (str/join " ")))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn row-sum-odd-numbers 
  "Calculate the sum of the numbers in the nth row of this triangle (starting at index 1)"
  [row-num]
  (exp row-num 3)
)

(defn find-average
  [numbers]
  (/ (apply + numbers) (count numbers)))


(defn string-to-number [str]
  (read-string str)
)


(defn number [lines]
  "Create map with k - number, v - lines"
  ; TODO
  (->(zipmap (iterate inc 1) lines)
    ())
  )

(comment
  (square-sum [5 3 4])
  (square-sum [1 2])
  (jaden-case "How can mirrors be real if our eyes aren't real")
  (find-average [1 2 3 4])
  (find-average [1 1 1])
  (number [1 2 3 4])
)