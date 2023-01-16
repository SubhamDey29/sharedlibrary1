
def call()
    {
        if(params.Action=='Build'){
        sh("terraform apply -auto-approve");
        }
        else if(params.Action=='Destroy'){
        sh("terraform destroy -auto-approve");
        }
        echo "hi"
    }

       
