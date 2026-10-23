package com.stencilla.app.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.stencilla.app.ui.theme.StencillaIcons

// ── Design tokens ─────────────────────────────────────────────────────
private val BgProfile    = Color(0xFFF8F5F1)
private val Brand2       = Color(0xFFC87A64)
private val Lavender2    = Color(0xFFEBE5F1)
private val Lavender2Txt = Color(0xFF6C5B7B)
private val G1           = Color(0xFF111827)
private val G2           = Color(0xFF374151)
private val G3           = Color(0xFF6B7280)
private val G5           = Color(0xFFD1D5DB)
private val G6           = Color(0xFFE5E7EB)
private val G7           = Color(0xFFF3F4F6)
private val White        = Color.White

// ── Static data ───────────────────────────────────────────────────────
private val styleChips = listOf("Minimal", "Neutral Lover", "Classic", "Effortless")

/** Preference rows — each has a leading icon, a label, and a trailing chevron */
private data class PrefRow(val icon: ImageVector, val label: String)

/** Settings rows — same structure */
private data class SettingRow(val icon: ImageVector, val label: String)

private val wornColors = listOf(
    Color(0xFFE5D3C8), Color(0xFF8B6B56), Color(0xFF2C2C2C),
    Color(0xFF5C6B52), Color(0xFF6B6B6B)
)

/** Category icons for wardrobe insights */
private data class WardrobeCategory(val icon: ImageVector, val label: String)

@Composable
fun ProfileScreen(onNavigateToSettings: () -> Unit = {}) {

    // Built inside composable so ImageVectors resolve correctly
    val prefRows = listOf(
        PrefRow(StencillaIcons.Ruler,   "Body & Fit"),
        PrefRow(StencillaIcons.Sparkle, "Style Preferences"),
        PrefRow(StencillaIcons.Tag,     "Occasions"),
        PrefRow(StencillaIcons.Droplet, "Color Preferences")
    )
    val settingRows = listOf(
        SettingRow(StencillaIcons.PersonCircle, "Account"),
        SettingRow(StencillaIcons.Bell,         "Notifications"),
        SettingRow(StencillaIcons.Lock,         "Privacy"),
        SettingRow(StencillaIcons.HelpCircle,   "Help & Support")
    )
    val wardrobeCategories = listOf(
        WardrobeCategory(StencillaIcons.Tops,    "Tops"),
        WardrobeCategory(StencillaIcons.Bottoms, "Bottoms"),
        WardrobeCategory(StencillaIcons.Outers,  "Outers"),
        WardrobeCategory(StencillaIcons.Shoes,   "Shoes"),
        WardrobeCategory(StencillaIcons.Bag,     "Bags")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(BgProfile),
        contentPadding = PaddingValues(bottom = 80.dp)
    ) {
        // ── Centered serif header ─────────────────────────────────────
        item {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 28.dp, bottom = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "PROFILE TAB",
                    fontFamily = FontFamily.Serif,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Brand2,
                    letterSpacing = 1.sp
                )
                Text("Your style. Your space.", fontSize = 11.sp, color = G3,
                    modifier = Modifier.padding(top = 3.dp))
            }
        }

        // ── User card ─────────────────────────────────────────────────
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(White)
                    .padding(14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    AsyncImage(
                        model = "https://lh3.googleusercontent.com/aida-public/AB6AXuCed8oheJvq5HOJcXcmd458mzH7JWjUpUw5NBPOsDdqCFR9h_Fucs9vPQwIX2uDEPkecHBtGtaCf8Nearipvdd0eUDbNv8-SavymI7_e0dIfJnt54PI6swIjyabNvsnohcIPS_qJEmpAmaUwORkP2dJHi5mCf9ixE87auBP0RB5iyJrbB-95ukCNzlPF_ZEBu2Q4Dr3W7YhYE5gB4gcvXDR07HjSEPIRsAr5NZC7orRQaMCTqPPCmsW",
                        contentDescription = "Ananya",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(52.dp).clip(CircleShape)
                    )
                    Column {
                        Text("Ananya", fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = G1)
                        Text("Style Explorer", fontSize = 11.sp, color = G3)
                    }
                }
                // Edit button with border
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(999.dp))
                        .border(1.dp, G5, RoundedCornerShape(999.dp))
                        .padding(horizontal = 14.dp, vertical = 5.dp)
                ) {
                    Text("Edit", fontSize = 11.sp, fontWeight = FontWeight.Medium, color = G2)
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        // ── Style identity chips ──────────────────────────────────────
        item {
            Column(modifier = Modifier.padding(horizontal = 18.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text("Style identity", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Text("View details", fontSize = 10.sp, color = G3)
                }
                Spacer(Modifier.height(8.dp))
                // Chips with visible border — fixes the "invisible on white" issue
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    styleChips.forEach { chip ->
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(999.dp))
                                .background(White)
                                .border(1.dp, G6, RoundedCornerShape(999.dp))  // <-- border added
                                .padding(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            Text(chip, fontSize = 11.sp, color = G1)
                        }
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        // ── Preferences card ─────────────────────────────────────────
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(White)
            ) {
                Text("Preferences", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1,
                    modifier = Modifier.padding(start = 14.dp, top = 12.dp, bottom = 8.dp))
                prefRows.forEach { row ->
                    HorizontalDivider(color = G6, thickness = 1.dp)
                    ProfileRow(icon = row.icon, label = row.label)
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        // ── Wardrobe insights card ────────────────────────────────────
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(White)
                    .padding(14.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 14.dp)) {
                    Text("Wardrobe insights", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Text("View all", fontSize = 10.sp, color = G3)
                }
                // Most worn colors
                Text("Most worn colors", fontSize = 11.sp, fontWeight = FontWeight.Medium, color = G2,
                    modifier = Modifier.padding(bottom = 8.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(bottom = 14.dp)) {
                    wornColors.forEach { c ->
                        Box(modifier = Modifier.size(22.dp).clip(CircleShape).background(c))
                    }
                }
                // Most worn categories — SVG icons
                Text("Most worn categories", fontSize = 11.sp, fontWeight = FontWeight.Medium, color = G2,
                    modifier = Modifier.padding(bottom = 10.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    wardrobeCategories.forEach { cat ->
                        Column(horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(3.dp)) {
                            Icon(
                                imageVector = cat.icon,
                                contentDescription = cat.label,
                                tint = G3,
                                modifier = Modifier.size(20.dp)
                            )
                            Text(cat.label, fontSize = 9.sp, color = G3)
                        }
                    }
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        // ── AI Suggestion card ────────────────────────────────────────
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(Lavender2)
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier.weight(1f)) {
                    Icon(
                        imageVector = StencillaIcons.WandSparkle,
                        contentDescription = null,
                        tint = Lavender2Txt,
                        modifier = Modifier.size(14.dp).padding(top = 1.dp)
                    )
                    Column {
                        Text("AI Suggestion", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = Lavender2Txt)
                        Text(
                            "Add more statement pieces (Color) to elevate your looks.",
                            fontSize = 10.sp, color = Lavender2Txt,
                            lineHeight = 14.sp,
                            modifier = Modifier.padding(top = 3.dp)
                        )
                    }
                }
                Icon(
                    imageVector = StencillaIcons.ChevronRight,
                    contentDescription = null,
                    tint = Lavender2Txt,
                    modifier = Modifier.size(14.dp)
                )
            }
            Spacer(Modifier.height(16.dp))
        }

        // ── Settings card ─────────────────────────────────────────────
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(White)
            ) {
                Text("Settings", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1,
                    modifier = Modifier.padding(start = 14.dp, top = 12.dp, bottom = 8.dp))
                settingRows.forEach { row ->
                    HorizontalDivider(color = G6, thickness = 1.dp)
                    ProfileRow(icon = row.icon, label = row.label)
                }
            }
        }
    }
}

// ── Shared row composable for Preferences & Settings ──────────────────
@Composable
private fun ProfileRow(icon: ImageVector, label: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 14.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFF9CA3AF),
                modifier = Modifier.size(16.dp)
            )
            Text(label, fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Color(0xFF374151))
        }
        Icon(
            imageVector = StencillaIcons.ChevronRight,
            contentDescription = null,
            tint = Color(0xFFD1D5DB),
            modifier = Modifier.size(14.dp)
        )
    }
}
