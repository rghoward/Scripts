package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ti0 extends Drawable implements mda.b {
    public final int A;
    public float B;
    public float C;
    public float D;
    public WeakReference<View> E;
    public WeakReference<FrameLayout> F;
    public final WeakReference<Context> t;
    public final kk6 u;
    public final mda v;
    public final Rect w;
    public final zi0 x;
    public float y;
    public float z;

    public ti0(Context context, zi0.a aVar) {
        dba dbaVar;
        dba dbaVar2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.t = weakReference;
        vka.c(context, vka.b, "Theme.MaterialComponents");
        this.w = new Rect();
        mda mdaVar = new mda(this);
        this.v = mdaVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = mdaVar.a;
        textPaint.setTextAlign(align);
        zi0 zi0Var = new zi0(context, aVar);
        this.x = zi0Var;
        boolean zG = g();
        zi0.a aVar2 = zi0Var.b;
        kk6 kk6Var = new kk6(ll9.f(context, zG ? aVar2.z.intValue() : aVar2.x.intValue(), g() ? aVar2.A.intValue() : aVar2.y.intValue()).a());
        this.u = kk6Var;
        i();
        Context context2 = weakReference.get();
        if (context2 != null && (dbaVar2 = mdaVar.g) != (dbaVar = new dba(context2, aVar2.w.intValue()))) {
            if (dbaVar2 != dbaVar) {
                mdaVar.g = dbaVar;
                mda.a aVar3 = mdaVar.b;
                dbaVar.d(context2, textPaint, aVar3);
                WeakReference<mda.b> weakReference2 = mdaVar.f;
                mda.b bVar = weakReference2.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dbaVar.d(context2, textPaint, aVar3);
                ColorStateList colorStateList = dbaVar.k;
                textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
                ColorStateList colorStateList2 = dbaVar.a;
                textPaint.setShadowLayer(dbaVar.h, dbaVar.f, dbaVar.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
                mdaVar.e = true;
                mda.b bVar2 = weakReference2.get();
                if (bVar2 != null) {
                    bVar2.a();
                    bVar2.onStateChange(bVar2.getState());
                }
            }
            j();
            l();
            invalidateSelf();
        }
        int i = aVar2.E;
        if (i != -2) {
            this.A = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.A = aVar2.F;
        }
        mdaVar.e = true;
        l();
        invalidateSelf();
        mdaVar.e = true;
        i();
        l();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(aVar2.u.intValue());
        if (kk6Var.u.c != colorStateListValueOf) {
            kk6Var.p(colorStateListValueOf);
            invalidateSelf();
        }
        j();
        WeakReference<View> weakReference3 = this.E;
        if (weakReference3 != null && weakReference3.get() != null) {
            View view = this.E.get();
            WeakReference<FrameLayout> weakReference4 = this.F;
            k(view, weakReference4 != null ? weakReference4.get() : null);
        }
        l();
        setVisible(aVar2.M.booleanValue(), false);
    }

    @Override // mda.b
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view, View view2) {
        float y;
        float x;
        ViewParent parent;
        boolean z;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float f = (this.z - this.D) + y;
            float f2 = (this.y - this.C) + x;
            View view4 = (View) parent;
            float height = ((this.z + this.D) - view4.getHeight()) + y;
            float width = ((this.y + this.C) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.z = Math.abs(f) + this.z;
            }
            if (f2 < 0.0f) {
                this.y = Math.abs(f2) + this.y;
            }
            if (height > 0.0f) {
                this.z -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.y -= Math.abs(width);
            }
        }
    }

    public final String c() {
        zi0 zi0Var = this.x;
        boolean zA = zi0Var.a();
        zi0.a aVar = zi0Var.b;
        WeakReference<Context> weakReference = this.t;
        if (!zA) {
            if (!h()) {
                return null;
            }
            int i = this.A;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(aVar.G).format(f());
            }
            Context context = weakReference.get();
            return context == null ? BuildConfig.FLAVOR : String.format(aVar.G, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        zi0.a aVar2 = zi0Var.b;
        String str = aVar2.C;
        int i2 = aVar2.E;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = weakReference.get();
        if (context2 == null) {
            return BuildConfig.FLAVOR;
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        zi0 zi0Var = this.x;
        boolean zA = zi0Var.a();
        zi0.a aVar = zi0Var.b;
        if (zA) {
            CharSequence charSequence = aVar.H;
            return charSequence != null ? charSequence : zi0Var.b.C;
        }
        if (!h()) {
            return aVar.I;
        }
        if (aVar.J == 0 || (context = this.t.get()) == null) {
            return null;
        }
        int i = this.A;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(aVar.J, f(), Integer.valueOf(f())) : context.getString(aVar.K, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.u.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        mda mdaVar = this.v;
        mdaVar.a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.z - rect.exactCenterY();
        canvas.drawText(strC, this.y, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), mdaVar.a);
    }

    public final FrameLayout e() {
        WeakReference<FrameLayout> weakReference = this.F;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.x.b.D;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.x.a() || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.x.b.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.w.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.w.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        zi0 zi0Var = this.x;
        return (zi0Var.a() || zi0Var.b.D == -1) ? false : true;
    }

    public final void i() {
        Context context = this.t.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        zi0 zi0Var = this.x;
        this.u.setShapeAppearanceModel(ll9.f(context, zG ? zi0Var.b.z.intValue() : zi0Var.b.x.intValue(), g() ? zi0Var.b.A.intValue() : zi0Var.b.y.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        this.v.a.setColor(this.x.b.v.intValue());
        invalidateSelf();
    }

    public final void k(View view, FrameLayout frameLayout) {
        this.E = new WeakReference<>(view);
        this.F = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        l();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0118 A[PHI: r13
      0x0118: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:45:0x00e4, B:47:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        WeakReference<Context> weakReference = this.t;
        Context context = weakReference.get();
        WeakReference<View> weakReference2 = this.E;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.w;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference3 = this.F;
        FrameLayout frameLayout = weakReference3 != null ? weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zG = g();
        zi0 zi0Var = this.x;
        float f8 = zG ? zi0Var.d : zi0Var.c;
        this.B = f8;
        if (f8 != -1.0f) {
            this.C = f8;
            this.D = f8;
        } else {
            this.C = Math.round((g() ? zi0Var.g : zi0Var.e) / 2.0f);
            this.D = Math.round((g() ? zi0Var.h : zi0Var.f) / 2.0f);
        }
        if (g()) {
            String strC = c();
            float f9 = this.C;
            mda mdaVar = this.v;
            if (mdaVar.e) {
                mdaVar.a(strC);
                f7 = mdaVar.c;
            } else {
                f7 = mdaVar.c;
            }
            this.C = Math.max(f9, (f7 / 2.0f) + zi0Var.b.N.intValue());
            float f10 = this.D;
            if (mdaVar.e) {
                mdaVar.a(strC);
            }
            float fMax = Math.max(f10, (mdaVar.d / 2.0f) + zi0Var.b.O.intValue());
            this.D = fMax;
            this.C = Math.max(this.C, fMax);
        }
        zi0.a aVar = zi0Var.b;
        zi0.a aVar2 = zi0Var.b;
        int i = zi0Var.k;
        int iIntValue = aVar.Q.intValue();
        if (g()) {
            iIntValue = aVar.S.intValue();
            Context context2 = weakReference.get();
            if (context2 != null) {
                iIntValue = aw.c(iIntValue, aw.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - aVar.V.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.D);
        }
        int iIntValue2 = aVar.U.intValue() + iIntValue;
        int iIntValue3 = aVar2.L.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.z = rect3.bottom - iIntValue2;
        } else {
            this.z = rect3.top + iIntValue2;
        }
        int iIntValue4 = g() ? aVar.R.intValue() : aVar2.P.intValue();
        if (i == 1) {
            iIntValue4 += g() ? zi0Var.j : zi0Var.i;
        }
        int iIntValue5 = aVar.T.intValue() + iIntValue4;
        int iIntValue6 = aVar2.L.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (zi0Var.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f = rect3.left + this.C;
                    f2 = (this.D * 2.0f) - iIntValue5;
                    f3 = f - f2;
                } else {
                    f3 = (rect3.right - this.C) + ((this.D * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = (rect3.left - this.C) + iIntValue5;
            } else {
                f = rect3.right + this.C;
                f2 = iIntValue5;
                f3 = f - f2;
            }
            this.y = f3;
        } else {
            if (zi0Var.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f4 = rect3.right + this.C;
                    f5 = iIntValue5;
                    f6 = f4 - f5;
                } else {
                    f6 = (rect3.left - this.C) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f6 = (rect3.right - this.C) + ((this.D * 2.0f) - iIntValue5);
            } else {
                f4 = rect3.left + this.C;
                f5 = (this.D * 2.0f) - iIntValue5;
                f6 = f4 - f5;
            }
            this.y = f6;
        }
        if (aVar.W.booleanValue()) {
            ViewParent viewParentE = e();
            if (viewParentE == null) {
                viewParentE = view.getParent();
            }
            if ((viewParentE instanceof View) && (viewParentE.getParent() instanceof View)) {
                b(view, (View) viewParentE.getParent());
            }
        } else {
            b(view, null);
        }
        float f11 = this.y;
        float f12 = this.z;
        float f13 = this.C;
        float f14 = this.D;
        rect2.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
        float f15 = this.B;
        kk6 kk6Var = this.u;
        if (f15 != -1082130432) {
            kk6Var.setShapeAppearanceModel(kk6Var.u.a.a(f15));
        }
        if (rect.equals(rect2)) {
            return;
        }
        kk6Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, mda.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        zi0 zi0Var = this.x;
        zi0Var.a.B = i;
        zi0Var.b.B = i;
        this.v.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
