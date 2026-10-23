package com.stencilla.app.ui.closet

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.stencilla.app.ui.theme.StencillaIcons

// ── Design tokens ─────────────────────────────────────────────────────
private val Bg2        = Color(0xFFFAFAFA)
private val G1         = Color(0xFF111827)
private val G2         = Color(0xFF374151)
private val G3         = Color(0xFF6B7280)
private val G4         = Color(0xFF9CA3AF)
private val G6         = Color(0xFFE5E7EB)
private val G7         = Color(0xFFF3F4F6)
private val Surface    = Color(0xFFF5F5F5)
private val White      = Color.White
private val Green      = Color(0xFF22C55E)
private val GreenLight = Color(0xFFDCFCE7)

// ── Image data ────────────────────────────────────────────────────────
private val closetGridUrls = listOf(
    "https://lh3.googleusercontent.com/aida-public/AB6AXuBZio4yCOo7aYafefuEFDXJD0CGg9yJ_pAjxmsbnb9R3I3r8UqNpJYGLIJ3SKRUAoOHCsPHevSdSmScrL8JPLLHe0YvHLJaK0KDh2FPPGdjLTJ84C9FSLNLHIOQb3Kf0x0jMnfC58c48JxwVJ-7mqoG_ProBIL4PTKIqThZXd91qKxYvjh2Q1YerxSlp7j4n1sIx_k99gzBgJVCB06GqqGQ_Nr4I1qAAlDu-ME_KvYtWzHtX4RiydtK",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuDc2zwAM6H8ZMNJEKOEqVhasENtwpBKxinTTJ-iRdZUezcN5wg-lny8QJdYJUZmlvgH8LPdR1PeoYFEX0pNg8atKtygnlW_gddpxkVJn3xbggKTbAfiBHrAfCxl3a--b4OFZc4FjNaEU8JPC1WpmCx3MAfLk3slWPB7XVlpqqKY05YwauJE_eQofBC6xJ8ee36GsUtJULSKWzTA8SULMcMppy-45gWcSXzYd3GFjS_ZvX9BZAXo7ki3",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuDMBXFcDBQMllD2ta4WxqdsLkqSkq_3XK8677M_nfYzYq4RjtGWQkgFbiUdrJDi0STyisyTI3hTAwpiu_OmFEggYl6SlVdYRg8Hu8S_vZnTR8t3LrojPUAqbElmYSHSpG_osUVEunRs0ZgzuA0S_rp17K-dTZ-Ot-pPlbjou5DhScjTNU1dH0qc9wFzqK-1hL-jXbGmkUwL79KFNCeAMKIZgpD9S8KY663P4ensWDBcvlq9DJ2iYkaj",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuAaFSycyCY2gZqj8rbPUwVSb_JvApmSrTHlyHI8kKFptmnsVdp7NvmccnnR73kRg7aMuY9_fZxXqyX9ya-lf9Y5Qq5nL64UdP5DyHZOLz6jINdWWXDyb0Qy78G5mCjU_kUMZncqnUB-KVnVoIqK35Zyk-QxQ-I0uSp5k4X0UsthL4sdUPlIne_quJ1XpKd3MO0V9aDwoAMPrQLVCLfcXQwC37CEGlfOTqQV3dF9WIy5M1eESrO_yJze",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuCJWyK2Egn0RahOhXrmNrvZlqJ1_OMN2eX28Qxbkd8Q6dFZucacNNgDEezZGAeqlG47UHzmbRqvLcLhcRVgGAu-q0amFR4sIspJ8O9tiDMuaJm93uW9aJMEwaRsJBRC-okxFQGgROdZRgBL3ohTch0IhQ3SbxEw8GeyjShOBAhWcrsSeeGC8v6QVzKlzCj6Pgu2d1o0yzQeqZAjJBHgSlZe3Nhqv-b5_MZ15BjB6dohrNUY9ZxlgR6o",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuB_e3ruLdrK5LGcDOnf9waCHZlVtq7hsgkdHagCXYviDseyL_IcQ0AqW2qbnjf-SmO_UWxl91v-y5gT08aeru11ls6O-04wJGz-gBK91tcq6YSwzSqRGF23pgdTsAyI6d6ILsIXM6MZcmk6WvP2jf4VwRgZpmxNjC5Y4GMDZKSQgONQf4huV_jwhC1wQSAomptGd_EupU2Rbr1Gpqy0niWp1cxAn_MojDuYd1Pimkyc9VMv56I4pB8e",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuCdkFsSE8yPJ0GkIcFaRoin890kbgHw9XVMQaQTCfch2rDRGJ6HAnnCEcgaX8KrWhnBbEEB5PKozH6o9UDOPRAfmqiYaO6rJvyDSU5L9nXULXr8ezWgUGiA7Ew3NYNTQBWkWu6mPD4tKSmgTsSHnqVVjQg5nSxYEwLTMhQGlYTCc9X17EmnRk5-0KK5XXiUkqS0GeKaIsyc9vFW4O8qHHnzIeg9hfzQpWK9mcJ8rtbSXlIrThdryzBg",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuDnRDtcCE_js_i3d-9MuDyEIgZcouatEKTIjUYTDOxhGt9LCMWiOwPQm0CTaCu5b8oiTpaNQSwcBq4gCsl5t9nPiA6dHVb8rUmDXzzHBIoQZ_G6QoyX9lbdavJFlI6K_CTXLMIPZGVnovgh3Uk1RJuTuS1aLHayxe0Jquob4ZB8eNWZ77un2Hf4Xhw8B9D-Dh1iqXKn5YIM-SybfVK9wW2WS6ec6PhDU66C-QO5fyuUm0RJcsMu1HND",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuBIB-ebHW3tUfXD70arsvGCDNFgGcD3gr0uyMg0bDLXDD88Y471GAgr_jaKFa4zkjVdrZFyESiKQk6w1mVf5XQ2SNOfeiJ3R29RASsxKSG-DDyE6gPgRZhV_GuX-Kgk9utntRRj_-uQ6O41n-IQ31Hoo_BDuAO2ixF1C3XbLAJaoMmo_--IxPPaIZuM_4pX9DUhwp6xgta825uzAx1zQisKz_6lQBcqgWW4wbHIyTGfcGVkxGdvuYPG"
)

private val recentUrls = listOf(
    "https://lh3.googleusercontent.com/aida-public/AB6AXuBBoncBGVIlkSbb42Q4y06n0bX7gyCEi3NkYoqYcXoaZQAeiE1WgLzix22Vw3b3aWFDpg5oKqrhWqdK4UrxpW3Sa2srQ4rPO9ADKPHegkwpcjIgBfM6mbzGH3rmWEwkZIZLuMvh_Wf1PdcnC9KNKbRnAhNUWPVWSNUpbp-1NucuNcb49NHFiFYZGCH1yxd3dQbNnFrWPLWmJ-HwnBWtTu2tben5YjdEaaQfQKgPVsuBiXNX24_hXsqi",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuDm_LDjBfh67Tc8M9KeX4E5TcatphoFmcD1ZHtfy0QzWJeGN9a5xp1S1-SHyAYboIJ-JZx2x5ioBHkMF7YgBk9jM3bGr-781k7ba4zDEo1SApTeYmHnDL1U7HYqnXCXzbf-fht9m1dPVsHehirhm9q6bQ4w2WfmsAjxOWKGJNAvrHHqs2ch0seA8HyDHH6x_3GS2O1O_07pOKNL293zR82Et3kTaz3v-vq2KpjDH3SCKdmmqbpjQkbM",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuC29eqW0qRsPWDiWPbLxInayOIH2UlLJOd0PjS2n81zB2TPw4rmcahfx90BHDdAxbOl6ubdsRjANcaKXzNslqUlGzxBBsPM_0aEGVYN2tX3SQ2HyE5pxRGOrb6s7_KbflhVlSzY4bsNnuAcoz0Q1E_8o5ib1EY0opb4UjA8Nh1BgBTQ0R9J9k22ny0OefmXQK9o0V7tguh6pvQqOFaDiqflv6QcvLqMFwPa__tO-7bYqHCTFGfXwlHV",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuBFPeWhAwSncxckqXcyXeUkshh7F53fItRksHhJiSTORQgVxICZ3cVRgERQlieEL8VOUp5PnG_E_q0cYGOrkjll-XtdxhjKvgv6mXLLOFobDRF74KeKRFVfKNv_W7KOfuPlXOhyHmpbfY1WoKJRMbu2s7msEqAxUGqmAzMvbQXJPQH_r7aWWkTnD9t_QXuvDQXgZFY9-N-A4YJ2JohXBOdeEE8y7RQ7gYjP16tPgllH8iRoZaH92tD9"
)

// ── Smart category data — icon, label, count ──────────────────────────
private data class SmartCategory(val icon: ImageVector, val label: String, val count: Int)

@Composable
fun ClosetScreen(
    viewModel: ClosetViewModel = hiltViewModel(),
    onAddItem: () -> Unit = {}
) {
    var selectedPill by remember { mutableStateOf("All") }
    val pills = listOf("All", "Tops", "Bottoms", "Dresses", "Outers")

    // smartCategories is computed inside composable so ImageVectors are valid
    val smartCategories = listOf(
        SmartCategory(StencillaIcons.Briefcase, "Workwear", 24),
        SmartCategory(StencillaIcons.TShirt,    "Casual",   40),
        SmartCategory(StencillaIcons.Star,       "Party",    18),
        SmartCategory(StencillaIcons.Gem,        "Ethnic",   12)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Bg2)
        ) {
            // ── Sticky header ──────────────────────────────────────────
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xEBFAFAFA))
                    .padding(start = 20.dp, end = 20.dp, top = 28.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                // Title row + icons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("My Closet", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Row(horizontalArrangement = Arrangement.spacedBy(14.dp), verticalAlignment = Alignment.CenterVertically) {
                        // SlidersHorizontal — the correct filter/grid icon
                        Icon(
                            imageVector = StencillaIcons.SlidersHorizontal,
                            contentDescription = "Filter",
                            tint = G2,
                            modifier = Modifier.size(18.dp)
                        )
                        // Bell
                        Icon(
                            imageVector = StencillaIcons.Bell,
                            contentDescription = "Notifications",
                            tint = G3,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                // Search pill
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(999.dp))
                        .background(White)
                        .padding(horizontal = 12.dp, vertical = 9.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = StencillaIcons.Search,
                        contentDescription = null,
                        tint = G4,
                        modifier = Modifier.size(14.dp)
                    )
                    Text("Search your closet", fontSize = 12.sp, color = G3)
                }
                // Category pills (horizontal scroll)
                Row(
                    modifier = Modifier.horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    pills.forEach { p ->
                        val on = p == selectedPill
                        Text(
                            p,
                            fontSize = 11.sp,
                            fontWeight = if (on) FontWeight.SemiBold else FontWeight.Normal,
                            color = if (on) White else G2,
                            modifier = Modifier
                                .clip(RoundedCornerShape(999.dp))
                                .background(if (on) G1 else White)
                                .then(if (!on) Modifier.border(1.dp, G6, RoundedCornerShape(999.dp)) else Modifier)
                                .clickable { selectedPill = p }
                                .padding(horizontal = 14.dp, vertical = 5.dp)
                        )
                    }
                }
            }

            // ── Scrollable body ────────────────────────────────────────
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(start = 20.dp, end = 20.dp, top = 12.dp, bottom = 100.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                // 3-col clothing grid
                item {
                    val rows = closetGridUrls.chunked(3)
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        rows.forEach { rowUrls ->
                            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                rowUrls.forEach { url ->
                                    Box(
                                        modifier = Modifier
                                            .weight(1f)
                                            .aspectRatio(3f / 4f)
                                            .clip(RoundedCornerShape(14.dp))
                                            .background(Surface),
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
                                // Fill last row if uneven
                                repeat(3 - rowUrls.size) {
                                    Spacer(modifier = Modifier.weight(1f))
                                }
                            }
                        }
                    }
                }

                // Wardrobe overview card
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .background(White)
                            .border(1.dp, G6, RoundedCornerShape(16.dp))
                            .padding(16.dp)
                    ) {
                        Text("Wardrobe overview", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1,
                            modifier = Modifier.padding(bottom = 12.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(horizontal = 6.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // 128 Items
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("128", fontSize = 22.sp, fontWeight = FontWeight.SemiBold, color = G1)
                                Text("Items", fontSize = 10.sp, color = G3)
                            }
                            Box(modifier = Modifier.width(1.dp).height(36.dp).background(G6))
                            // 32 Outfits
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("32", fontSize = 22.sp, fontWeight = FontWeight.SemiBold, color = G1)
                                Text("Outfits", fontSize = 10.sp, color = G3)
                            }
                            Box(modifier = Modifier.width(1.dp).height(36.dp).background(G6))
                            // 72% utilized donut
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(modifier = Modifier.size(48.dp), contentAlignment = Alignment.Center) {
                                    @Suppress("DEPRECATION")
                                    CircularProgressIndicator(
                                        progress = 0.72f,
                                        modifier = Modifier.fillMaxSize(),
                                        color = Green,
                                        trackColor = GreenLight,
                                        strokeWidth = 4.dp
                                    )
                                    Text("72%", fontSize = 11.sp, fontWeight = FontWeight.SemiBold, color = G1)
                                }
                                Text("Utilized", fontSize = 10.sp, color = G3, modifier = Modifier.padding(top = 4.dp))
                            }
                        }
                    }
                }

                // Smart categories — 4-col grid with real SVG icons
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Smart categories", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                        Text("View all", fontSize = 11.sp, color = G3)
                    }
                    Spacer(Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        smartCategories.forEach { cat ->
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(White)
                                    .border(1.dp, G6, RoundedCornerShape(12.dp))
                                    .padding(vertical = 10.dp, horizontal = 4.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(36.dp)
                                        .clip(CircleShape)
                                        .background(G7),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = cat.icon,
                                        contentDescription = cat.label,
                                        tint = G2,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                                Spacer(Modifier.height(6.dp))
                                Text(cat.label, fontSize = 10.sp, fontWeight = FontWeight.Medium, color = G1)
                                Text(cat.count.toString(), fontSize = 9.sp, color = G3)
                            }
                        }
                    }
                }

                // Recently added — 4-col
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Recently added", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                        Text("View all", fontSize = 11.sp, color = G3)
                    }
                    Spacer(Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        recentUrls.forEach { url ->
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(3f / 4f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Surface),
                                contentAlignment = Alignment.Center
                            ) {
                                AsyncImage(
                                    model = url,
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier.fillMaxSize().padding(4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // ── Add item FAB ──────────────────────────────────────────────
        // Matches design: a terracotta "+" button floating bottom-right
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 20.dp, bottom = 90.dp)
                .size(52.dp)
                .shadow(6.dp, CircleShape)
                .clip(CircleShape)
                .background(Color(0xFFC26D53))
                .clickable { onAddItem() },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = StencillaIcons.Plus,
                contentDescription = "Add item",
                tint = Color.White,
                modifier = Modifier.size(22.dp)
            )
        }
    }
}
