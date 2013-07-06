(ns euler.euler-4
  (require [clojure.math.combinatorics :as combos]))

(defn is-palindrome
  [number]
  (= (apply str (reverse (str number)))
     (str number)))

(defn euler
  [lower upper]
  (reduce max 
    (filter is-palindrome 
      (map 
        #(apply * %) 
        (combos/selections (range lower upper) 2)))))
