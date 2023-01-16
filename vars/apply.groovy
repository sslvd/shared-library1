def call(){
  input message:'terraform apply?',ok:'yes'
                 sh("terraform apply -auto-approve");
                 }
