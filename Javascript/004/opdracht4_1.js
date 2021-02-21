var mijnauto = {
    kleur: "blauw",
    merk: "Ford",
    snelheid: 0,

    toeteren: function (){
        console.log("toet!")
    },

    gasgeven: function (){
        console.log(mijnauto.snelheid)
    }
}

mijnauto.toeteren()
mijnauto.gasgeven()
