(ns euler.euler-7
  (:require [clojure.contrib.lazy-seqs :as lazyseqs]))

(defn seven
  [number]
  (nth lazyseqs/primes (- number 1)))

