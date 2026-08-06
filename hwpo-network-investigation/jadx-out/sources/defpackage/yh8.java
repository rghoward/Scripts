package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yh8 implements wt6 {
    public final au6 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public yh8(ek4 ek4Var, String str, Object[] objArr) {
        this.a = ek4Var;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.wt6
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.wt6
    public final au6 b() {
        return this.a;
    }

    @Override // defpackage.wt6
    public final ve8 c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return ve8.t;
        }
        return (i & 4) == 4 ? ve8.v : ve8.u;
    }
}
