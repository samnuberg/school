<?php

class overzichtauto {
    private $overzichtNaam = '';
    private $autos = array();


    function voegAutoToe($auto) {
        $this->autos[] = $auto;
    }

    function getAutos() {
        return $this->autos;
    }

    function getOverzicht() {
        return array('naam' => $this->overzichtNaam);
    }

    /**
     * Set name for overzicht
     * @return string
     */
    public function getOverzichtNaam()
    {
        return $this->overzichtNaam;
    }

    /**
     * Get name for overzicht
     * @param string $overzichtNaam
     */
    public function setOverzichtNaam($overzichtNaam)
    {
        $this->overzichtNaam = $overzichtNaam;
    }


}
