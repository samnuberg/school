<?php

class overzichtBroodjes {
    private $overzichtNaam = '';
    private $broodjes = array();

    function voegBroodjeToe($broodje) {
        $this->broodjes[] = $broodje;
    }

    function getBroodjes() {
        return $this->broodjes;
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


