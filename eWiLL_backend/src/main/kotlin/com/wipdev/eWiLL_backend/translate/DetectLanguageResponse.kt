package com.wipdev.eWiLL_backend.translate
//[{"language":"en","score":1.0,"isTranslationSupported":true,"isTransliterationSupported":false}]
class DetectLanguageResponse {
    var language: String? = null
    var score: Float = 0.toFloat()
    var isTranslationSupported: Boolean = false
    var isTransliterationSupported: Boolean = false

    override fun toString(): String {
        return "DetectLanguageResponse{" +
                "language='" + language + '\''.toString() +
                ", score=" + score +
                ", isTranslationSupported=" + isTranslationSupported +
                ", isTransliterationSupported=" + isTransliterationSupported +
                '}'.toString()
    }
}