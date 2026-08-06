package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.n
    public final m f(m mVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int iH = mVar.h(a.DAY_OF_WEEK);
                if (iH == i2) {
                    return mVar;
                }
                int i3 = iH - i2;
                return mVar.b(i3 >= 0 ? 7 - i3 : -i3, b.DAYS);
            default:
                int iH2 = mVar.h(a.DAY_OF_WEEK);
                if (iH2 == i2) {
                    return mVar;
                }
                int i4 = i2 - iH2;
                return mVar.c(i4 >= 0 ? 7 - i4 : -i4, b.DAYS);
        }
    }
}
