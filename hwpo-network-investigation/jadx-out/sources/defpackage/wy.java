package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wy {
    public final View a;
    public epa d;
    public epa e;
    public epa f;
    public int c = -1;
    public final tz b = tz.a();

    public wy(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new epa();
                }
                epa epaVar = this.f;
                epaVar.a = null;
                epaVar.d = false;
                epaVar.b = null;
                epaVar.c = false;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    epaVar.d = true;
                    epaVar.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    epaVar.c = true;
                    epaVar.b = backgroundTintMode;
                }
                if (epaVar.d || epaVar.c) {
                    tz.e(background, epaVar, view.getDrawableState());
                    return;
                }
            }
            epa epaVar2 = this.e;
            if (epaVar2 != null) {
                tz.e(background, epaVar2, view.getDrawableState());
                return;
            }
            epa epaVar3 = this.d;
            if (epaVar3 != null) {
                tz.e(background, epaVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        epa epaVar = this.e;
        if (epaVar != null) {
            return epaVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        epa epaVar = this.e;
        if (epaVar != null) {
            return epaVar.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = ph8.z;
        gpa gpaVarE = gpa.e(context, attributeSet, iArr, i);
        TypedArray typedArray = gpaVarE.b;
        View view2 = this.a;
        egb.n(view2, view2.getContext(), iArr, attributeSet, gpaVarE.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                tz tzVar = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (tzVar) {
                    colorStateListG = tzVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(gpaVarE.a(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(d83.c(typedArray.getInt(2, -1), null));
            }
            gpaVarE.f();
        } catch (Throwable th) {
            gpaVarE.f();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListG;
        this.c = i;
        tz tzVar = this.b;
        if (tzVar != null) {
            Context context = this.a.getContext();
            synchronized (tzVar) {
                colorStateListG = tzVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new epa();
            }
            epa epaVar = this.d;
            epaVar.a = colorStateList;
            epaVar.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new epa();
        }
        epa epaVar = this.e;
        epaVar.a = colorStateList;
        epaVar.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new epa();
        }
        epa epaVar = this.e;
        epaVar.b = mode;
        epaVar.c = true;
        a();
    }
}
