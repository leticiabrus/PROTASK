let form = document.getElementById("form");
let nomeInput = document.getElementById("nomeInput");
let CardInput = document.getElementById("CardInput");
let msg = document.getElementById("msg");
let Sprints = document.getElementById("Sprints");
let add = document.getElementById("add");

form.addEventListener("submit", (e) => {
    e.preventDefault();
    formValidation();
  });
  
  let formValidation = () => {
    if (nomeInput.value === "") {
      console.log("failure");
      msg.innerHTML = "Sprint não pode ser vazio.";
    } else {
      console.log("success");
      msg.innerHTML = "";
      acceptData();
      add.setAttribute("data-bs-dismiss", "modal");
      add.click();
  
      (() => {
        add.setAttribute("data-bs-dismiss", "");
      })();
    }
  };
  
  let data = [{}];
  
  let acceptData = () => {
    data.push({
      nome: nomeInput.value,
      banda: CardInput.value,
    });
  
    localStorage.setItem("data", JSON.stringify(data));
  
    console.log(data);
    createSprints();
  };
  
  let createSprints = () => {
    sprints.innerHTML = "";
    data.map((x, y) => {
      return (sprint.innerHTML += `
      <div id=${y}>
            <span class="fw-bold">${x.nome}</span>
            <span class="fw-bold">${x.card}</span>
   
            <span class="options">
              <i onClick= "editSprints(this)" data-bs-toggle="modal" data-bs-target="#form" class="fas fa-edit"></i>
              <i onClick ="deleteSprints(this);createSprints()" class="fas fa-trash-alt"></i>
            </span>
          </div>
      `);
    });
  
    resetForm();
  };
  
  let deleteSprints = (e) => {
    e.parentElement.parentElement.remove();
    data.splice(e.parentElement.parentElement.id, 1);
    localStorage.setItem("data", JSON.stringify(data));
    console.log(data);
    
  };
  
  let editCard = (e) => {
    let selectedCard = e.parentElement.parentElement;
  
    nomeInput.value = selectedCard.children[0].innerHTML;
    bandaInput.value = selectedCard.children[1].innerHTML;
  
    deleteCard(e);
  };
  
  let resetForm = () => {
    nomeInput.value = "";
    bandaInput.value = "";
  };
  
  (() => {
    data = JSON.parse(localStorage.getItem("data")) || []
    console.log(data);
    createSprints();
  })();