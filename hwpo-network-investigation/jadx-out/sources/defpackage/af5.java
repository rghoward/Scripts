package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af5 implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 1:
                ns7 ns7Var = (ns7) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(ns7Var.b);
                sb.append(", ");
                return e44.a(sb, ns7Var.c, ')');
            default:
                int i = gp8.E;
                return Boolean.valueOf(((hp8) obj).a);
        }
    }
}
