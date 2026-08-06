package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n7b {
    public static final m7b a = new m7b(ag7.a.a, 0, 0);

    public static final mva a(ojb ojbVar, iw iwVar) {
        mva mvaVarA = ojbVar.a(iwVar);
        int length = iwVar.u.length();
        iw iwVar2 = mvaVarA.a;
        ag7 ag7Var = mvaVarA.b;
        int length2 = iwVar2.u.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(ag7Var.b(i), length2, i);
        }
        b(ag7Var.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(ag7Var.a(i2), length, i2);
        }
        c(ag7Var.a(length2), length, length2);
        return new mva(iwVar2, new m7b(ag7Var, iwVar.u.length(), iwVar2.u.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbB = u43.b("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ", i3, i);
        sbB.append(i2);
        sbB.append(']');
        xc5.c(sbB.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbB = u43.b("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ", i3, i);
        sbB.append(i2);
        sbB.append(']');
        xc5.c(sbB.toString());
    }
}
