(ns euler.core
  (:require [euler.euler-1 :as euler1]
            [euler.euler-2 :as euler2]
            [euler.euler-3 :as euler3]
            [euler.euler-4 :as euler4]
            [euler.euler-5 :as euler5]
            [euler.euler-7 :as euler7])
  (:gen-class))

(defn -main
  [& args]
  (println "### Project Euler ###")
  (println "Problem 1:")
  (println (euler1/euler-bo))
  (println "Problem 2:")
  (println (euler2/euler 4000000))
  (println "Problem 3:")
  (println (euler3/euler 600851475143))
  (println "Problem 4:")
  (println (euler4/euler 99 1000))
  (println "Problem 5:")
  (println (euler5/five 20))
  (println "Problem 7:")
  (println (euler7/seven 10001)))
