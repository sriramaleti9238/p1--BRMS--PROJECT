  
  const buttons = document.getElementsByName("passengers[1][seat]");
  const result = document.getElementById("result");
  
  const buttonPressed = (e) => {
    result.innerHTML = `<strong>${e.target.value}</strong>`;
    const re = ` ${e.target.value}`;
  };

  for (let button of buttons) {
    button.addEventListener("click", buttonPressed);
  }
  function func() {
    var f = document.getElementbyid("result").value;
    alert(f);
  }