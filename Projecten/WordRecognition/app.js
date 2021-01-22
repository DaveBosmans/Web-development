

var message = document.querySelector('#message');


var SpeechRecognition = SpeechRecognition || webkitSpeechRecognition
var SpeechGrammarList = SpeechGrammarList || webkitSpeechGrammarList
var SpeechRecognitionEvent = SpeechRecognitionEvent || webkitSpeechRecognitionEvent



var grammer = '#JSGF V1.0;'; //woorden

var recognition = new SpeechRecognition();
var speechRecognitionGrammerList = new SpeechGrammarList ();
speechRecognitionGrammerList.addFromString(grammer, 1);

recognition.grammers = speechRecognitionGrammerList;
recognition.lang = 'nl-NL', 'us-US'; //Welke taal je spreekt.
recognition.interimResults = true; //false ... Dit is detecting de woorden on the fly
recognition.continuous = true; //doorgaan met luisteren of niet

// onresult
// onspeechend
// onerror



recognition.onresult = function (event) {
    var last = event.results.length - 1;
    var wordsSaid = event.results[last] [0].transcript;
    message.textContent = "Uw Woorden: " + wordsSaid + ".";
    console.log(wordsSaid);
    let words = document.getElementById("word").value;

    console.log(words);

    if (wordsSaid.includes(words)) {
        var audio = new Audio ('Copy of explosie.mp3');
        audio.play();
        console.log("!!!!!!!!!!!!!!!!!!");
        
    } 

    
}




recognition.onerror = function(event) {
    message.textContent = "Error occurred in recognition" + event.error; 
}


document.querySelector('#btnStart').addEventListener('click' , function(event){
    recognition.start();
});