def call() {
    echo "Build stages"
    sh 'mvn clean install'
}
