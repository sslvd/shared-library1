def call(){
  input message:'terraform apply?',ok:'yes'
                 sh("terraform -auto-approve");
                 }
