pics = document.getElementById("pics");
createPicsHolders()
createAapImages()

function createPicsHolders() {
    for (var i = 0; i < 9; i++) {
        pictureHolder = document.createElement("div");
        pictureHolder.className = "picture-holder";
        pictureHolder.id = "picture-holder-"+i;
        pics.appendChild(pictureHolder);
    }
}

function createAapImages() {
    pictureHolders = document.getElementsByClassName("picture-holder");
    for (var i = 0; i < pictureHolders.length; i++){
        favoriet = document.createElement("div");
        favoriet.className = "favoriet";
        favoriet.id = "favoriet_"+ (i+1);
        logoPlaatje = document.createElement("img");
        logoPlaatje.src = "img/logo" + (i+1) + ".png";
        logoPlaatje.id = (i+1);
        logoPlaatje.addEventListener("dblclick", function () {
            maakFavoriet(this.id);
        });
        pictureHolders[i].appendChild(favoriet);
        pictureHolders[i].appendChild(logoPlaatje);
    }
}

function maakFavoriet(id) {
    console.log("maal mij Favoriet! het gaat oom logo..." + id);
    notsofavoriet = document.getElementsByClassName("favoriet");

    for (var i = 0; i < notsofavoriet.length; i++){
        notsofavoriet[i].style.backgroundImage = "none";
    }

    favoriet = document.getElementById("favoriet_" + id)
    favoriet.style.backgroundImage = "url('img/heart.png')";
}

//picsHolders maken
//picsHolder bevat een plaatje van een logo en een favorite symbool (hartje)

//apenPlaatjes toevoegen aan picsHolders
//favoriteSymbols toevoegen aan picsHolders