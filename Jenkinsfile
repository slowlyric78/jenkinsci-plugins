node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      checkout scm
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      // mvnHome = tool 'M3'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "mvn -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/mvn.cmd -Dmaven.test.failure.ignore clean package/)
      }
      echo 'X-DRun-Model-Id:Model_1'
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
      archive 'src/*.ipynb'
      sh 'cp src/notebook.html notebook.html'
      archive 'notebook.html'
      // archive 'model.json'

   }
}
