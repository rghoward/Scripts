package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements ci4<jt1, Integer, g2b> {
        public final /* synthetic */ oh4<Context, T> u;
        public final /* synthetic */ ox6 v;
        public final /* synthetic */ oh4<T, g2b> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(oh4<? super Context, ? extends T> oh4Var, ox6 ox6Var, oh4<? super T, g2b> oh4Var2, int i, int i2) {
            super(2);
            this.u = oh4Var;
            this.v = ox6Var;
            this.w = oh4Var2;
            this.x = i;
            this.y = i2;
        }

        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            num.intValue();
            ft.b(this.u, this.v, this.w, jt1Var, gz3.s(this.x | 1), this.y);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements oh4<View, g2b> {
        public static final b u = new b(1);

        @Override // defpackage.oh4
        public final /* bridge */ /* synthetic */ g2b invoke(View view) {
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c extends wp5 implements mh4<qr5> {
        public final /* synthetic */ Context u;
        public final /* synthetic */ oh4<Context, View> v;
        public final /* synthetic */ yt1 w;
        public final /* synthetic */ m09 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ View z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Context context, oh4<? super Context, View> oh4Var, yt1 yt1Var, m09 m09Var, int i, View view) {
            super(0);
            this.u = context;
            this.v = oh4Var;
            this.w = yt1Var;
            this.x = m09Var;
            this.y = i;
            this.z = view;
        }

        @Override // defpackage.mh4
        public final qr5 invoke() {
            KeyEvent.Callback callback = this.z;
            callback.getClass();
            return new zgb(this.u, this.v, this.w, this.x, this.y, (mn7) callback).getLayoutNode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d extends wp5 implements ci4<qr5, ox6, g2b> {
        public static final d u = new d(2);

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, ox6 ox6Var) {
            ft.c(qr5Var).setModifier(ox6Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e extends wp5 implements ci4<qr5, tx2, g2b> {
        public static final e u = new e(2);

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, tx2 tx2Var) {
            ft.c(qr5Var).setDensity(tx2Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class f extends wp5 implements ci4<qr5, m76, g2b> {
        public static final f u = new f(2);

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, m76 m76Var) {
            ft.c(qr5Var).setLifecycleOwner(m76Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class g extends wp5 implements ci4<qr5, f19, g2b> {
        public static final g u = new g(2);

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, f19 f19Var) {
            ft.c(qr5Var).setSavedStateRegistryOwner(f19Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class h extends wp5 implements ci4<qr5, tq5, g2b> {
        public static final h u = new h(2);

        @Override // defpackage.ci4
        public final g2b invoke(qr5 qr5Var, tq5 tq5Var) {
            int i;
            zgb zgbVarC = ft.c(qr5Var);
            int iOrdinal = tq5Var.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    u.b();
                    return null;
                }
            } else {
                i = 0;
            }
            zgbVarC.setLayoutDirection(i);
            return g2b.a;
        }
    }

    public static final void a(oh4 oh4Var, ox6 ox6Var, oh4 oh4Var2, jt1 jt1Var, int i) {
        int i2;
        m76 m76Var;
        bj4 bj4VarO = jt1Var.o(-180024211);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(oh4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = i & 3072;
        b bVar = b.u;
        if (i4 == 0) {
            i3 |= bj4VarO.j(bVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? 16384 : 8192;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(bj4VarO.T);
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var.H(t84.t).H(ba4.a.t).H(ca4.t).H(x94.t));
            tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
            tq5 tq5Var = (tq5) bj4VarO.F(qu1.n);
            kw7 kw7VarP = bj4VarO.P();
            m76 m76Var2 = (m76) bj4VarO.F(kc6.a);
            f19 f19Var = (f19) bj4VarO.F(uc6.a);
            bj4VarO.K(1314774735);
            int i5 = i3 & 14;
            int iHashCode2 = Long.hashCode(bj4VarO.v());
            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            bj4.b bVarE = bj4VarO.E();
            m09 m09Var = (m09) bj4VarO.F(o09.a);
            View view = (View) bj4VarO.F(AndroidCompositionLocals_androidKt.f);
            boolean zJ = bj4VarO.j(context) | ((((i5 & 14) ^ 6) > 4 && bj4VarO.J(oh4Var)) || (i5 & 6) == 4) | bj4VarO.j(bVarE) | bj4VarO.j(m09Var) | bj4VarO.h(iHashCode2) | bj4VarO.j(view);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                m76Var = m76Var2;
                c cVar = new c(context, oh4Var, bVarE, m09Var, iHashCode2, view);
                bj4VarO.C(cVar);
                objF = cVar;
            } else {
                m76Var = m76Var2;
            }
            mh4 mh4Var = (mh4) objF;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.u0(125, 1, null, null);
            bj4VarO.r = true;
            if (bj4VarO.S) {
                bj4VarO.k(mh4Var);
            } else {
                bj4VarO.z();
            }
            bt1.c.getClass();
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, d.u, ox6VarC);
            rd7.d(bj4VarO, e.u, tx2Var);
            rd7.d(bj4VarO, f.u, m76Var);
            rd7.d(bj4VarO, g.u, f19Var);
            rd7.d(bj4VarO, h.u, tq5Var);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.d(bj4VarO, gt.u, oh4Var2);
            rd7.d(bj4VarO, ht.u, bVar);
            bj4VarO.U(true);
            bj4VarO.U(false);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jt(oh4Var, ox6Var, oh4Var2, i);
        }
    }

    public static final <T extends View> void b(oh4<? super Context, ? extends T> oh4Var, ox6 ox6Var, oh4<? super T, g2b> oh4Var2, jt1 jt1Var, int i, int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-1783766393);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.j(oh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? 256 : 128;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            if (i5 != 0) {
                oh4Var2 = b.u;
            }
            a(oh4Var, ox6Var, oh4Var2, bj4VarO, ((i3 << 6) & 57344) | (i3 & 14) | 3072 | (i3 & 112));
        } else {
            bj4VarO.u();
        }
        ox6 ox6Var2 = ox6Var;
        oh4<? super T, g2b> oh4Var3 = oh4Var2;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new a(oh4Var, ox6Var2, oh4Var3, i, i2);
        }
    }

    public static final zgb c(qr5 qr5Var) {
        zgb zgbVar = qr5Var.H;
        if (zgbVar != null) {
            return zgbVar;
        }
        throw ik.a("Required value was null.");
    }
}
