<?php

class auto {
    private $merk;
    private $type;
    private $prijs;
    private $url;

    function __construct($merk, $type, $prijs, $url)
    {
        $this->merk = $merk;
        $this->type = $type;
        $this->prijs = $prijs;
        $this->url = $url;
    }


    /**
     * Gets value of merk
     * @return string
     */
    public function getMerk()
    {
        return $this->merk;
    }

    /**
     * Sets value of merk
     * @param string $merk
     */
    public function setMerk($merk)
    {
        $this->merk = $merk;
    }

    /**
     * Get value of type
     * @return string
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Sets value of type
     * @param string $type
     */
    public function setType($type)
    {
        $this->type = $type;
    }

    /**
     * Get value of prijs
     * @return int
     */
    public function getPrijs()
    {
        return $this->prijs;
    }

    /**
     * Sets value of prijs
     * @param int $prijs
     */
    public function setPrijs($prijs)
    {
        $this->prijs = $prijs;
    }

    /**
     * Get value of url
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * Sets value of url
     * @param string $url
     */
    public function setUrl($url)
    {
        $this->url = $url;
    }




}
