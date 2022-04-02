package com.safwan.parstagram

import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser
import java.io.File

// Description : String
// Image : File
// User : User

@ParseClassName("Post")
class Post : ParseObject() {


    fun getDescription(): String? {
        return getString(KEY_DESCRIPTION)
    }

    fun setDescription(descrption: String){
        put(KEY_DESCRIPTION,descrption)
    }

    fun setImage(parsefile: ParseFile) {
        put(KEY_IMAGE,parsefile)
    }

    fun getImage(): ParseFile? {
        return getParseFile(KEY_IMAGE)
    }

    fun getUser() : ParseUser? {
        return getParseUser(KEY_USER)
    }

    fun setUser(user: ParseUser) {
        put(KEY_USER, user)
    }

    companion object{
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "Image"
        const val KEY_USER = "user"
    }

}