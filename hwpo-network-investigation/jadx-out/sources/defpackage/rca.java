package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rca {
    public static final rca a = new rca();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ei4<uh1, jt1, Integer, g2b> {
        public final /* synthetic */ Drawable t;

        public a(Drawable drawable) {
            this.t = drawable;
        }

        @Override // defpackage.ei4
        public final g2b invoke(uh1 uh1Var, jt1 jt1Var, Integer num) {
            long j = uh1Var.a;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                rca.a.d(this.t, jt1Var2, 48);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ei4<uh1, jt1, Integer, g2b> {
        public final /* synthetic */ RemoteAction t;

        public b(RemoteAction remoteAction) {
            this.t = remoteAction;
        }

        @Override // defpackage.ei4
        public final g2b invoke(uh1 uh1Var, jt1 jt1Var, Integer num) {
            long j = uh1Var.a;
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                rca.a.e(this.t.getIcon(), jt1Var2, 48);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    public static String a(TextClassification textClassification, jt1 jt1Var) {
        jt1Var.K(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        jt1Var.B();
        return strValueOf;
    }

    public static g2b b(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            yba.a(actionIntent);
        } else {
            actionIntent.send();
        }
        return g2b.a;
    }

    public static String c(RemoteAction remoteAction, jt1 jt1Var) {
        jt1Var.K(-1376593684);
        String string = remoteAction.getTitle().toString();
        jt1Var.B();
        return string;
    }

    public static void f(e02 e02Var, Context context, bda bdaVar) {
        if (context == null) {
            return;
        }
        int i = bdaVar.c;
        final TextClassification textClassification = bdaVar.b;
        if (i < 0) {
            ci4 ci4Var = new ci4() { // from class: mca
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    return rca.a(textClassification, (jt1) obj);
                }
            };
            Drawable icon = textClassification.getIcon();
            e02.b(e02Var, ci4Var, icon != null ? new fr1(true, -1123224187, new a(icon)) : null, new ql3(1, context, textClassification), 6);
        } else {
            final RemoteAction remoteAction = textClassification.getActions().get(i);
            e02.b(e02Var, new ci4() { // from class: nca
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    return rca.c(remoteAction, (jt1) obj);
                }
            }, ((i == 0) || remoteAction.shouldShowIcon()) ? new fr1(true, -1261173016, new b(remoteAction)) : null, new it9(1, remoteAction), 6);
        }
    }

    public final void d(final Drawable drawable, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(257732500);
        int i2 = (bj4VarO.j(drawable) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 3) != 2)) {
            ox6 ox6VarJ = ir9.j(ox6.a.t, f02.e);
            boolean zJ = bj4VarO.j(drawable);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new yt0(4, drawable);
                bj4VarO.C(objF);
            }
            dv0.a(z63.c(ox6VarJ, (oh4) objF), bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(drawable, i) { // from class: qca
                public final /* synthetic */ Drawable u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(49);
                    this.t.d(this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public final void e(final Icon icon, jt1 jt1Var, final int i) {
        xj8 xj8VarW;
        ci4<? super jt1, ? super Integer, g2b> ci4Var;
        bj4 bj4VarO = jt1Var.o(2116504409);
        int i2 = (bj4VarO.j(icon) ? 4 : 2) | i;
        if (bj4VarO.A(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            boolean zJ = bj4VarO.J(icon) | bj4VarO.J(context);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = icon.loadDrawable(context);
                bj4VarO.C(objF);
            }
            Drawable drawable = (Drawable) objF;
            if (drawable == null) {
                xj8VarW = bj4VarO.W();
                if (xj8VarW == null) {
                    return;
                } else {
                    ci4Var = new ci4(icon, i) { // from class: oca
                        public final /* synthetic */ Icon u;

                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iS = gz3.s(49);
                            this.t.e(this.u, (jt1) obj, iS);
                            return g2b.a;
                        }
                    };
                }
            } else {
                d(drawable, bj4VarO, 48);
            }
            xj8VarW.d = ci4Var;
        }
        bj4VarO.u();
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            ci4Var = new ci4(icon, i) { // from class: pca
                public final /* synthetic */ Icon u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(49);
                    this.t.e(this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
            xj8VarW.d = ci4Var;
        }
    }
}
