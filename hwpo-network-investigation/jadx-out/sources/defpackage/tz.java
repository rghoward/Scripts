package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tz {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static tz c;
    public zt8 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public final int[] a = {2131230847, 2131230845, 2131230771};
        public final int[] b = {2131230795, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {2131230844, 2131230846, 2131230788, R.drawable.abc_text_cursor_material, 2131230841, 2131230842, 2131230843};
        public final int[] d = {2131230820, R.drawable.abc_cab_background_internal_bg, 2131230819};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = xka.c(context, R.attr.colorControlHighlight);
            int iB = xka.b(context, R.attr.colorButtonNormal);
            int[] iArr = xka.b;
            int[] iArr2 = xka.d;
            int iE = vi1.e(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, xka.c, xka.f}, new int[]{iB, iE, vi1.e(iC, i), i});
        }

        public static LayerDrawable c(zt8 zt8Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableD = zt8Var.d(context, R.drawable.abc_star_black_48dp);
            Drawable drawableD2 = zt8Var.d(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableD;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableD2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = tz.b;
            }
            drawableMutate.setColorFilter(tz.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return vz1.b(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230837) {
                return vz1.b(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, xka.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, xka.c(context, R.attr.colorAccent));
                }
                if (i == 2131230832 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return vz1.b(context, R.color.abc_tint_spinner);
                }
                if (a(this.b, i)) {
                    return xka.d(context, R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return vz1.b(context, R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return vz1.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return vz1.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = xka.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = xka.b;
                iArr2[0] = xka.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = xka.e;
                iArr2[1] = xka.c(context, R.attr.colorControlActivated);
                iArr[2] = xka.f;
                iArr2[2] = xka.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = xka.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = xka.e;
                iArr2[1] = xka.c(context, R.attr.colorControlActivated);
                iArr[2] = xka.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized tz a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return zt8.f(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            tz tzVar = new tz();
            c = tzVar;
            tzVar.a = zt8.c();
            zt8 zt8Var = c.a;
            a aVar = new a();
            synchronized (zt8Var) {
                zt8Var.e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, epa epaVar, int[] iArr) {
        PorterDuff.Mode mode = zt8.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = epaVar.d;
        if (!z && !epaVar.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? epaVar.a : null;
        PorterDuff.Mode mode2 = epaVar.c ? epaVar.b : zt8.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = zt8.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
