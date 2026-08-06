package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dt7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.v0;
import defpackage.wp5;
import defpackage.xj8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends v0 {
    public final dt7 t;
    public boolean u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.v = i;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            int iS = gz3.s(this.v | 1);
            ComposeView.this.Content(jt1Var, iS);
            return g2b.a;
        }
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.v0
    public final void Content(jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(420213850);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            ci4 ci4Var = (ci4) this.t.getValue();
            if (ci4Var == null) {
                bj4VarO.K(-1238823553);
            } else {
                bj4VarO.K(98585282);
                ci4Var.invoke(bj4VarO, 0);
            }
            bj4VarO.U(false);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.v0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.u;
    }

    public final void setContent(ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.u = true;
        this.t.setValue(ci4Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = bl7.i(null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
