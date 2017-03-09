(ns sesame.system
  (:require [com.stuartsierra.component :as component]
            [sesame.core :refer [main-panel]]
            [sesame.components.reagent :refer [new-reagent-root]]))

(declare system)

(defn new-system []
  (component/system-map
   :reagent (new-reagent-root main-panel (js/document.getElementById "app"))))

(defn init []
  (set! system (new-system)))

(defn start []
  (set! system (component/start system)))

(defn stop []
  (set! system (component/stop system)))

(defn ^:export go []
  (init)
  (start))

(defn reset []
  (stop)
  (go))
