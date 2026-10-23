package com.stencilla.app.ui.planner

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.stencilla.app.ui.theme.StencillaIcons

// ── Design tokens ─────────────────────────────────────────────────────
private val Bg2             = Color(0xFFFAFAFA)
private val PlannerPurple   = Color(0xFFE9E4F0)
private val BrandTerracotta = Color(0xFFC26A5A)
private val BrandLight3     = Color(0xFFF8F6F3)
private val G1              = Color(0xFF111827)
private val G2              = Color(0xFF374151)
private val G3              = Color(0xFF6B7280)
private val G4              = Color(0xFF9CA3AF)
private val G5              = Color(0xFFD1D5DB)
private val G6              = Color(0xFFE5E7EB)
private val White           = Color.White
private val PurpleBtn       = Color(0xFF8A7996)

// ── Static data ───────────────────────────────────────────────────────
private val daysOfWeek   = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
private val calDates     = listOf(19, 20, 21, 22, 23, 24, 25)
private const val selectedDate = 22

private data class DayPlan(val day: String, val event: String?, val time: String?)
private val dayPlans = listOf(
    DayPlan("Today",     null,                  null),
    DayPlan("Tomorrow",  "College Presentation", "10:00 AM"),
    DayPlan("Saturday",  "Brunch with friends",  "11:30 AM"),
    DayPlan("Sunday",    "Movie Night",          "7:00 PM")
)

private val outfitStrip = listOf(
    Triple("Mon", 19, "https://lh3.googleusercontent.com/aida-public/AB6AXuATb-mYiM5cuQaadnO2AJoqK2nMS4KU61CgjR0OkohFYMPMaRYsxsLnkE1LES3bD6fbJ3bFTdGhidvujSfUQixSpLCh8A09Url5ODGxRJE5GzwDpnGyjMjk-eoRMC_4kf-edAnj_hqhVnjoY2gauXIforSSB1uU0xSmdBMCguxNZt9v0wvZv2cTGyGgIBK8D-kYfb9M4bgxlAwNGXNGhMYdwHphDjf8Emhz4v5UPjKDEUbFd1jK8569"),
    Triple("Tue", 20, "https://lh3.googleusercontent.com/aida-public/AB6AXuCEE2f0sAF4nPPLu1OzmVvo7Kg7nJR3CAtc3bPFwU6JfVj4zewsZYBG-jTxj0Of1FFV6rlXUjSEVm_0rPeWfy1qBQiqusBo_TPo9nXv4_DJpaH0A_0oaco_MKnBJx7NFvGPnCLXaiBi0D6Bu_0r7KMpL6bFniF6YUuAK8j9ceSxZyQ1b3Rq7L7dqfxZYkijNMKqrT6TcrA4E3jwvgx674PezHqGXZ7FCGURbCIkjLOpnzK2XbZ98ZKY"),
    Triple("Wed", 21, "https://lh3.googleusercontent.com/aida-public/AB6AXuDWL7lJHoFw8e64EdoBVwJ0zgY87cBnEJjg1Bq2wXhWQeJA6obdImpphzYU2kQrqJjsQcYftfOQX1CVZlng8b-LXAUqEW21SohRz2rS3oP5qMXH93LZP-y1FzverA9KO88HBTVWQ-p82ohbS0_ELJuqgP7H09pQltnYkaDT8NUXusshNdKeIJ09-YZEuRzybFcaJ4gtTy7O8mR5b0zbEri71Fsl9RVOmZshEyu551qXMzi5xr12AxcJ"),
    Triple("Thu", 22, "https://lh3.googleusercontent.com/aida-public/AB6AXuDzxjjZJQA6EP1ocYLNf0NF84fSsUCMKOlvuXYRGtlgt11neXfYPg4s2r2b5l0DTG4DPJ8mN-AGzCTYNqEDaOomnEA38N8Y5Ja-jR090mKt0eHHbVYznaOz2TEdv-0gmjN3_24HAmxj29APcqRKMoRNk_vEdDAqbckmpHnBvj938g0bHPzgSM_y2n7QSTUWpO6ZmUppfPEYlAcD7OoVnFTj1YdYU6VIqGbE08D_PnbVYRwcTP8BVYrn"),
    Triple("Fri", 23, "https://lh3.googleusercontent.com/aida-public/AB6AXuDds9z_GrWOIQToQPBi10hWOw_oIIqnIOzjErQyPjkCCd56u6SlFOZ1Df9PKDGNPu7oCES0dr9K23TZU4_JROTHqUA0WNpz12yJLPyna5_t8CGmcreQJuSn0kbwA-OMAEbKynj41GmveVPM8gm3NjsHV0w_cFBMRgyKbeW5Td6cbQX5B7Xpjr_V9AiNnHoCGTJSwwvJ6aYVg6JefpqU--TgTFk2IJhyolpuupwk9cZx_OIOrKRNwJRz")
)

private val eventThumbs = listOf(
    "https://lh3.googleusercontent.com/aida-public/AB6AXuC_XCxA2KecVLWLYUfF_II4Z2ul9Jwl7pm-NXHvPgTiArFnENYpO7-RUyvQSMaJuss6c_5QDgn-8cOBFm2MWGhAZgy10bjv6oPw3WchMOFEKRgTmzi3Vxhsbi2i8VayPQsn3gzMqvTIQTooJce9l58-OzpZU87xxb1LmRnk7JxwaZuQ0DSC3JpUhxjG3_-Inc64nSXMJHWvN-Nq7owqaYrDIyV6vtc6ATbIBnlr5nONbWAOQDvvI4Mn",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuANQmnM1qL46cGJO5k909hn9c5zDID2L1Zq--ud4vo-aFk-V-MZVDyWY-t4QJzS6XVYs47-t6tDnrVKUGcjRWXRTtUPW9abFA75dOugQal7p7dk9nFpqzAxUk7sXD7PY6IG8mDihcDuHG7fWK_MmOJ7yU8alJGOSun_rwutpWAvpiX6t90Rx1dSPnu3i1BGqvMKQRMTd8hgHfk0s8Wklv7hQsEzChLvP_RKEnPoPDP60E1bfkyy7Bpl",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuCf-Z70JBdSQnjhJTMA5z_KXeHfjfqZUqNavZFD4UF4PweCFsOUeKr1HNEowL6PGKXHJiwkhV25TBQUqFYcKkg1K0oaTLRZzYWWgEcecrgKgeJS1QTooJce9l58-OzpZU87xxb1LmRnk7JxwaZuQ0DSC3JpUhxjG3_-Inc64nSXMJHWvN-Nq7owqaYrDIyV6vtc6ATbIBnlr5nONbWAOQDvvI4Mn",
    "https://lh3.googleusercontent.com/aida-public/AB6AXuCQ3TLs1hnBxhwV5oPLz6SLeKcqytX5nyH7Jl7lO4iY3qjFPT03ehx6k1dvQLEENh6So2SjOGc_Jh2oEMQlNSs4lwBmj-KLo9uzq6xarhhwFAYl3c8B6b3mi61VOjWjr1LYthS2pbyvqkOdBEMyCsq8gH2DKc80_jaMX1J8JoT7llJX2dngrgRHOkEznilBa2mpXKiznHeRfw0JvLBXM3AdUfYSAD8WqmuuAn6t7fMEM7nQdSs3qWng"
)

@Composable
fun PlannerScreen(onNavigateToStyleNotes: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Bg2)
    ) {
        // ── Sticky header ──────────────────────────────────────────────
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xF2FBFBFA))
                .padding(start = 20.dp, end = 20.dp, top = 28.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "PLANNER TAB",
                fontFamily = FontFamily.Serif,
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                color = BrandTerracotta,
                letterSpacing = 1.sp
            )
            Text("Plan ahead. Look effortless.", fontSize = 12.sp, color = G3,
                modifier = Modifier.padding(top = 4.dp))
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(start = 20.dp, end = 20.dp, top = 0.dp, bottom = 80.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // ── Calendar ──
            item {
                Text("May 2025", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = G1,
                    modifier = Modifier.padding(bottom = 10.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    daysOfWeek.forEach { d ->
                        Text(d, fontSize = 10.sp, color = G3, fontWeight = FontWeight.Medium,
                            modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
                    }
                }
                Spacer(Modifier.height(6.dp))
                Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    calDates.forEach { date ->
                        val sel = date == selectedDate
                        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                            if (sel) {
                                Box(
                                    modifier = Modifier.size(32.dp).clip(CircleShape).background(BrandTerracotta),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(date.toString(), fontSize = 12.sp, color = White, fontWeight = FontWeight.SemiBold)
                                }
                            } else {
                                Text(date.toString(), fontSize = 12.sp, color = G1, fontWeight = FontWeight.Medium,
                                    modifier = Modifier.padding(vertical = 6.dp))
                            }
                        }
                    }
                }
            }

            // ── Upcoming event ──
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text("Upcoming", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Text("View all", fontSize = 11.sp, color = G3)
                }
                Spacer(Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(White)
                        .border(1.dp, G6, RoundedCornerShape(16.dp))
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Box(
                            modifier = Modifier.width(52.dp).height(66.dp)
                                .clip(RoundedCornerShape(8.dp)).background(BrandLight3)
                        ) {
                            AsyncImage(
                                model = "https://lh3.googleusercontent.com/aida-public/AB6AXuANr8xB-u498sqfZmKlf5yRsXdsoFxyBGNMYHUq2g0AzmPqSdfuZYCIK6GaG3-T5IlXsWqgbKVx24UAmKUnj4Aczl7wUseClIEqekFRs6APxgA9ZWgX-mK7tWfo1SFZK3MZNBKOfell-X_I1H6gj1qTabznRTrUbUjMRYjhRKiOhJQQencgPNLGP4T-OFhkC-PFte7OVGTtGsujq08mSyIPfIp4xcKbPdqaRoEEkHauDmuLYNNJlRPx",
                                contentDescription = null, contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Column {
                            Text("College Presentation", fontSize = 13.sp, fontWeight = FontWeight.Medium, color = G1)
                            Text("Tomorrow · 10:00 AM", fontSize = 10.sp, color = G3,
                                modifier = Modifier.padding(top = 3.dp, bottom = 8.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                                eventThumbs.forEach { url ->
                                    Box(
                                        modifier = Modifier.width(20.dp).height(28.dp)
                                            .clip(RoundedCornerShape(4.dp)).background(BrandLight3)
                                    ) {
                                        AsyncImage(model = url, contentDescription = null,
                                            contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                                    }
                                }
                            }
                        }
                    }
                    Icon(
                        imageVector = StencillaIcons.ChevronRight,
                        contentDescription = null,
                        tint = G4,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }

            // ── Plan your day ──
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text("Plan your day", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Box(
                        modifier = Modifier.size(24.dp).clip(CircleShape).border(1.dp, G5, CircleShape),
                        contentAlignment = Alignment.Center
                    ) { Text("+", fontSize = 12.sp, color = G3) }
                }
                Text("Get outfit ideas for your plans", fontSize = 11.sp, color = G3,
                    modifier = Modifier.padding(top = 4.dp, bottom = 12.dp))
                Column {
                    dayPlans.forEachIndexed { idx, plan ->
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalAlignment = Alignment.CenterVertically) {
                                // Calendar icon — matching design
                                Box(
                                    modifier = Modifier.size(30.dp).clip(CircleShape).background(BrandLight3),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = StencillaIcons.CalendarSmall,
                                        contentDescription = null,
                                        tint = G3,
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                                Column {
                                    Text(plan.day, fontSize = 12.sp, fontWeight = FontWeight.Medium, color = G1)
                                    Text(plan.event ?: "No plans yet", fontSize = 10.sp, color = G3,
                                        modifier = Modifier.padding(top = 1.dp))
                                }
                            }
                            if (plan.time != null) {
                                Row(verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                                    Text(plan.time, fontSize = 10.sp, color = G3, fontWeight = FontWeight.Medium)
                                    Icon(
                                        imageVector = StencillaIcons.ChevronRight,
                                        contentDescription = null,
                                        tint = G4,
                                        modifier = Modifier.size(12.dp)
                                    )
                                }
                            } else {
                                Text("+", fontSize = 14.sp, color = G4)
                            }
                        }
                        if (idx < dayPlans.size - 1) HorizontalDivider(color = G6, thickness = 1.dp)
                    }
                }
            }

            // ── Trip planner banner ──
            item {
                Box(
                    modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(16.dp))
                        .background(PlannerPurple).padding(16.dp)
                ) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text("Trip planner", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                            Text("Pack smart. Travel light.", fontSize = 10.sp, color = G3,
                                modifier = Modifier.padding(top = 3.dp, bottom = 10.dp))
                            Box(
                                modifier = Modifier.clip(RoundedCornerShape(999.dp))
                                    .background(PurpleBtn).padding(horizontal = 14.dp, vertical = 5.dp)
                            ) {
                                Text("Plan a trip", fontSize = 10.sp, fontWeight = FontWeight.Medium, color = White)
                            }
                        }
                        Box(modifier = Modifier.size(96.dp)) {
                            AsyncImage(
                                model = "https://lh3.googleusercontent.com/aida-public/AB6AXuDfgnHl5boTCFySL6flTR__r5wHNEAkcM_2zhuM_jMceWVF8MrmEBFqGQ7wXGkePUK83WpnQ6w8F5PD3QLcPvIFNibaXGNRzxkx2L5i0Q_W7xTg7hqPkdrmFKosE57ZKvrIQJ1F02mh-1V3XC9wqls0KnlqSyblbpYsUrMVRXnNxzd3guwPWhPXSf5TW-K1kIMrodD2iT7o7n93vO2e6HviL5S2yvAP3RDl8f7yZRntt5IsEbY_-u2g",
                                contentDescription = "luggage", contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(8.dp))
                            )
                        }
                    }
                }
            }

            // ── Outfit calendar strip ──
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Text("Outfit calendar", fontSize = 13.sp, fontWeight = FontWeight.SemiBold, color = G1)
                    Text("View all", fontSize = 11.sp, color = G3)
                }
                Text("See your looks", fontSize = 11.sp, color = G3,
                    modifier = Modifier.padding(top = 2.dp, bottom = 12.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    outfitStrip.forEach { (dow, date, url) ->
                        val sel = date == selectedDate
                        Column(horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(3.dp)) {
                            Text(dow.uppercase(), fontSize = 8.sp,
                                color = if (sel) BrandTerracotta else G3,
                                fontWeight = if (sel) FontWeight.Medium else FontWeight.Normal,
                                letterSpacing = 0.5.sp)
                            Text(date.toString(), fontSize = 11.sp,
                                color = if (sel) BrandTerracotta else G1,
                                fontWeight = FontWeight.Medium)
                            Box(
                                modifier = Modifier.width(46.dp).height(66.dp)
                                    .clip(RoundedCornerShape(8.dp)).background(BrandLight3)
                                    .then(if (sel) Modifier.border(1.5.dp, BrandTerracotta, RoundedCornerShape(8.dp)) else Modifier)
                            ) {
                                AsyncImage(model = url, contentDescription = null,
                                    contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                            }
                        }
                    }
                }
            }
        }
    }
}
