let outputScreen = document.getElementById("output");
function inputButtons(pressed) {
  let buttonInput = pressed.innerHTML;
  document.getElementById("AC").innerHTML = "C";
  if (
    buttonInput == "/" ||
    buttonInput == "*" ||
    buttonInput == "+" ||
    buttonInput == "-" ||
    buttonInput == "="
  ) {
    pressed.style.backgroundColor = "green";
    setTimeout(() => {
      pressed.style.backgroundColor = "";
    }, 500);
  }
  if (buttonInput == "=") {
    outputScreen.innerHTML = +parseFloat(eval(outputScreen.innerHTML)).toFixed(2);
    console.log(typeof test);
    console.log(outputScreen);
    console.log("datatype " + typeof outputScreen.innerHTML);
  } else if (buttonInput == "AC" || buttonInput == "C") {
    outputScreen.innerHTML = 0;
    document.getElementById("AC").innerHTML = "AC";
  } else if (buttonInput == "+/-") {
    outputScreen.innerHTML = outputScreen.innerHTML * -1;
  } else {
    if (outputScreen.innerHTML == "0") {
      outputScreen.innerHTML = buttonInput;
    } else {
      outputScreen.innerHTML += buttonInput;
    }
  }
}

document.getElementById("calculation").addEventListener("click", function(){
    console.log("hry");
})