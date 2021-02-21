var plaatjes = [1,2,3,4,5,6,7,8,9];
var teller = 0;
var slideholder = document.getElementById("slideframe");
slideholder.style.backgroundImage = "url('img/logo1.png')";
slideholder.addEventListener("click", function () {
    slideholder.style.backgroundImage = "url('img/logo"+getAap()+".png')";
});

function getAap() {
    if (teller >= plaatjes.length){
        teller = 0;
    }
    teller++;
    console.log(teller);
    return teller;
}