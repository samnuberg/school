var plaatjes = [1,2,3];
var teller = 0;
var slideholder1 = document.getElementById("slideframe1");
slideholder1.style.backgroundImage = "url('img/crookapp/eyes1.png')";
slideholder1.addEventListener("click", function () {
    slideholder1.style.backgroundImage = "url('img/crookapp/eyes"+getEyes()+".png')";
});

function getEyes() {
    if (teller >= plaatjes.length){
        teller = 0;
    }
    teller++;
    console.log(teller);
    return teller;
}

var slideholder2 = document.getElementById("slideframe2");
slideholder2.style.backgroundImage = "url('img/crookapp/nose1.png')";
slideholder2.addEventListener("click", function () {
    slideholder2.style.backgroundImage = "url('img/crookapp/nose"+getNose()+".png')";
});

function getNose() {
    if (teller >= plaatjes.length){
        teller = 0;
    }
    teller++;
    console.log(teller);
    return teller;
}

var slideholder3 = document.getElementById("slideframe3");
slideholder3.style.backgroundImage = "url('img/crookapp/mouth1.png')";
slideholder3.addEventListener("click", function () {
    slideholder3.style.backgroundImage = "url('img/crookapp/mouth"+getMouth()+".png')";
});

function getMouth() {
    if (teller >= plaatjes.length){
        teller = 0;
    }
    teller++;
    console.log(teller);
    return teller;
}