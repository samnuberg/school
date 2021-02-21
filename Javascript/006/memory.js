var memoryCard;
var random = 0;
var randomNumbers = [];
var firstCard, secondCard;
var checked = false;
var score1 = 0;
var score2 = 0;
var beurt = true;
createPicsHolders();
createRandomNumbersArray();
fillPicsHoldersWithBackground();


function createPicsHolders() {
    pics = document.getElementById("pics");
    for (var i = 0; i < 18; i++) {
        var pictureHolder = document.createElement("div");
        pictureHolder.className = "picture-holder";
        pictureHolder.id = "picture-holder-"+i;
        pics.appendChild(pictureHolder);
    }
}

function createRandomNumbersArray(){
    while (randomNumbers.length < 18){
        random = Math.floor(Math.random() * 18) + 1;
        if (randomNumbers.lastIndexOf(random) == -1){
            randomNumbers.push(random);
        }
    }
}

function fillPicsHoldersWithBackground() {
    var pictureHolders = document.getElementsByClassName("picture-holder");
    for (var teller = 0; teller < pictureHolders.length; teller++){
        memoryCard = document.createElement("img");
        memoryCard.src = "img/background.png";
        memoryCard.id = randomNumbers[teller];
        memoryCard.addEventListener( "click", function () {
            showPicsWhenClickedOn(this.id);
            givePicturesId(this.id);
        });
        pictureHolders[teller].appendChild(memoryCard);
    }
}



function showPicsWhenClickedOn(id) {
    var clickedPicture = document.getElementById(id)
    clickedPicture.src = "img/logo" + id + ".png";
}

function givePicturesId(id) {
    if (firstCard && !secondCard) secondCard = id;
    if (!firstCard) firstCard = id;
    if (firstCard && secondCard) {
        var idOne = parseInt(firstCard);
        var idTwo = parseInt(secondCard);
        checkForSamePictures(idOne, idTwo);
    }
}

function checkForSamePictures(idOne, idTwo) {
    if (idOne == (idTwo + 9) ) {
            checked = true;
    } else if (idOne == (idTwo - 9) ){
        checked = true;
    }
}

function buttonNext() {
    var idOne = parseInt(firstCard);
    var idTwo = parseInt(secondCard);
    addScoreToPlayer();
    resetPicturesAfterFalseCombination(idOne, idTwo);
    resetValuesAfterPlayersTurn();
    TurnOfPlayerIndicator();
    printWinnerOfTheGame();
    generateButtonForNewGame()
}

function resetPicturesAfterFalseCombination(idOne, idTwo) {
    if (checked == false) {
        if (beurt == true) beurt = false;
        else if (beurt == false) beurt = true;
        var falsePictureOne = document.getElementById(idOne)
        falsePictureOne.src = "img/background.png";
        var falsePictureTwo = document.getElementById(idTwo)
        falsePictureTwo.src = "img/background.png";
    }
}

function addScoreToPlayer() {
    if (checked == true) {
        if (beurt == true) {
            score1 += 1;
            document.getElementById("player1-score").innerText = "Score:" + score1;
        } else if (beurt == false){
            score2 += 1;
            document.getElementById("player2-score").innerText = "Score:" + score2;
        }
    }
}

function resetValuesAfterPlayersTurn() {
    if (secondCard) {
        firstCard = null;
        secondCard = null;
        checked = false;
    }
}

function TurnOfPlayerIndicator() {
    if (beurt == true) document.getElementById("beurt").innerHTML = "<h1>Player 1 is aan de beurt</h1>" ;
    else if (beurt == false) document.getElementById("beurt").innerHTML = "<h1>Player 2 is aan de beurt</h1>" ;
}

function printWinnerOfTheGame() {
    if (score1 + score2 == 9){
        document.getElementById("beurt").innerHTML = "<h1>De winnaar is:</h1>" ;
        if (score1 > score2) document.getElementById("beurt").innerHTML = "<h1>De winnaar is Player 1!</h1>";
        if (score2 > score1) document.getElementById("beurt").innerHTML = "<h1>De winnaar is Player 2!</h1>";
        if (score2 == score1) document.getElementById("beurt").innerHTML = "<h1>Het is een gelijk spel!</h1>";
    }
}

function generateButtonForNewGame() {
    if (score1 + score2 == 9) {
        document.getElementById("nieuw-spel-knop").style.visibility = "visible";
        document.getElementById("knop").style.visibility = "hidden";
    }
}




