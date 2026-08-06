package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lha {
    public static final iw a(kha khaVar) {
        iw iwVar = khaVar.a;
        long j = khaVar.b;
        iwVar.getClass();
        return iwVar.subSequence(lja.f(j), lja.e(j));
    }

    public static final iw b(kha khaVar, int i) {
        iw iwVar = khaVar.a;
        iw iwVar2 = khaVar.a;
        long j = khaVar.b;
        int iE = lja.e(j);
        int iE2 = lja.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = iwVar2.u.length();
        }
        return iwVar.subSequence(iE, Math.min(length, iwVar2.u.length()));
    }

    public static final iw c(kha khaVar, int i) {
        iw iwVar = khaVar.a;
        long j = khaVar.b;
        int iF = lja.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return iwVar.subSequence(Math.max(0, i2), lja.f(j));
    }
}
