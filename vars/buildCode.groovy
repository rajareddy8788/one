def call() {
    echo "Build stage"
    sh 'mvn clean install'
}
