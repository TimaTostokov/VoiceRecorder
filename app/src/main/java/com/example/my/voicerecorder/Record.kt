package com.example.my.voicerecorder

data class Record(
    var id: Int,
    var name: String,
    var fileName: String,
    var date: String,
    var playing: Boolean = false
)