(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.6.2"]
                 [compojure "1.6.0"]
                 [environ "1.1.0"]
                 [hiccup "1.0.5"]
                 [org.clojure/java.jdbc "LATEST"]
                 [org.postgresql/postgresql "LATEST"]]
  :plugins[[lein-environ "1.1.0"]]
  :profiles {:dev {:dependencies [[prone "1.1.4"]]
                   :env {:dev true}}})
