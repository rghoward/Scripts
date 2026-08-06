package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ll9 implements kl9 {
    public static final yl8 m = new yl8(0.5f);
    public f41 a = new by8();
    public f41 b = new by8();
    public f41 c = new by8();
    public f41 d = new by8();
    public d72 e = new h0(0.0f);
    public d72 f = new h0(0.0f);
    public d72 g = new h0(0.0f);
    public d72 h = new h0(0.0f);
    public qa3 i = new qa3();
    public qa3 j = new qa3();
    public qa3 k = new qa3();
    public qa3 l = new qa3();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public f41 a = new by8();
        public f41 b = new by8();
        public f41 c = new by8();
        public f41 d = new by8();
        public d72 e = new h0(0.0f);
        public d72 f = new h0(0.0f);
        public d72 g = new h0(0.0f);
        public d72 h = new h0(0.0f);
        public qa3 i = new qa3();
        public qa3 j = new qa3();
        public qa3 k = new qa3();
        public qa3 l = new qa3();

        public final ll9 a() {
            ll9 ll9Var = new ll9();
            ll9Var.a = this.a;
            ll9Var.b = this.b;
            ll9Var.c = this.c;
            ll9Var.d = this.d;
            ll9Var.e = this.e;
            ll9Var.f = this.f;
            ll9Var.g = this.g;
            ll9Var.h = this.h;
            ll9Var.i = this.i;
            ll9Var.j = this.j;
            ll9Var.k = this.k;
            ll9Var.l = this.l;
            return ll9Var;
        }

        public final void b(float f) {
            this.e = new h0(f);
            this.f = new h0(f);
            this.g = new h0(f);
            this.h = new h0(f);
        }
    }

    public static a f(Context context, int i, int i2) {
        h0 h0Var = new h0(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(bh8.B), h0Var);
    }

    public static a g(Context context, AttributeSet attributeSet, int i, int i2) {
        h0 h0Var = new h0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bh8.t, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(bh8.B), h0Var);
    }

    public static a h(TypedArray typedArray, d72 d72Var) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            d72 d72VarI = i(typedArray, 5, d72Var);
            d72 d72VarI2 = i(typedArray, 8, d72VarI);
            d72 d72VarI3 = i(typedArray, 9, d72VarI);
            d72 d72VarI4 = i(typedArray, 7, d72VarI);
            d72 d72VarI5 = i(typedArray, 6, d72VarI);
            a aVar = new a();
            aVar.a = lk6.b(i2);
            aVar.e = d72VarI2;
            aVar.b = lk6.b(i3);
            aVar.f = d72VarI3;
            aVar.c = lk6.b(i4);
            aVar.g = d72VarI4;
            aVar.d = lk6.b(i5);
            aVar.h = d72VarI5;
            return aVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static d72 i(TypedArray typedArray, int i, d72 d72Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new h0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new yl8(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return d72Var;
    }

    @Override // defpackage.kl9
    public final ll9 a(float f) {
        a aVarK = k();
        aVarK.b(f);
        return aVarK.a();
    }

    @Override // defpackage.kl9
    public final ll9[] c() {
        return new ll9[]{this};
    }

    @Override // defpackage.kl9
    public final boolean e() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(qa3.class) && this.j.getClass().equals(qa3.class) && this.i.getClass().equals(qa3.class) && this.k.getClass().equals(qa3.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && (this.b instanceof by8) && (this.a instanceof by8) && (this.c instanceof by8) && (this.d instanceof by8);
    }

    public final a k() {
        a aVar = new a();
        aVar.a = new by8();
        aVar.b = new by8();
        aVar.c = new by8();
        aVar.d = new by8();
        aVar.e = new h0(0.0f);
        aVar.f = new h0(0.0f);
        aVar.g = new h0(0.0f);
        aVar.h = new h0(0.0f);
        aVar.i = new qa3();
        aVar.j = new qa3();
        aVar.k = new qa3();
        new qa3();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.kl9
    public final ll9 d() {
        return this;
    }

    @Override // defpackage.kl9
    public final ll9 b(int[] iArr) {
        return this;
    }
}
