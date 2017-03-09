(ns sesame.components.reagent
  (:require [com.stuartsierra.component :as component]
            [reagent.core :as reagent]))

(defrecord ReagentRoot [comp container]
  component/Lifecycle
  (start [this]
    (reagent/render [comp] container)
    this)
  (stop [this]
    (reagent/unmount-component-at-node container)
    this))

(defn new-reagent-root [comp container]
  (map->ReagentRoot {:comp comp :container container}))
