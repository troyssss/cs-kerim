version = 1

cloudstream {
    authors     = listOf("kerimmkirac")
    language    = "tr"
    description = "TRanimaci - Türkiye'nin Online Anime izleme sitesi."

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
    **/
    status  = 1 // will be 3 if unspecified
    tvTypes = listOf("Anime")
    iconUrl = "https://www.google.com/s2/favicons?domain=tranimaci.com&sz=%size%"
}