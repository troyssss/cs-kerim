version = 21

cloudstream {
    authors     = listOf("kerimmkirac")
    language    = "tr"
    description = "XPrime.Tv"

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
    **/
    status  = 1 // will be 3 if unspecified
    tvTypes = listOf("Movie","TvSeries")
    iconUrl = "https://www.google.com/s2/favicons?domain=xprime.tv&sz=%size%"
}