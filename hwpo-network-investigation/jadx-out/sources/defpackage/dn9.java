package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dn9 {
    public static final xya a = xv.c(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, ca3.a, 2);

    public static final void a(fr1 fr1Var, jt1 jt1Var, final int i) {
        final fr1 fr1Var2;
        bj4 bj4VarO = jt1Var.o(1033612924);
        if (bj4VarO.A(i & 1, (i & 19) != 18)) {
            String strB = ws3.b(bj4VarO, R.string.m3c_bottom_sheet_drag_handle_description);
            c15 c15Var = new c15(di.a.n);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, c15Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var2 = fr1Var;
            yqa.b(sqa.a(bj4VarO), gr1.b(2059851063, new cn9(strB), bj4VarO), yqa.c(bj4VarO), null, false, fr1Var2, bj4VarO, 100663344);
            bj4VarO.U(true);
        } else {
            fr1Var2 = fr1Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: zm9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(55);
                    dn9.a(this.t, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
