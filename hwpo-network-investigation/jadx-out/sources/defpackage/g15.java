package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g15 {
    public final nia a;
    public int b = -1;
    public float c;

    public g15(nia niaVar) {
        this.a = niaVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        int i2 = 1;
        nia niaVar = this.a;
        if (z) {
            int iG = ty1.g(niaVar.f, i, z);
            int lineStart = niaVar.f.getLineStart(iG);
            int iF = niaVar.f(iG);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.b == i4) {
            return this.c;
        }
        float fH = z3 ? niaVar.h(i, z) : niaVar.i(i, z);
        if (z2) {
            this.b = i4;
            this.c = fH;
        }
        return fH;
    }
}
