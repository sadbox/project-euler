(ns euler.euler_2)

(defn fib-seq []
  (( fn rfib [a b]
    (lazy-seq (cons a (rfib b (+ a b)))))
  0 1))

(defn euler-2 []
  (apply +
    (take-while #(< % 4000000)
      (filter #(zero? (mod % 2)) (fib-seq)))))
