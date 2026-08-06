package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cv5 {
    public static final gu5 a = new gu5(null, 0, false, 0.0f, new a(), 0.0f, false, u72.a(ff3.t), yx2.a(), 0, new n12(2), new o12(2), hf3.t, 0, 0, 0, fl7.t, 0, 0);

    public static final zu5 a(final int i, jt1 jt1Var, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        au3 au3Var = zu5.w;
        boolean zH = jt1Var.h(i) | jt1Var.h(0);
        Object objF = jt1Var.f();
        if (zH || objF == jt1.a.a) {
            objF = new mh4() { // from class: bv5
                @Override // defpackage.mh4
                public final Object invoke() {
                    return new zu5(i, 0);
                }
            };
            jt1Var.C(objF);
        }
        return (zu5) mm8.e(objArr, au3Var, (mh4) objF, jt1Var, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements gl6 {
        @Override // defpackage.gl6
        public final int h() {
            return 0;
        }

        @Override // defpackage.gl6
        public final int j() {
            return 0;
        }

        @Override // defpackage.gl6
        public final Map<ei, Integer> l() {
            return if3.t;
        }

        @Override // defpackage.gl6
        public final void m() {
        }
    }
}
