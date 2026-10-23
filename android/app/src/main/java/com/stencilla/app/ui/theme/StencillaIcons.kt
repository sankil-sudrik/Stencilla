package com.stencilla.app.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

/**
 * Stencilla icon set — all icons are hand-crafted SVG ImageVectors on a 24×24 grid.
 * Stroke icons use strokeLineWidth = 1.8f by default to match the Stitch design weight.
 * Add every new icon here; never use emoji or Unicode glyphs in the UI.
 */
object StencillaIcons {

    // ── Stroke helpers ──────────────────────────────────────────────────
    private fun stroke(
        name: String,
        block: ImageVector.Builder.() -> Unit
    ): ImageVector = ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp, defaultHeight = 24.dp,
        viewportWidth = 24f, viewportHeight = 24f
    ).apply(block).build()

    private fun fill(
        name: String,
        block: ImageVector.Builder.() -> Unit
    ): ImageVector = ImageVector.Builder(
        name = name,
        defaultWidth = 24.dp, defaultHeight = 24.dp,
        viewportWidth = 24f, viewportHeight = 24f
    ).apply(block).build()

    // ─────────────────────────────────────────────────────────────────────
    // NAVIGATION / SHELL
    // ─────────────────────────────────────────────────────────────────────

    /** Bottom-bar "Today" — sun */
    val Sun: ImageVector get() = stroke("Sun") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f); verticalLineTo(3f)
            moveTo(12f, 21f); verticalLineTo(22f)
            moveTo(4.22f, 4.22f); lineTo(4.93f, 4.93f)
            moveTo(19.07f, 19.07f); lineTo(19.78f, 19.78f)
            moveTo(2f, 12f); horizontalLineTo(3f)
            moveTo(21f, 12f); horizontalLineTo(22f)
            moveTo(4.22f, 19.78f); lineTo(4.93f, 19.07f)
            moveTo(19.07f, 4.93f); lineTo(19.78f, 4.22f)
            moveTo(12f, 7f)
            curveTo(9.24f, 7f, 7f, 9.24f, 7f, 12f)
            curveTo(7f, 14.76f, 9.24f, 17f, 12f, 17f)
            curveTo(14.76f, 17f, 17f, 14.76f, 17f, 12f)
            curveTo(17f, 9.24f, 14.76f, 7f, 12f, 7f); close()
        }
    }

    /** Bottom-bar "Closet" — hanger */
    val Hanger: ImageVector get() = stroke("Hanger") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 4f)
            curveTo(13.1f, 4f, 14f, 4.9f, 14f, 6f)
            curveTo(14f, 6.74f, 13.6f, 7.38f, 13f, 7.73f)
            lineTo(20f, 14f); horizontalLineTo(4f); lineTo(11f, 7.73f)
            curveTo(10.4f, 7.38f, 10f, 6.74f, 10f, 6f)
            curveTo(10f, 4.9f, 10.9f, 4f, 12f, 4f); close()
            moveTo(4f, 14f); horizontalLineTo(20f)
            curveTo(20f, 14f, 21f, 14.5f, 21f, 15.5f)
            curveTo(21f, 16.5f, 20f, 17f, 19f, 17f)
            horizontalLineTo(5f)
            curveTo(4f, 17f, 3f, 16.5f, 3f, 15.5f)
            curveTo(3f, 14.5f, 4f, 14f, 4f, 14f)
        }
    }

    /** Bottom-bar "Planner" — calendar */
    val Calendar: ImageVector get() = stroke("Calendar") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 2f); verticalLineTo(6f)
            moveTo(16f, 2f); verticalLineTo(6f)
            moveTo(3f, 9f); horizontalLineTo(21f)
            moveTo(4f, 4f); horizontalLineTo(20f)
            curveTo(20.55f, 4f, 21f, 4.45f, 21f, 5f)
            verticalLineTo(20f)
            curveTo(21f, 20.55f, 20.55f, 21f, 20f, 21f)
            horizontalLineTo(4f)
            curveTo(3.45f, 21f, 3f, 20.55f, 3f, 20f)
            verticalLineTo(5f)
            curveTo(3f, 4.45f, 3.45f, 4f, 4f, 4f); close()
        }
    }

    /** Bottom-bar "Profile" — person */
    val Person: ImageVector get() = stroke("Person") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 4f)
            curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
            curveTo(8f, 10.21f, 9.79f, 12f, 12f, 12f)
            curveTo(14.21f, 12f, 16f, 10.21f, 16f, 8f)
            curveTo(16f, 5.79f, 14.21f, 4f, 12f, 4f); close()
            moveTo(6f, 20f)
            curveTo(6f, 17.24f, 8.69f, 15f, 12f, 15f)
            curveTo(15.31f, 15f, 18f, 17.24f, 18f, 20f)
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // HEADER / SHELL
    // ─────────────────────────────────────────────────────────────────────

    /** Bell notification */
    val Bell: ImageVector get() = stroke("Bell") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(18f, 8f)
            curveTo(18f, 6.4f, 17.37f, 4.87f, 16.24f, 3.76f)
            curveTo(15.12f, 2.63f, 13.59f, 2f, 12f, 2f)
            curveTo(10.41f, 2f, 8.88f, 2.63f, 7.76f, 3.76f)
            curveTo(6.63f, 4.87f, 6f, 6.4f, 6f, 8f)
            curveTo(6f, 15f, 3f, 17f, 3f, 17f)
            horizontalLineTo(21f)
            curveTo(21f, 17f, 18f, 15f, 18f, 8f); close()
            moveTo(10.3f, 21f)
            curveTo(10.57f, 21.48f, 11.27f, 22f, 12f, 22f)
            curveTo(12.73f, 22f, 13.43f, 21.48f, 13.7f, 21f)
        }
    }

    /** Cloud-sun weather */
    val CloudSun: ImageVector get() = stroke("CloudSun") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            // sun body
            moveTo(12f, 2f); verticalLineTo(3f)
            moveTo(12f, 9f)
            curveTo(10.34f, 9f, 9f, 10.34f, 9f, 12f)
            // rays
            moveTo(4.93f, 4.93f); lineTo(5.64f, 5.64f)
            moveTo(2f, 12f); horizontalLineTo(3f)
            moveTo(19.07f, 4.93f); lineTo(18.36f, 5.64f)
            moveTo(21f, 12f); horizontalLineTo(20f)
            // cloud
            moveTo(9f, 16f)
            curveTo(6.24f, 16f, 4f, 13.76f, 4f, 11f)
            curveTo(4f, 8.51f, 5.84f, 6.45f, 8.25f, 6.06f)
            curveTo(9.14f, 4.82f, 10.54f, 4f, 12.13f, 4f)
            curveTo(14.76f, 4f, 16.9f, 5.9f, 17.12f, 8.38f)
            curveTo(18.74f, 8.88f, 20f, 10.35f, 20f, 12f)
            curveTo(20f, 14.21f, 17.65f, 16f, 15f, 16f)
            horizontalLineTo(9f); close()
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // TODAY — quick action icons
    // ─────────────────────────────────────────────────────────────────────

    /** Create Outfit — shirt silhouette */
    val Shirt: ImageVector get() = stroke("Shirt") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(20.38f, 3.62f)
            lineTo(16f, 2f)
            curveTo(16f, 2f, 14.5f, 5f, 12f, 5f)
            curveTo(9.5f, 5f, 8f, 2f, 8f, 2f)
            lineTo(3.62f, 3.62f)
            lineTo(2f, 9f)
            lineTo(5f, 10f)
            verticalLineTo(21f)
            horizontalLineTo(19f)
            verticalLineTo(10f)
            lineTo(22f, 9f)
            lineTo(20.38f, 3.62f); close()
        }
    }

    /** AI Stylist — sparkle/wand */
    val Sparkle: ImageVector get() = stroke("Sparkle") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            // wand stick
            moveTo(15f, 4f); lineTo(20f, 9f)
            moveTo(4f, 20f); lineTo(13f, 11f)
            // star
            moveTo(17.5f, 2f); verticalLineTo(5f)
            moveTo(22f, 6.5f); horizontalLineTo(19f)
            moveTo(17.5f, 11f); verticalLineTo(8f)
            moveTo(13f, 6.5f); horizontalLineTo(16f)
        }
    }

    /** Style Notes — notepad lines */
    val Notepad: ImageVector get() = stroke("Notepad") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(4f, 4f); horizontalLineTo(20f)
            curveTo(20f, 4f, 21f, 4.45f, 21f, 5f)
            verticalLineTo(19f)
            curveTo(21f, 19.55f, 20.55f, 20f, 20f, 20f)
            horizontalLineTo(4f)
            curveTo(3.45f, 20f, 3f, 19.55f, 3f, 19f)
            verticalLineTo(5f)
            curveTo(3f, 4.45f, 3.55f, 4f, 4f, 4f); close()
            moveTo(7f, 9f); horizontalLineTo(17f)
            moveTo(7f, 12f); horizontalLineTo(17f)
            moveTo(7f, 15f); horizontalLineTo(13f)
        }
    }

    /** Weather Aware — cloud with rain */
    val CloudRain: ImageVector get() = stroke("CloudRain") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(16f, 13f)
            verticalLineTo(21f)
            moveTo(8f, 13f)
            verticalLineTo(21f)
            moveTo(12f, 15f)
            verticalLineTo(23f)
            moveTo(20f, 16.58f)
            curveTo(21.22f, 15.83f, 22f, 14.51f, 22f, 13f)
            curveTo(22f, 10.79f, 20.21f, 9f, 18f, 9f)
            horizontalLineTo(16.74f)
            curveTo(16.31f, 7.32f, 15.12f, 5.92f, 13.56f, 5.2f)
            curveTo(12f, 4.48f, 10.2f, 4.56f, 8.7f, 5.41f)
            curveTo(7.21f, 6.26f, 6.16f, 7.8f, 6f, 9.53f)
            curveTo(4.27f, 9.87f, 3f, 11.31f, 3f, 13f)
            curveTo(3f, 14.93f, 4.49f, 16.5f, 6.38f, 16.58f)
        }
    }

    /** Wand magic — for "Why this works" and AI section */
    val WandSparkle: ImageVector get() = stroke("WandSparkle") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(3f, 21f); lineTo(12f, 12f)
            moveTo(9f, 3f); horizontalLineTo(12f)
            moveTo(10.5f, 1.5f); verticalLineTo(4.5f)
            moveTo(14.5f, 5.5f); lineTo(16.5f, 7.5f)
            moveTo(20f, 3f); verticalLineTo(6f)
            moveTo(18.5f, 1.5f); horizontalLineTo(21.5f)
            moveTo(15f, 9f); horizontalLineTo(18f)
            moveTo(16.5f, 7.5f); verticalLineTo(10.5f)
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // CLOSET
    // ─────────────────────────────────────────────────────────────────────

    /** Filter / sliders icon (grid-like) — closet header right icon */
    val SlidersHorizontal: ImageVector get() = stroke("SlidersHorizontal") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(21f, 4f); horizontalLineTo(14f)
            moveTo(10f, 4f); horizontalLineTo(3f)
            moveTo(21f, 12f); horizontalLineTo(12f)
            moveTo(8f, 12f); horizontalLineTo(3f)
            moveTo(21f, 20f); horizontalLineTo(16f)
            moveTo(12f, 20f); horizontalLineTo(3f)
            // knobs
            moveTo(14f, 2f); verticalLineTo(6f)
            moveTo(8f, 10f); verticalLineTo(14f)
            moveTo(16f, 18f); verticalLineTo(22f)
        }
    }

    /** Plus (add item FAB) */
    val Plus: ImageVector get() = stroke("Plus") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round
        ) {
            moveTo(12f, 5f); verticalLineTo(19f)
            moveTo(5f, 12f); horizontalLineTo(19f)
        }
    }

    /** Workwear — briefcase */
    val Briefcase: ImageVector get() = stroke("Briefcase") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(9f, 7f)
            verticalLineTo(4f)
            curveTo(9f, 3.45f, 9.45f, 3f, 10f, 3f)
            horizontalLineTo(14f)
            curveTo(14.55f, 3f, 15f, 3.45f, 15f, 4f)
            verticalLineTo(7f)
            moveTo(2f, 9f)
            horizontalLineTo(22f)
            curveTo(22f, 9f, 22f, 9f, 22f, 9.5f)
            verticalLineTo(19f)
            curveTo(22f, 19.55f, 21.55f, 20f, 21f, 20f)
            horizontalLineTo(3f)
            curveTo(2.45f, 20f, 2f, 19.55f, 2f, 19f)
            verticalLineTo(9.5f)
            curveTo(2f, 9f, 2f, 9f, 2f, 9f); close()
        }
    }

    /** Casual — t-shirt */
    val TShirt: ImageVector get() = stroke("TShirt") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(16f, 3f)
            curveTo(16f, 3f, 14.5f, 6f, 12f, 6f)
            curveTo(9.5f, 6f, 8f, 3f, 8f, 3f)
            lineTo(3f, 6f); lineTo(6f, 9f)
            verticalLineTo(21f); horizontalLineTo(18f)
            verticalLineTo(9f); lineTo(21f, 6f)
            lineTo(16f, 3f); close()
        }
    }

    /** Party — star */
    val Star: ImageVector get() = stroke("Star") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f)
            lineTo(15.09f, 8.26f); lineTo(22f, 9.27f)
            lineTo(17f, 14.14f); lineTo(18.18f, 21.02f)
            lineTo(12f, 17.77f); lineTo(5.82f, 21.02f)
            lineTo(7f, 14.14f); lineTo(2f, 9.27f)
            lineTo(8.91f, 8.26f); lineTo(12f, 2f); close()
        }
    }

    /** Ethnic — diamond/gem */
    val Gem: ImageVector get() = stroke("Gem") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(2f, 9f); lineTo(12f, 22f); lineTo(22f, 9f)
            lineTo(17.5f, 3f); horizontalLineTo(6.5f); lineTo(2f, 9f); close()
            moveTo(2f, 9f); horizontalLineTo(22f)
            moveTo(6.5f, 3f); lineTo(9f, 9f); lineTo(12f, 22f)
            moveTo(17.5f, 3f); lineTo(15f, 9f); lineTo(12f, 22f)
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // PLANNER
    // ─────────────────────────────────────────────────────────────────────

    /** Small calendar for "Plan your day" rows */
    val CalendarSmall: ImageVector get() = stroke("CalendarSmall") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 2f); verticalLineTo(5f)
            moveTo(16f, 2f); verticalLineTo(5f)
            moveTo(3.5f, 8f); horizontalLineTo(20.5f)
            moveTo(4f, 4f); horizontalLineTo(20f)
            curveTo(20.55f, 4f, 21f, 4.45f, 21f, 5f)
            verticalLineTo(20f)
            curveTo(21f, 20.55f, 20.55f, 21f, 20f, 21f)
            horizontalLineTo(4f)
            curveTo(3.45f, 21f, 3f, 20.55f, 3f, 20f)
            verticalLineTo(5f)
            curveTo(3f, 4.45f, 3.45f, 4f, 4f, 4f); close()
        }
    }

    /** Luggage / suitcase */
    val Luggage: ImageVector get() = stroke("Luggage") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(9f, 6f); verticalLineTo(3f)
            curveTo(9f, 2.45f, 9.45f, 2f, 10f, 2f)
            horizontalLineTo(14f)
            curveTo(14.55f, 2f, 15f, 2.45f, 15f, 3f)
            verticalLineTo(6f)
            moveTo(2f, 8f)
            horizontalLineTo(22f)
            curveTo(22f, 8f, 22f, 8f, 22f, 8.5f)
            verticalLineTo(20f)
            curveTo(22f, 20.55f, 21.55f, 21f, 21f, 21f)
            horizontalLineTo(3f)
            curveTo(2.45f, 21f, 2f, 20.55f, 2f, 20f)
            verticalLineTo(8.5f)
            curveTo(2f, 8f, 2f, 8f, 2f, 8f); close()
            moveTo(12f, 12f); verticalLineTo(17f)
            moveTo(9f, 14.5f); horizontalLineTo(15f)
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // PROFILE — preference & settings row icons
    // ─────────────────────────────────────────────────────────────────────

    /** Body & Fit — ruler/measure */
    val Ruler: ImageVector get() = stroke("Ruler") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(21.21f, 15.89f)
            lineTo(15.89f, 21.21f)
            curveTo(15.5f, 21.6f, 14.86f, 21.6f, 14.46f, 21.21f)
            lineTo(2.79f, 9.54f)
            curveTo(2.4f, 9.14f, 2.4f, 8.5f, 2.79f, 8.11f)
            lineTo(8.11f, 2.79f)
            curveTo(8.5f, 2.4f, 9.14f, 2.4f, 9.54f, 2.79f)
            lineTo(21.21f, 14.46f)
            curveTo(21.6f, 14.86f, 21.6f, 15.5f, 21.21f, 15.89f); close()
            moveTo(6f, 11f); lineTo(8.5f, 8.5f)
            moveTo(9.5f, 14f); lineTo(12f, 11.5f)
            moveTo(13f, 17f); lineTo(15.5f, 14.5f)
        }
    }

    /** Style Preferences — palette */
    val Palette: ImageVector get() = stroke("Palette") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f)
            curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
            curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            curveTo(14.5f, 22f, 16f, 20.76f, 16f, 19f)
            curveTo(16f, 18.16f, 15.67f, 17.39f, 15.12f, 16.82f)
            curveTo(15.05f, 16.74f, 15f, 16.61f, 15f, 16.5f)
            curveTo(15f, 16.22f, 15.22f, 16f, 15.5f, 16f)
            horizontalLineTo(17f)
            curveTo(19.76f, 16f, 22f, 13.76f, 22f, 11f)
            curveTo(22f, 6.04f, 17.52f, 2f, 12f, 2f); close()
            moveTo(7f, 13f)
            curveTo(6.45f, 13f, 6f, 12.55f, 6f, 12f)
            curveTo(6f, 11.45f, 6.45f, 11f, 7f, 11f)
            curveTo(7.55f, 11f, 8f, 11.45f, 8f, 12f)
            curveTo(8f, 12.55f, 7.55f, 13f, 7f, 13f); close()
            moveTo(9f, 9f)
            curveTo(8.45f, 9f, 8f, 8.55f, 8f, 8f)
            curveTo(8f, 7.45f, 8.45f, 7f, 9f, 7f)
            curveTo(9.55f, 7f, 10f, 7.45f, 10f, 8f)
            curveTo(10f, 8.55f, 9.55f, 9f, 9f, 9f); close()
            moveTo(15f, 9f)
            curveTo(14.45f, 9f, 14f, 8.55f, 14f, 8f)
            curveTo(14f, 7.45f, 14.45f, 7f, 15f, 7f)
            curveTo(15.55f, 7f, 16f, 7.45f, 16f, 8f)
            curveTo(16f, 8.55f, 15.55f, 9f, 15f, 9f); close()
        }
    }

    /** Occasions — tag */
    val Tag: ImageVector get() = stroke("Tag") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(20.59f, 13.41f)
            lineTo(13.42f, 20.58f)
            curveTo(13.22f, 20.78f, 12.96f, 20.9f, 12.68f, 20.93f)
            curveTo(12.4f, 20.96f, 12.12f, 20.9f, 11.88f, 20.76f)
            lineTo(3.59f, 15.76f)
            curveTo(3.38f, 15.64f, 3.21f, 15.47f, 3.11f, 15.26f)
            curveTo(3f, 15.05f, 2.97f, 14.81f, 3f, 14.59f)
            lineTo(4f, 4f)
            lineTo(14.59f, 3f)
            curveTo(14.81f, 2.97f, 15.05f, 3f, 15.26f, 3.11f)
            curveTo(15.47f, 3.21f, 15.64f, 3.38f, 15.76f, 3.59f)
            lineTo(20.76f, 11.88f)
            curveTo(20.9f, 12.12f, 20.96f, 12.4f, 20.93f, 12.68f)
            curveTo(20.9f, 12.96f, 20.78f, 13.22f, 20.59f, 13.41f); close()
            // dot
            moveTo(8.5f, 8.5f)
            curveTo(8.5f, 8.78f, 8.28f, 9f, 8f, 9f)
            curveTo(7.72f, 9f, 7.5f, 8.78f, 7.5f, 8.5f)
            curveTo(7.5f, 8.22f, 7.72f, 8f, 8f, 8f)
            curveTo(8.28f, 8f, 8.5f, 8.22f, 8.5f, 8.5f); close()
        }
    }

    /** Color Preferences — swatches / droplet */
    val Droplet: ImageVector get() = stroke("Droplet") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f)
            lineTo(5.5f, 10f)
            curveTo(4.5f, 11.2f, 4f, 12.7f, 4f, 14f)
            curveTo(4f, 17.31f, 7.13f, 20f, 12f, 20f)
            curveTo(16.87f, 20f, 20f, 17.31f, 20f, 14f)
            curveTo(20f, 12.7f, 19.5f, 11.2f, 18.5f, 10f)
            lineTo(12f, 2f); close()
        }
    }

    /** Settings — Account (person circle) */
    val PersonCircle: ImageVector get() = stroke("PersonCircle") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f)
            curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
            curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
            curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f); close()
            moveTo(12f, 7f)
            curveTo(13.1f, 7f, 14f, 7.9f, 14f, 9f)
            curveTo(14f, 10.1f, 13.1f, 11f, 12f, 11f)
            curveTo(10.9f, 11f, 10f, 10.1f, 10f, 9f)
            curveTo(10f, 7.9f, 10.9f, 7f, 12f, 7f); close()
            moveTo(7f, 18f)
            curveTo(7f, 15.79f, 9.24f, 14f, 12f, 14f)
            curveTo(14.76f, 14f, 17f, 15.79f, 17f, 18f)
        }
    }

    /** Settings — Notifications (bell small) — reuse Bell above in code */

    /** Settings — Privacy (lock) */
    val Lock: ImageVector get() = stroke("Lock") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 11f)
            verticalLineTo(7f)
            curveTo(8f, 4.79f, 9.79f, 3f, 12f, 3f)
            curveTo(14.21f, 3f, 16f, 4.79f, 16f, 7f)
            verticalLineTo(11f)
            moveTo(5f, 11f)
            horizontalLineTo(19f)
            curveTo(19.55f, 11f, 20f, 11.45f, 20f, 12f)
            verticalLineTo(20f)
            curveTo(20f, 20.55f, 19.55f, 21f, 19f, 21f)
            horizontalLineTo(5f)
            curveTo(4.45f, 21f, 4f, 20.55f, 4f, 20f)
            verticalLineTo(12f)
            curveTo(4f, 11.45f, 4.45f, 11f, 5f, 11f); close()
        }
    }

    /** Settings — Help & Support (question circle) */
    val HelpCircle: ImageVector get() = stroke("HelpCircle") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(12f, 2f)
            curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
            curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
            curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f); close()
            moveTo(12f, 17f)
            curveTo(11.45f, 17f, 11f, 16.55f, 11f, 16f)
            curveTo(11f, 15.45f, 11.45f, 15f, 12f, 15f)
            curveTo(12.55f, 15f, 13f, 15.45f, 13f, 16f)
            curveTo(13f, 16.55f, 12.55f, 17f, 12f, 17f); close()
            moveTo(12f, 13f)
            verticalLineTo(12f)
            curveTo(13.1f, 12f, 14f, 11.1f, 14f, 10f)
            curveTo(14f, 8.9f, 13.1f, 8f, 12f, 8f)
            curveTo(10.9f, 8f, 10f, 8.9f, 10f, 10f)
        }
    }

    /** Chevron right — generic row arrow */
    val ChevronRight: ImageVector get() = stroke("ChevronRight") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(9f, 18f); lineTo(15f, 12f); lineTo(9f, 6f)
        }
    }

    /** Send / arrow right — for AI input */
    val ArrowRight: ImageVector get() = stroke("ArrowRight") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(5f, 12f); horizontalLineTo(19f)
            moveTo(13f, 6f); lineTo(19f, 12f); lineTo(13f, 18f)
        }
    }

    // ─────────────────────────────────────────────────────────────────────
    // WARDROBE INSIGHTS — category icons
    // ─────────────────────────────────────────────────────────────────────

    /** Tops — folded shirt */
    val Tops: ImageVector get() = stroke("Tops") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.6f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(16f, 3f)
            curveTo(16f, 3f, 14.5f, 6f, 12f, 6f)
            curveTo(9.5f, 6f, 8f, 3f, 8f, 3f)
            lineTo(3f, 6f); lineTo(5f, 9f)
            verticalLineTo(20f); horizontalLineTo(19f)
            verticalLineTo(9f); lineTo(21f, 6f); lineTo(16f, 3f); close()
        }
    }

    /** Bottoms — trousers */
    val Bottoms: ImageVector get() = stroke("Bottoms") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.6f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(4f, 3f); horizontalLineTo(20f)
            lineTo(18f, 12f); lineTo(15f, 21f)
            moveTo(20f, 3f); lineTo(18f, 12f); lineTo(12f, 12f)
            moveTo(4f, 3f); lineTo(6f, 12f); lineTo(9f, 21f)
            moveTo(4f, 3f); lineTo(6f, 12f); lineTo(12f, 12f)
        }
    }

    /** Outers — jacket */
    val Outers: ImageVector get() = stroke("Outers") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.6f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(18f, 3f); lineTo(21f, 6f); lineTo(18f, 9f)
            verticalLineTo(21f); horizontalLineTo(6f)
            verticalLineTo(9f); lineTo(3f, 6f); lineTo(6f, 3f)
            curveTo(6f, 3f, 8f, 6f, 12f, 6f)
            curveTo(16f, 6f, 18f, 3f, 18f, 3f); close()
            moveTo(12f, 6f); verticalLineTo(21f)
        }
    }

    /** Shoes — sneaker silhouette */
    val Shoes: ImageVector get() = stroke("Shoes") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.6f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(3f, 16f)
            curveTo(3f, 16f, 4f, 8f, 9f, 8f)
            lineTo(13f, 8f)
            curveTo(13f, 8f, 15f, 8f, 16f, 10f)
            lineTo(20f, 10f)
            curveTo(21f, 10f, 22f, 11f, 22f, 12f)
            verticalLineTo(16f)
            curveTo(22f, 17f, 21f, 17f, 20f, 17f)
            horizontalLineTo(3f)
            curveTo(3f, 17f, 2f, 17f, 3f, 16f); close()
        }
    }

    /** Bags — handbag */
    val Bag: ImageVector get() = stroke("Bag") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.6f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(9f, 8f)
            verticalLineTo(5f)
            curveTo(9f, 3.9f, 10.34f, 3f, 12f, 3f)
            curveTo(13.66f, 3f, 15f, 3.9f, 15f, 5f)
            verticalLineTo(8f)
            moveTo(3f, 10f)
            horizontalLineTo(21f)
            curveTo(21f, 10f, 22f, 10.5f, 22f, 11f)
            verticalLineTo(20f)
            curveTo(22f, 20.55f, 21.55f, 21f, 21f, 21f)
            horizontalLineTo(3f)
            curveTo(2.45f, 21f, 2f, 20.55f, 2f, 20f)
            verticalLineTo(11f)
            curveTo(2f, 10.5f, 3f, 10f, 3f, 10f); close()
        }
    }

    /** Search — magnifying glass */
    val Search: ImageVector get() = stroke("Search") {
        path(
            stroke = SolidColor(Color.Black), strokeLineWidth = 1.8f,
            strokeLineCap = StrokeCap.Round, strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(21f, 21f); lineTo(16.65f, 16.65f)
            moveTo(11f, 19f)
            curveTo(6.58f, 19f, 3f, 15.42f, 3f, 11f)
            curveTo(3f, 6.58f, 6.58f, 3f, 11f, 3f)
            curveTo(15.42f, 3f, 19f, 6.58f, 19f, 11f)
            curveTo(19f, 15.42f, 15.42f, 19f, 11f, 19f); close()
        }
    }
}
