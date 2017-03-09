(ns sesame.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [sesame.core-test]
   [sesame.common-test]))

(enable-console-print!)

(doo-tests 'sesame.core-test
           'sesame.common-test)
