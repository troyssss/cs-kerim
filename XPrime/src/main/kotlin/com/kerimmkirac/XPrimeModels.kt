package com.nikyokki

import com.fasterxml.jackson.annotation.JsonProperty

data class MovieResponse(
    @JsonProperty("results") val results: List<XMovie>,
)

data class XMovie(
    @JsonProperty("backdrop_path") val backdropPath: String? = null,
    @JsonProperty("genre_ids") val genreIds: List<Int>? = null,
    @JsonProperty("genres") val genres: List<Genre>? = null,
    @JsonProperty("id") val id: Int,
    @JsonProperty("original_title") val originalTitle: String? = null,
    @JsonProperty("media_type") val mediaType: String? = null,
    @JsonProperty("overview") val overview: String? = null,
    @JsonProperty("poster_path") val posterPath: String? = null,
    @JsonProperty("release_date") val releaseDate: String? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("vote_average") val vote: Double? = null,
    @JsonProperty("runtime") val runtime: Int? = null,
    @JsonProperty("credits") val credits: Credits? = null,
    @JsonProperty("recommendations") val recommendations: Recommendations? = null,
    @JsonProperty("imdb_id") val imdb: String? = null,
    // TV Series fields
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("original_name") val originalName: String? = null,
    @JsonProperty("first_air_date") val firstAirDate: String? = null,
    @JsonProperty("last_air_date") val lastAirDate: String? = null,
    @JsonProperty("number_of_seasons") val numberOfSeasons: Int? = null,
    @JsonProperty("number_of_episodes") val numberOfEpisodes: Int? = null,
    @JsonProperty("seasons") val seasons: List<Season>? = null,
    @JsonProperty("external_ids") val externalIds: ExternalIds? = null,
)

data class Recommendations(
    @JsonProperty("results") val results: List<XMovie>
)

data class Credits(
    @JsonProperty("cast") val cast: List<Cast>,
)

data class Cast(
    @JsonProperty("name") val name: String,
    @JsonProperty("profile_path") val profilePath: String? = null,
)

data class Genres(
    @JsonProperty("genres") val genres: List<Genre>?
)

data class Genre(
    @JsonProperty("id") val id: Int,
    @JsonProperty("name") val name: String,
)

data class Stream(
    @JsonProperty("available_qualities") val qualities: List<String>,
    @JsonProperty("status") val status: String,
    @JsonProperty("has_subtitles") val hasSubtitles: Boolean,
    @JsonProperty("subtitles") val subtitles: List<PrimeSubs>
)

data class PrimeSubs(
    @JsonProperty("file") val file: String? = null,
    @JsonProperty("label") val label: String? = null,
)

data class Trailers(
    @JsonProperty("id") val id: Int,
    @JsonProperty("results") val results: List<Trailer>
)

data class Trailer(
    @JsonProperty("key") val key: String,
    @JsonProperty("site") val site: String,
)

data class Servers(
    @JsonProperty("servers") val servers: List<Server>? = null
)

data class Server(
    @JsonProperty("name") val name: String,
    @JsonProperty("status") val status: String,
)

data class Subtitle(
    @JsonProperty("url") val url: String,
    @JsonProperty("display") val display: String,
)

data class Season(
    @JsonProperty("season_number") val seasonNumber: Int,
    @JsonProperty("episode_count") val episodeCount: Int,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("overview") val overview: String? = null,
    @JsonProperty("poster_path") val posterPath: String? = null,
    @JsonProperty("air_date") val airDate: String? = null,
)

data class ExternalIds(
    @JsonProperty("imdb_id") val imdbId: String? = null,
    @JsonProperty("tvdb_id") val tvdbId: Int? = null,
)

data class SeasonDetails(
    @JsonProperty("episodes") val episodes: List<EpisodeDetails>,
    @JsonProperty("season_number") val seasonNumber: Int,
    @JsonProperty("name") val name: String? = null,
)

data class EpisodeDetails(
    @JsonProperty("episode_number") val episodeNumber: Int,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("overview") val overview: String? = null,
    @JsonProperty("air_date") val airDate: String? = null,
    @JsonProperty("still_path") val stillPath: String? = null,
    @JsonProperty("runtime") val runtime: Int? = null,
)