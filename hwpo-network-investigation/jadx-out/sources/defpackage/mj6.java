package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mj6 {
    public final MaterialButton a;
    public kl9 b;
    public ry9 c;
    public kk6.d d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public kk6 o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public mj6(MaterialButton materialButton, kl9 kl9Var) {
        this.a = materialButton;
        this.b = kl9Var;
    }

    public final kk6 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (kk6) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112 A[LOOP:0: B:41:0x0100->B:46:0x0112, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x010e A[SYNTHETIC] */
    public final void c() {
        LayerDrawable layerDrawable;
        Drawable drawable;
        kk6 kk6Var = new kk6(this.b);
        ry9 ry9Var = this.c;
        if (ry9Var != null) {
            kk6Var.n(ry9Var);
        }
        kk6.d dVar = this.d;
        if (dVar != null) {
            kk6Var.X = dVar;
        }
        MaterialButton materialButton = this.a;
        Context context = materialButton.getContext();
        kk6Var.l(context);
        kk6Var.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            kk6Var.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        kk6Var.u.j = f;
        kk6Var.invalidateSelf();
        kk6.c cVar = kk6Var.u;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            kk6Var.onStateChange(kk6Var.getState());
        }
        kk6 kk6Var2 = new kk6(this.b);
        ry9 ry9Var2 = this.c;
        if (ry9Var2 != null) {
            kk6Var2.n(ry9Var2);
        }
        kk6Var2.setTint(0);
        float f2 = this.j;
        int iA = this.p ? g53.a(R.attr.colorSurface, materialButton) : 0;
        kk6Var2.u.j = f2;
        kk6Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iA);
        kk6.c cVar2 = kk6Var2.u;
        if (cVar2.d != colorStateListValueOf) {
            cVar2.d = colorStateListValueOf;
            kk6Var2.onStateChange(kk6Var2.getState());
        }
        kk6 kk6Var3 = new kk6(this.b);
        this.o = kk6Var3;
        ry9 ry9Var3 = this.c;
        if (ry9Var3 != null) {
            kk6Var3.n(ry9Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(dx8.c(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{kk6Var2, kk6Var}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable focusRingDrawable = null;
        FocusRingDrawable.e(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        kk6 kk6VarA = a(false);
        if (kk6VarA != null) {
            kk6VarA.o(this.v);
            kk6VarA.setState(materialButton.getDrawableState());
        }
        Drawable background = materialButton.getBackground();
        if (background instanceof FocusRingDrawable) {
            focusRingDrawable = (FocusRingDrawable) background;
        } else if (background instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) background).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                focusRingDrawable = (FocusRingDrawable) drawable2;
            } else if (background instanceof LayerDrawable) {
                layerDrawable = (LayerDrawable) background;
                for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                    drawable = layerDrawable.getDrawable(i);
                    if (drawable instanceof FocusRingDrawable) {
                        focusRingDrawable = (FocusRingDrawable) drawable;
                        break;
                    }
                }
            }
        } else if (background instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) background;
            while (i < layerDrawable.getNumberOfLayers()) {
                drawable = layerDrawable.getDrawable(i);
                if (drawable instanceof FocusRingDrawable) {
                    focusRingDrawable = (FocusRingDrawable) drawable;
                    break;
                }
            }
        }
        if (focusRingDrawable != null) {
            focusRingDrawable.A = new WeakReference<>(kk6VarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void d() {
        tl9 tl9Var;
        kk6 kk6VarA = a(false);
        if (kk6VarA != null) {
            kk6VarA.s(this.b);
            ry9 ry9Var = this.c;
            if (ry9Var != null) {
                kk6VarA.n(ry9Var);
            }
        }
        kk6 kk6VarA2 = a(true);
        if (kk6VarA2 != null) {
            kk6VarA2.s(this.b);
            ry9 ry9Var2 = this.c;
            if (ry9Var2 != null) {
                kk6VarA2.n(ry9Var2);
            }
        }
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable != null) {
            Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (objFindDrawableByLayerId instanceof tl9) {
                tl9Var = (tl9) objFindDrawableByLayerId;
            } else {
                tl9Var = null;
            }
        } else {
            tl9Var = null;
        }
        if (tl9Var != null) {
            boolean z = tl9Var instanceof kk6;
            kl9 kl9Var = this.b;
            if (!z) {
                tl9Var.setShapeAppearanceModel(kl9Var.d());
                return;
            }
            kk6 kk6Var = (kk6) tl9Var;
            kk6Var.s(kl9Var);
            ry9 ry9Var3 = this.c;
            if (ry9Var3 != null) {
                kk6Var.n(ry9Var3);
            }
        }
    }

    public final void e() {
        kk6 kk6VarA = a(false);
        kk6 kk6VarA2 = a(true);
        if (kk6VarA != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            kk6VarA.u.j = f;
            kk6VarA.invalidateSelf();
            kk6.c cVar = kk6VarA.u;
            if (cVar.d != colorStateList) {
                cVar.d = colorStateList;
                kk6VarA.onStateChange(kk6VarA.getState());
            }
            if (kk6VarA2 != null) {
                float f2 = this.j;
                int iA = this.p ? g53.a(R.attr.colorSurface, this.a) : 0;
                kk6VarA2.u.j = f2;
                kk6VarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iA);
                kk6.c cVar2 = kk6VarA2.u;
                if (cVar2.d != colorStateListValueOf) {
                    cVar2.d = colorStateListValueOf;
                    kk6VarA2.onStateChange(kk6VarA2.getState());
                }
            }
        }
    }
}
