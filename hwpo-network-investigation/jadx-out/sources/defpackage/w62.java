package defpackage;

import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w62 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ w62(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                a72 a72Var = (a72) obj2;
                iw iwVar = (iw) obj;
                boolean z = false;
                if (!a72Var.M && a72Var.N) {
                    gia giaVar = a72Var.L.e;
                    if (giaVar != null) {
                        List<? extends ra3> listI = ws0.i(new zz3(), new lo1(iwVar, 1));
                        u56 u56Var = a72Var.L;
                        nd3 nd3Var = u56Var.d;
                        g75 g75Var = u56Var.v;
                        kha khaVarA = nd3Var.a(listI);
                        giaVar.a(null, khaVarA);
                        g75Var.invoke(khaVarA);
                    } else {
                        kha khaVar = a72Var.K;
                        String str = khaVar.a.u;
                        long j = khaVar.b;
                        int i2 = lja.c;
                        String string = z2a.F(str, (int) (j >> 32), (int) (j & 4294967295L), iwVar).toString();
                        int length = iwVar.u.length() + ((int) (a72Var.K.b >> 32));
                        a72Var.L.v.invoke(new kha(4, ay.c(length, length), string));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$4$lambda$3((t72) obj2, (fw0) this.v, (v94) obj);
        }
    }
}
