# Telepresence :  A local development environment for a remote Kubernetes cluster
Telepresence is an open source tool that lets you run a single service locally, while connecting that service to a remote Kubernetes cluster.

local debugging

http://127.0.0.1:4986/       

microservice debugging

http://127.0.0.1:30893/      

Prerequisites:
Docker Desktop is installed and kubernetes is activated

For Windows download from:

https://app.getambassador.io/download/tel2/windows/amd64/latest/telepresence.zip



```
cd telepresence

Set-ExecutionPolicy Bypass -Scope Process
.\install-telepresence.ps1

telepresence helm install

telepresence connect

```



<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/telepresence.png"><br/>
   __Telepresence Status and List__
</p>




<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/intercept.png"><br/>
   #### Telepresence  Intercept
</p>



<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_idea.png"><br/>
    #### set break-points  to idea
</p>




<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/deploymentsandbrowser.png"><br/>
    __Comparison__
</p>






<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_locally.png"><br/>
    __debug locally__
</p>


<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_microservice.png"><br/>
    __debug remote microservice__
</p>




