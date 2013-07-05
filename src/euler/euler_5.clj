(ns euler.euler-5
  (:require [clojure.contrib.lazy-seqs :as lazyseqs]))

(defn result-of-primes
  [maxnum]
  (apply * (take-while #(< % maxnum) lazyseqs/primes)))

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
