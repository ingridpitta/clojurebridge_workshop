(ns cipher.core-test
  (:require [cipher.core :as core]
            [midje.sweet :refer :all]))

(facts "recebe um caractere minúsculo e retorna sua posição no alfabeto: a = 0, b = 1, etc"
       (tabular
         (core/to-int ?char) => ?result
         ?char ?result
         \a    0
         \b    1
         \c    2
         \d    3))


(facts "recebe um caractere número inteiro e retorna o caractere correspondente: 0 = a, 1 = b, etc"
       (tabular
         (core/to-char ?int) => ?result
         ?int ?result
         0    \a
         1    \b
         2    \c
         3    \d))


(facts "retorna a nova posição do caractere"
       (tabular
         (core/shift ?char 20) => ?result
         ?char ?result
         \a    \u
         \b    \v
         \c    \w
         \d   \x))

(facts "retorna a nova string encriptada"
       (tabular
         (core/caesar-encrypt ?string 20) => ?result
         ?string ?result
         "abc"    "uvw"
         ))

(facts "retorna a nova string decriptada"
       (tabular
         (core/caesar-decrypt ?string 20) => ?result
         ?string ?result
         "uvw"    "abc"
         ))

