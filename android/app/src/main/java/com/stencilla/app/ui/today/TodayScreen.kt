package com.stencilla.app.ui.today

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.stencilla.app.ui.theme.StencillaIcons

// ── Design tokens ─────────────────────────────────────────────────────
private val BgPage      = Color(0xFFF8F7F4)
private val Brand       = Color(0xFFC26D53)
private val BrandLight  = Color(0xFFF2E8E3)
private val Lavender    = Color(0xFFEBE6F2)
private val LavenderBtn = Color(0xFF8C7B9E)
private val G1          = Color(0xFF111827)
private val G2          = Color(0xFF374151)
private val G3          = Color(0xFF6B7280)
private val G4          = Color(0xFF9CA3AF)
private val G5          = Color(0xFFD1D5DB)
private val G6          = Color(0xFFE5E7EB)
private val White       = Color.White

@Composable
fun TodayScreen(
    onNavigateToStyleNotes: () -> Unit = {},
    onNavigateToVerifier: () -> Unit = {}
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(BgPage),
        contentPadding = PaddingValues(bottom = 80.dp)
    ) {
        // ── Header: "Good morning, / Ananya" + bell + weather ──
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 18.dp, end = 18.dp, top = 28.dp, bottom = 0.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column {
                    Text("Good morning,", fontSize = 12.sp, color = G3, fontWeight = FontWeight.Medium)
                    Text("Ananya", fontSize = 26.sp, fontWeight = FontWeight.SemiBold, color = G1, lineHeight = 28.sp)
                }
                Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    // Bell icon — SVG
                    Icon(
                        imageVector = StencillaIcons.Bell,
                        contentDescription = "Notifications",
                        tint = G3,
                        modifier = Modifier.size(18.dp)
                    )
                    // Weather chip — cloud-sun SVG + temperature
                    Column(horizontalAlignment = Alignment.End) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                            Icon(
                                imageVector = StencillaIcons.CloudSun,
                                contentDescription = null,
                                tint = Color(0xFFEAB308),
                                modifier = Modifier.size(14.dp)
                            )
                            Text("28°", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = G1)
                        }
                        Text("Partly Cloudy", fontSize = 9.sp, color = G4)
                    }
                }
            }
        }

        // ── "Your look for today" section ──
        item { Spacer(Modifier.height(20.dp)) }
        item {
            Text(
                "Your look for today",
                fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1,
                modifier = Modifier.padding(horizontal = 18.dp)
            )
            Spacer(Modifier.height(10.dp))
            // Hero outfit + 2 accessory side cards
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .height(230.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Main outfit image
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFE8E6DF))
                ) {
                    AsyncImage(
                        model = "https://lh3.googleusercontent.com/aida-public/AB6AXuAl7rjg_sZjc2aBbFO565CsJPPCq9X566vrMjw7s2BeOy-5cGI3WySLPeU1p1yKr0PmTDUHnSp2OqynDaERouonGvopf7nwawadsMiJGb-46AsDVPo33Y2wrwYZduHpxsOl0_wgg-3882jIUqNccX5VBcpPtnBI56B8960sB4e4eEyUhqMWnTYoOEu0dlovGHOTi8_S16Ujg7nkmpTLXh5Nrdg51QGoKrFHSZDLeK2HN_XiWcdBM2us",
                        contentDescription = "Outfit",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                // Side: bag + shoes
                Column(
                    modifier = Modifier
                        .width(88.dp)
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    listOf(
                        "https://lh3.googleusercontent.com/aida-public/AB6AXuCFcbjFZ8JvFBvrnXfHX2qfCQA4sb2StS3m3pc7fMVlXh1sdoaTewZQpyrJ_2zIaR-lDO5_U1R1n1QwMsBAUeyVidjQDec0uX48kZr_rasQ4cscZY1ZJvs7MEAyKvGhLlHQOTTDBhCpdS0OXKwne9IvPPC8ol0sEa_HL-N9NzqQABc1D7-LK11LggrYq-DvXlw4DunDTVAOqgy8vDH4RlUW-N9cVODD-VcoMp39WXIynzAlN2pd7cZD",
                        "https://lh3.googleusercontent.com/aida-public/AB6AXuDWMqtLxJB3GsuKy07cL7xqC7AaWfV2EH3d4mTpf9Ck1bDr3MC6Xko-vO9qoYWGMS7yIG7RKaw_3XtKzjWPZuSjSmN9gHqSRtJQPtvUUeNPm0BZs-ADs0WQH-rxY_XxT4CIZWD-K2_O1bKRBQpgUOOuNzs_KEYOZJc30PCz7fK1eLIfU7okZb_eMRrJN7jT1mIW6uMdvRM_E_31FeRioOqpTtO0e0iPMcwgntUNPUECJu7c7rADSCpd"
                    ).forEach { url ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .clip(RoundedCornerShape(16.dp))
                                .background(White)
                                .border(1.dp, G6, RoundedCornerShape(16.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            AsyncImage(
                                model = url,
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier.fillMaxSize().padding(6.dp)
                            )
                        }
                    }
                }
            }
        }

        // ── Why this works card ──
        item {
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(White)
                    .border(1.dp, G6, RoundedCornerShape(16.dp))
                    .padding(12.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.Top
            ) {
                // Magic-wand icon in a terracotta tinted box
                Box(
                    modifier = Modifier
                        .size(20.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .background(BrandLight),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = StencillaIcons.WandSparkle,
                        contentDescription = null,
                        tint = Brand,
                        modifier = Modifier.size(12.dp)
                    )
                }
                Column {
                    Text("Why this works", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Text(
                        "Balanced neutrals with a soft pop of earthy green.",
                        fontSize = 10.sp, color = G3, lineHeight = 15.sp,
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }
            }
        }

        // ── Quick actions ──
        item {
            Spacer(Modifier.height(20.dp))
            Text("Quick actions", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1,
                modifier = Modifier.padding(horizontal = 18.dp))
            Spacer(Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // Create Outfit — active (terracotta)
                QuickActionBtn(
                    label = "Create\nOutfit",
                    active = true,
                    modifier = Modifier.weight(1f),
                    icon = StencillaIcons.Shirt,
                    iconTint = White
                )
                QuickActionBtn(
                    label = "AI Stylist",
                    active = false,
                    modifier = Modifier.weight(1f),
                    icon = StencillaIcons.Sparkle,
                    iconTint = G2
                )
                QuickActionBtn(
                    label = "Style\nNotes",
                    active = false,
                    modifier = Modifier.weight(1f),
                    onClick = onNavigateToStyleNotes,
                    icon = StencillaIcons.Notepad,
                    iconTint = G2
                )
                QuickActionBtn(
                    label = "Weather\nAware",
                    active = false,
                    modifier = Modifier.weight(1f),
                    icon = StencillaIcons.CloudRain,
                    iconTint = G2
                )
            }
        }

        // ── Ask AI Stylist card ──
        item {
            Spacer(Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Lavender)
                    .padding(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(7.dp),
                    modifier = Modifier.padding(bottom = 9.dp)
                ) {
                    Icon(
                        imageVector = StencillaIcons.Sparkle,
                        contentDescription = null,
                        tint = LavenderBtn,
                        modifier = Modifier.size(16.dp)
                    )
                    Text("Ask AI Stylist", fontSize = 12.sp, fontWeight = FontWeight.SemiBold, color = G1)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(White)
                        .padding(start = 12.dp, top = 3.dp, bottom = 3.dp, end = 3.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "\"What can I wear to a coffee date?\"",
                        fontSize = 11.sp, color = G3,
                        modifier = Modifier.weight(1f)
                    )
                    Box(
                        modifier = Modifier
                            .size(28.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(LavenderBtn),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = StencillaIcons.ArrowRight,
                            contentDescription = "Send",
                            tint = White,
                            modifier = Modifier.size(14.dp)
                        )
                    }
                }
            }
        }

        // ── More outfit ideas ──
        item {
            Spacer(Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("More outfit ideas", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                Text("See all", fontSize = 10.sp, color = G4)
            }
            Spacer(Modifier.height(10.dp))
        }
        item {
            val ideas = listOf(
                Color(0xFFE8E6DF) to "https://lh3.googleusercontent.com/aida-public/AB6AXuAE9iOcRxW9dqeeF5XRwK3MbDgKZZ-0Lq2nFaODEKpk-ya1Fib_L6XubgwZn91q49iE1pej9TMd-tiPnKmeUUbuxYBluxxmKppX5Ehz0y1c3DmbRTrFons5DqVPbhWihIZZtBenEcYkNs6FVO52dmB3sFxvyC6MNZBvrRK0BYZjDyrsNx2xXnukTkGOpbyPcZtm9Zjlp_fWifOu-CIo6MtST7pcMTY7POKYN6bdjuLSWauqiHqmXJlR",
                Color(0xFFF4F1E9) to "https://lh3.googleusercontent.com/aida-public/AB6AXuDCe22IG9fvE1_kr-46tr8HklWQxjzNwW_PdN9ibFgbK9FqosZ9U2A6F6UdY0RXUB3PkMyy221k_kHp0KOa1m8TDdslp1eXdVeQueTt1KAWC2Ft3Qweey8mLXujWBlEJOqTb7BOSSOSiRAsz0BgLg2d1Sf7QfD1pf9mRZPebC9oDxNxDuPncQwwvh4FLlrEeR9b2-ifFcZ2sMg6vjGojIeFbOnj3lDxtTkLTUl6kYWc4IvQMNY1OH6n",
                Color(0xFFEAE8E3) to "https://lh3.googleusercontent.com/aida-public/AB6AXuCdT_kiZ2wXpnMtY13FCR0JL8jRT0VFeh--Ob_W5vusF-lQ0njWe1rwPdZ4RqrcSdlP_OnXR0nh_Jx0JqTvccUenjIx16u51IweUxmYh5MC_F0h0Tg9U89otxg4FqjWFYc53BPE9B3iMkakZy5v1BU5-W5YkVPyF7YHiQFDkz9Abs3i-9GCk4Yjuoe3wTEJOz90A-iLcgElLcbJ4MJFg8NW1cj06LOlldGeBrN7AXb7aGyj_8bjPKx-"
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 18.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                ideas.forEach { (bg, url) ->
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .height(132.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(bg)
                    ) {
                        AsyncImage(
                            model = url,
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
            Spacer(Modifier.height(8.dp))
            // Pagination dots
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(modifier = Modifier.size(5.dp).clip(CircleShape).background(Brand))
                Spacer(Modifier.width(4.dp))
                repeat(3) {
                    Box(modifier = Modifier.size(5.dp).clip(CircleShape).background(G5))
                    Spacer(Modifier.width(4.dp))
                }
            }
        }
    }
}

// ── Quick Action Button ────────────────────────────────────────────────
@Composable
private fun QuickActionBtn(
    label: String,
    active: Boolean,
    icon: ImageVector,
    iconTint: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(46.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(if (active) Brand else White)
                .then(if (!active) Modifier.border(1.dp, G6, RoundedCornerShape(14.dp)) else Modifier),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = iconTint,
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(Modifier.height(5.dp))
        Text(
            label,
            fontSize = 9.sp,
            fontWeight = if (active) FontWeight.SemiBold else FontWeight.Medium,
            color = if (active) G2 else G3,
            textAlign = TextAlign.Center,
            lineHeight = 12.sp
        )
    }
}
