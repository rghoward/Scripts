package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qw5 {
    public static final void a(final mh4 mh4Var, final ox6 ox6Var, final lx5 lx5Var, final rw5 rw5Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1055276397);
        int i2 = (bj4VarO.j(mh4Var) ? 4 : 2) | i | (bj4VarO.J(ox6Var) ? 32 : 16) | (bj4VarO.J(lx5Var) ? 256 : 128) | (bj4VarO.J(rw5Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if (bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            final h37 h37VarJ = bl7.j(mh4Var, bj4VarO);
            n06.a(gr1.b(-933153643, new ei4() { // from class: lw5
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ox6 ox6VarH;
                    f09 f09Var = (f09) obj;
                    jt1 jt1Var2 = (jt1) obj2;
                    ((Integer) obj3).getClass();
                    Object objF = jt1Var2.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = new ew5(f09Var, new yb5(1, h37VarJ));
                        jt1Var2.C(objF);
                    }
                    final ew5 ew5Var = (ew5) objF;
                    Object objF2 = jt1Var2.f();
                    if (objF2 == c0187a) {
                        objF2 = new f4a(new jw5(ew5Var));
                        jt1Var2.C(objF2);
                    }
                    final f4a f4aVar = (f4a) objF2;
                    final lx5 lx5Var2 = lx5Var;
                    if (lx5Var2 != null) {
                        jt1Var2.K(1743490539);
                        final g88 g88Var = lx5Var2.a;
                        if (g88Var == null) {
                            jt1Var2.K(887527095);
                            g88Var = h88.a;
                            if (g88Var != null) {
                                jt1Var2.K(1345554384);
                                jt1Var2.B();
                            } else {
                                jt1Var2.K(1345603457);
                                View view = (View) jt1Var2.F(AndroidCompositionLocals_androidKt.f);
                                boolean zJ = jt1Var2.J(view);
                                Object objF3 = jt1Var2.f();
                                if (zJ || objF3 == c0187a) {
                                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                    objF3 = tag instanceof g88 ? (g88) tag : null;
                                    if (objF3 == null) {
                                        objF3 = new wq(view);
                                        view.setTag(R.id.compose_prefetch_scheduler, objF3);
                                    }
                                    jt1Var2.C(objF3);
                                }
                                jt1Var2.B();
                                g88Var = (g88) objF3;
                            }
                        } else {
                            jt1Var2.K(887526010);
                        }
                        jt1Var2.B();
                        Object[] objArr = {lx5Var2, ew5Var, f4aVar, g88Var};
                        boolean zJ2 = jt1Var2.J(lx5Var2) | jt1Var2.j(ew5Var) | jt1Var2.j(f4aVar) | jt1Var2.j(g88Var);
                        Object objF4 = jt1Var2.f();
                        if (zJ2 || objF4 == c0187a) {
                            objF4 = new oh4() { // from class: nw5
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj4) {
                                    c88 c88Var = new c88(ew5Var, f4aVar, g88Var);
                                    lx5 lx5Var3 = lx5Var2;
                                    lx5Var3.d = c88Var;
                                    return new pw5(lx5Var3);
                                }
                            };
                            jt1Var2.C(objF4);
                        }
                        wd3.c(objArr, (oh4) objF4, jt1Var2);
                        jt1Var2.B();
                    } else {
                        jt1Var2.K(1744076749);
                        jt1Var2.B();
                    }
                    int i3 = mx5.a;
                    ox6 ox6Var2 = ox6Var;
                    if (lx5Var2 != null && (ox6VarH = ox6Var2.H(new uxa(lx5Var2))) != null) {
                        ox6Var2 = ox6VarH;
                    }
                    boolean zJ3 = jt1Var2.J(ew5Var);
                    final rw5 rw5Var2 = rw5Var;
                    boolean zJ4 = zJ3 | jt1Var2.J(rw5Var2);
                    Object objF5 = jt1Var2.f();
                    if (zJ4 || objF5 == c0187a) {
                        objF5 = new ci4() { // from class: ow5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj4, Object obj5) {
                                return rw5Var2.a(new tw5(ew5Var, (g4a) obj4), ((xx1) obj5).a);
                            }
                        };
                        jt1Var2.C(objF5);
                    }
                    c4a.b(f4aVar, ox6Var2, (ci4) objF5, jt1Var2, 8);
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 6);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, lx5Var, rw5Var, i) { // from class: mw5
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ lx5 v;
                public final /* synthetic */ rw5 w;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    qw5.a(this.t, this.u, this.v, this.w, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
