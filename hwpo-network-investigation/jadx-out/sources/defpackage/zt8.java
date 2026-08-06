package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zt8 {
    public static zt8 g;
    public WeakHashMap<Context, fx9<ColorStateList>> a;
    public final WeakHashMap<Context, we6<WeakReference<Drawable.ConstantState>>> b = new WeakHashMap<>(0);
    public TypedValue c;
    public boolean d;
    public tz.a e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final a h = new a(6);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends nf6<Integer, PorterDuffColorFilter> {
    }

    public static synchronized zt8 c() {
        try {
            if (g == null) {
                g = new zt8();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        a aVar = h;
        aVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilterC = aVar.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i, mode);
            aVar.d(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        fx9<ColorStateList> fx9Var = this.a.get(context);
        if (fx9Var == null) {
            fx9Var = new fx9<>();
            this.a.put(context, fx9Var);
        }
        int i2 = fx9Var.w;
        if (i2 != 0 && i <= fx9Var.u[i2 - 1]) {
            fx9Var.e(i, colorStateList);
            return;
        }
        if (fx9Var.t && i2 >= fx9Var.u.length) {
            zb9.b(fx9Var);
        }
        int i3 = fx9Var.w;
        if (i3 >= fx9Var.u.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            fx9Var.u = Arrays.copyOf(fx9Var.u, i7);
            fx9Var.v = Arrays.copyOf(fx9Var.v, i7);
        }
        fx9Var.u[i3] = i;
        fx9Var.v[i3] = colorStateList;
        fx9Var.w = i3 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawableC;
        WeakReference<Drawable.ConstantState> weakReferenceB;
        Drawable drawableNewDrawable;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            we6<WeakReference<Drawable.ConstantState>> we6Var = this.b.get(context);
            layerDrawableC = null;
            if (we6Var != null && (weakReferenceB = we6Var.b(j)) != null) {
                Drawable.ConstantState constantState = weakReferenceB.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    we6Var.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131230788)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableC = tz.a.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = tz.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = tz.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                we6<WeakReference<Drawable.ConstantState>> we6Var2 = this.b.get(context);
                if (we6Var2 == null) {
                    we6Var2 = new we6<>();
                    this.b.put(context, we6Var2);
                }
                we6Var2.f(j, new WeakReference<>(constantState2));
                return layerDrawableC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof wcb) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                d83.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateListC;
        fx9<ColorStateList> fx9Var;
        WeakHashMap<Context, fx9<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateListD = null;
        colorStateListC = (weakHashMap == null || (fx9Var = weakHashMap.get(context)) == null) ? null : fx9Var.c(i);
        if (colorStateListC == null) {
            tz.a aVar = this.e;
            if (aVar != null) {
                colorStateListD = aVar.d(context, i);
            }
            if (colorStateListD != null) {
                a(context, i, colorStateListD);
            }
            colorStateListC = colorStateListD;
        }
        return colorStateListC;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        tz.a aVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (aVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = xka.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = tz.b;
                tz.a.e(drawableFindDrawableByLayerId, iC, mode2);
                tz.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), xka.c(context, R.attr.colorControlNormal), mode2);
                tz.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), xka.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = xka.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = tz.b;
                tz.a.e(drawableFindDrawableByLayerId2, iB, mode3);
                tz.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), xka.c(context, R.attr.colorControlActivated), mode3);
                tz.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), xka.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        tz.a aVar2 = this.e;
        boolean z3 = false;
        if (aVar2 != null) {
            PorterDuff.Mode mode4 = tz.b;
            if (tz.a.a(aVar2.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (tz.a.a(aVar2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zA = tz.a.a(aVar2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zA) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230808) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(tz.c(xka.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
