(ns euler.util)

(defn div?
  [a b]
  (zero? (mod a b)))

(def primes
  (filter 
    (fn [y] 
      (not-any? 
        #(div? y %) 
        (range 3 (int (Math/sqrt y)) 2)))
    (rest (range))))
