//Define Function
def call (String ProectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:#{ImageTag} ."
}
