def call(String url, String branch){
  echo "This is cloning the code"
  git url: "S{url}", branch: "${branch}
  echo "Code Cloning Successful."
}
