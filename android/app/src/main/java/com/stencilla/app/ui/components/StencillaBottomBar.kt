package com.stencilla.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stencilla.app.ui.navigation.Routes
import com.stencilla.app.ui.theme.StencillaIcons

// ── Design tokens (matches design's bottom nav) ───────────────────────
private val Brand       = Color(0xFFC26D53)   // terracotta active
private val G1          = Color(0xFF111827)
private val G4          = Color(0xFF9CA3AF)   // inactive icon/label

/**
 * Bottom navigation bar styled to exactly match the Stitch design:
 * - Active tab uses terracotta icon + label
 * - Inactive tabs use grey icon + label
 * - Clean white surface, no Material3 indicator pill
 */
@Composable
fun StencillaBottomBar(currentRoute: String, onNavigate: (String) -> Unit) {

    val items = listOf(
        Triple(Routes.TODAY,   StencillaIcons.Sun,      "Today"),
        Triple(Routes.CLOSET,  StencillaIcons.Hanger,   "Closet"),
        Triple(Routes.PLANNER, StencillaIcons.Calendar, "Planner"),
        Triple(Routes.PROFILE, StencillaIcons.Person,   "Profile")
    )

    NavigationBar(
        containerColor = Color.White,
        tonalElevation = 0.dp,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        items.forEach { (route, icon, label) ->
            val selected = currentRoute == route
            NavigationBarItem(
                selected = selected,
                onClick = { onNavigate(route) },
                icon = {
                    Icon(
                        imageVector = icon,
                        contentDescription = label,
                        tint = if (selected) Brand else G4,
                        modifier = Modifier.size(22.dp)
                    )
                },
                label = {
                    Text(
                        label,
                        fontSize = 10.sp,
                        fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
                        color = if (selected) Brand else G4
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor   = Brand,
                    unselectedIconColor = G4,
                    indicatorColor      = Color.Transparent  // removes the pill highlight
                )
            )
        }
    }
}
