package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nd3 {
    public kha a;
    public td3 b;

    public final kha a(List<? extends ra3> list) {
        ra3 ra3Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            ra3Var = null;
            while (i < size) {
                try {
                    ra3 ra3Var2 = list.get(i);
                    try {
                        ra3Var2.a(this.b);
                        i++;
                        ra3Var = ra3Var2;
                    } catch (Exception e2) {
                        e = e2;
                        ra3Var = ra3Var2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(this.b.a.a());
                        sb2.append(", composition=");
                        sb2.append(this.b.c());
                        sb2.append(", selection=");
                        td3 td3Var = this.b;
                        sb2.append((Object) lja.h(ay.c(td3Var.b, td3Var.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        th1.E(list, sb, new md3(ra3Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            td3 td3Var2 = this.b;
            td3Var2.getClass();
            iw iwVar = new iw(td3Var2.a.toString());
            td3 td3Var3 = this.b;
            long jC = ay.c(td3Var3.b, td3Var3.c);
            lja ljaVar = lja.g(this.a.b) ? null : new lja(jC);
            kha khaVar = new kha(iwVar, ljaVar != null ? ljaVar.a : ay.c(lja.e(jC), lja.f(jC)), this.b.c());
            this.a = khaVar;
            return khaVar;
        } catch (Exception e4) {
            ra3Var = null;
            e = e4;
        }
    }
}
