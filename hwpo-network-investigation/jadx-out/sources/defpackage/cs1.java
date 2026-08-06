package defpackage;

import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 {
    public static final fr1 a = new fr1(false, 1425358052, b.t);
    public static final fr1 b = new fr1(false, -1179219109, a.t);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ei4<oy8, jt1, Integer, g2b> {
        public static final a t = new a();

        @Override // defpackage.ei4
        public final g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                mia.b(ws3.b(jt1Var2, R.string.m3c_time_picker_pm), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ei4<oy8, jt1, Integer, g2b> {
        public static final b t = new b();

        @Override // defpackage.ei4
        public final g2b invoke(oy8 oy8Var, jt1 jt1Var, Integer num) {
            jt1 jt1Var2 = jt1Var;
            int iIntValue = num.intValue();
            if (jt1Var2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
                mia.b(ws3.b(jt1Var2, R.string.m3c_time_picker_am), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
            } else {
                jt1Var2.u();
            }
            return g2b.a;
        }
    }
}
