(ns euler.euler-3
  (:require [euler.util :as util]))

(defn primes-reversed
  [number]
  (take-while #(< % number) util/primes))

(defn euler
  [number]
  (last (filter #(zero? (mod number %)) (primes-reversed (int (Math/sqrt number))))))
