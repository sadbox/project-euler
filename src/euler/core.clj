(ns euler.core
  (:require [euler.euler-1 :as euler1]
            [euler.euler-2 :as euler2]
            [euler.euler-3 :as euler3])
  (:gen-class))

(defn -main
  [& args]
  (println "### Project Euler ###")
  (println "Problem 1:")
  (println (euler1/euler-bo) (euler1/euler-aaron))
  (println "Problem 2:")
  (println (euler2/euler 4000000))
  (println "Problem 3:")
  (println (euler3/euler 600851475143)))
