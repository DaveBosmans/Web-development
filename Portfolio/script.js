// NAVBAR SWITCH
const open = document.getElementById('open')
const close = document.getElementById('close')
const container = document.querySelector('.container')

open.addEventListener('click', () => container.classList.add('show-nav'))

close.addEventListener('click', () => container.classList.remove('show-nav'))

// -------------------------------------------------------------------------------------

// BANNER SQUARES

const squareContainer = document.getElementById("squareContainer");
const colorsSquare = ['#e74c3c', '#8e44ad', '#3498db', '#e67e22', '#2ecc71'];
const SQUARES = 4000;

for (let i = 0; i < SQUARES; i++) {
    const square = document.createElement('div');
    square.classList.add('square');


    square.addEventListener('mouseover', () => setColor(square));

    square.addEventListener('mouseout', () => removeColor(square));

    squareContainer.appendChild(square);
}

function setColor(element){
    const color = getRandomColor();
    element.style.background = color;
    // element.style.boxShadow = `0 0 2px ${color}, 0 0 10px ${color}`;
}

function removeColor(element){
    element.style.background = '';
    // element.style.boxShadow = '0 0 2px #000';
}

function getRandomColor(){
    return colorsSquare[Math.floor(Math.random() * colorsSquare.length)];
}

// ----------------------------------------------------------------------------------------------