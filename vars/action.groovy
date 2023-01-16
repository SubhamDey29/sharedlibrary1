parameters{
        choice(
            name:'Action',
            choices: ['Build','Destroy'],
            description: 'What do you want to perform?'
        )
}
def terraformAction()
    {
        if(params.Action=='Build'){
        sh("terraform apply -auto-approve");
        }
        else if(params.Action=='Destroy'){
        sh("terraform destroy -auto-approve");
        }
    }
       
