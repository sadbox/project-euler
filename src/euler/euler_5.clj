(ns euler.euler-5
  (:require [euler.util :as util]))

(defn result-of-primes
  [maxnum]
  (apply * (take-while #(< % maxnum) util/primes)))

(defn five
  [maxnum]
  (first 
    (filter 
      (fn [x] 
        (every? 
          #(zero? (mod x %)) 
          (range 1 (+ 1 maxnum)))) 
      (map 
        #(* (result-of-primes maxnum) (+ 1 %)) 
        (range)))))
