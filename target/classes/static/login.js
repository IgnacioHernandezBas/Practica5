

const getFormLog=async()=>{
  let name=document.getElementById("nombre").value;
  let mail=document.getElementById("correo").value;
  let pass=document.getElementById("password").value;
  if(name=="" ||mail==""||pass=="")
  {
    alert("ERROR->HAY CAMPOS SIN RELLENAR");
    return false;
  }
  console.log(name + " "+mail+" "+pass);
  let peticion=await fetch("/login",
  {
    method:'POST',// El metodo a utilizar es POST
    credentials:"same-origin",// Mismas credenciales que en origen
    headers:{
      "Content-Type":"application/json" //Indicamos al programa que está enviando un json
    },
    body:JSON.stringify({
      nombre:name,
      correo:mail,
      password:pass 
    }),
    dataType:"json"
    })
      // Converting to JSON
    .then(peticion => peticion.json())
    
    // Displaying results to console
    .then(json => console.log(json));
 
}

const seeFilledClient=async()=>{
  let request= await fetch("/getCliente",
  {
   method:'GET',// El metodo a utilizar es GET
   credentials:"same-origin",// Mismas credenciales que en origen
   dataType:"json"
 }).catch(e=>console.log("ERROR"));
 if (request.ok){
   let datos= await request.json();
   console.log(datos.nombre);
   let div=document.getElementById("results");
   let text=document.createTextNode("Nombre: "+datos.nombre+" |Correo: "+datos.correo+" |Contraseña: "+datos.password);
   div.appendChild(text);
 }
}
