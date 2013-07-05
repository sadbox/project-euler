(ns euler.euler-3
  (:require [clojure.contrib.lazy-seqs :as lazyseqs]))

(defn primes-reversed
  [number]
  (reverse (take-while #(< % number) lazyseqs/primes)))

(defn euler
  [number]
  (first (filter #(zero? (mod number %)) (primes-reversed (int (Math/sqrt number))))))
