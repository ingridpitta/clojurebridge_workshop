(defproject cipher "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"] [midje "1.9.0"]]
  :plugins [[lein-midje "3.2.1"]]
  :repl-options {:init-ns cipher.core})
