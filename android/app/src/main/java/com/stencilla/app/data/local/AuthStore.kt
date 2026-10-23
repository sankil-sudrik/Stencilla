package com.stencilla.app.data.repository

import android.content.Context
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * The auth token DataStore. Single instance for the whole app — DataStore throws
 * if two instances are active for the same file.
 */
@Singleton
class AuthStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    val dataStore by context.stencillaAuthStore
    val tokenKey = stringPreferencesKey("access_token")
}

private val Context.stencillaAuthStore by preferencesDataStore(name = "stencilla_auth")
