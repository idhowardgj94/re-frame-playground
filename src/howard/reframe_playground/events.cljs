(ns howard.reframe-playground.events
    (:require
     [re-frame.core :as re-frame]
     [howard.reframe-playground.db :as db]
     [day8.re-frame.tracing :refer-macros [fn-traced]]
     ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::click-button
 (fn-traced [db e]
   (js/console.log (clj->js db) ", " (clj->js e))
   (assoc db :author  "howard2")))

(re-frame/reg-event-fx
 ::click-button-2
 (fn-traced [{:keys [db]} event]
   (js/console.log (clj->js db) ", " (clj->js event))
   {:db (assoc db :author "howard3")}))

(re-frame/reg-event-ctx
 ::click-button-3
 (fn [ctx event]
   (js/console.log (clj->js ctx) ", " (clj->js event))))
#_(
   (require '[cljs.repl :refer [doc]])
   (doc re-frame/reg-event-db)
   (doc re-frame/reg-event-fx)
   (doc re-frame/reg-event-ctx)
   (doc assoc)
   ,)
