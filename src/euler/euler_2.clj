(ns euler.euler-2)

(defn fib-seq []
  (( fn rfib [a b]
    (lazy-seq (cons a (rfib b (+ a b)))))
  0 1))

(defn euler [maxnum]
  (apply +
    (take-while #(< % maxnum)
      (filter #(zero? (mod % 2)) (fib-seq)))))
