let inputCpf = document.getElementById('CPF');

inputCpf.addEventListener('keyup', ()=>{
    // console.log(inputCpf.value)
    if(isNaN(inputCpf.value)){
        inputCpf.value = inputCpf.value.substring(0, (inputCpf.value.length -1))
    }
    if(inputCpf.value.length >11){
        inputCpf.value = inputCpf.value.substring(0,11)
    }
 })

 