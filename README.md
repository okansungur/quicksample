# Telepresence :  A local development environment for a remote Kubernetes cluster
Telepresence is an open source tool that lets you run a single service locally, while connecting that service to a remote Kubernetes cluster.

Ngrok open your local environment to internet  ex: local jenkins  with expiration time of 2 hours
https://ngrok.com/


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
   <b>Telepresence Status and List</b>
</p>




<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/intercept.png"><br/>
  <b>Telepresence  Intercept</b>
</p>



<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_idea.png"><br/>
    <b>set break-points  to idea</b>
</p>




<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/deploymentsandbrowser.png"><br/>
    <b>Comparison</b>
</p>






<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_locally.png"><br/>
    <b>debug locally</b>
</p>


<p align="center">
  <img  src="https://github.com/okansungur/quicksample/blob/main/images/debug_microservice.png"><br/>
    <b>debug remote microservice</b>
</p>




