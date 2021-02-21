<?php

class radioprogramma {
   private $programmaNaam = '';
   private $programmaOmschrijving = '';
   private $liedjes = array();

   public function voegLiedjeToe($liedje){
       $this->liedjes[] = $liedje;
   }

   public function getLiedjes() {
       return $this->liedjes;
   }

   public function getProgramma() {
       return array('naam' => $this->programmaNaam,
                    'omschrijving' => $this->programmaOmschrijving);
   }
   /**
    * Geeft het programma een naam
    * @param de naam als string
    */
   public function setNaam($n) {
       if (strlen($n)>=2) {
           $this->programmaNaam = $n;
       }
   }
    /**
     * Geeft het programma een omschrijving
     * @param de omschrijving als string
     */
    public function setOmschrijving($o) {
        $this->programmaOmschrijving = $o;
    }
    /**
     * Retouneert naam van het programma
     * @return programma naam
     */
    public function getNaam() {
        return $this->programmaNaam;
    }
    /**
     * Retouneert omschrijving van het programma
     * @return programma omschrijving
     */
    public function getOmschrijving() {
        return $this->programmaOmschrijving;
    }
}