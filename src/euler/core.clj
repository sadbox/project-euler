(ns euler.core
  (:require [euler.euler_1 :as euler1]
            [euler.euler_2 :as euler2])
  (:gen-class))

(defn -main
  [& args]
  (println "### Project Euler ###")
  (println "Problem 1:")
  (println (euler1/euler-bo) (euler1/euler-aaron))
  (println "Problem 2:")
  (println (euler2/euler-2))
  (println "Problem 3:"))
