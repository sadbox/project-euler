(ns euler.euler-3
  (:require [euler.util :as util]))

(defn primes-until
  [number]
  (take-while #(< % number) util/primes))

(defn euler
  [number]
  (last (filter #(zero? (mod number %)) (primes-until (int (Math/sqrt number))))))
