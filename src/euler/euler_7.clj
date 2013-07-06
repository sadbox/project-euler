(ns euler.euler-7
  (:require [euler.util :as util]))

(defn seven
  [number]
  (nth util/primes (- number 1)))
