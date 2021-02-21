<?php
class liedje {
    private $title;
    private $artiest;

    function __construct($title, $artiest) {
        $this->title = $title;
        $this->artiest = $artiest;
    }

    /**
     * Gets value of title.
     * @return mixed
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Sets the value of title.
     * @param mixed $title
     */
    public function setTitle($title)
    {
        $this->title = $title;
    }

    /**
     * Gets value of artist.
     * @return mixed
     */
    public function getArtiest()
    {
        return $this->artiest;
    }

    /**
     * Sets the value of artist.
     * @param mixed $artiest
     */
    public function setArtiest($artiest)
    {
        $this->artiest = $artiest;
    }

}
