<?php

class broodje {
    private $naam;
    private $meel;
    private $vorm;
    private $gewicht;

    function __construct($naam, $meel, $vorm, $gewicht)
    {
        $this->naam = $naam;
        $this->meel = $meel;
        $this->vorm = $vorm;
        $this->gewicht = $gewicht;
    }

    /**
     * Gets value of naam
     * @return mixed
     */
    public function getNaam()
    {
        return $this->naam;
    }

    /**
     * Sets value of naam
     * @param mixed $naam
     */
    public function setNaam($naam)
    {
        $this->naam = $naam;
    }

    /**
     * Gets value of meel
     * @return mixed
     */
    public function getMeel()
    {
        return $this->meel;
    }

    /**
     * Sets value of meel
     * @param mixed $meel
     */
    public function setMeel($meel)
    {
        $this->meel = $meel;
    }

    /**
     * Gets value of vorm
     * @return mixed
     */
    public function getVorm()
    {
        return $this->vorm;
    }

    /**
     * Sets value of vorm
     * @param mixed $vorm
     */
    public function setVorm($vorm)
    {
        $this->vorm = $vorm;
    }

    /**
     * Gets value of gewicht
     * @return mixed
     */
    public function getGewicht()
    {
        return $this->gewicht;
    }

    /**
     * Sets value of gewicht
     * @param mixed $gewicht
     */
    public function setGewicht($gewicht)
    {
        $this->gewicht = $gewicht;
    }


}
